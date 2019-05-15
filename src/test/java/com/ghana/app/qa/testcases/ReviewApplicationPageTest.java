package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.*;

public class ReviewApplicationPageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ReviewApplicationPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 56)
	public void signUpAndValidateReviewApp() throws InterruptedException, IOException {
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
		travelInfoPage.getTextTravelInfoPagetitle();
		softAssertion.assertEquals(travelInfoPage.getTextTravelInfoPagetitle(), "Travel Information",
				"it is not navigate to travel info page");
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
		uploadDocPage.getUploadDoc();
		uploadDocPage.clicksaveAndContiBtn();
	}

	@Test(priority = 57)
	public void getTextPersonalInfoTest() throws InterruptedException, IOException {
		softAssertion.assertEquals(reviewApplicationPage.getTextReviewPageTtle(), prop.getProperty("reviewApplicationText"), "We are not navigate to review Application page from upload document");
		
		System.out.println("applicationID==>Revie1" + applicationID);
		// ------Personal info
		softAssertion.assertEquals(reviewApplicationPage.getTextFromfirstLastName(), (firstName + " " + lastName),
				"Provided and Get firstName are not matched");
		// System.out.println(reviewApplicationPage.getTextFromfirstLastName()
		// +" = "+(firstName+" "+lastName));

		TestUtil.dateAlter(birthDate);
		softAssertion.assertEquals(reviewApplicationPage.getTextBirthDate(), providedDate,
				"Provided and Get Birthdate are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromBirthPlace(), birthPlace,
				"Provided and Get birthPlace are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPassportNumber(), passportNumber,
				"Provided and Get passportNumber are not matched");

		TestUtil.dateAlter(passportIssuedDate);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPassportIssuedDate(), providedDate,
				"Provided and Get passportIssuedDate are not matched");

		TestUtil.dateAlter(passportExpiryDate);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPassportExpiryDate(), providedDate,
				"Provided and Get passportExpiryDate are not matched");

		softAssertion.assertAll();

	}

	@Test(priority = 58)
	public void getTextAddressInfoTest() throws InterruptedException, IOException {
		// Address Info
		softAssertion.assertEquals(reviewApplicationPage.getTextFromAddress(),
				(FlatNo + ", " + StreetName + ", " + Landmark), "Provided and Get address are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFrompinCode(), pinCode,
				"Provided and Get pinCode are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromCityName(), cityName,
				"Provided and Get cityName are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromStateName(), stateName,
				"Provided and Get stateName are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromCountryName(), countryName,
				"Provided and Get countryName are not matched");

		// softAssertion.assertEquals(reviewApplicationPage.getTextFromAddressType(),
		// addressType, "Provided and Get addressType are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromNationality(), nationalityName,
				"Provided and Get nationality are not matched");

		// softAssertion.assertEquals(reviewApplicationPage.getTextFromFormerNationality(),
		// formerNationality, "Provided and Get formerNationality are not
		// matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmailId(), emailId,
				"Provided and Get emailId are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPhoneNumber(), phoneNumber,
				"Provided and Get phoneNumber are not matched");

		softAssertion.assertAll();

	}

	@Test(priority = 59)
	public void getTextEmergencyContactTest() throws InterruptedException, IOException {
		// Emergency contact
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerContactName(),
				(emerContactName + " " + emerContactSurname), "Provided and Get address are not matched");
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerPhoneNumber(), emerPhoneNumber,
				"Provided and Get emerPhoneNumber are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromProfession(), profession,
				"Provided and Get profession are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmployer(), employer,
				"Provided and Get employer are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmployerAddress(), employerAddress,
				"Provided and Get countryName are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerPincode(), emerPincode,
				"Provided and Get emerPincode are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerCityName(), emerCityName,
				"Provided and Get emerCityName are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerState(), emerState,
				"Provided and Get emerState are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerCountry(), emerCountry,
				"Provided and Get emerCountry are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerEmployerPhoneNumber(), emerEmployerPhoneNumber,
				"Provided and Get emerEmployerPhoneNumber are not matched");

		softAssertion.assertAll();

	}

	@Test(priority = 60)
	public void getTextTravelInfoTest() throws InterruptedException, IOException {
		// Travel Info
		TestUtil.dateAlter(dateOfDeparture);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromDateOfDeparture(), providedDate,
				"Provided and Get dateOfDeparture are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromtTicketNumber(), ticketNumber,
				"Provided and Get emerPhoneNumber are not matched");

		// primary reference

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryFirstLastName(),
				(priFirstName + " " + priLastName), "Provided and Get primaryFirstLastName are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryAddress(), primaryAddress,
				"Provided and Get primaryAddress are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryPinCode(), primaryPinCode,
				"Provided and Get primaryPinCode are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryCity(), primaryCity,
				"Provided and Get primaryCity are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryState(), primaryState,
				"Provided and Get primaryState are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryCountry(), primaryCountry,
				"Provided and Get primaryCountry are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryRefrencePhoneNo(), primaryRefrencePhoneNo,
				"Provided and Get primaryRefrencePhoneNo are not matched");

		// Secondary reference

		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryFirstLastName(),
				(secFirstName + " " + secLastName), "Provided and Get secondaryFirstLastName are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryAddress(), secondaryAddress,
				"Provided and Get secondaryAddress are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryPinCode(), secondaryPinCode,
				"Provided and Get primaryPinCode are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryCity(), secondaryCity,
				"Provided and Get secondaryCity are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryState(), secondaryState,
				"Provided and Get secondaryState are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryCountry(), secondaryCountry,
				"Provided and Get secondaryCountry are not matched");

		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryRefrencePhoneNo(),
				secondaryRefrencePhoneNo, "Provided and Get secondaryRefrencePhoneNo are not matched");

		softAssertion.assertAll();

	}


}
