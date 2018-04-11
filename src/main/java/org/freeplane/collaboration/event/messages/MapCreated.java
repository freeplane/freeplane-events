package org.freeplane.collaboration.event.messages;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapCreated.class)
@JsonDeserialize(as = ImmutableMapCreated.class)
public interface MapCreated extends ResponseEvent{
	 MapId id();
}

