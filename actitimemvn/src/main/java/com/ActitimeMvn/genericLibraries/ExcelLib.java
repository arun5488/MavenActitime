package com.ActitimeMvn.genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String filepath = System.getProperty("user.dir")+"\\src\\test\\resource\\testData.xlsx";
	
	public String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell col = row.getCell(colNum);
		
		String data = col.getStringCellValue();
				
		return data;
	}
	
	public void writeExcelData(String sheetName, int rowNum, int colNum, String data) throws Throwable{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row =sh.getRow(rowNum);
		Cell col = row.createCell(colNum);
		col.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		wb.close();
		
				
				
		
		
	}
	

}
