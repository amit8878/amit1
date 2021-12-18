package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[1])[4]")).sendKeys("bang");
		driver.findElement(By.xpath("//p[contains(.,'Bangalore, IN - Kempegowda International Airport (BLR)')]")).click();
		driver.findElement(By.xpath("(//input[1])[5]")).sendKeys("goa");
		driver.findElement(By.xpath("//p[contains(.,'Goa, IN - Dabolim Airport (GOI)')]")).click();
		driver.findElement(By.xpath("(//button)[4]")).click();
		driver.findElement(By.xpath("(//div[.='28'])[3]")).click();
		driver.findElement(By.xpath("(//button)[5]")).click();
		List<WebElement> flightNames = driver.findElements(By.xpath("//img[@class='br-2 o-hidden mx-1']"));
		List<WebElement> time = driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-400 c-neutral-900']"));
		for(int i=0;i<flightNames.size();i++)
		{
			String flight = flightNames.get(i).getAttribute("alt");
			String t = time.get(3*i).getText();
			System.out.println("Flight name : "+flight);
			System.out.println("Departure time : "+t);
		}
		driver.close();
		

	}

}
