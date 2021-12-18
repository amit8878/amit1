package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggetion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allOptions = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allOptions.size();
	    for (int i = 0; i < count; i++) {
			 String text = allOptions.get(i).getText();
			System.out.println(text);
		}
	    Thread.sleep(2000);
	    driver.close();
	    }

	}


