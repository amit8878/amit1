package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13"+Keys.ENTER);
		List<WebElement> allPhones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> phonePrices = driver.findElements(By.xpath("//div[@class='_4rR01T']/../../div[2]/div[1]/div[1]/div[1]"));
		for(int i=0;i<allPhones.size();i++)
		{
			String text = allPhones.get(i).getText();
			String price = phonePrices.get(i).getText();
			System.out.println(text+" ------> "+price);
		}
		driver.close();

	}

}
