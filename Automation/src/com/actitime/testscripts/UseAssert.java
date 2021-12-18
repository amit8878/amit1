package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseAssert {
	static {
  	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
   @Test
   public void testVerifyTitle() {
  	 WebDriver driver=new ChromeDriver();
  	 driver.get("https://google.com/");
  	 String actualTitle = driver.getTitle();
  	 String expectedTitle = "soogle";
  	 Assert.assertEquals(actualTitle, expectedTitle);
  	 driver.close();
     
}
}
