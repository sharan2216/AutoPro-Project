//package com.AutoPro.Utilities;
//
//
//	import java.io.IOException;
//	 
//	import org.testng.annotations.Test;
//	 
//	import com.aventstack.extentreports.ExtentReports;
//	import com.aventstack.extentreports.ExtentTest;
//	import com.aventstack.extentreports.MediaEntityBuilder;
//	import com.aventstack.extentreports.Status;
//	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//	 
//	public class ExtentReportsDemo
//	{
//	 
//		@Test
//		public void loginTest() throws IOException
//		{    
//	            // Create Object of ExtentHtmlReporter and provide the path where you want to generate the report 
//	            // I used (.) in path where represent the current working directory
//		    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/learn_automation1.html");
//			
//	            // Create object of ExtentReports class- This is main class which will create report
//		    ExtentReports extent = new ExtentReports();
//		    
//	            // attach the reporter which we created in Step 1
//		    extent.attachReporter(reporter);
//		    
//	            // call createTest method and pass the name of TestCase- Based on your requirement
//		    ExtentTest logger=extent.createTest("LoginTest");
//		    
//	            // log method will add logs in report and provide the log steps which will come in report
//		    logger.log(Status.INFO, "Login to amazon");
//		   
//		    logger.log(Status.PASS, "Title verified");
//		   
//	            // Flush method will write the test in report- This is mandatory step  
//		    extent.flush();
//			
//	            // You can call createTest method multiple times depends on your requirement
//	            // In our case we are calling twice which will add 2 testcases in our report
//		    ExtentTest logger2=extent.createTest("Logoff Test");
//		    
//		    logger2.log(Status.FAIL, "Title verified");
//		    
//		    logger2.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("/Users/shashi/Desktop/logo.jpg").build());
//	        
//		    logger2.pass("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("/Users/shashi/Desktop/logo.jpg").build());
//	 
//	            // This will add another test in report
//		    extent.flush();
//		    	
//		}
//		
//	}
//
package com.AutoPro.Utilities;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
 
public class ExtentReportsDemo
{
         // Create global variable which will be used in all method
	 ExtentReports extent;
	 ExtentTest logger;
	 WebDriver driver;
	
        // This code will run before executing any testcase
	@BeforeMethod
	public void setup()
	{
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/amazon.html");
		
	    extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);
	    
	    logger=extent.createTest("LoginTest");
	}
 
	
        // Actual Test which will start the application and verify the title
	@Test
	public void loginTest() throws IOException
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/shashi/Desktop/chromedriver");
//		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("http://www.google.com");
		System.out.println("title is "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("amazon"));
	}
	
        // This will run after testcase and it will capture screenshot and add in report
//	@AfterMethod
//	public void tearDown1(ITestResult result) throws IOException
//	{
//		
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//			//temp = Helper.captureScreenShot(driver);
//			
//			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath("/Users/shashi/Desktop/logo.jpg")).build();
//		}
//		
//		extent.flush();
//		driver.quit();
		
	}
	