package com.crm.TestCases;

import org.testng.annotations.Test;

public class CreateLeadsTest {

	@Test(groups = "smokeTest")
	public void leadsWithMandatoryFields() {
		System.out.println("leads created successfully");
	}
	
	@Test(groups = "smokeTest")
	public void leadsDeleted() {
		System.out.println("leads deleted successfully");
	}
}
