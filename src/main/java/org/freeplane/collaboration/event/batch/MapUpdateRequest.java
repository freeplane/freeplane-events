package org.freeplane.collaboration.event.batch;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapUpdateRequest.class)
@JsonDeserialize(as = ImmutableMapUpdateRequest.class)
public interface MapUpdateRequest {
	Credentials credentials();
	UpdateBlockCompleted update();
}

