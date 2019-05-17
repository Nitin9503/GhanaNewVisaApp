package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import java.io.IOException;

import static com.ghana.app.qa.util.TestUtil.*;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bsh.util.Util;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class UploadDocPageTest extends DriverInit {

	SoftAssert softAssertion = new SoftAssert();

	public UploadDocPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test(priority = 54)
	public void signUpAndFillTravelInfo() throws InterruptedException, IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		signUpPage.clickOnCheckBoxes();
		signUpPage.verifyCheckBoxIsSelected();
		System.out.println("selectedBoxOnSignUp2==>" + selectedBoxOnSignUp);
		// softAssertion.assertTrue(selectedBoxOnSignUp,
		// "Check boxes are not selected from SignUp page");
		signUpPage.selectRadioButton();
		signUpPage.verifyRadioButtonSelected();
		// softAssertion.assertTrue(selectedRadioButtonOnSignUp,
		// "Check boxes are not selected from SignUp page");
		signUpPage.SelectPassportType();
		signUpPage.selectNationality();
		Thread.sleep(2000);
		signUpPage.selectPortOfArrival();
		signUpPage.selectVisaType();

		signUpPage.selectVisaLocation();

		signUpPage.passPhoneNo(phoneNumber);
		signUpPage.passEmailId(emailId);
		signUpPage.passReEmailId(emailId);
		signUpPage.enterCaptchaField();
		// signUpPage.continueBtn();
		// signUpPage.cancelBtn();
		signUpPage.selectDateOfBirth(birthDate);
		// signUpPage.continueBtn();
		signUpPage.continueBtn();

		// ----------------------Personal info page
		// Test----------------------------------//
		Thread.sleep(2000);
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		personalInfoPage.passFirstName(firstName);
		personalInfoPage.passMiddleName(middleName);
		personalInfoPage.passLastName(lastName);
		personalInfoPage.passPassportNumber(passportNumber);
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		softAssertion.assertTrue(genderRadioButton, "Gender Radio button is not selected");
		softAssertion.assertAll();
		personalInfoPage.selectPassIssueDate(passportIssuedDate);
		personalInfoPage.selectPassExpiryDate(passportExpiryDate);
		personalInfoPage.passPlaceOfBirth(birthPlace);
		personalInfoPage.clickOnSaveAndContinue();
		// ----------------------Address Info page
		// Test----------------------------------//
		addressInfoPage.selectFormerNaitonality();
		addressInfoPage.PassAddressInfofield(FlatNo, StreetName, Landmark, pinCode, cityName, stateName, countryName);
		addressInfoPage.clickSaveAndContinuebtn();
		emergencyContactPage.emergencyContactDetails(emerContactName, emerContactSurname, emerPhoneNumber);
		emergencyContactPage.selectRelation();
		emergencyContactPage.emergencyProfessionDetails(profession, employer, employerAddress, emerPincode,
				emerCityName, emerState, emerCountry, emerEmployerPhoneNumber);
		emergencyContactPage.clickEmeContinueBtn();
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
		System.out.println("travelInfoPage.verifyByPhoneCheckbox()" + travelInfoPage.verifyByPhoneCheckbox());
		softAssertion.assertTrue(travelInfoPage.verifyByPhoneCheckbox(), "Phone Check box is not selected");
		travelInfoPage.clickOnByTextMessageCheckbox();
		System.out
				.println("travelInfoPage.verifyByTextMessageCheckbox()" + travelInfoPage.verifyByTextMessageCheckbox());
		softAssertion.assertTrue(travelInfoPage.verifyByTextMessageCheckbox(),
				"By Text Message Check box is not selected");
		travelInfoPage.clickOnByEmailCheckbox();
		System.out.println("travelInfoPage.verifyByEmailCheckbox()" + travelInfoPage.verifyByEmailCheckbox());
		softAssertion.assertTrue(travelInfoPage.verifyByEmailCheckbox(), "By Email Check box is not seletced");
		travelInfoPage.passOtherWayToReach("Skype");
		softAssertion.assertAll();
		travelInfoPage.clickOnContinuebutton();
	}

	@Test(priority = 55)
	public void getUploadDocTest() throws InterruptedException, IOException {

		softAssertion.assertEquals(uploadDocPage.getTextUploadDocPageTitle(), prop.getProperty("uploadDocumentsText"), "We are not navigate to Upload docuent page from Travel Infor");		
		uploadDocPage.getUploadDoc();
		softAssertion.assertAll();

	}

	
}
