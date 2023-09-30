package com.starzero.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class IndividualPageObjects extends BasePage {

	public IndividualPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath= "//p[text()='Track ']")
	public WebElement headingTrack;
	
	@FindBy(xpath= "//p[text()='Assess']")
	public WebElement headingAssess;
	
	@FindBy(xpath= "//p[text()='Offset ']")
	public WebElement headingOffset;
	
	@FindBy(xpath= "//p[text()='Emission']")
	public WebElement headingEmission;
	
	@FindBy(css= ".individual_btn")
	public WebElement subscribeNowbtn;
	
	@FindBy(xpath = "//li[@class='m-2 mr-3']//img[@alt='countryIcon']")
	protected WebElement countryDropdown;
	
	@FindBy(xpath = "//div[@role='button']")
	public WebElement dropdown;
	
	@FindAll(@FindBy(xpath = "//ul[@role = 'listbox']/child::li"))
	protected List<WebElement> countries;

}
