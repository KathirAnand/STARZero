package com.starzero.helperClass;

import org.openqa.selenium.WebDriver;

import com.starzero.pageActions.PageActions;
import com.starzero.pageObjects.PlansPage;

public class PlansPageHelper extends PlansPage {
	
	public PlansPageHelper(WebDriver driver) {
		super(driver);
	}

	public void clickDropdown() {
		try {
		PageActions.clickElement(dropDown);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
