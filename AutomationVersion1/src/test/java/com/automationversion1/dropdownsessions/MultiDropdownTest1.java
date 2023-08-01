package com.automationversion1.dropdownsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropdownTest1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement mulitplevaues=driver.findElement(By.id("multiple-select-example"));
		
		Select ref= new Select(mulitplevaues);
		
		List<WebElement> alloptions=ref.getOptions();
		
		for(WebElement option:alloptions) {
			System.out.println(option.getText());
		}
	}

}
