package com.automationversion1.basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLogin {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		
		WebElement usrnametextbox =driver.findElement(By.id("login_field"));
		
		usrnametextbox.sendKeys("Testing@gmail.com");
		
		Thread.sleep(2000);// used to halt the execution of code
		
		usrnametextbox.clear();// This method clear text from textbox.
		
		usrnametextbox.sendKeys("Testing123@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.findElement(By.name("commit")).click();
		
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		String urloftheapplication=driver.getCurrentUrl();
		
		System.out.println(urloftheapplication);
	}

}
