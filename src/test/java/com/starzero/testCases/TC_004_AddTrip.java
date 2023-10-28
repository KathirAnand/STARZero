package com.starzero.testCases;

import org.testng.annotations.Test;

import com.starzero.helperClass.HomePage;
import com.starzero.helperClass.JourneyPage;
import com.starzero.helperClass.LoginPage;
import com.starzero.testBase.BaseClass;
import com.starzero.testBase.FilePaths;

public class TC_004_AddTrip extends BaseClass{
	LoginPage loginPage;
	HomePage homePage;
	JourneyPage journeyPage;
	
	public void addTrip_India() {
		
	}
	@Test
	public  void addTrip_UK() throws InterruptedException {
		String country = "UK";
		String reading = "250";
		selectCountry(country);
		loginPage = new LoginPage(driver);
		loginPage.login()
		.clickJourney()
		.clickRecordNewTrip()
		.setOdometerReadingAs(reading)
		.setOdometerImage(FilePaths.IMG_PATH)
		.clickSubmitBtn();
		Thread.sleep(5000);
		
		
	}
}
