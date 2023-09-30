package com.starzero.pageActions;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


public class PageActions extends ProjectSpecificMethods implements ElementActions {
	
	
	public WebDriverWait wait;
	public static Actions action;
	private String text = "";
	private boolean status;
	/**
	 * 
	 * @param element
	 */
	public void clickElement(WebElement element) {
		try {
			element.click();
		}
		catch(ElementClickInterceptedException ex)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
//			ex.printStackTrace();
		}
		catch(NoSuchElementException ex)
		{
			ex.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
	public void waitAndClick(WebElement element) {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public void waitAndJsClick(WebElement element) {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public void actionClick(WebElement ele) throws InterruptedException {
		
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			action = new Actions(driver);
			text = ele.getText();
			action.moveToElement(ele).click().build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public void clearAndType(WebElement element, String value) {
		try {
			element.clear();
			element.sendKeys(value);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static boolean isDisplayedInUI(WebElement element){
		return element.isDisplayed();
	}

	
	public boolean isSelected(WebElement element) {
		status = element.isSelected();
		return status;
	}
	
	public void findAndClick(List<WebElement> elements, String value) {
		String text;
		for(WebElement element:elements) {
			text = element.getText();
			if(text.equals(value)) {
				element.click();
				logger.info(value + " is clicked");
				break;
			}
		}
	}
}
