package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNaukriChildWindow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> a = driver.getWindowHandles();
		int count=a.size();
		System.out.println(count);
		for(String wh:a)
		{
			System.out.println(wh);
		}
		driver.quit();

	}

}
