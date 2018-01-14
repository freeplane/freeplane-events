package org.freeplane.collaboration.event.content.links;

import java.util.Optional;

import org.freeplane.collaboration.event.NodeUpdated;
import org.freeplane.collaboration.event.content.links.ImmutableHyperlinkUpdated;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableHyperlinkUpdated.class)
@JsonDeserialize(as = ImmutableHyperlinkUpdated.class)
public interface HyperlinkUpdated extends NodeUpdated {
	Optional<String> uri();
}
