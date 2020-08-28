package com.AutoPro.testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.AutoPro.Pages.BaseClass;
import com.AutoPro.Pages.LoginPage;
import com.AutoPro.Utilities.ExcelDataProvider;
import com.AutoPro.Utilities.Helper;


public class LoginTest extends BaseClass
{
	@Test(priority=1)
	public void loginApp() throws FileNotFoundException, InterruptedException
	{
		logger=report.createTest("Login to Amazon");
		ExcelDataProvider excel=new ExcelDataProvider();
		LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
		logger.info("starting Application");
		loginpage.LoginToApplication(excel.getStringData("Login",0,0),excel.getStringData("Login",0,1));
		logger.pass("Login successful");
		Helper.captureScreenShot(driver);
		
	}
//@Test(priority=2)
//	public void loginApp1() throws FileNotFoundException, InterruptedException
//	{
//		logger=report.createTest("Logout from Amazon");
//		logger.fail("Logout FAILED");
//		Helper.captureScreenShot(driver);
//	
	

}
