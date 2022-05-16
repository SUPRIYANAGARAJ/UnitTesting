package com.skillsoft.Junit_Project24;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoleConverter extends SimpleArgumentConverter{

	@Override
	protected Object convert(Object source, Class<?> target) {
		// TODO Auto-generated method stub
		assertEquals(String.class, target);
		return String.valueOf(source).toUpperCase();
	}

}
