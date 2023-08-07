package com.automationversion1.testngconcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTest {

	WebDriver driver; // empty
	Properties pr;
	
	SoftAssert softassert= new SoftAssert();

	@BeforeTest
	public void dataSetUp() throws IOException {
		String projectlocation = System.getProperty("user.dir");
		File fi = new File(projectlocation + "\\TestData.Properites");
		BufferedReader br = new BufferedReader(new FileReader(fi));
		pr = new Properties();
		pr.load(br);
	}

	@BeforeClass
	public void setUP() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		String url = pr.getProperty("url");

		driver.get(url); // laucnhed url
	}

	@BeforeMethod
	public void orangeHRMLogin() {

		String urername = pr.getProperty("username");

		String password = pr.getProperty("password");

		driver.findElement(By.name("username")).sendKeys(urername);

		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String actualURL = driver.getCurrentUrl();

		String expURl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		softassert.assertEquals(actualURL, expURl);
	}

	@Test
	public void adminPage() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String acturl = driver.getCurrentUrl();
		Assert.assertEquals(expurl, acturl);
		System.out.println("I'm in admin page");
	}
	
	@Test
	public void leavePage() {
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		String expurl= "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList";
		String acturl  = driver.getCurrentUrl();
		Assert.assertEquals(expurl, acturl); // hard assertion pass next line will execute, hard assertion fail next line won't execute
		System.out.println("I'm in leave page");
	}

	@AfterMethod
	public void logOut() {
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String acturl = driver.getCurrentUrl();

		Assert.assertEquals(expurl, acturl);
		
		softassert.assertAll();

	}

	@org.testng.annotations.AfterClass
	public void tearDown() {
		driver.close();
	}

}
