package com.WebDriverDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02FacebookLogin_ClassName {
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		/*WebElement userID = driver.findElement(By.className(" _6luy"));
		userID.sendKeys("7019420563");*/
		
		WebElement userId = driver.findElement(By.className("_55r1"));
		userId.sendKeys("ankushvankore@gmail.com");
		
		
		
		/*WebElement password = driver.findElement(By.className("_9npi"));
		password.sendKeys("Pass@1230");*/
		
		WebElement password = driver.findElement(By.className("_55r1"));
		password.sendKeys("123456");
		
		
	//

		
		/*WebElement loginBtn = driver.findElement(By.className("_42ft"));
		loginBtn.click();*/
		
		WebElement loginBtn = driver.findElement(By.className("_42ft"));
		loginBtn.click();
		
		//driver.close();
	}
	

}
