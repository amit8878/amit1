package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectingToSelenium {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("selenium.dev")) {
			System.out.println("url contains selenium.dev so pass");
		} else {
               System.out.println("url not contains selenium.dev so fail");
		}
		
		driver.close();
		

	}
}
