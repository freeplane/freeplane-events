package org.freeplane.collaboration.event.json;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.StdConverter;

@SuppressWarnings("serial")
public class ValueWrapperSerializer<T> extends StdDelegatingSerializer{
	@SuppressWarnings("rawtypes")
	private static Converter CONVERTER = new Converter();

	private static class Converter<T> extends StdConverter <ValueWrapper<T>, T> {
		@Override
		public T convert(ValueWrapper<T> in) {
			return in.value();
		}


	};
	public ValueWrapperSerializer() {
		super(CONVERTER);
	}

	@Override
	protected StdDelegatingSerializer withDelegate(com.fasterxml.jackson.databind.util.Converter<Object, ?> converter,
	                                               JavaType delegateType, JsonSerializer<?> delegateSerializer) {
		return new StdDelegatingSerializer(converter, delegateType, delegateSerializer);
	}
}