package com.automationversion1.syncronizationconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo4 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver, 30);

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://letcode.in/signin");
		
		driver.findElement(By.name("email")).sendKeys("testingdemo@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Testing@123");
		
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		
		WebElement toast=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()=' Welcome Testing ']"))));
		
		System.out.println(toast.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(toast));
		
		driver.findElement(By.linkText("Sign out")).click();
		
		
		
		
	}

}
