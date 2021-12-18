package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]"));
		driver.navigate().back();
		driver.get("https://www.facebook.com");
		boolean logo = driver.findElement(By.xpath("//img[contains(@src,'fbcdn')]")).isDisplayed();
		if(logo==true)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("LOGO IS NOT PRESENT");
		}
		driver.close();

	}

}
