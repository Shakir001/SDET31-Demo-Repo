package com.crm.TestCases;

import org.testng.annotations.Test;

public class ParameterFromEclipseTest {

	@Test
	public void getData1() {
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}
}
