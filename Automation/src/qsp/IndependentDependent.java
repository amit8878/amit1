package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amit2/OneDrive/Desktop/table.html");
		String text = driver.findElement(By.xpath("//td[.='selenium']/../td[2]")).getText();
         System.out.println(text);
         driver.close();
	}

}
