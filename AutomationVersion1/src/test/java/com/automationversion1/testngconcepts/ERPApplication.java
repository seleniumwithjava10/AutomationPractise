package com.automationversion1.testngconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ERPApplication {

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Successfully");
	}

	@BeforeClass  // This will execute  before every time for Test method()
	public void login() {
		System.out.println("Login Successfully");
	}
	
	@Test (priority = 2)
	public void addEmployees() {
		System.out.println("Added Employees");
	}
	
	@Test (priority = 1)
	public void deleteEmployees() {
		System.out.println("Delete Employees");
	}
	
	@Test (priority = 3)
	public void updateEmployees() {
		System.out.println("Update Employees");
	}
	
	@AfterClass  // This will execute after every time for Test method
	public void logOut() {
		System.out.println("LogOut ERP Applicaiton");
	}
	
	@org.testng.annotations.AfterTest
	public void closeBrowser() {
		System.out.println("Close browser successfully");
	}

}
