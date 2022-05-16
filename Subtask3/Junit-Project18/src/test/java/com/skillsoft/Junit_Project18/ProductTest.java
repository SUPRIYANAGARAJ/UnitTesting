package com.skillsoft.Junit_Project18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.JRE;


public class ProductTest { 
	
static Product tv;

//for system properties	
	/*@BeforeAll
	public static void init() {
		tv = new Product("Diallonic","Delta",13423,800,"Electronics");
		
		System.out.println("System properties:");
		System.out.println("os.arch: " + System.getProperty("os.arch"));
		System.out.println("os.version: " + System.getProperty("os.version"));
		System.out.println("os.name: " + System.getProperty("os.name"));
		System.out.println("user.name: " + System.getProperty("user.name"));
	}
	
	@Test
	@DisplayName("Brand Name Check")
	@EnabledIfSystemProperty(named = "os.arch", matches = "amd64")
	public void brandNameTest() {
		assertEquals("Diallonic", tv.getBrandName(), "Brand NameTest");
	}
	
	@Test
	@DisplayName("Price Check")
	@EnabledIfSystemProperty(named = "os.version", matches = "10\\..*")
	public void priceTest() {
		assertEquals(800, tv.getPrice(), "Price Test");
	}
	
	@Test
	@DisplayName("Category Check")
	@EnabledIfSystemProperty(named = "os.name", matches = "Windows 10")
	public void categoryTest() {
		assertEquals("Electronics", tv.getCategory(), "Category Test");
	}
	
	@Test
	@DisplayName("Model Check")
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*_64")
	public void modelTest() {
		assertEquals("Delta", tv.getModel(), "Model Test");
	}*/

//for environment variables
@BeforeAll
public static void init1() {
	tv = new Product("Diallonic","Delta",13423,800,"Electronics");
	
	System.out.println("Environment variables:");
	System.out.println("PROCESSOR_LEVEL: " + System.getenv("PROCESSOR_LEVEL"));
	System.out.println("USERDOMAIN_ROAMINGPROFILE: " + System.getenv("USERDOMAIN_ROAMINGPROFILE"));
	System.out.println("ALL: " +System.getenv());
}
	

@Test
@DisplayName("Brand Name Check")
@EnabledIfEnvironmentVariable(named = "PROCESSOR_LEVEL", matches = "6")
public void brandNameTest1() {
	assertEquals("Diallonic", tv.getBrandName(), "Brand NameTest");
}

@Test
@DisplayName("Price Check")
@EnabledIfEnvironmentVariable(named = "USERDOMAIN_ROAMINGPROFILE", matches = "AMERICAS")
public void priceTest1() {
	assertEquals(800, tv.getPrice(), "Price Test");
}

@Test
@DisplayName("Category Check")
@EnabledIfEnvironmentVariable(named = "USER", matches = "loony.*")
public void categoryTest1() {
	assertEquals("Electronics", tv.getCategory(), "Category Test");
}

@Test
@DisplayName("Model Check")
@EnabledIfEnvironmentVariable(named = "LANG", matches = "de_DE*")
public void modelTest1() {
	assertEquals("Delta", tv.getModel(), "Model Test");
}


	

}
