package org.freeplane.collaboration.event.json;

import java.util.function.Function;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.util.StdConverter;

@SuppressWarnings("serial")
public class WrappingValueDeserializer<T, R extends ValueWrapper<T>> extends StdDelegatingDeserializer<T>{
	private static class Converter<T, R > extends StdConverter <T, R> {
		private final Function<T, R> converter;
		
		public Converter(Function<T, R> converter) {
			super();
			this.converter = converter;
		}

		@Override
		public R convert(T in) {
			return converter.apply(in);
		}

	};
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public WrappingValueDeserializer(Function<T, R> f) {
		super(new Converter(f));
	}

	@Override
	protected StdDelegatingDeserializer<T> withDelegate(com.fasterxml.jackson.databind.util.Converter<Object, T> converter,
	                                                         JavaType delegateType,
	                                                         JsonDeserializer<?> delegateDeserializer) {
		return new StdDelegatingDeserializer<T>(converter, delegateType, delegateDeserializer);
	}

}