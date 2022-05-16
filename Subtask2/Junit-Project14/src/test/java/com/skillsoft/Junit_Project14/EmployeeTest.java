package com.skillsoft.Junit_Project14;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
public class EmployeeTest {
	
	static Employee firstEmployee;
	
	@BeforeAll
	public static void initEmployee() {
		firstEmployee = new Employee("Susan", "4rester",1005,'F',"Tech Lead",80000, "Permanent");
		
	}
	
	@Test
	public void assertTest() {
		
		firstEmployee.addProject("Blue Flame");
		firstEmployee.addProject("Black Box");
		
		ArrayList<String> compareList = new ArrayList<>();
		compareList.add("Blue Flame");
		compareList.add("Black Box");
		
		assertIterableEquals(compareList, firstEmployee.getProjects());
	}
	
	@Test
	public void assertTest1() {
		
		firstEmployee.addProject("Blue Flame");
		firstEmployee.addProject("Black Box");
		
		LinkedList<String> compareList = new LinkedList<>();
		compareList.add("Blue Flame");
		compareList.add("Black Box");
		
		assertIterableEquals(compareList, firstEmployee.getProjects());
	}
	
	

}
