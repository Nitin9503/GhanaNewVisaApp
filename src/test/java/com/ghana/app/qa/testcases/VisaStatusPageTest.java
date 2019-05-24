package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
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
	public void verifyVisastatuswithValidData(){
		visaStatusPage.passApplicationId("4520B968534E");//applicationID
		visaStatusPage.selectDateofbirth("25091990");//birthDate
		String captcha = visaStatusPage.getVStatuscaptcha();
		System.out.println(captcha);
		visaStatusPage.passVStatuscaptcha(captcha);
	    visaStatusPage.clickonVsContinueBtn();
	    System.out.println(visaStatusPage.getFirstLastnametext());
		  Assert.assertEquals(visaStatusPage.getFirstLastnametext(), firstName+" "+lastName);
		/*Assert.assertEquals(driver.getTitle(), "Track Application");
		String applicantName = driver.findElement(By.xpath("//span[contains(text(),'"+firstName+" "+lastName+"')]")).getText();
	    Assert.assertEquals(applicantName, firstName+" "+lastName, "provided applicant name not match with applicant name on Visa tracking");*/
		}
	
	/*@Test(priority=59)
	public void verifyVisastatuswithInValidData(){
		visaStatusPage.passApplicationId(applicationID);
		visaStatusPage.selectDateofbirth(passportIssuedDate);
		String captcha = visaStatusPage.getVStatuscaptcha();
		System.out.println(captcha);
		visaStatusPage.passVStatuscaptcha(captcha);
		visaStatusPage.clickonVsContinueBtn();
		}*/
}