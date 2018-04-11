package org.freeplane.collaboration.event.messages;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "messageType")
@JsonSubTypes({
	@Type(value = ImmutableMapCreateRequested.class, name = "MapCreateRequested"),
	@Type(value = ImmutableMapCreated.class, name = "MapCreated"),
	@Type(value = ImmutableMapUpdateRequested.class, name = "MapUpdateRequested"),
	@Type(value = ImmutableMapUpdateProcessed.class, name = "ImmutableMapUpdateProcessed"),
	})
public interface Message {
	MessageId messageId();
}
