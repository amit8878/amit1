package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UseSoftAssert {
	static {
  	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
   @Test
   public void testVerifyTitle() {
  	 WebDriver driver=new ChromeDriver();
  	 driver.get("https://google.com/");
  	 String actualTitle = driver.getTitle();
  	 String expectedTitle = "soogle";
  	 SoftAssert s= new SoftAssert();
  	 s.assertEquals(actualTitle, expectedTitle);
  	 driver.close();
  	 s.assertAll();
   }

}
