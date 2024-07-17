package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14Lcatebbyrelativexpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    driver.findElement(By.xpath("//form[@class=\"_9vtf\"]/div/div/input ")).sendKeys("7019420563");
	    driver.findElement(By.xpath("//input[@type= \"password\"] ")).sendKeys("darsh");
	    driver.findElement(By.xpath("//button[@value= \"1\"]")).click();
	}

}
