package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.FlatNo;
import static com.ghana.app.qa.testdata.ConstantVariable.Landmark;
import static com.ghana.app.qa.testdata.ConstantVariable.StreetName;
import static com.ghana.app.qa.testdata.ConstantVariable.applicationID;
import static com.ghana.app.qa.testdata.ConstantVariable.birthDate;
import static com.ghana.app.qa.testdata.ConstantVariable.birthPlace;
import static com.ghana.app.qa.testdata.ConstantVariable.cityName;
import static com.ghana.app.qa.testdata.ConstantVariable.countryName;
import static com.ghana.app.qa.testdata.ConstantVariable.dateOfDeparture;
import static com.ghana.app.qa.testdata.ConstantVariable.emailId;
import static com.ghana.app.qa.testdata.ConstantVariable.emerCityName;
import static com.ghana.app.qa.testdata.ConstantVariable.emerContactName;
import static com.ghana.app.qa.testdata.ConstantVariable.emerContactSurname;
import static com.ghana.app.qa.testdata.ConstantVariable.emerCountry;
import static com.ghana.app.qa.testdata.ConstantVariable.emerEmployerPhoneNumber;
import static com.ghana.app.qa.testdata.ConstantVariable.emerPhoneNumber;
import static com.ghana.app.qa.testdata.ConstantVariable.emerPincode;
import static com.ghana.app.qa.testdata.ConstantVariable.emerState;
import static com.ghana.app.qa.testdata.ConstantVariable.employer;
import static com.ghana.app.qa.testdata.ConstantVariable.employerAddress;
import static com.ghana.app.qa.testdata.ConstantVariable.firstName;
import static com.ghana.app.qa.testdata.ConstantVariable.lastName;
import static com.ghana.app.qa.testdata.ConstantVariable.month;
import static com.ghana.app.qa.testdata.ConstantVariable.nationalityName;
import static com.ghana.app.qa.testdata.ConstantVariable.passportExpiryDate;
import static com.ghana.app.qa.testdata.ConstantVariable.passportIssuedDate;
import static com.ghana.app.qa.testdata.ConstantVariable.passportNumber;
import static com.ghana.app.qa.testdata.ConstantVariable.phoneNumber;
import static com.ghana.app.qa.testdata.ConstantVariable.pinCode;
import static com.ghana.app.qa.testdata.ConstantVariable.priFirstName;
import static com.ghana.app.qa.testdata.ConstantVariable.priLastName;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryAddress;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryCity;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryCountry;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryPinCode;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryRefrencePhoneNo;
import static com.ghana.app.qa.testdata.ConstantVariable.primaryState;
import static com.ghana.app.qa.testdata.ConstantVariable.profession;
import static com.ghana.app.qa.testdata.ConstantVariable.secFirstName;
import static com.ghana.app.qa.testdata.ConstantVariable.secLastName;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryAddress;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryCity;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryCountry;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryPinCode;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryRefrencePhoneNo;
import static com.ghana.app.qa.testdata.ConstantVariable.secondaryState;
import static com.ghana.app.qa.testdata.ConstantVariable.stateName;
import static com.ghana.app.qa.testdata.ConstantVariable.ticketNumber;
import static com.ghana.app.qa.testdata.ConstantVariable.year;
import static com.ghana.app.qa.util.TestUtil.prop;
import static com.ghana.app.qa.util.TestUtil.providedDate;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.util.TestUtil;

public class PartiallyFilledApplicatlionTest extends PersonalInfoPageTest{

	public PartiallyFilledApplicatlionTest() throws IOException,
			InterruptedException {
		super();
		
	}
	@Test(priority=58)
	public void PartiallyFilledAppliTest() throws InterruptedException{
		personalInfoPage.clickOnSaveAndContinue();
		partiallyFilledApplicationPage.clickOnHomepageLinktext();
		Assert.assertEquals(driver.getTitle(), "Home", "it is navigated on home page");
	}
	@Test(priority=59)
	public void NegativePartiallyFilledTest() throws InterruptedException{
		partiallyFilledApplicationPage.clickOnpartialFilledTab();
		partiallyFilledApplicationPage.passApplicationId("3434242244242");
		partiallyFilledApplicationPage.selectDOB("25091990");
		String capchatext = partiallyFilledApplicationPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyFilledApplicationPage.passCaptchaText(capchatext);
		partiallyFilledApplicationPage.clickOnsubmitbtn();
		System.out.println(partiallyFilledApplicationPage.getErrorMessage().substring(2));
		Assert.assertEquals(partiallyFilledApplicationPage.getErrorMessage().substring(2), "Error! Incorrect Application ID or Date of Birth.");
		partiallyFilledApplicationPage.clickclosebtn();
	}
	@Test(priority=61)
	public void AlreadySubmittedPartiallyFilledTest() throws InterruptedException{
		partiallyFilledApplicationPage.clickOnpartialFilledTab();
		partiallyFilledApplicationPage.passApplicationId(applicationID);
		partiallyFilledApplicationPage.selectDOB(birthDate);
		String capchatext = partiallyFilledApplicationPage.getCaptchaText();
		System.out.println(capchatext);
		partiallyFilledApplicationPage.passCaptchaText(capchatext);
		partiallyFilledApplicationPage.clickOnsubmitbtn();
		System.out.println(partiallyFilledApplicationPage.getErrorMessage().substring(2));
		Assert.assertEquals(partiallyFilledApplicationPage.getErrorMessage().substring(2), "Error! Your application is submiited for verification, Please check status.");
		partiallyFilledApplicationPage.clickclosebtn();
	}
	@Test(priority=60)
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
		visaPaymentPage.verifyConfirmationPop();
		Thread.sleep(2000);
		System.out.println("home page title"
				+ homePage.validateHomePageTitle());
		softAssertion.assertEquals(homePage.validateHomePageTitle(), prop.getProperty("homePageTitle"), "We are not navigate to Home page after payment");
		System.out.println( "applicationID==>visa" +applicationID);
		

		//Assert.assertEquals(partiallyfilledPage.getErrorMessage().substring(2), expected);
		
	}
	
}
