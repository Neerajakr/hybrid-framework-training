package com.allianz.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ZDemoExcel {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("src/test/resources/test_data/hrm_data.xlsx");
		
		XSSFWorkbook book= new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("invalidLoginTest");
		
//		String value=sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(value);
		
		
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(rowcount);
		System.out.println(colcount);
		
		
		Object[][] data=new String[rowcount-1][colcount];
		
		DataFormatter format = new DataFormatter();
	
		
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
			//	String value1=sheet.getRow(i).getCell(j).getStringCellValue();
				String value1=format.formatCellValue(sheet.getRow(i).getCell(j));
				data[i-1][j]=value1;
		//		System.out.println(value1);
			}
		}
		
		for(int i=0;i<rowcount-1;i++) {
			for(int j=0;j<colcount;j++) {
				
				System.out.println(data[i][j]);
			}
			
			} 
		
		System.out.println(data);
		
		book.close();
		file.close();
		
	}

}
