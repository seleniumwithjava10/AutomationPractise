package com.automationversion1.actionssession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTestDemo1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement rightclickbtn = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions action = new Actions(driver);

		action.contextClick(rightclickbtn).perform();

		WebElement deletebtn = driver.findElement(By.xpath("//span[.='Delete']"));

		action.click(deletebtn).perform();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();

		Thread.sleep(2000);

		driver.close();
	}

}
