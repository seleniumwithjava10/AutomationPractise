package com.automationversion1.testngconcepts;

public class EcommerceTesting {
	
	public void lauchBrowser() {
		System.out.println("Lauch Browser Successfully");
	}

	public void login() {
		System.out.println("Login successfully");
	}

	public void searchProduct() {
		System.out.println("Search product successfully");
	}

	public void addToCart() {
		System.out.println("Product added to cart successfully");
	}

	public void checkOutProduct() {

		System.out.println("Product checkout succesfully");
	}

	public void logOut() {
		System.out.println("LogOut Successfully");
	}
	
	public void closeBrowser() {
		System.out.println("Close Browser Succcessfully");
	}
	
	public static void main(String[] args) {
		EcommerceTesting test= new EcommerceTesting();
		
		test.lauchBrowser();
		
		test.login();
		
		test.searchProduct();
		
		test.addToCart();
		
		test.checkOutProduct();
		
		test.logOut();
		
		test.closeBrowser();
	}

}
