package com.automationversion1.basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLoginTitle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		
		// In this page I want title of the page
		
		String titleofthe_page=driver.findElement(By.tagName("h1")).getText();
		
		System.out.println(titleofthe_page);
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
