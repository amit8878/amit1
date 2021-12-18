package com.actitime.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("e=webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("OpenBrowser", true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverCommonLib wc=new WebDriverCommonLib();
		wc.waitForElementToLoad(driver);
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void login() {
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	@AfterMethod
	public void logout() {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();
		
		
	}
	

}
