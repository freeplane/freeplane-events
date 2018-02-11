package org.freeplane.collaboration.event.batch;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapDescription.class)
@JsonDeserialize(as = ImmutableMapDescription.class)
public interface MapDescription {
	String name();
	
	default String description() {
		return "";
	}
}

