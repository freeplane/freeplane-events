package org.freeplane.collaboration.event.content.other;

import org.freeplane.collaboration.event.NodeUpdated;
import org.freeplane.collaboration.event.content.other.ImmutableNodeContentUpdated;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableNodeContentUpdated.class)
@JsonDeserialize(as = ImmutableNodeContentUpdated.class)
public interface NodeContentUpdated extends NodeUpdated{
	
	static ImmutableNodeContentUpdated.Builder builder() {
		return ImmutableNodeContentUpdated.builder();
	}
	
	String content();
}
