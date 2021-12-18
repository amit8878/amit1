package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amit2/OneDrive/Desktop/form.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[2]")).sendKeys(Keys.CONTROL+"av");
		
		driver.close();

	}

}