package org.freeplane.collaboration.event.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class EnumMapperSpec {
	enum EnumAB {
		A, B
	}

	enum EnumAB2 {
		A, B
	}

	enum EnumCD {
		C, D
	}

	@Test
	public void testMapping() throws Exception {
		assertThat(EnumMapper.map(EnumAB.A, EnumCD.class)).isEqualTo(EnumCD.C);
		assertThat(EnumMapper.map(EnumAB.B, EnumCD.class)).isEqualTo(EnumCD.D);
	}

	@Test
	public void testSameEnumAssertionWithSameValueNames() throws Exception {
		EnumMapper.assertSameEnums(EnumAB.class, EnumAB2.class);
	}

	@Test(expected = AssertionError.class)
	public void testSameEnumAssertionWithDifferentValueNames() throws Exception {
		EnumMapper.assertSameEnums(EnumAB.class, EnumCD.class);
	}
}
