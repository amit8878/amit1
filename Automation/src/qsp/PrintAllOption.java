package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSPIDER/hotel.html");
		WebElement AllOption = driver.findElement(By.id("slv"));
		Select s=new Select(AllOption);
		List<WebElement> allOption = s.getOptions();
//		for(int i=0;i<allOption.size();i++)
//		{
//			String text = allOption.get(i).getText();
//			System.out.println(text);
//		}
		for(WebElement option:allOption)
		{
			String text = option.getText();
			System.out.println(text);
		}
		driver.close();

	}

}
