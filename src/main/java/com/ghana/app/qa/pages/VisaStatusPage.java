package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class VisaStatusPage extends TestBase{

	public VisaStatusPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
		
	}
    
	@FindBy (xpath="//button[contains(text(),'Visa Status')]")
	WebElement visastatusBtn;
	
	@FindBy (xpath="//input[@id='txt_appn_id']")
	WebElement vstatusApplicationId;
	
	
	@FindBy (xpath="//input[@id='dateofbirth']")
    WebElement vstatusDateOfBirth;
	
	@FindBy (xpath="//label[@id='text_captcha']")
    WebElement vstatuscaptchatext;
	
	@FindBy (xpath="//input[@id='usercaptchacode']")
    WebElement vstatuscaptchatextfiled;
	
	@FindBy (xpath="//input[@value='Continue']")
    WebElement vstatusContinueBtn;
	
	@FindBy (xpath="//button[contains(text(),'Cancel')]")
    WebElement vstatusCancelBtn;
	
	@FindBy (xpath="//span[@id='txt_status']")
    WebElement applicationStatustext;
	
	@FindBy (xpath="//span[@id='txt_fname']")
    WebElement firstLastName;
	
	//span[contains(text(),'Approved & Forward')]
	
	
	
	public void verifyClickonVisaStatusBtn(){
		visastatusBtn.click();
	}
	
	public void passApplicationId(String appliId){
		vstatusApplicationId.sendKeys(appliId);
	}
	
	public void selectDateofbirth(String DOB){
		TestUtil.actionClassMethod(vstatusDateOfBirth);
		vstatusDateOfBirth.sendKeys(DOB);
	}
	
	public String getVStatuscaptcha(){
		return vstatuscaptchatext.getText();
	}
	
	public void passVStatuscaptcha(String capchatext){
		vstatuscaptchatextfiled.sendKeys(capchatext);
	}
	
	public void clickonVsContinueBtn(){
		vstatusContinueBtn.click();
	}
	
	public void clickonVsCancelBtn(){
		vstatusCancelBtn.click();
	}
	
	public String getApplicationStatustext(){
		return applicationStatustext.getText();
	}
	public String getFirstLastnametext(){
		return firstLastName.getText();
	}
	
}
