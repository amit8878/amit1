
package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class HandlingPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		//WebDriver driver=new ChromeDriver();
		FileInputStream f=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(f);
		String data = p.getProperty("url");
		System.out.println(data);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));

	}

}
