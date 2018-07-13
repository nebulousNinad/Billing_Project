package com.ninad.project.Billing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlScript;

import com.ninad.project.utility.verifyPassword;

import junit.framework.Assert;


public class TestAuthenticate {

	@Test (dataProvider="getData")       //[0][0]       [0][1]               [0][3]
	public void testAuthenticate(String username , String password , String Stringflag){	
		
		boolean myflag=false;
		
		if(Stringflag.equalsIgnoreCase("t")){
			myflag=true;
		}
		
		boolean actualvalue= verifyPassword.verify(username, password);
		
		Assert.assertEquals(myflag,actualvalue);
		
		
		//Assert.assertEquals(expected, actual);
		
	}
	
	
	
	 @DataProvider(name="getData")
		public Object[][] getData() throws IOException, InterruptedException{
		 
		    File file = new File("E:/BillTest.xlsx");		 
		    
			FileInputStream fi = new FileInputStream(file);				 
			 
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			
			XSSFSheet sheet = wb.getSheetAt(0);
			
			 Object [][] data = new Object [sheet.getPhysicalNumberOfRows()][3]; //sheet.getPhysicalNumberOfRows()
		
		Iterator<Row> rowIterator = sheet.iterator();
			
		while(rowIterator.hasNext()){
			
			//while(rowIterator.hasNext()){
				
				System.out.println(" i have another row ...");
				
				for(int i=0;i<sheet.getPhysicalNumberOfRows();i++){	
					
					Row row=rowIterator.next();
					Iterator<Cell> cellIterator =row.iterator();
					//u need to load next row here
					Thread.sleep(2000);
					//System.out.println("inside ith iindexx.................");
				
				for(int j=0;j<3;j++){
					
					//System.out.println("inside j wala loop ********");
					Thread.sleep(2000);
					Cell cell = cellIterator.next();
					
					System.out.println("inside second for  i"+i+" j "+j+ " cell -:  "+cell.getStringCellValue() );
					
					data [i][j] = cell.getStringCellValue();
					
				}
			}			
	 }

		return  data;
			
		/*
		
		Object [][] data = new Object [2][3];
			
			
			data [0][0] = "admin";
			data [0][1] = "admin";
			data [0][2] = true;
			
			data[1][0] = "SecondUid";
			data[1][1] = "SecondPWD";
			data [1][2] = false;
			
			return data;
		
	
	*/
			
		}
	 
}
