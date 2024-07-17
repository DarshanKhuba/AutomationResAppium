package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D11WriteToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
  @Test
  public void WriteData() {
	  //String fpath=
	  //String fpath = system.getProperty("user.dir") = "\\MyFirst.xlsx"
	  row = sheet.createRow(0);   // create first row inside the sheet
	  cell = row.createCell(0);   // create first cell inside the 1st row
	  
	  cell.setCellValue("Darshan");   //put the data inside the value
	  //row = sheet.createRow(0);
	  cell = row.createCell(1);
	  cell.setCellValue("Khuba");
	  
	  
	  sheet.createRow(1).createCell(0).setCellValue("Banti");
	  sheet.createRow(1).createCell(0).setCellValue("Banti");
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  //One time configuraton
	  file = new File("D:\\darshan_java\\SeleniumAutomationProject\\MyFirst.xlsx");
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();            //create the workbook
	  sheet = wb.createSheet("My Sheet");   //create sheet
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);      //Write the data physically to the file
	  wb.close();
	  fos.close();
  }

}
