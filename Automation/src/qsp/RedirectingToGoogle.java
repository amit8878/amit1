package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectingToGoogle {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("google.com")) {
			System.out.println("url contains google so pass");
		} else {
               System.out.println("url not contains goolge so fail");
		}
		driver.close();
		

	}

}
