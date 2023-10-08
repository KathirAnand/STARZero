package com.starzero.helperClass;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.WebDriver;

import com.starzero.pageObjects.PlansPageObjects;

public class PlansPage extends PlansPageObjects {

	public PlansPage(WebDriver driver) {
		super(driver);
	}

	public void clickDropdown() {
		try {
			action.actionClick(dropdown);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickCountry(String country) {
		try {
//			action.waitAndClick(countrtIndia);
			action.findAndClick(countries, country);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * This method select the plan Breeze Basic by clicking on 'Get Started' button
	 */
	public PlansPage selectPlanBreezeBasic() {
		try {
			waitAndClick(breezeCarUK);
		} catch (Error ex) {
			throw new RuntimeErrorException(ex);
		}
		return this;
	}

	/**
	 * This method select the plan Windy Essential by clicking on 'Get Started'
	 * button
	 */
	public PlansPage selectPlanWindyEssential() {
		try {
			clickElement(windyEssentialForCarUK);
		} catch (Error ex) {
			throw new RuntimeErrorException(ex);
		}
		return this;
	}

	/**
	 * This method select the plan Aero Supreme by clicking on 'Get Started' button
	 */
	public PlansPage selectPlanAeroSupreme() {
		try {
			clickElement(aeroSupremeForCarUK);
		} catch (Error ex) {
			throw new RuntimeErrorException(ex);
		}
		return this;
	}

	public PlansPage setVehicleRegistrationNumber(String regNo) {
		try {
			clearAndType(vehicleRegNoInputField, regNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;

	}

	public PlansPage clickFindMyCar() {
		try {
			clickElement(regNoSubmitBtn);
		} catch (Error ex) {
			throw new RuntimeErrorException(ex);
		}
		return this;
	}

	public PlansPage clickYesBtn() {
		try {
			clickElement(yesBtn);
		} catch (Error ex) {
			throw new RuntimeErrorException(ex);
		}
		return this;
	}

	public PlansPage clickNoBtn() {
		try {
			clickElement(noBtn);
		} catch (Error ex) {
			throw new RuntimeErrorException(ex);
		}
		return this;
	}

	public PlansPage clickReEnterRegBtn() {
		try {
			clickElement(reEnterRegNoBtn);
		} catch (Error ex) {
			throw new RuntimeErrorException(ex);
		}
		return this;
	}

	/**
	 * This method set the vehicle class as Car and the plans should change
	 * accordingly
	 */
	public PlansPage selectVehicleCar() {
		clickElement(planForCar);
		return this;
	}

	/**
	 * This method set the vehicle class as Bike and the plans should change
	 * accordingly
	 */
	public PlansPage selectVehicleBike() {
		clickElement(planForBike);
		return this;
	}

	public PlansPage setFirstName(String firstName) {
		try {
			clearAndType(firstNameInputField, firstName);
			logger.info("Entered first name is "+firstName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public PlansPage setLastName(String lastName) {
		try {
			clearAndType(lastNameInputField, lastName);
			logger.info("Entered lastName is "+lastName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public PlansPage setEmail(String email) {
		try {
			clearAndType(emailInputField, email);
			logger.info("Entered emailId is "+email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public PlansPage setPhoneNumber(String phNumber) {
		try {
			clearAndType(mobileNumberInputField, phNumber);
			logger.info("Entered phoneNumber is "+phNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public PlansPage setPassword(String password) {
		try {
			clearAndType(passWordInputField, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public PlansPage setOwnerLastName(String ownerLastName) {
		try {
			clearAndType(ownerLastNameInputField, ownerLastName);
			logger.info("Entered ownerLastName is "+ownerLastName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public PlansPage setOwnerFirstName(String ownerFirstName) {
		try {
			clearAndType(ownerFirstNameInputField, ownerFirstName);
			logger.info("Entered owner first name is"+ownerFirstName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public PlansPage clickTermsOfUseCheckBox() {
		try {
			clickElement(termsOfUseCheckBox);
		} catch (Error ex) {
			throw new RuntimeErrorException(ex);
		}
		return this;
	}

	public void clickSubscribeBtn() {
		try {
			clickElement(subscribeBtn);
		} catch (Error ex) {
			throw new RuntimeErrorException(ex);
		}
	}
}
