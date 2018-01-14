package org.freeplane.plugin.collaboration.client.event.batch;

import org.immutables.value.Value;

@Value.Modifiable
public interface UpdateHeaderExtension {
	String mapId();

	long mapRevision();
}
