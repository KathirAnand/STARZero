package com.starzero.utilities;

public class TestDataProvider {
	
	public static  Object[][] getTestData(String filePath,String sheetName) throws Exception{
		ExcelUtility read=new ExcelUtility(filePath);
		int rowCount=read.getRowCount(sheetName);
		int colCount=read.getCellCount(sheetName, rowCount);
		Object[][] data=new Object[rowCount][colCount];
		System.out.println(rowCount);
		System.out.println(colCount);
		for(int rowIndex=0;rowIndex<rowCount;rowIndex++) {
			for(int colIndex=0;colIndex<colCount;colIndex++) {
				data[rowIndex][colIndex]=read.getCellData(sheetName, rowIndex+1, colIndex);
				System.out.println(data[rowIndex][colIndex]);
			}
		}
		return data;
	}
	
	public static  Object[][] getSingleTestData(String filePath,String sheetName) throws Exception{
		ExcelUtility read=new ExcelUtility(filePath);
		int rowCount=read.getRowCount(sheetName);
		int colCount=read.getCellCount(sheetName, rowCount);
		rowCount--;
		Object[][] data=new Object[rowCount][colCount];
		System.out.println(rowCount);
		System.out.println(colCount);
		for(int rowIndex=0;rowIndex<rowCount;rowIndex++) {
			for(int colIndex=0;colIndex<colCount;colIndex++) {
				data[rowIndex][colIndex]=read.getCellData(sheetName, rowIndex+1, colIndex);
				System.out.println(data[rowIndex][colIndex]);
			}
		}
		return data;
	}
}
