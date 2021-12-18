package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteWithoutClear {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amit2/OneDrive/Desktop/form.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[1]")).sendKeys(Keys.BACK_SPACE);
		

	}

}
