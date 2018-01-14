package org.freeplane.collaboration.event.children;

import org.freeplane.collaboration.event.MapUpdated;
import org.freeplane.collaboration.event.children.ImmutableRootNodeIdUpdated;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableRootNodeIdUpdated.class)
@JsonDeserialize(as = ImmutableRootNodeIdUpdated.class)
public interface RootNodeIdUpdated extends MapUpdated{
	static ImmutableRootNodeIdUpdated.Builder builder() {
		return ImmutableRootNodeIdUpdated.builder();
	}
	
	String nodeId();
}
