package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(month);
		s1.selectByValue("7");
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));		
		Select s2=new Select(year);		
		s2.selectByVisibleText("1995");
		driver.findElement(By.linkText("22")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("8878522916");
		driver.findElement(By.id("renew_policy_submit")).click();
		String error = driver.findElement(By.id("policynumberError")).getText();
		System.out.println(error);
		driver.close();
		
		

	}

}
