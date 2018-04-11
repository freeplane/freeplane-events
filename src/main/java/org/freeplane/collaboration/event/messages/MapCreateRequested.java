package org.freeplane.collaboration.event.messages;

import org.immutables.value.Value.Default;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Parameter;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableMapCreateRequested.class)
@JsonDeserialize(as = ImmutableMapCreateRequested.class)
public interface MapCreateRequested extends Event{
	@Override @Default
	default MessageId messageId() {return MessageId.random();}
	@Parameter Credentials credentials();
	@Parameter MapDescription description();
}

