package com.automationversion1.actionssession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTestDemo3 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		WebElement googlesearch=driver.findElement(By.name("q"));
		
		Actions action= new Actions(driver);
		
		action.keyDown(Keys.SHIFT).sendKeys(googlesearch, "selenium").keyUp(Keys.SHIFT).sendKeys("selenium").perform();
		
		  File filename=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  FileUtils.copyFile(filename, new File("C:\\Users\\ADMIN\\Documents\\New Batch 26th June 2023\\page.jpg"));
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
