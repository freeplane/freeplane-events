package org.freeplane.collaboration.event.content.links;

import org.freeplane.collaboration.event.NodeUpdated;
import org.freeplane.collaboration.event.content.links.ImmutableConnectorRemoved;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableConnectorRemoved.class)
@JsonDeserialize(as = ImmutableConnectorRemoved.class)
public interface ConnectorRemoved extends NodeUpdated{
	String targetId();
}
