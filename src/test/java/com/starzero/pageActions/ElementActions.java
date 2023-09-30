package com.starzero.pageActions;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ElementActions {
	
	
	public void clearAndType(WebElement element, String value);
	
	public void clickElement(WebElement element);
	
	public void waitAndClick(WebElement element);
	
	public void waitAndJsClick(WebElement element);
	
	public void actionClick(WebElement ele)throws InterruptedException;
	
	public void findAndClick(List<WebElement> elements, String value);

}
