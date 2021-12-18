package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Dimension dimension = driver.findElement(By.id("email")).getSize();
		int h1 = dimension.getHeight();
		int w1=dimension.getWidth();
		System.out.println("Height = "+h1);
		System.out.println("Width = "+w1);

	}

}
