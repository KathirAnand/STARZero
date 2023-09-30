package com.starzero.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class PlansPageObjects extends BasePage {

	public PlansPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "((//label[text()='Select your country']))[1]")
	public WebElement dropDownLabel;
	
	
	@FindBy(xpath = "//div[@role='button']")
	public WebElement dropdown;
	
	
	@FindBy(xpath = "//li[normalize-space()='IN']")
	public WebElement countrtIndia;
	
	
	@FindBy(xpath = "//li[contains(text(),'UK')]")
	protected WebElement countrtUK;
	
	@FindAll(@FindBy(xpath = "//ul[@role = 'listbox']/child::li"))
	protected List<WebElement> countries;
}
