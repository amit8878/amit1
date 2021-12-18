package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSPIDER/hotel.html");
		WebElement slvListBox = driver.findElement(By.id("slv"));
		Select s=new Select(slvListBox);
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		driver.close();

	}

}
