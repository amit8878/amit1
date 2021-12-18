package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsTagName {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		String tag = driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).getTagName();
		System.out.println(tag);
        if(tag.contains("a"))
        {
        	System.out.println("anchor tag is present");
        }
        else
        {
        	System.out.println("anchor tag is not present");
        }
        driver.close();
	}

}
