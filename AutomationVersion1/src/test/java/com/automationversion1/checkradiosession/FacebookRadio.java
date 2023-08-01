package com.automationversion1.checkradiosession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRadio {
	
	public static void facekbookRadioSelect(String reqgender) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/signup");
		
		
		List<WebElement> allradios=driver.findElements(By.xpath("//input[@type='radio']/../label"));
		
		for(WebElement radio:allradios) {
			String gender=radio.getText();
			
			if(gender.equalsIgnoreCase(reqgender)) {
				radio.click();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		facekbookRadioSelect("male");
	}

}
