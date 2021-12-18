package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSPIDER/12PM%20WEB/form/form2.html");
		driver.findElement(By.xpath("//input[1]")).clear();
		driver.findElement(By.xpath("//input[1]")).sendKeys("rahil");

	}

}
