package org.freeplane.collaboration.event.batch;

import org.freeplane.collaboration.event.json.WrappingValueDeserializer;
import org.freeplane.collaboration.event.json.ValueWrapper;
import org.freeplane.collaboration.event.json.ValueWrapperSerializer;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Parameter;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(using=ValueWrapperSerializer.class)
@JsonDeserialize(using=MapIdDeserializer.class)
public interface MapId extends ValueWrapper<String>{
	@Parameter String value();
}

@SuppressWarnings("serial")
class MapIdDeserializer extends WrappingValueDeserializer<String, MapId>{
	public MapIdDeserializer() {
		super(ImmutableMapId::of);
	}
}

