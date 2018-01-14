package org.freeplane.collaboration.event.children;

import org.freeplane.collaboration.event.NodeUpdated;
import org.freeplane.collaboration.event.children.ImmutableNodeMoved;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableNodeMoved.class)
@JsonDeserialize(as = ImmutableNodeMoved.class)
public interface NodeMoved extends NodeUpdated{
	
	static ImmutableNodeMoved.Builder builder() {
		return ImmutableNodeMoved.builder();
	}
	
	NodePosition position();
}
