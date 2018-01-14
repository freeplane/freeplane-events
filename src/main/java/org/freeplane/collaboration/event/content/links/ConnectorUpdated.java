package org.freeplane.collaboration.event.content.links;

import org.freeplane.collaboration.event.NodeUpdated;
import org.freeplane.collaboration.event.content.links.ImmutableConnectorUpdated;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableConnectorUpdated.class)
@JsonDeserialize(as = ImmutableConnectorUpdated.class)
public interface ConnectorUpdated extends NodeUpdated{
	ConnectorData getConnectorData(); 
}
