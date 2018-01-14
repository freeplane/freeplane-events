package org.freeplane.collaboration.event.content.links;

import java.util.List;
import java.util.Optional;

import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Value.Immutable
@JsonSerialize(as = ImmutableConnectorData.class)
@JsonDeserialize(as = ImmutableConnectorData.class)
public interface ConnectorData {
	public static enum Shape {
		LINE, LINEAR_PATH, CUBIC_CURVE, EDGE_LIKE
	};

	public static enum ArrowType {
		DEFAULT, NONE;
	}

	@Value.Immutable
	@JsonSerialize(as = ImmutablePoint.class)
	@JsonDeserialize(as = ImmutablePoint.class)
	public interface Point {
		public int x();

		public int y();
	}

	String targetId();

	int getAlpha();

	String getColor();

	int getWidth();

	Optional<List<Integer>> getDash();

	Shape getShape();

	boolean getShowControlPointsFlag();

	Optional<String> getSourceLabel();

	Optional<String> getMiddleLabel();

	Optional<String> getTargetLabel();

	String getLabelFontFamily();

	int getLabelFontSize();

	ArrowType getStartArrow();

	ArrowType getEndArrow();

	Point getStartInclination();

	Point getEndInclination();
}
