package org.freeplane.collaboration.event.batch;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapCreateRequest.class)
@JsonDeserialize(as = ImmutableMapCreateRequest.class)
public interface MapCreateRequest {
	Credentials credentials();
	MapDescription description();
}

