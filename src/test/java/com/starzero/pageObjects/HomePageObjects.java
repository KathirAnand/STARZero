package com.starzero.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects extends BasePage{
	
	public HomePageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="")
	WebElement bannerImage;
	
	//navbar Links
	@FindBy(xpath="//a[text()='Login']")
	protected WebElement login;
	
	@FindBy(xpath="//a[text()='Home ']")
	protected WebElement navHome;
	
	@FindBy(xpath="//a[text()='About us']")
	protected WebElement navAboutUs;
	
	@FindBy(xpath="//a[text()='Contact us']")
	protected WebElement navContactUs;
	
	@FindBy(xpath="//a[text()='Plans']")
	protected WebElement navPlans;
	
	@FindBy(xpath="//a[text()='Individual ']")
	protected WebElement navIndividual;
	
	
	
	
}
