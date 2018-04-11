package org.freeplane.collaboration.event.messages;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapUpdateProcessed.class)
@JsonDeserialize(as = ImmutableMapUpdateProcessed.class)
public interface MapUpdateProcessed extends ResponseEvent{
	enum UpdateStatus{ACCEPTED, REJECTED, MERGED};

	UpdateStatus status();
}
