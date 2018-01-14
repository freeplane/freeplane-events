package org.freeplane.collaboration.event.batch;

import org.immutables.value.Value;

@Value.Modifiable
public interface UpdateHeader {
	String mapId();

	long mapRevision();
}
