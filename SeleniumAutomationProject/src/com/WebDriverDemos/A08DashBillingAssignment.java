package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A08DashBillingAssignment {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dash.bling-center.com/platform/signIn.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[5]/button/p")).click();
		driver.findElement(By.id("email1")).sendKeys("TestGmaiAil.com");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/button[2]")).click();
		
		Thread.sleep(5000);
		
		System.out.println("Message: " + driver.findElement(By.id("resetsuccess")).getText());
		driver.close();
	}

}
