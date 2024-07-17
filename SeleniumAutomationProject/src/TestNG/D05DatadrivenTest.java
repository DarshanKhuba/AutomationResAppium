package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05DatadrivenTest {
	WebDriver driver;
	
  @Test(dataProvider = "getLoginData")//REad the data from the @dataprovider method
  public void f(String un, String ps) {
  }
  @BeforeMethod//-----------------------------------------------
  public void beforeMethod() {
  }

  @AfterMethod//-------------------------------------------------
  public void afterMethod() {
	  if(driver.getCurrentUrl().contains("dash"))
		{
		  
		    System.out.println("Test case passed");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
			driver.findElement(By.partialLinkText("Log")).click();
		}
		else
		{
			System.out.println("Test case failed because of :" + driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
		}
	}


  @DataProvider//------------------------------------------------
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "manasa", "mansa123" },
      new Object[] { "tushar", "tushar123" },
      new Object[] { "admin", "admin123" },
      new Object[] { "darshan", "darshan123" },
    };
  }
  @BeforeTest//---------------------------------------------------
  public void beforeTest() {
  }

  @AfterTest//----------------------------------------------------
  public void afterTest() {
  }

}
