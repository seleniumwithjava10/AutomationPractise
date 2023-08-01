package com.automationversion1.basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLogin1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		
		driver.findElement(By.id("login_field")).sendKeys("Testing@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Testing123");
		
		driver.findElement(By.name("commit")).click();
		
		//driver.findElement(By.linkText("Forgot password?")).click();
		
		driver.findElement(By.partialLinkText("Create an")).click();
		
		Thread.sleep(3000);
		
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		String pageurl=driver.getCurrentUrl();
		
		System.out.println(pageurl);
		
		Thread.sleep(10000); // This command halt the execution of the code
		
		driver.close();
	}

}
