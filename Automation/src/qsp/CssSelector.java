package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();
         driver.get("http://127.0.0.1:5500/layout/new3.html");
         driver.findElement(By.cssSelector("a[id='d1']")).click();
         driver.navigate().back();
         driver.findElement(By.cssSelector("a[name='n1']")).click();
         driver.navigate().back();
         driver.findElement(By.cssSelector("a[class='c1']")).click();
         driver.navigate().back();
         driver.findElement(By.cssSelector("a[href='https://www.facebook.com/']")).click();

	}

}
