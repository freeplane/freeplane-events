package org.freeplane.plugin.collaboration.client.event.children;

import org.freeplane.plugin.collaboration.client.event.NodeUpdated;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableSpecialNodeTypeSet.class)
@JsonDeserialize(as = ImmutableSpecialNodeTypeSet.class)
public interface SpecialNodeTypeSet extends NodeUpdated {
	enum SpecialNodeType {
		SUMMARY_BEGIN, SUMMARY_END, SUMMARY_BEGIN_END;
	}

	static ImmutableSpecialNodeTypeSet.Builder builder() {
		return ImmutableSpecialNodeTypeSet.builder();
	}

	SpecialNodeType content();
}
