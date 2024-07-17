package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D25Headless {
	public static void main(String [] args) {
		
	
	
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("Title: " + driver.getTitle());
		driver.close();
}
	

}

/*
or(int i=1;i<=rows.size();i++)
{
    WebElement w = driver.findElement(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr["+i+"]/td[4]"));
    double price = Double.parseDouble( w.getText().toString().replace(",",""));
    if(max<price)
    {
        max = price;
    }

}

System.out.println("highest price number:"+max);
Currency inr = Currency.getInstance("INR");
//Local instance for India
Locale loc = new Locale("hi", "IN");
// Create a NumberFormatter with custom currency
NumberFormat inrFormatter
        = NumberFormat.getCurrencyInstance(loc);
inrFormatter.setCurrency(inr);
// Convert string to BigDecimal and format as
// currency
BigDecimal amt = new BigDecimal(max);
String currInr = inrFormatter.format(amt);
System.out.println("highest price value::"+currInr);


https://www.online.citibank.co.in/



ChromeOptions op = new ChromeOptions();
op.addArguments("start-maximized");
WebDriver driver = new ChromeDriver(op);

*/