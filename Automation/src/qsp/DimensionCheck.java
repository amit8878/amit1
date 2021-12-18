package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionCheck {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		Dimension dimension1 = driver.findElement(By.id("username")).getSize();
		int h1 = dimension1.getHeight();
		int w1=dimension1.getWidth();
		Dimension dimension2 = driver.findElement(By.name("pwd")).getSize();
		int h2=dimension2.getHeight();
		int w2=dimension2.getWidth();
		if(h1==h2&&w1==w2)
		{
			System.out.println("height and width of both textbox are equal");
		}
		else
		{
			System.out.println("height and width are not equal");
		}
		driver.close();

	}

}
