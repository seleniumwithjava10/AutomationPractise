package com.automationversion1.basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://facebook.com");//get() is used to launch url in the browser
		
		driver.manage().window().maximize();// this command will increase page maximum size
		
		driver.close(); //This command is used to close opened browser.
	}

}
