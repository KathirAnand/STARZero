package com.starzero.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.starzero.pageActions.PageActions;

public class BasePage extends PageActions {
	
	protected WebDriver driver;
	protected PageActions action = new PageActions();
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
