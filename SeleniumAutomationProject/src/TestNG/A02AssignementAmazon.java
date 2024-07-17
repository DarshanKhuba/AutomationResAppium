package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A02AssignementAmazon {
	WebDriver driver;
  @BeforeTest
  public void beforetest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  //------------------------------------------------------------------------------------------
  @AfterTest
  public void aftertest()
  {
	  driver.close();
  }
  //-------------------------------------------------------------------------------------------
  @BeforeMethod
  public void beforemethod() {
	  driver.get("https://www.amazon.in/");
	  System.out.println("Title: " + driver.getTitle());
	  
  }
  //---------------------------------------------------------------------------------------------
  @AfterMethod
  public void aftermethod()
  {
	  
  }
  //----------------------------------------------------------------------------------------------
  
  
}
