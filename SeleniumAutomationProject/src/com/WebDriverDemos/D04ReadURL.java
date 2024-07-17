package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04ReadURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		String url = driver.getCurrentUrl();
		if(url.contains("downloads"))
			System.out.println("Tst case pass:");
		else
			System.out.println("Test case fail: ");
		driver.close();

	}

}
