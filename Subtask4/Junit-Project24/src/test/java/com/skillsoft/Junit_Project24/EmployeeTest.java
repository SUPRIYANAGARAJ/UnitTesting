package com.skillsoft.Junit_Project24;

import java.util.stream.Stream;

import javax.naming.InvalidNameException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class EmployeeTest {
	
	/*static Stream<String> getLastNames(){
		
		return Stream.of("Al4d", "B3nson", "$mith", "@lford");
		
	}*/
	
	/*@ParameterizedTest
	@MethodSource("getLastNames")
	@DisplayName("Name Check")
	public void nameTest(String lName) {
		
		Employee employee = new Employee("Brian", lName, 1011, 'M',"Tester",50000,"Contract");
		
		assertThrows(InvalidNameException.class,
				() -> {employee.validateLastName();},
				"Throws Exception test");
	}*/
	
	/*@ParameterizedTest(name = "Test #{index} - Last name: {0}")
	@MethodSource("getLastNames")
	@DisplayName("Name Check")
	public void nameTest1(String lName) {
		
		Employee employee = new Employee("Brian", lName, 1011, 'M',"Tester",50000,"Contract");
		
		assertThrows(InvalidNameException.class,
				() -> {employee.validateLastName();},
				"Throws Exception test");
	}*/
	
	//RoleConverter
	@ParameterizedTest
	@ValueSource(strings = {"developer", "tester", "release engineer", "storage engineer"})
	@DisplayName("Role Check")
	public void converterTest(@ConvertWith(RoleConverter.class) String role) {
		
		Employee employee = new Employee("Brian", "Alford", 1011, 'M',role,50000,"Contract");
		
		System.out.println("Value of role: " + role);
		
		assertEquals(role, employee.getRole());
	}
	

	
}
