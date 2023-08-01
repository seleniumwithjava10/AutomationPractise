package com.automationversion1.checkradiosession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxTest {
	
	public static void checkBoxSelect(String checkcar) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> allcheckboxs=driver.findElements(By.xpath("//label/input[@type='checkbox']"));
		
		for(WebElement checkbox:allcheckboxs) {
			String checkcars=checkbox.getAttribute("id");
			if(checkcars.equals(checkcar)) {
				checkbox.click();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		checkBoxSelect("benzcheck");
	}

}
