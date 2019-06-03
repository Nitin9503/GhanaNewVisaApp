package com.ghana.app.qa.testcases;
import static com.ghana.app.qa.testdata.ConstantVariable.*;

import static com.ghana.app.qa.util.TestUtil.prop;
import static com.ghana.app.qa.util.TestUtil.providedDate;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class PartiallyFilledApplicatlionTest extends PersonalInfoPageTest{

	SoftAssert softAssertion= new SoftAssert();
	public PartiallyFilledApplicatlionTest() throws IOException,
			InterruptedException {
		super();
		
	}
	@Test(priority=13)
	public void PartiallyFilledAppliTest() throws InterruptedException{
		personalInfoPage.clickOnSaveAndContinue();
		partiallyFilledApplicationPage.clickOnHomepageLinktext();
		Assert.assertEquals(driver.getTitle(), "Home", "it is navigated on home page");
	}
	@Test(priority=14)
	public void NegativePartiallyFilledTest() throws InterruptedException{
		partiallyFilledApplicationPage.clickOnpartialFilledTab();
		partiallyFilledApplicationPage.passApplicationId("3434242244242");
		partiallyFilledApplicationPage.selectDOB("25091990");
		String capchatext = partiallyFilledApplicationPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyFilledApplicationPage.passCaptchaText(capchatext);
		partiallyFilledApplicationPage.clickOnsubmitbtn();
		System.out.println(partiallyFilledApplicationPage.getErrorMessage1());
		Assert.assertEquals(partiallyFilledApplicationPage.getErrorMessage1(), "Error! Incorrect Application ID or Date of Birth.");
		partiallyFilledApplicationPage.clickclosebtn();
	}

	@Test(priority=15)
	public void PartiallyFilledTest() throws InterruptedException{
		partiallyFilledApplicationPage.passApplicationId(applicationID);
	    partiallyFilledApplicationPage.selectDOB(birthDate);
		String capchatext = partiallyFilledApplicationPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyFilledApplicationPage.passCaptchaText(capchatext);
		partiallyFilledApplicationPage.clickOnsubmitbtn();
		System.out.println("click on continue btn");
		//System.out.println(partiallyFilledApplicationPage.getErrorMessage().substring(2));
		addressInfoPage.getTextAddressInfoPageTitle();
		System.out.println(addressInfoPage.getTextAddressInfoPageTitle());
		softAssertion.assertEquals(addressInfoPage.getTextAddressInfoPageTitle(), prop.getProperty("addressInformationText"),
				"it is not navigate to address info page");
		softAssertion.assertAll();
		Thread.sleep(2000);
		addressInfoPage.selectFormerNaitonality();
		System.out.println("former nationality selected");
		addressInfoPage.PassAddressInfofield(FlatNo, StreetName, Landmark, pinCode, cityName, stateName, countryName);
		addressInfoPage.clickSaveAndContinuebtn();
		emergencyContactPage.emergencyContactDetails(emerContactName, emerContactSurname, emerPhoneNumber);
		emergencyContactPage.selectRelation();
		emergencyContactPage.emergencyProfessionDetails(profession, employer, employerAddress, emerPincode,
				emerCityName, emerState, emerCountry, emerEmployerPhoneNumber);
		emergencyContactPage.clickEmeContinueBtn();
		travelInfoPage.getTextTravelInfoPagetitle();
	// ----------------------Travel Info page
	// Test----------------------------------//
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		travelInfoPage.passDateOfDeparture(dateOfDeparture);
		travelInfoPage.clickOnContinuebutton();
		travelInfoPage.passTicketNumber(ticketNumber);
		travelInfoPage.clickOnTravelBy();
		travelInfoPage.clickPurpose_of_journey();
		travelInfoPage.passPrimaryRefFirstname(priFirstName);
		travelInfoPage.passPrimaryRefLastname(priLastName);
		travelInfoPage.pass_Primary_ref_address(primaryAddress);
		travelInfoPage.pass_primary_ref_pincode(primaryPinCode);
		travelInfoPage.pass_primary_ref_city(primaryCity);
		travelInfoPage.pass_primary_ref_state(primaryState);
		travelInfoPage.pass_primary_ref_country(primaryCountry);
		travelInfoPage.pass_primary_ref_phone_number(primaryRefrencePhoneNo);
		travelInfoPage.PassSecondaryRefDetails(secFirstName, secLastName, secondaryAddress, secondaryPinCode,
				secondaryCity, secondaryState, secondaryCountry, secondaryRefrencePhoneNo);
		travelInfoPage.clickOnByPhoneCheckbox();
		travelInfoPage.clickOnByTextMessageCheckbox();
		travelInfoPage.clickOnByEmailCheckbox();
		travelInfoPage.passOtherWayToReach("Skype");
		travelInfoPage.clickOnContinuebutton();
		uploadDocPage.getUploadDoc();
		uploadDocPage.clicksaveAndContiBtn();
		reviewApplicationPage.clickOnContinuebutton();
		System.out.println("applicationID==>Revie2" + applicationID);
		softAssertion.assertEquals(visaPaymentPage.getTextPaymentPageTitle(), prop.getProperty("visaPaymentText"),
				"it is not navigate to payment info page");	
		visaPaymentPage.clickOnCheckoutBtn();
		visaPaymentPage.passCardNo();
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
		visaPaymentPage.passCvvNo();
		visaPaymentPage.clickOnMakePaymentBtn();
		visaPaymentPage.clickOnSubmitbtn();
		visaPaymentPage.clickOnOKtbtn();
		visaPaymentPage.clickOnDonetbtn();
		//visaPaymentPage.verifyConfirmationPop();
		Thread.sleep(2000);
		System.out.println("home page title"
				+ homePage.validateHomePageTitle());
		softAssertion.assertEquals(homePage.validateHomePageTitle(), prop.getProperty("homePageTitle"), "We are not navigate to Home page after payment");
		System.out.println( "applicationID==>visa" +applicationID);
		

		//Assert.assertEquals(partiallyfilledPage.getErrorMessage().substring(2), expected);
		
	}
	@Test(priority=16)
	public void AlreadySubmittedPartiallyFilledTest() throws InterruptedException{
		partiallyFilledApplicationPage.clickOnpartialFilledTab();
		partiallyFilledApplicationPage.passApplicationId(applicationID);
		partiallyFilledApplicationPage.selectDOB(birthDate);
		String capchatext = partiallyFilledApplicationPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyFilledApplicationPage.passCaptchaText(capchatext);
		partiallyFilledApplicationPage.clickOnsubmitbtn();
		System.out.println(partiallyFilledApplicationPage.getErrorMessage2());
		Assert.assertEquals(partiallyFilledApplicationPage.getErrorMessage2(), "Error! Your application is submiited for verification, Please check status.");
		partiallyFilledApplicationPage.clickclosebtn();
	}
	@Test(priority=17)
	public void verifyWithEmptyField() throws InterruptedException{
		partiallyFilledApplicationPage.selectDOB(birthDate);
		String capchatext = partiallyFilledApplicationPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyFilledApplicationPage.passCaptchaText(capchatext);
		partiallyFilledApplicationPage.clickOnsubmitbtn();
		/* Alert simpleAlert = driver.switchTo().alert();
		 String alertText = simpleAlert.getText();
		 System.out.println("Alert text is " + alertText);
		 */
	}
	
}
