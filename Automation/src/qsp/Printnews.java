package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printnews {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> news = driver.findElements(By.xpath("(//ul[@class='top-list__list'])[1]"));
		for(int i=0;i<news.size();i++)
		{
			String text = news.get(i).getText();
			System.out.println(text);
		}
		driver.close();
		
		

	}

}
