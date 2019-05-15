package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

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
	
	public void passUserName(String Username) {
		username.sendKeys(Username);
	}

	public void passPassword(String Password) {
		password.sendKeys(Password);
	}
	public void clickOnLoginButton() {
		login.click();
	}
	
	public String getTitleOfConsulate(){
		
		return driver.getTitle();
	}
	
	

}
