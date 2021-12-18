package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		EdgeDriver e=new EdgeDriver();
	ChromeDriver c=new ChromeDriver();
	c.get("https://www.facebook.com/");	
	String title=c.getTitle();
	System.out.println(title);
	
	
    

	}

}
