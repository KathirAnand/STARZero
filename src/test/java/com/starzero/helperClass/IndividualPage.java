package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.starzero.pageObjects.IndividualPageObjects;

public class IndividualPage extends IndividualPageObjects {

	public IndividualPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void selectCountry() {
		clickElement(countryDropdown);
	}
	
	public void clickCountryDropdown() throws InterruptedException {
		actionClick(dropdown);
	}
	
	public void clickCountry(String country) {
			action.findAndClick(countries, country);
	}
	public void visiblityOfVedioHeading() {
		try {
			Assert.assertTrue(isDisplayedInUI(headingTrack),"Track is not displayed in UI");
			Assert.assertTrue(isDisplayedInUI(headingAssess),"Assess is not displayed in UI");
			Assert.assertTrue(isDisplayedInUI(headingOffset),"Offset is not displayed in UI");
			Assert.assertTrue(isDisplayedInUI(headingEmission),"Emission is not displayed in UI");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	public void clickSubscribeNowbtn() {
			clickElement(subscribeNowbtn);
	}

}
