package com.automationversion1.webtableconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://letcode.in/table");

		WebElement table = driver.findElement(By.cssSelector("table#simpletable"));

		List<WebElement> tableheaders = table.findElements(By.tagName("th"));

		for (WebElement tableheader : tableheaders) {
			String data = tableheader.getText();
			System.out.println(data);
		}
		
		List<WebElement> allrows=table.findElements(By.cssSelector("tbody>tr"));
		
		int size=allrows.size();
		
		if(size==3) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
      
		  for(WebElement row:allrows) {  //3 =1
			  List<WebElement> allcolumns=row.findElements(By.tagName("td"));
			  
			  String firstrowdata=allcolumns.get(0).getText();
			  
			  System.out.println(firstrowdata);
		  }
		
	}

}
