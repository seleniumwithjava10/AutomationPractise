package com.automationversion1.basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GithubLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login_field")).sendKeys("Testing@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Testing123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("commit")).click();
		
		Thread.sleep(2000); // This command halt the execution for 2 seconds
		
		driver.close();
	}

}
