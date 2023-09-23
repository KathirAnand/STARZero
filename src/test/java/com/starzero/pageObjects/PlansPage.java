package com.starzero.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlansPage extends BasePage {

	public PlansPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "((//label[text()='Select your country']))[1]")
	public WebElement dropDown;
	

}
