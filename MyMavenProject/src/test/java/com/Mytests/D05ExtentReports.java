package com.Mytests;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D05ExtentReports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 

		ExtentSparkReporter htmlReport = new ExtentSparkReporter("MyFirstReports.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlReport);

		// Add Environment Variable

		report.setSystemInfo("Machine Name", "Hp");
		report.setSystemInfo("Test", "Darshan");
		report.setSystemInfo("Oper Sys", "Win 11");
		report.setSystemInfo("Browser", "Google Chrome");

		// Configuration of look andd feel of repo
		htmlReport.config().setDocumentTitle("First Extent report");
		htmlReport.config().setReportName("Google Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("EEEE MMM dd, yyyy HH:mm:ss");

	}

}
