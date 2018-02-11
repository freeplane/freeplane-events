package org.freeplane.collaboration.event.batch;

import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Parameter;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapCreateRequest.class)
@JsonDeserialize(as = ImmutableMapCreateRequest.class)
public interface MapCreateRequest {
	@Parameter Credentials credentials();
	@Parameter MapDescription description();
}

