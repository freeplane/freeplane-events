package org.freeplane.collaboration.event.messages;

import org.immutables.value.Value.Default;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Parameter;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapUpdateRequested.class)
@JsonDeserialize(as = ImmutableMapUpdateRequested.class)
public interface MapUpdateRequested extends Event{
	@Override @Default
	default MessageId messageId() {return MessageId.random();}
	@Parameter Credentials credentials();
	@Parameter UpdateBlockCompleted update();
}

