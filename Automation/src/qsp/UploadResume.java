package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResume {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='mTxt'])[7]")).click();
		driver.findElement(By.xpath("//div[text()='Please enter your Email ID / Username']/../input")).sendKeys("dark22shadow95@gmail.com");
		driver.findElement(By.xpath("//input[@class='err-border']/../../div[3]/input")).sendKeys("8878522916");
		driver.findElement(By.xpath("//input[@class='err-border']/../../div[6]/button")).click();

	}

}
