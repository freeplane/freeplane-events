package org.freeplane.collaboration.event.messages;

import java.util.List;

import org.freeplane.collaboration.event.messages.ImmutableGenericUpdateBlockCompleted;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Value.Immutable
@JsonSerialize(as = ImmutableGenericUpdateBlockCompleted.class)
@JsonDeserialize(as = ImmutableGenericUpdateBlockCompleted.class)
public interface  GenericUpdateBlockCompleted {
	static ImmutableGenericUpdateBlockCompleted.Builder builder() {
		return ImmutableGenericUpdateBlockCompleted.builder();
	}
	UserId userId();
	MapId mapId();
	long mapRevision();
	List<ObjectNode> updateBlock();
}
