package org.freeplane.collaboration.event.batch;

import java.util.List;

import org.freeplane.collaboration.event.MapUpdated;
import org.freeplane.collaboration.event.batch.ImmutableUpdateBlockCompleted;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableUpdateBlockCompleted.class)
@JsonDeserialize(as = ImmutableUpdateBlockCompleted.class)
public interface  UpdateBlockCompleted {
	static ImmutableUpdateBlockCompleted.Builder builder() {
		return ImmutableUpdateBlockCompleted.builder();
	}
	String mapId();
	long mapRevision();
	List<MapUpdated> updateBlock();
}
