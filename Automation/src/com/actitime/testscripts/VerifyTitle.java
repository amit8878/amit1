package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
      static {
    	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
      }
     @Test
     public void testVerifyTitle() {
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://google.com/");
    	 String actualTitle = driver.getTitle();
    	 String expectedTitle = "soogle";
    	  if (actualTitle.equals(expectedTitle)) {
			System.out.println("title is matching and pass");
		}
    	  else {
			System.out.println("title is not matching and fail");
		}
    	  driver.close();
     }
	
	

}
