package com.automationversion1.basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchApplication {

	
	public static void main(String[] args) {
		
		//WebDrivermanger to communicate any browser
		
		WebDriverManager.chromedriver().setup(); // At the time of execute check the browser version and internally download
		//required .exe file
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		
	}
}
