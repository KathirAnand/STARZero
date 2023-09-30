package com.starzero.testCases;

import org.testng.annotations.Test;

import com.starzero.helperClass.IndividualPage;
import com.starzero.helperClass.PlansPage;
import com.starzero.testBase.BaseClass;

public class TC_001_LaunchURL extends BaseClass{
	
	@Test
	public void validateDropdownSelection() throws Exception {
		String country = "UK";
		
		IndividualPage ih = new IndividualPage(driver);
		ih.visiblityOfVedioHeading();
		ih.clickSubscribeNowbtn();
		logger.info("Subscribe Now button is clicked");
		
		PlansPage pp = new PlansPage(driver);
		pp.clickDropdown();
		pp.clickCountry(country);
		logger.info(country +" is clicked");
		
		Thread.sleep(5000);

	}
}
