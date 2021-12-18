package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Generic class for webdriver
 * @author amit2
 *
 */
public class WebDriverCommonLib {

	/**
	 * Generic method for implicit wait
	 * @param driver
	 */
	public void waitForElementToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * Explicit wait for element is visible
	 * @param driver
	 * @param element
	 */
	public void waitForElementPresence(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	/**
	 * Custom wait for element is present in GUI
	 * @param element
	 */
	public void customWaitForElement(WebElement element) {
		int i=0;
	    while (i<=1000) {
			try {
				element.isDisplayed();
				break;
			} catch (Exception e) {
				i++;
			}
		}
	}
	
	/**
	 * Select the option in listbox using index
	 * @param element
	 * @param index
	 */
	public void selectOption(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
		
	}
	
	/**
	 * select the option in listbox using visible text
	 * @param element
	 * @param text
	 */
	public void selectOption(WebElement element, String text) {
		Select s=new Select(element);
		s.deselectByVisibleText(text);
	}
}
