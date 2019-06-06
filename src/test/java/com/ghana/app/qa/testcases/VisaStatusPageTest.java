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

	SoftAssert softAssertion = new SoftAssert();
	public VisaStatusPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test(priority=57)
	public void verifyVisastatusTab(){
		visaStatusPage.verifyClickonVisaStatusBtn();
		softAssertion.assertEquals(driver.getTitle(), "Visa Status");
	}
	
	/*@Test(priority=58)
	public void verifyVisaStatuswithValidData() throws InterruptedException{
		visaStatusPage.passApplicationId("4520B968534E"); //applicationID //4520B968534E
		visaStatusPage.selectDateofbirth("25091990");//birthDate  //25091990
		String captcha = visaStatusPage.getVStatuscaptcha();
		visaStatusPage.passVStatuscaptcha(captcha);
	    visaStatusPage.clickonVsContinueBtn();
	  
	    System.out.println(visaStatusPage.getFirstLastnametext());
	    System.out.println(visaStatusPage.getApplicationStatustext());
	    System.out.println(visaStatusPage.getApplRefId());
	    softAssertion.assertEquals(visaStatusPage.getApplRefId(), applicationID,
				"provided and get text application Id does not matched");
		//Assert.assertEquals(visaStatusPage.getFirstLastnametext(), firstName+" "+lastName);
	    softAssertion.assertEquals(visaStatusPage.getFirstLastnametext(), firstName+" "+lastName);
	    softAssertion.assertEquals(visaStatusPage.getApplicationStatustext(), "Approved & Forward");
	    visaPaymentPage.clickOnDonetbtn();
	    System.out.println("home page title"
				+ homePage.validateHomePageTitle());
		Assert.assertEquals(homePage.validateHomePageTitle(), prop.getProperty("homePageTitle"), "We are not navigate to Home page after payment");
		System.out.println( "visa applicationID after payment==>" +applicationID);
		}*/
	
	@Test(priority=59)
	public void verifyVisastatuswithInValidData(){
		visaStatusPage.verifyClickonVisaStatusBtn();
		visaStatusPage.passApplicationId("5550B968534");
		visaStatusPage.selectDateofbirth("35091990");
		String captcha = visaStatusPage.getVStatuscaptcha();
		System.out.println(captcha);
		visaStatusPage.passVStatuscaptcha(captcha);
		visaStatusPage.clickonVsContinueBtn();
		softAssertion.assertEquals(visaStatusPage.getStatusErrorMsg1(), "Error! Incorrect Application ID or Date of Birth.",
					"provided and get text error message does not matched");
		softAssertion.assertAll();
	}
}