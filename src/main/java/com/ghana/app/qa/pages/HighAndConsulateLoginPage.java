package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class HighAndConsulateLoginPage extends TestBase {

	public HighAndConsulateLoginPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//input[@name='Login' and @type='submit']")
	WebElement login;
	
	public void passUserName(String Username) throws InterruptedException {
		username.sendKeys(Username);
		TestUtil.colorElement(username);
		Thread.sleep(3000);
	}

	public void passPassword(String Password) throws InterruptedException
		{
			password.sendKeys(Password);
			TestUtil.colorElement(password);
			Thread.sleep(3000);
		}
	
	
	public void clickOnLoginButton() {
		login.click();
	}
	
	public String getTitleOfConsulate(){
		
		return driver.getTitle();
	}
	
	

}
