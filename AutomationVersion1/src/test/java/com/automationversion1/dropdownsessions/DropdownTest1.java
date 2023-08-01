package com.automationversion1.dropdownsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.letskodeit.com/practice");

		WebElement carslist = driver.findElement(By.id("carselect"));

		Select cars = new Select(carslist);

		cars.selectByIndex(1);

		WebElement selectedcar = cars.getFirstSelectedOption();

		String data = selectedcar.getText();

		System.out.println(data); // selected option from dropdown

		Thread.sleep(3000);

		String title = driver.getTitle();

		System.out.println(title);

		String urlpage = driver.getCurrentUrl();

		System.out.println(urlpage);

		driver.close(); // This method close current active browser

	}

}
