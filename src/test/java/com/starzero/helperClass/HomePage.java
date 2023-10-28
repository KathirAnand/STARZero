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
		logger.info("About Us is clicked");
		return new AboutUsPageObjects(driver);
	}
	
	public LoginPage clickLoginBtn() {
		clickElement(login);
		logger.info("Login button is clicked");
		return new LoginPage(driver);
	}
	
	public ContactUsPageObjects clickContactUs() {
		clickElement(navContactUs);
		logger.info("Contact Us is clicked");
		return new ContactUsPageObjects(driver);
		
	}
	
	public JourneyPage clickJourney() {
		try {
			clickElement(navJourney);
			logger.info("Journey is clicked");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return new JourneyPage(driver);
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
