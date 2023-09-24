package com.starzero.testCases;

import org.testng.annotations.Test;

import com.starzero.helperClass.IndividualHelper;
import com.starzero.helperClass.PlansPageHelper;
import com.starzero.testBase.BaseClass;

public class TC_001_LaunchURL extends BaseClass{
	
	@Test
	public void validateLandingPage() throws Exception {
		
		IndividualHelper ih = new IndividualHelper(driver);
		ih.visiblityOfVedioHeading();
		ih.clickSubscribeNowbtn();
		
		PlansPageHelper pp = new PlansPageHelper(driver);
		pp.clickDropdown();
		Thread.sleep(5000);

	}
}
