package org.freeplane.collaboration.event.messages;

import org.freeplane.collaboration.event.messages.ImmutableMapDescription;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Parameter;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapDescription.class)
@JsonDeserialize(as = ImmutableMapDescription.class)
public interface MapDescription {
	@Parameter String name();
	
	default String description() {
		return "";
	}
}

