package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleOfNaukri {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> a = driver.getWindowHandles();
		for(String wh:a)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			
		}
		driver.quit();

	}

}
