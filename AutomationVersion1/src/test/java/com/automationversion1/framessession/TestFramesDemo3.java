package com.automationversion1.framessession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFramesDemo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://letcode.in/frame");
       
		//If we define implicity wait here it will applicable for all classes and current class //10 sec
		
		WebElement frame1 = driver.findElement(By.xpath("//*[@name='firstFr']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.name("fname")).sendKeys("Guru"); // Req wait is  1 sec 10 9 seconds collapsed

		driver.findElement(By.name("lname")).sendKeys("M");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='innerFrame']")));
		
		driver.findElement(By.name("email")).sendKeys("GuruMohanReddymadem@gmail.com");
		
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.name("lname")).sendKeys("Madem");
		
		Thread.sleep(3000);
		
		//driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
	}

}
