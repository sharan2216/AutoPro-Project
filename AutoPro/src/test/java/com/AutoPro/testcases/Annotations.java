package com.AutoPro.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.AutoPro.Pages.LoginPage;

import net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy;

public class Annotations extends LoginPage{
	
	public Annotations(WebDriver ldriver)
	{
		super(ldriver);
	}
	WebDriver driver;

@Test(priority=1)
public void Login()
{
	 driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
}
	 @FindBy(id="ap_email")WebElement email;
		@FindBy(className="a-button-input")WebElement continueButton;
		@FindBy(id="ap_password")WebElement passwordTextBox;
		@FindBy(id="signInSubmit")WebElement SignInButton;
		
		//@FindBy(id="SubmitLogin")WebElement loginButton;
		

		public void LoginToApplication1(String mobileNumber,String password) throws InterruptedException//
		{
			email.click();
			System.out.println("CLICKED inside THE BOX");
			Thread.sleep(3000);
			email.sendKeys(mobileNumber);
			//pass.sendKeys(password);
			continueButton.click();
			Thread.sleep(3000);
			passwordTextBox.click();
			
			passwordTextBox.sendKeys(password);
			Thread.sleep(2000);
			SignInButton.click();
			
	  
}
}
