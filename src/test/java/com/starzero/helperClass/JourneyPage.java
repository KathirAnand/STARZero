package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;

import com.starzero.pageObjects.JourneyPageObjects;

public class JourneyPage extends JourneyPageObjects{

	public JourneyPage(WebDriver driver) {
		super(driver);
	}
	
	public JourneyPage clickRecordNewTrip() {
		try {
			clickElement(recordTrip);
			logger.info("Record New Trip button is clicked");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}
	
	public JourneyPage setOdometerReadingAs(String reading) {
		try {
			clearAndType(odometerReadingInputField, reading);
			logger.info("Odometer Reading is entered as "+ reading);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}
	
	public JourneyPage setOdometerImage(String imagePath) {
		try {
			clearAndType(imageInputField, imagePath);
			logger.info("Image uploaded successfully");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}
	
	public JourneyPage clickUploadBtn() {
		try {
			clickElement(uploadBtn);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return this;
	}
	
	public JourneyPage clickSubmitBtn() {
		try {
			clickElement(submitBtn);
			logger.info("Submit button is clicked");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return this;
	}
}
