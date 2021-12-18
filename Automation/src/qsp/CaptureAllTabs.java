package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllTabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> itr = tabs.iterator();
		String ptab = itr.next();
		String ctab = itr.next();
		driver.switchTo().window(ctab);
		List<WebElement> allTabs = driver.findElements(By.xpath("//span[text()='Features']/../../li"));
		for (WebElement webElement : allTabs) {
			System.out.println(webElement.getText());
			
		}
		driver.quit();
		

	}

}
