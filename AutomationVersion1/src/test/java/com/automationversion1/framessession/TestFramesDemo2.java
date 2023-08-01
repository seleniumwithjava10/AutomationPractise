package com.automationversion1.framessession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFramesDemo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://jqueryui.com/droppable/");
		
		WebElement framepage=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(framepage);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions ref= new Actions(driver);
		
		ref.dragAndDrop(drag, drop).perform();
	}

}
