package com.skillsoft.Junit_Project23;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
	
	/*static Employee employee;
	static double salary;
	
	@BeforeAll
	public static void initEmployee() {
		
		salary = 45000;
		employee = new Employee("Brian", "Alford", 1011, 'M', "Tester",salary, "Contract");
	}

	@ParameterizedTest
	@DisplayName("Salary Update")
	@ValueSource(doubles = {500, 1000, 1300, 2400, 3500, 4000, 6000})
	public void salaryUpdateTest(double salaryIncrement) {
		
        
		employee.adjustSalary(salaryIncrement);
		salary += salaryIncrement;
		
		assertEquals(salary, employee.getSalary(), "Test salary updates");
		
		
	}*/
	
	/*@ParameterizedTest
	@DisplayName("Last Name Check")
	@ValueSource(strings = {"Al4d", "B3nson", "$mith", "@lford"})
	public void nameTest(String lastName) {
		
		Employee employee = new Employee("Brian", lastName, 1011, 'M',"Tester",50000,"Contract");
		
		assertThrows(InvalidNameException.class,
				() -> {employee.validateLastName();},
				"Throws Exception test");
	}*/
	
	/*@ParameterizedTest
	@NullSource
	@DisplayName("Null Name Check")
	public void nameTest1(String name) {
		
		Employee employee = new Employee(name, name, 1011, 'M',"Tester",50000,"Contract");
		
		assertNull(employee.getFirstName());
		assertNull(employee.getLastName());
	}*/
	
	/*@ParameterizedTest
	@EmptySource
	@DisplayName("Empty Name Check")
	public void nameTest2(String name) {
		
		Employee employee = new Employee(name, name, 1011, 'M',"Tester",50000,"Contract");
		
		assertEquals("",employee.getFirstName());
		assertEquals("",employee.getLastName());
	}*/
	
	/*@ParameterizedTest
	@NullAndEmptySource
	@DisplayName("Empty Name Check")
	public void nameTest2(String name) {
		
		Employee employee = new Employee(name, name, 1011, 'M',"Tester",50000,"Contract");
		
		String fName = employee.getFirstName();
		assertTrue(fName == null || fName.isEmpty());
	}*/
	
//	@ParameterizedTest
//	@CsvSource({"Brian, Alford", "Amy, Cruz", "Raj, Chwanda"})
//	@DisplayName("Name Check")
//	public void nameTest3(String fName, String lName) {
//		
//		Employee employee = new Employee(fName.trim(), lName.trim(), 1011, 'M',"Tester",50000,"Contract");
//		
//		assertEquals(fName.trim(), employee.getFirstName());
//		assertEquals(lName.trim(), employee.getLastName());
//		
//		
//	}
//	
	@ParameterizedTest
	@CsvFileSource(resources="/empnames.csv",numLinesToSkip=1)
	@DisplayName("Name Check")
	public void nameTest3(String fName, String lName) {
		
		Employee employee = new Employee(fName.trim(), lName.trim(), 1011, 'M',"Tester",50000,"Contract");
		
		assertEquals(fName.trim(), employee.getFirstName());
		assertEquals(lName.trim(), employee.getLastName());
		
		
	}
	
	
	
	

}
