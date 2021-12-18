package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amit2/OneDrive/Desktop/file.html");
		File f=new File("./data/resume.docx");
		String absolutePath = f.getAbsolutePath();
		driver.findElement(By.id("ev")).sendKeys(absolutePath);
		
	}

}
