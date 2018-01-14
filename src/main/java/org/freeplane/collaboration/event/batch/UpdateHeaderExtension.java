package org.freeplane.collaboration.event.batch;

import org.immutables.value.Value;

@Value.Modifiable
public interface UpdateHeaderExtension {
	String mapId();

	long mapRevision();
}
