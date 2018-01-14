package org.freeplane.collaboration.event.content.core;

import org.freeplane.collaboration.event.NodeUpdated;
import org.freeplane.collaboration.event.content.core.ImmutableCoreUpdated;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableCoreUpdated.class)
@JsonDeserialize(as = ImmutableCoreUpdated.class)
public interface CoreUpdated extends NodeUpdated{

	static ImmutableCoreUpdated.Builder builder() {
		return ImmutableCoreUpdated.builder();
	}

	String content();
	
	CoreMediaType mediaType();
}
