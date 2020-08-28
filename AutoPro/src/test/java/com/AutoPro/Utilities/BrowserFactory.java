package com.AutoPro.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory  {
	public static WebDriver driver;
	
	//TO PUT THE DRIVERS.EXE FILES (ChromeDriver.exe/iexplore.exe/geckDriver.exe) TO DRIVERS FOLDER--- LOCATION = C:\Users\shashi\eclipse_Folder\inetBankingV1\Drivers  
	//check in computer/laptop driver
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
	
		if(browserName.equals("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(browserName.equals("iexplore"))
	{
		System.setProperty("Webdriver.ie.driver","./Drivers/iexplore.exe");
		driver=new InternetExplorerDriver();
	}
			
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(appURL);
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	return driver;
	}


  public static void quitBrowser()
	{
	driver.quit();
}
}