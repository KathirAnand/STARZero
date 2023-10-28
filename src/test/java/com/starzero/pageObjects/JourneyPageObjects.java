package com.starzero.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JourneyPageObjects extends BasePage{

	public JourneyPageObjects(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(xpath= "//img[@class='Journey_jou_addTrip__Rcfta']")
	public WebElement recordTrip;
		
	@FindBy(xpath= "//input[@name='reading']")
	public WebElement odometerReadingInputField;
	
	@FindBy(xpath= "//button[text()='Submit']")
	public WebElement submitBtn;
	
	@FindBy(xpath= "//button[normalize-space()='Cancel']")
	public WebElement cancelBtn;
	
	@FindBy(xpath= "//input[@id='image-upload']")
	public WebElement imageInputField;
	
	@FindBy(xpath= "//label[text()='Upload']")
	public WebElement uploadBtn;
	
	@FindBy(xpath= "//a[text()='How?']")
	public WebElement howLink;
}
