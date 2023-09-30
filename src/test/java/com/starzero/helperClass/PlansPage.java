package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;

import com.starzero.pageObjects.PlansPageObjects;

public class PlansPage extends PlansPageObjects {
	
	public PlansPage(WebDriver driver) {
		super(driver);
	}

	public void clickDropdown() {
		try {
		action.actionClick(dropdown);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickCountry(String country) {
		try {
//			action.waitAndClick(countrtIndia);
			action.findAndClick(countries, country);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
