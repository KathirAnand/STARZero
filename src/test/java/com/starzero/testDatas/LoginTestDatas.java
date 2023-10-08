package com.starzero.testDatas;

import org.testng.annotations.DataProvider;

import com.starzero.testBase.FilePaths;
import com.starzero.utilities.TestDataProvider;

public class LoginTestDatas {
	String indiaSheetName = "India_LoginDatas";
	String ukSheetName = "UK_LoginDatas";
	String usaSheetName = "USA_LoginDatas";
	Object [][] data;
	
	@DataProvider(name = "ukLoginDatas")
	public Object[][] ukLoginTestDatas(){
		try {
			data = TestDataProvider.getTestData(FilePaths.LOGIN_TESTDATAS, ukSheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
		
	}
	
	@DataProvider(name = "indiaLoginDatas")
	public Object[][] indiaLoginTestDatas(){
		try {
			data = TestDataProvider.getTestData(FilePaths.LOGIN_TESTDATAS, indiaSheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
		
	}
	
	@DataProvider(name = "usaLoginDatas")
	public Object[][] usaLoginTestDatas(){
		try {
			data = TestDataProvider.getTestData(FilePaths.LOGIN_TESTDATAS, usaSheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
		
	}

}
