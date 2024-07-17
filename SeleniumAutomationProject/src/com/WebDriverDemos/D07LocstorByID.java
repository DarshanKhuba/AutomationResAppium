package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocstorByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("7019420563");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("Abcdef");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		driver.close();
		

	}

}
