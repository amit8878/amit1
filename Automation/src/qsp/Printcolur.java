package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printcolur {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		String colour = link.getCssValue("color");
		String fontsize = link.getCssValue("font-size");
		String fonttype = link.getCssValue("font-family");
		System.out.println(colour);
		System.out.println(fontsize);
		System.out.println(fonttype);
		driver.close();
		

	}

}
