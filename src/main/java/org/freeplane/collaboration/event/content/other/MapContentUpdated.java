package org.freeplane.collaboration.event.content.other;

import org.freeplane.collaboration.event.MapUpdated;
import org.freeplane.collaboration.event.content.other.ImmutableMapContentUpdated;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableMapContentUpdated.class)
@JsonDeserialize(as = ImmutableMapContentUpdated.class)
public interface MapContentUpdated extends MapUpdated{
	
	static ImmutableMapContentUpdated.Builder builder() {
		return ImmutableMapContentUpdated.builder();
	}
	
	String content();
}
