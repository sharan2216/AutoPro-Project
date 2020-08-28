package com.AutoPro.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//ScreenShots,Frames,Alerts,windows,Sync issue, javaScript Executor
	public static  String captureScreenShot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir")+"/Screenshots/Amazon"+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(src,new File(screenshotPath));
			System.out.println("SceenShot Captured");
			
		} catch (IOException e) {
			
			System.out.println("Unable to capture ScreenShot");
		}
		return screenshotPath;
	}	
		public static String getCurrentDateTime()
		{
			DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			Date currentDate=new Date();
			return customFormat.format(currentDate);
		}
			
		
	}


