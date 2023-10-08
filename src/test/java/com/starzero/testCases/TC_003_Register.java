package com.starzero.testCases;

import org.testng.annotations.Test;

import com.starzero.helperClass.IndividualPage;
import com.starzero.helperClass.PlansPage;
import com.starzero.pageActions.ProjectSpecificMethods;
import com.starzero.testBase.BaseClass;

public class TC_003_Register extends BaseClass {
	
	static String regNo = "VO22SSU";
	static String firstName = ProjectSpecificMethods.generateFirstName();
	static String ownerFirstName = ProjectSpecificMethods.generateFirstName();
	static String ownerLastName = ProjectSpecificMethods.generateLastName();
	static String lastName = ProjectSpecificMethods.generateLastName();
	static String emailId = ProjectSpecificMethods.generateEmailId();
	static String phoneNumber = ProjectSpecificMethods.generateRandomNumber();
	static String password = "test1234";
	
	@Test
	public void UK_Registration() throws InterruptedException {
		IndividualPage individualPage = new IndividualPage(driver);
		PlansPage plansPage = individualPage.clickSubscribeNowbtn()
		.selectPlanBreezeBasic()
		.setVehicleRegistrationNumber(regNo)
		.clickFindMyCar()
		.clickYesBtn()
		.setFirstName(firstName)
		.setLastName(lastName)
		.setOwnerFirstName(ownerFirstName)
		.setOwnerLastName(ownerLastName)
		.setEmail(emailId)
		.setPhoneNumber(phoneNumber)
		.setPassword(password)
		.clickTermsOfUseCheckBox();
		plansPage.clickSubscribeBtn();
		
	}
	
	

}