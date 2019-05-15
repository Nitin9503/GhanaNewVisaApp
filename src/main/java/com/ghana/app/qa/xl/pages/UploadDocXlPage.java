package com.ghana.app.qa.xl.pages;

import static com.ghana.app.qa.util.TestUtil.OSName;
import static com.ghana.app.qa.util.TestUtil.driverPath;
import static com.ghana.app.qa.util.TestUtil.prop;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class UploadDocXlPage extends TestBase {

	
	public UploadDocXlPage() throws Exception, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[contains(text(),'Upload Documents')]")
	WebElement uploadDocPageTitle;
	@FindBy(xpath="//input[@id='uploadBtn1']")
	WebElement attachFileBtn1;
	@FindBy(xpath="//input[@id='uploadBtn2']")
	WebElement attachFileBtn2;
	@FindBy(xpath="//input[@id='uploadBtn3']")
	WebElement attachFileBtn3;
	@FindBy(xpath="//input[@id='uploadBtn4']")
	WebElement attachFileBtn4;
	@FindBy(xpath="//input[@id='uploadBtn5']")
	WebElement attachFileBtn5;
	@FindBy(xpath="//input[@id='uploadBtn6']")
	WebElement attachFileBtn6;
	@FindBy(xpath="//input[@id='uploadBtn7']")
	WebElement attachFileBtn7;
	@FindBy(xpath="//input[@id='uploadBtn8']")
	WebElement attachFileBtn8;
	@FindBy(id="applicant_upload_document_form_btn")
	WebElement saveAndComtinueBtn;
	
	public String getTextUploadDocPageTitle(){
		return uploadDocPageTitle.getText();
		
	}
	public void getUploadDoc(){
		
	driverPath = System.getProperty("user.dir");
		System.out.println("path==>" +driverPath);
		System.out.println(OSName);
		if (OSName.equalsIgnoreCase("Mac OS X")) {
			System.out.println(OSName);
			// enter the file path onto the file-selection input field
			attachFileBtn1.sendKeys(driverPath+"/DocumentAttach/airticket.jpeg");
			attachFileBtn2.sendKeys(driverPath+"/DocumentAttach/Passport-size-photo.jpg");
			attachFileBtn3.sendKeys(driverPath+"/DocumentAttach/YellowFeverVaccination.pdf");
			attachFileBtn4.sendKeys(driverPath+"/DocumentAttach/Covering Letter for tourist.pdf");
			attachFileBtn5.sendKeys(driverPath+"/DocumentAttach/demand-draft-1.jpg");
			attachFileBtn6.sendKeys(driverPath+"/DocumentAttach/IDcard_Ghana.jpg");
			attachFileBtn7.sendKeys(driverPath+"/DocumentAttach/invitation letter.pdf");
			attachFileBtn8.sendKeys(driverPath+"/DocumentAttach/proofofvisa.pdf");
		 
		} else if (OSName.equalsIgnoreCase("Windows")) {
			System.out.println(OSName);
			// enter the file path onto the file-selection input field
			System.out.println("hello");
			attachFileBtn1.sendKeys(driverPath+"\\DocumentAttach\\airticket.jpeg");
			attachFileBtn2.sendKeys(driverPath+"\\DocumentAttach\\Passport-size-photo.jpg");
			attachFileBtn3.sendKeys(driverPath+"\\DocumentAttach\\YellowFeverVaccination.pdf");
			attachFileBtn4.sendKeys(driverPath+"\\DocumentAttach\\Covering Letter for tourist.pdf");
			attachFileBtn5.sendKeys(driverPath+"\\DocumentAttach\\demand-draft-1.jpg");
			attachFileBtn6.sendKeys(driverPath+"\\DocumentAttach\\IDcard_Ghana.jpg");
			attachFileBtn7.sendKeys(driverPath+"\\DocumentAttach\\invitation letter.pdf");
			attachFileBtn8.sendKeys(driverPath+"\\DocumentAttach\\proofofvisa.pdf");
			System.out.println("bolloo");
		}
		
	}
	
	public void clicksaveAndContiBtn(){
		saveAndComtinueBtn.click();
	}
}
