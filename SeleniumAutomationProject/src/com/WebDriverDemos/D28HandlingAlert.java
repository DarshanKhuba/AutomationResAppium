package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D28HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		Alert alt;
		JavascriptExecutor js;
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");
		js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 250)", " ");
		js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));

		//driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();

		js.executeScript("arguments[0].click()", driver.findElement(By.id("timerAlertButton")));

		//driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("confirmButton")));
		
		//driver.findElement(By.id("confirmButton")).click();
		alt = driver.switchTo().alert();
		alt.dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		
		/*js.executeScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		alt = driver.switchTo().alert();
		alt.sendKeys("Darshan");
		alt.accept();
		System.out.println(driver.findElement(By.id("promtResult")).getText());
		;*/
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		alt = driver.switchTo().alert();
		alt.sendKeys("Kavita");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		driver.close();

	}

}
