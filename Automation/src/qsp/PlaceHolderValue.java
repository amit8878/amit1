package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderValue {static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		String value = driver.findElement(By.id("username")).getAttribute("placeholder");
		System.out.println(value);
      
        driver.close();
	}

}