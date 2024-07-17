package com.WebDriverDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11Linktextlocator {
	public static void main(String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement gmaillink = driver.findElement(By.linkText("Gmail" ));
		String text = gmaillink.getText();
		System.out.println("Text on the link: " + text);
		String url = gmaillink.getAttribute("href");
		System.out.println("URL of link: " + url);
		gmaillink.click();
		
		
		
		
		
	}

}
