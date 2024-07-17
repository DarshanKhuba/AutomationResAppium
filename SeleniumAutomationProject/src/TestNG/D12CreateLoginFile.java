package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12CreateLoginFile {
	String fpath = System.getProperty("user.dir") + ""\\Logindata.xsls";"
	File file();
	
	
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue(un);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "User Name", "Password", "Result" },
      new Object[] { "admin", "admin123", "Not Run" },
      new Object[] { "kiran", "kiran123", "Not run" },
      new Object[] { "kavita", "kavita123", "Not run" },
      new Object[] { "admin", "admin123", "Not Run"  },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  file = new File(fpath);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	
	  sheet = wb.createSheet("OHRMLogin");
  }

  @AfterTest
  public void afterTest() {
  }

}
