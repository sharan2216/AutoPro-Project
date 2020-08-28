package com.AutoPro.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.annotations.Test;

public class LoginPage {

	WebDriver driver;
	@Test
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="ap_email")WebElement email;
	@FindBy(className="a-button-input")WebElement continueButton;
	@FindBy(id="ap_password")WebElement passwordTextBox;
	@FindBy(id="signInSubmit")WebElement SignInButton;
	
	//@FindBy(id="SubmitLogin")WebElement loginButton;
	
	public void LoginToApplication(String mobileNumber,String password) throws InterruptedException//
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
