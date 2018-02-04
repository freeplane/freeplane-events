package org.freeplane.collaboration.event.batch;

import org.freeplane.collaboration.event.json.WrappingValueDeserializer;
import org.freeplane.collaboration.event.json.ValueWrapper;
import org.freeplane.collaboration.event.json.ValueWrapperSerializer;
import org.immutables.value.Value.Immutable;
import org.immutables.value.Value.Parameter;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Immutable
@JsonSerialize(using=ValueWrapperSerializer.class)
@JsonDeserialize(using=UserIdDeserializer.class)
public interface UserId extends ValueWrapper<String>{
	@Parameter String value();
}

@SuppressWarnings("serial")
class UserIdDeserializer extends WrappingValueDeserializer<String, UserId>{
	public UserIdDeserializer() {
		super(ImmutableUserId::of);
	}
}

