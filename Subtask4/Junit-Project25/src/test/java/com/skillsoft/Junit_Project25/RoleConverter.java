package com.skillsoft.Junit_Project25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class RoleConverter extends SimpleArgumentConverter{

	@Override
	protected Object convert(Object source, Class<?> target) {
		// TODO Auto-generated method stub
		assertEquals(String.class, target);
		return String.valueOf(source).toUpperCase();
	}


}
