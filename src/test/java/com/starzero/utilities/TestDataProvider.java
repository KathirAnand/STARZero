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
	
	public static void setTestData(String filePath,String sheetName,String [] data) throws Exception {
		ExcelUtility read=new ExcelUtility(filePath);
		int rowCount=read.getRowCount(sheetName)+1;
//		System.out.println(rowCount);
		for(int i=0;i<data.length;i++) {
//			System.out.println(data[i]);
			read.setCellData(sheetName, rowCount, i, data[i]);
		}
		
	}
	
//	public static void main(String[] args) throws Exception {
//		String [] val=new String [] {"val1","val2","val3"};
//		String sheetName="Sheet1";
//		setTestData(FilePaths.REGISTERED_DATAS,sheetName,val);
//		
//	}
}
