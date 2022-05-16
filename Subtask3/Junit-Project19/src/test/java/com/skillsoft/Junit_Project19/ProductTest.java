package com.skillsoft.Junit_Project19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;


public class ProductTest {
	
	static Product tv;
	
	/*@BeforeAll
	public static void init() {
		tv = new Product("Diallonic","Delta",13423,800,"Electronics");
		
		System.out.println("Environment variables:");
		System.out.println("PROCESSOR_LEVEL: " + System.getenv("PROCESSOR_LEVEL"));
		System.out.println("USERDOMAIN_ROAMINGPROFILE: " + System.getenv("USERDOMAIN_ROAMINGPROFILE"));
		System.out.println("ALL: " +System.getenv());
	}
		

	@Test
	@DisplayName("Brand Name Check")
	@EnabledIfEnvironmentVariable(named = "PROCESSOR_LEVEL", matches = "6")
	@EnabledForJreRange(max = JRE.JAVA_11)
	public void brandNameTest() {
		assertEquals("Diallonic", tv.getBrandName(), "Brand NameTest");
	}

	@Test
	@DisplayName("Price Check")
	@EnabledIfEnvironmentVariable(named = "USERDOMAIN_ROAMINGPROFILE", matches = "AMERICAS")
	@DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
	public void priceTest() {
		assertEquals(800, tv.getPrice(), "Price Test");
	}

	@Test
	@DisplayName("Category Check")
	@EnabledIfEnvironmentVariable(named = "USER", matches = "loony.*")
	@EnabledOnOs(OS.WINDOWS)
	public void categoryTest() {
		assertEquals("Electronics", tv.getCategory(), "Category Test");
	}

	@Test
	@DisplayName("Model Check")
	@EnabledIfEnvironmentVariable(named = "LANG", matches = "de_DE*")
	@DisabledForJreRange(min = JRE.JAVA_14)
	public void modelTest() {
		assertEquals("Delta", tv.getModel(), "Model Test");
	}*/
	
	//custom annotations
	@BeforeAll
	public static void init1() {
		tv = new Product("Diallonic", "Delta", 13423,800,"Electronics");
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Test
	@EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
	@EnabledOnOs(OS.WINDOWS)
	@EnabledIfSystemProperty(named = "os.arch", matches = "amd64")
	public @interface MyCustomTestConditions {
}

	@MyCustomTestConditions
	@DisplayName("Brand Name Check")
	public void brandNameTest1() {
		assertEquals("Diallonic", tv.getBrandName(), "Brand NameTest");
	}

	@MyCustomTestConditions
	@EnabledIfEnvironmentVariable(named = "USERDOMAIN_ROAMINGPROFILE", matches = "AMERICAS")
	@DisplayName("Price Check")
	public void priceTest1() {
		assertEquals(800, tv.getPrice(), "Price Test");
	}

	@MyCustomTestConditions
	@DisabledIfEnvironmentVariable(named = "PROCESSOR_LEVEL", matches = "6")
	@DisplayName("Category Check")
	public void categoryTest1() {
		assertEquals("Electronics", tv.getCategory(), "Category Test");
	}

	
	@DisplayName("Model Check")
	@MyCustomTestConditions
	@EnabledIfEnvironmentVariable(named = "USER", matches = "skill.*")
	public void modelTest1() {
		assertEquals("Delta", tv.getModel(), "Model Test");
	}
}