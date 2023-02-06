package com.demowebshop.tricentis.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CommonMethods {
	public String propertyData(String a) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/cd.property");
		Properties p = new Properties();
		p.load(fis);
		String s = p.getProperty(a);
		return s;
		
		
	}
	
	public String excelData(String sheetname,int rownum,int col) throws Exception, IOException {
		FileInputStream fis = new FileInputStream("./data/TS.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String s = wb.getSheet(sheetname).getRow(rownum).getCell(col).toString();
		return s;
	}

}
