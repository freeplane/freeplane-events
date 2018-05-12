package org.freeplane.collaboration.event.messages;

import org.immutables.value.Value.Default;
import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapUpdateDistributed.class)
@JsonDeserialize(as = ImmutableMapUpdateDistributed.class)
public interface MapUpdateDistributed extends ResponseEvent {
	@Override @Default
	default MessageId messageId() {return MessageId.random();}
	GenericUpdateBlockCompleted update();
}
