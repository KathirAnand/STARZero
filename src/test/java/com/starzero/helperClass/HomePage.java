package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;

import com.starzero.pageObjects.AboutUsPageObjects;
import com.starzero.pageObjects.ContactUsPageObjects;
import com.starzero.pageObjects.HomePageObjects;
import com.starzero.pageObjects.IndividualPageObjects;

public class HomePage extends HomePageObjects{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public IndividualPageObjects clickIndividual() {
		clickElement(navIndividual);
		return new IndividualPageObjects(driver);
	}
	
	public HomePage clickHome() {
		clickElement(navHome);
		return this;
		
	}
	
	public PlansPage clickPlans() {
		clickElement(navPlans);
		return new PlansPage(driver);
		
	}
	
	public AboutUsPageObjects clickAboutUs() {
		clickElement(navAboutUs);
		return new AboutUsPageObjects(driver);
	}
	
	public LoginPage clickLoginBtn() {
		clickElement(login);
		return new LoginPage(driver);
	}
	
	public ContactUsPageObjects clickContactUs() {
		clickElement(navContactUs);
		return new ContactUsPageObjects(driver);
		
	}
	
	public void clickJourney() {
		clickElement(navJourney);
	}
	
	public boolean profileIcon() {
		return isDisplayedInUI(profileIcon);
	}
	public void signOut() {
		clickElement(profileIcon);
		clickElement(signOut);
		clickElement(signOutYes);
	}
	
	

}
