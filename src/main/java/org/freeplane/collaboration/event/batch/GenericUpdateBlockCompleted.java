package org.freeplane.collaboration.event.batch;

import java.util.List;

import org.freeplane.collaboration.event.batch.ImmutableGenericUpdateBlockCompleted;
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
	String mapId();
	long mapRevision();
	List<ObjectNode> updateBlock();
}
