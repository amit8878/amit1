package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependent1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		String version = driver.findElement(By.xpath("//p[.='Python']/../p[2]/a")).getText();
		System.out.println("Stable version for python is :"+ version);
		driver.close();

	}

}
