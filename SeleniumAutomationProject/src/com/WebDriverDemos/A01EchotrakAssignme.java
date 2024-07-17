package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01EchotrakAssignme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expMsg = "Invalid Username/Password";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		/*WebElement userID = driver.findElement(By.id("txtCustomerID"));
		userID.sendKeys("Darshan");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("darshan1216");*/
		
		WebElement userID = driver.findElement(By.className("form-control"));
		userID.sendKeys("Darshan");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("darshan1216");
		
		
		WebElement loginbtn = driver.findElement(By.id("Butsub"));
		loginbtn.click();
		
		WebElement error = driver.findElement(By.className("error"));
		String errMsg = error.getText();
	
		System.out.println("Error Message: " + errMsg);
		
		//if(expMsg.equals(errMsg))
		if(errMsg.contains("Invalid"))
			System.out.println("Correct Error Message: Test Case Pass");
		else
			System.out.println("Invalid Username/Password: Test case fail");
		driver.close();
		
				

	}

}
