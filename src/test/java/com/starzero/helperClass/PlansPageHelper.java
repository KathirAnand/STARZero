package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;

import com.starzero.pageObjects.PlansPage;

public class PlansPageHelper extends PlansPage {
	
	public PlansPageHelper(WebDriver driver) {
		super(driver);
	}

	public void clickDropdown() {
		try {
		action.clickElement(dropDown,driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
