package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.starzero.pageActions.PageActions;
import com.starzero.pageObjects.IndividualPage;
import com.starzero.pageObjects.PlansPage;

public class IndividualHelper extends IndividualPage {

	public IndividualHelper(WebDriver driver) {
		super(driver);
	}

	public void videoHeading() {
		try {

			Assert.assertTrue(PageActions.isDisplayedInUI(headingTrack),"Track is not displayed in UI");
			Assert.assertTrue(PageActions.isDisplayedInUI(headingAssess),"Assess is not displayed in UI");
			Assert.assertTrue(PageActions.isDisplayedInUI(headingOffset),"Offset is not displayed in UI");
			Assert.assertTrue(PageActions.isDisplayedInUI(headingEmission),"Emission is not displayed in UI");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	public void clickSubscribeNowbtn() {
		try {
			PageActions.clickElement(subscribeNowbtn);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
