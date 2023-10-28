package com.starzero.testDatas;

import com.starzero.testBase.FilePaths;
import com.starzero.utilities.TestDataProvider;

public class SignUp_GeneratedData {
	static String indiaSheetName = "India_RegisteredDatas";
	static String ukSheetName = "UK_RegisteredDatas";
	static String usaSheetName = "USA_RegisteredDatas";
	
	public static void setGeneratedDataIntoExcel(String [] data,String country) throws Exception {
		if(country.equalsIgnoreCase("india")) {
			TestDataProvider.setTestData(FilePaths.REGISTERED_DATAS, indiaSheetName, data);
		}
		else if(country.equalsIgnoreCase("uk")) {
			TestDataProvider.setTestData(FilePaths.REGISTERED_DATAS, ukSheetName, data);
		}
		else if(country.equalsIgnoreCase("usa")) {
			TestDataProvider.setTestData(FilePaths.REGISTERED_DATAS, usaSheetName, data);
		}
	}
}
