package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.prop;
public class VisaStatusPageTest extends DriverInit {

	public VisaStatusPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test(priority=57)
	public void verifyVisastatusTab(){
		visaStatusPage.verifyClickonVisaStatusBtn();
		Assert.assertEquals(driver.getTitle(), "Visa Status");
	}
	
	@Test(priority=58)
	public void verifyVisastatuswithValidData() throws InterruptedException{
		visaStatusPage.passApplicationId("4520B968534E");//applicationID
		visaStatusPage.selectDateofbirth("25091990");//birthDate
		String captcha = visaStatusPage.getVStatuscaptcha();
		System.out.println(captcha);
		visaStatusPage.passVStatuscaptcha(captcha);
	    visaStatusPage.clickonVsContinueBtn();
	    System.out.println(visaStatusPage.getFirstLastnametext());
		Assert.assertEquals(visaStatusPage.getFirstLastnametext(), firstName+" "+lastName);
		Assert.assertEquals(visaStatusPage.getApplicationStatustext(), " Approved & Forward");
		visaPaymentPage.clickOnDonetbtn();
		//visaPaymentPage.verifyConfirmationPop();
		Thread.sleep(2000);
		System.out.println( "verifyClickOnSubmitBtnTest3");
		System.out.println("home page title"
				+ homePage.validateHomePageTitle());
		Assert.assertEquals(homePage.validateHomePageTitle(), prop.getProperty("homePageTitle"), "We are not navigate to Home page after payment");
		System.out.println( "visa applicationID after payment==>" +applicationID);
		
		/*Assert.assertEquals(driver.getTitle(), "Track Application");
		String applicantName = driver.findElement(By.xpath("//span[contains(text(),'"+firstName+" "+lastName+"')]")).getText();
	    Assert.assertEquals(applicantName, firstName+" "+lastName, "provided applicant name not match with applicant name on Visa tracking");*/
		}
	
	@Test(priority=59)
	public void verifyVisastatuswithInValidData(){
		visaStatusPage.verifyClickonVisaStatusBtn();
		visaStatusPage.passApplicationId("5550B968534");
		visaStatusPage.selectDateofbirth("35091990");
		String captcha = visaStatusPage.getVStatuscaptcha();
		System.out.println(captcha);
		visaStatusPage.passVStatuscaptcha(captcha);
		visaStatusPage.clickonVsContinueBtn();
		}
}