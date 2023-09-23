package com.starzero.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualPage extends BasePage {

	public IndividualPage(WebDriver driver) {
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

}
