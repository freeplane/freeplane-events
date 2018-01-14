package org.freeplane.collaboration.event.content.links;

import org.freeplane.collaboration.event.NodeUpdated;
import org.freeplane.collaboration.event.content.links.ImmutableConnectorAdded;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableConnectorAdded.class)
@JsonDeserialize(as = ImmutableConnectorAdded.class)
public interface ConnectorAdded extends NodeUpdated{
	String targetId();
}
