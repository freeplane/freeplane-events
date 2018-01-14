package org.freeplane.collaboration.event.utils;

import java.util.stream.Stream;

public class EnumMapper {
	public static <T extends Enum<T>, U extends Enum<U>> U map(T source, Class<U> targetClass) {
		return targetClass.getEnumConstants()[source.ordinal()];
	}

	public static <T extends Enum<T>, U extends Enum<U>> void assertSameEnums(Class<T> sourceClass,
	                                                                          Class<U> targetClass) {
		final String sourceConstants = stringOf(sourceClass.getEnumConstants());
		final String targetConstants = stringOf(targetClass.getEnumConstants());
		if (!sourceConstants.equals(targetConstants))
			throw new AssertionError("Different enum constants");
	}

	private static <T extends Enum<T>> String stringOf(final T[] sourceConstants) {
		return Stream.of(sourceConstants).map(Enum::name).reduce((a, b) -> a + ", " + b).orElse("");
	}
}
