package com.starzero.pageActions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


public class PageActions extends ProjectSpecificMethods implements ElementActions {
	
	
	public WebDriverWait wait;
	/**
	 * 
	 * @param element
	 */
	public void clickElement(WebElement element,WebDriver driver) {
		try {
			element.click();
		}
		catch(ElementClickInterceptedException ex)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
			ex.printStackTrace();
		}
		catch(NoSuchElementException ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	public void actionClick(WebElement ele,WebDriver driver) throws InterruptedException {
		String text = "";
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			Actions action = new Actions(driver);
			text = ele.getText();
			action.moveToElement(ele).click().build().perform();
//			reportStep("The Element " + text + " clicked", "pass");
		} catch (StaleElementReferenceException e) {
//			reportStep("The Element " + text + " could not be clicked", "fail");
			throw new RuntimeException();
		} catch (Exception e) {
//			reportStep("The Element " + e + " could not be clicked", "fail");
			throw new RuntimeException();
		}
	}
	
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public void clearAndType(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public static boolean isDisplayedInUI(WebElement element)
	{
		return element.isDisplayed();
	}
}
