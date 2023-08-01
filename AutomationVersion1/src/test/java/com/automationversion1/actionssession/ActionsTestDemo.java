package com.automationversion1.actionssession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTestDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleclickbutton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions action= new Actions(driver);
		
		action.doubleClick(doubleclickbutton).perform();
		
		
	     Alert alert=driver.switchTo().alert();
	     
	     String alertmessage=alert.getText();
	     
	     System.out.println(alertmessage);
	     
	     alert.accept();
	     
	     Thread.sleep(2000);
	     
	     driver.close();
	}

}
