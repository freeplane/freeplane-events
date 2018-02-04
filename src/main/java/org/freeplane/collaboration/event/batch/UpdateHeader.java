package org.freeplane.collaboration.event.batch;

import org.immutables.value.Value;

@Value.Modifiable
public interface UpdateHeader {
	MapId mapId();

	long mapRevision();
}
