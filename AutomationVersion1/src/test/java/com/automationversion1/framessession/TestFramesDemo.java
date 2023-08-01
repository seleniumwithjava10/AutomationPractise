package com.automationversion1.framessession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFramesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		WebElement textbox = driver.findElement(By.className("frmTextBox"));

		Actions action = new Actions(driver);
		action.moveToElement(textbox).perform();

		// driver.switchTo().frame(driver.findElement(By.id("frm1")));

		WebElement menu = driver.findElement(By.id("selectnav2"));

		action.moveToElement(menu).perform();

		Select ref = new Select(menu);
		ref.selectByVisibleText("Home");
	}

}
