package com.skillsoft.Junit_Project25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;


public class EmployeeTest {

	@ParameterizedTest
	@ValueSource(strings = {"developer", "tester", "release engineer", "storage engineer"})
	@DisplayName("Role Check")
	@Tag("TEST")
	public void converterTest(@ConvertWith(RoleConverter.class) String role) {
		
		Employee employee = new Employee("Brian", "Alford", 1011, 'M',role,50000,"Contract");
		
		System.out.println("Value of role: " + role);
		
		assertEquals(role, employee.getRole());
	}
}
