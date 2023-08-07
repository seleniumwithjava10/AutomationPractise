package com.automationversion1.testngconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EcomTestingUsingTestNG {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch Browser is Successfully");
	}

	@BeforeMethod
	public void login() {
		System.out.println("Login successfully");
	}

	@Test(priority = 1)
	public void searchProduct() {
		System.out.println("Search product successfully");
	}

	@Test (priority = 2)
	public void addToCart() {
		System.out.println("Product added to cart successfully");
	}

	@Test(priority = 3)
	public void checkOutProduct() {

		System.out.println("Product checkout succesfully");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("LogOut Successfully");
	}
	
	@org.testng.annotations.AfterClass
	public void closeBroser() {
		System.out.println("Close Browser");
	}

}
