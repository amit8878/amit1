package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSPIDER/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		s.selectByIndex(2);
		s.selectByVisibleText("idly");
		s.selectByValue("d");
		if(s.isMultiple()==true)
		{
			s.deselectByVisibleText("vada");
			s.deselectByValue("d");
			s.deselectByIndex(0);
			
		}
		driver.close();

	}

}
