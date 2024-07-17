package com.Mytests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class D03ReadFromExce {
	String fpath = System.getProperty("user.dir") + "\\ExcelFiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	public static void main(String[] args) throws IOException {
	D03ReadFromExce d1 = new D03ReadFromExce();
	d1.readData();
	}

	public void readData() throws IOException
	{
		file = new File(fpath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		
		int rows = sheet.getPhysicalNumberOfRows();
		
		for(int i = 0; i< rows; i++)
		{
			for(int j = 1; j < 2;j++)
			{
				cell = sheet.getRow(i).getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
	}

}
