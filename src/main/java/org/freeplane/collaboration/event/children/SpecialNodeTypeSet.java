package org.freeplane.collaboration.event.children;

import org.freeplane.collaboration.event.NodeUpdated;
import org.freeplane.collaboration.event.children.ImmutableSpecialNodeTypeSet;
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
