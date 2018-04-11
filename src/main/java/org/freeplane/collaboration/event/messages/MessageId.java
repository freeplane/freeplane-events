package org.freeplane.collaboration.event.messages;

import java.util.UUID;

import org.freeplane.collaboration.event.json.ValueWrapper;
import org.freeplane.collaboration.event.json.ValueWrapperSerializer;
import org.freeplane.collaboration.event.json.WrappingValueDeserializer;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Parameter;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(using=ValueWrapperSerializer.class)
@JsonDeserialize(using=MessageIdDeserializer.class)
public interface MessageId extends ValueWrapper<String>{
	@Override
	@Parameter String value();

	static MessageId random() {
		return ImmutableMessageId.of(UUID.randomUUID().toString());
	}
}

@SuppressWarnings("serial")
class MessageIdDeserializer extends WrappingValueDeserializer<String, MessageId>{
	public MessageIdDeserializer() {
		super(ImmutableMessageId::of);
	}
}

