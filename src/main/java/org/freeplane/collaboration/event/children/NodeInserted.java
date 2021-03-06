package org.freeplane.collaboration.event.children;

import org.freeplane.collaboration.event.NodeUpdated;
import org.freeplane.collaboration.event.children.ImmutableNodeInserted;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableNodeInserted.class)
@JsonDeserialize(as = ImmutableNodeInserted.class)
public interface NodeInserted extends NodeUpdated{
	
	static ImmutableNodeInserted.Builder builder() {
		return ImmutableNodeInserted.builder();
	}
	
	NodePosition position();
}
