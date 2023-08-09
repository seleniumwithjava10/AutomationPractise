package com.automationversion1.cssconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		
		driver.findElement(By.cssSelector("input#login_field")).sendKeys("seleniumjava10@gmail.com");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Testing@1223");
		
		driver.findElement(By.cssSelector("input[value*='Sign']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
