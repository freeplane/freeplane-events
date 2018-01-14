package org.freeplane.collaboration.event.content.links;

import java.awt.Point;
import java.util.List;
import java.util.Optional;

import org.freeplane.collaboration.event.content.links.ImmutableConnectorData;
import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableConnectorData.class)
@JsonDeserialize(as = ImmutableConnectorData.class)
public interface ConnectorData {
	String targetId();

	int getAlpha();

	String getColor();

	int getWidth();

	Optional<List<Integer>> getDash();

	String getShape();

	boolean getShowControlPointsFlag();

	Optional<String> getSourceLabel();

	Optional<String> getMiddleLabel();

	Optional<String> getTargetLabel();

	String getLabelFontFamily();

	int getLabelFontSize();

	String getStartArrow();

	String getEndArrow();

	Point getStartInclination();

	Point getEndInclination();
}
