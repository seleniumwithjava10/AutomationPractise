package com.automationversion1.dropdownsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropDownTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement mutlidropdown=driver.findElement(By.id("multiple-select-example"));
		
		Select ref= new Select(mutlidropdown);
		ref.selectByIndex(0);
		ref.selectByValue("orange");
		ref.selectByVisibleText("Peach");
		
		Thread.sleep(2000);
		
		ref.deselectAll(); //deselect all option at a time
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
