package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class PartiallyFilledApplicationPage extends TestBase{

	public PartiallyFilledApplicationPage() throws IOException,
			InterruptedException {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy (xpath="//a[contains(text(),'Home')]")
	WebElement linkstext;
	
	@FindBy(xpath="//button[contains(text(),'Partially/Filled Application')]")
	WebElement partiallyFilledApplication;
    
	@FindBy(xpath="//input[@id='txt_appn_id_prt']")
	WebElement partiallyAppliIdField;
	
	@FindBy(xpath="//input[@id='dateofbirth']")
	WebElement dateOfBirthField;
	
	@FindBy(xpath="//label[@id='text_captcha']")
	WebElement textCaptcha;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement errorMessage;
	
	@FindBy(xpath="//input[@id='txt_captcha_prt']")
	WebElement textCaptchaFiled;
	
	@FindBy(xpath="//input[@id='btn_partially']")
	WebElement submitbtn;
	
	@FindBy(xpath="//a[@class='close']")
	WebElement closebtn;
	
	public void clickOnpartialFilledTab(){
		partiallyFilledApplication.click();
	}
	
	public void passApplicationId(String AppID){
		partiallyAppliIdField.sendKeys(AppID);
	}
	
	public void selectDOB(String BirthDate) throws InterruptedException {
		
        TestUtil.actionClassMethod(dateOfBirthField);
        dateOfBirthField.sendKeys(BirthDate);
        
}
	
	public void clickOnHomepageLinktext(){
		linkstext.click();
	}
	public String getCaptchaText(){
		return textCaptcha.getText();
		
	}
	public void passCaptchaText(String captchaTexts){
		textCaptchaFiled.sendKeys(captchaTexts);
		
	}
	public String getErrorMessage(){
		return errorMessage.getText();
		
	}
	public void clickOnsubmitbtn(){
		submitbtn.click();
		
	}
	public void clickclosebtn(){
		closebtn.click();
		
	}
	
}

