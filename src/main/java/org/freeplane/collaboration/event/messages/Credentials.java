package org.freeplane.collaboration.event.messages;

import org.freeplane.collaboration.event.messages.ImmutableCredentials;
import org.freeplane.collaboration.event.messages.UserId;
import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(as = ImmutableCredentials.class)
@JsonDeserialize(as = ImmutableCredentials.class)
public interface Credentials {
	UserId userId();
	static Credentials of(UserId userId) {
		return ImmutableCredentials.builder().userId(userId).build();
	}
}
