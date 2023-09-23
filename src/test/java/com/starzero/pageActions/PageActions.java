package com.starzero.pageActions;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;


public class PageActions {
	
	/**
	 * 
	 * @param element
	 */
	public static void clickElement(WebElement element) {
		try {
			element.click();
		}
		catch(NoSuchElementException ex)
		{
			ex.printStackTrace();
		}
		catch(ElementClickInterceptedException ex) 
		{
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public static void clearAndType(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public static boolean isDisplayedInUI(WebElement element)
	{
		return element.isDisplayed();
	}
}
