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

	@Test(priority = 1)
	public static void signUpAndFillSignUpPage() throws InterruptedException,
			IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		signUpPage.clickOnCheckBoxes();
		signUpPage.selectRadioButton();
		signUpPage.verifyRadioButtonSelected();
		signUpPage.SelectPassportType();
		signUpPage.selectNationality();
		Thread.sleep(1000);
		signUpPage.selectPortOfArrival();
		signUpPage.selectVisaType();
		signUpPage.selectVisaLocation();
		signUpPage.passPhoneNo(TestUtil.readDataFromExcellString(5, 11, 0));
		signUpPage.passEmailId(TestUtil.readDataFromExcellString(5, 12, 0));
		signUpPage.passReEmailId(TestUtil.readDataFromExcellString(5, 13, 0));
		signUpPage.enterCaptchaField();
		signUpPage.selectDateOfBirth(TestUtil
				.readDataFromExcellString(5, 14, 0));
		signUpPage.continueBtn();

	}

	@Test(priority = 2)
	public void fillPersonalPageTest() throws InterruptedException, IOException {
		// ----------------------Personal info page //
		// Test----------------------------------//
		Thread.sleep(1000);
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(6, 5,
				0));
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(6, 6,
				0));
		personalInfoPage.passLastName(TestUtil
				.readDataFromExcellString(6, 7, 0));
		personalInfoPage.passPassportNumber(TestUtil.readDataFromExcellString(
				6, 8, 0));
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		personalInfoPage.selectPassIssueDate(TestUtil.readDataFromExcellString(
				6, 9, 0));
		personalInfoPage.selectPassExpiryDate(TestUtil
				.readDataFromExcellString(6, 10, 0));
		personalInfoPage.passPlaceOfBirth(TestUtil.readDataFromExcellString(6,
				11, 0));
		personalInfoPage.clickOnSaveAndContinue();
	}

	@Test(priority = 3)
	public void fillAddressinfoPageTest() throws InterruptedException,
			IOException {
		// ----------------------Address Info page //
		// Test----------------------------------//
		addressInfoPage.selectFormerNaitonality();
		addressInfoPage.passFlatNumber(TestUtil.readDataFromExcellString(7, 4,
				0));
		addressInfoPage.passStreetName(TestUtil.readDataFromExcellString(7, 5,
				0));
		addressInfoPage
				.passLandmark(TestUtil.readDataFromExcellString(7, 6, 0));
		addressInfoPage.passPincode(TestUtil.readDataFromExcellString(7, 7, 0));
		addressInfoPage
				.passCityName(TestUtil.readDataFromExcellString(7, 8, 0));
		addressInfoPage.passStateName(TestUtil
				.readDataFromExcellString(7, 9, 0));
		addressInfoPage.passCountryName(TestUtil.readDataFromExcellString(7,
				10, 0));
		addressInfoPage.selectAddressType();
		addressInfoPage.clickSaveAndContinuebtn();
	}

	@Test(priority = 4)
	public void fillEmergencyPageTest() throws InterruptedException,
			IOException {
		emergencyContactPage.emergencyFirstName(TestUtil
				.readDataFromExcellString(8, 3, 0));
		emergencyContactPage.emergencyLastName(TestUtil
				.readDataFromExcellString(8, 4, 0));
		emergencyContactPage.emergencyContactNumber(TestUtil
				.readDataFromExcellString(8, 6, 0));
		emergencyContactPage.selectRelation();
		emergencyContactPage.passEmergency_profession(TestUtil
				.readDataFromExcellString(8, 7, 0));
		emergencyContactPage.passEmployerOrSchoolName(TestUtil
				.readDataFromExcellString(8, 8, 0));
		emergencyContactPage.pass_EmployerOrSchooladdress(TestUtil
				.readDataFromExcellString(8, 9, 0));
		emergencyContactPage.pass_Emergency_Pincode(TestUtil
				.readDataFromExcellString(8, 10, 0));
		emergencyContactPage.paa_Emergency_city(TestUtil
				.readDataFromExcellString(8, 11, 0));
		emergencyContactPage.pass_Emergency_State(TestUtil
				.readDataFromExcellString(8, 12, 0));
		emergencyContactPage.pass_Emergency_Country(TestUtil
				.readDataFromExcellString(8, 13, 0));
		emergencyContactPage.pass_emergency_employer_phone_number(TestUtil
				.readDataFromExcellString(8, 14, 0));
		emergencyContactPage.clickEmeContinueBtn();
	}

	@Test(priority = 5)
	public void fillTravelInfoPageTest() throws InterruptedException,
			IOException {

		travelInfoPage.passDateOfDeparture(TestUtil.readDataFromExcellString(9,
				3, 0));
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		travelInfoPage.passTicketNumber(TestUtil.readDataFromExcellString(9, 5,
				0));
		travelInfoPage.clickOnTravelBy();
		travelInfoPage.clickPurpose_of_journey();
		travelInfoPage.passPrimaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 8, 0));
		travelInfoPage.passPrimaryRefLastname(TestUtil
				.readDataFromExcellString(9, 9, 0));
		travelInfoPage.pass_Primary_ref_address(TestUtil
				.readDataFromExcellString(9, 10, 0));
		travelInfoPage.pass_primary_ref_pincode(TestUtil
				.readDataFromExcellString(9, 11, 0));
		travelInfoPage.pass_primary_ref_city(TestUtil.readDataFromExcellString(
				9, 12, 0));
		travelInfoPage.pass_primary_ref_state(TestUtil
				.readDataFromExcellString(9, 13, 0));
		travelInfoPage.pass_primary_ref_country(TestUtil
				.readDataFromExcellString(9, 14, 0));
		travelInfoPage.pass_primary_ref_phone_number(TestUtil
				.readDataFromExcellString(9, 15, 0));
		travelInfoPage.passsecondaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 16, 0));
		travelInfoPage.pass_secondary_ref_lastname(TestUtil
				.readDataFromExcellString(9, 17, 0));
		travelInfoPage.pass_secondary_ref_address(TestUtil
				.readDataFromExcellString(9, 18, 0));
		travelInfoPage.pass_secondary_ref_pincode(TestUtil
				.readDataFromExcellString(9, 19, 0));
		travelInfoPage.pass_secondary_ref_city(TestUtil
				.readDataFromExcellString(9, 20, 0));
		travelInfoPage.pass_secondary_ref_state(TestUtil
				.readDataFromExcellString(9, 21, 0));
		travelInfoPage.pass_secondary_ref_country(TestUtil
				.readDataFromExcellString(9, 22, 0));
		travelInfoPage.pass_secondary_ref_phone_number(TestUtil
				.readDataFromExcellString(9, 23, 0));
		travelInfoPage.clickOnByPhoneCheckbox();
		travelInfoPage.clickOnContinuebutton();

	}

	@Test(priority = 6)
	public void documentPageTest() throws InterruptedException, IOException {

		uploadDocPage.getUploadDoc();
		uploadDocPage.clicksaveAndContiBtn();
		TestUtil.writeStringValue(11, 1, 1);
		Thread.sleep(1000);

	}

	@Test(priority = 7)
	public void getTextPersonalInfoTest() throws InterruptedException,
			IOException {

		Assert.assertEquals(reviewApplicationPage.getTextReviewPageTtle(),
				TestUtil.readDataFromExcellString(11, 2, 0),
				"We are not navigate to review Application page from upload document");
		TestUtil.writeStringValue(11, 2, 1);
		System.out.println("applicationID==>Revie1" + applicationID);
		// ------Personal info
		Assert.assertEquals(reviewApplicationPage.getTextFromfirstLastName(),
				(TestUtil.readDataFromExcellString(6, 5, 0) + " " + TestUtil
						.readDataFromExcellString(6, 6, 0)),
				"Provided and Get firstName and lastname are not matched");
		TestUtil.writeStringValue(11, 3, 1);

		TestUtil.dateAlter(birthDate);
		Assert.assertEquals(reviewApplicationPage.getTextBirthDate(),
				TestUtil.readDataFromExcellString(5, 14, 0),
				"Provided and Get Birthdate are not matched");
		TestUtil.writeStringValue(11, 4, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromBirthPlace(),
				TestUtil.readDataFromExcellString(6, 11, 0),
				"Provided and Get birthPlace are not matched");
		TestUtil.writeStringValue(11, 5, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromPassportNumber(),
				TestUtil.readDataFromExcellString(6, 8, 0),
				"Provided and Get passportNumber are not matched");
		TestUtil.writeStringValue(11, 6, 1);
		TestUtil.dateAlter(passportIssuedDate);
		Assert.assertEquals(
				reviewApplicationPage.getTextFromPassportIssuedDate(),
				TestUtil.readDataFromExcellString(6, 9, 0),
				"Provided and Get passportIssuedDate are not matched");
		TestUtil.writeStringValue(11, 7, 1);
		TestUtil.dateAlter(passportExpiryDate);
		Assert.assertEquals(
				reviewApplicationPage.getTextFromPassportExpiryDate(),
				TestUtil.readDataFromExcellString(6, 10, 0),
				"Provided and Get passportExpiryDate are not matched");
		TestUtil.writeStringValue(11, 8, 1);
		// softAssertion.assertAll();
	}

	@Test(priority = 8)
	public void getTextAddressInfoTest() throws InterruptedException,
			IOException {
		// Address Info
		Assert.assertEquals(
				reviewApplicationPage.getTextFromAddress(),
				(TestUtil.readDataFromExcellString(7, 4, 0) + ", "
						+ TestUtil.readDataFromExcellString(7, 5, 0) + ", " + TestUtil
						.readDataFromExcellString(7, 6, 0)),
				"Provided and Get address are not matched");
		TestUtil.writeStringValue(11, 11, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFrompinCode(),
				TestUtil.readDataFromExcellString(7, 7, 0),
				"Provided and Get pinCode are not matched");
		TestUtil.writeStringValue(11, 13, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromCityName(),
				TestUtil.readDataFromExcellString(7, 8, 0),
				"Provided and Get cityName are not matched");
		TestUtil.writeStringValue(11, 14, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromStateName(),
				TestUtil.readDataFromExcellString(7, 9, 0),
				"Provided and Get stateName are not matched");
		TestUtil.writeStringValue(11, 15, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromCountryName(),
				TestUtil.readDataFromExcellString(7, 10, 0),
				"Provided and Get countryName are not matched");
		TestUtil.writeStringValue(11, 16, 1);
		// softAssertion.assertEquals(reviewApplicationPage.getTextFromAddressType(),
		// addressType, "Provided and Get addressType are not matched");

		Assert.assertEquals(reviewApplicationPage.getTextFromNationality(),
				TestUtil.readDataFromExcellString(5, 7, 0),
				"Provided and Get nationality are not matched");
		TestUtil.writeStringValue(11, 17, 1);
		// softAssertion.assertEquals(reviewApplicationPage.getTextFromFormerNationality(),
		// formerNationality, "Provided and Get formerNationality are not
		// matched");

		Assert.assertEquals(reviewApplicationPage.getTextFromEmailId(),
				TestUtil.readDataFromExcellString(5, 12, 0),
				"Provided and Get emailId are not matched");
		TestUtil.writeStringValue(11, 12, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromPhoneNumber(),
				TestUtil.readDataFromExcellString(5, 11, 0),
				"Provided and Get phoneNumber are not matched");
		TestUtil.writeStringValue(11, 18, 1);
		// softAssertion.assertAll();

	}

	@Test(priority = 9)
	public void getTextEmergencyContactTest() throws InterruptedException,
			IOException {
		// Emergency contact
		softAssertion.assertEquals(reviewApplicationPage
				.getTextFromEmerContactName(),
				(TestUtil.readDataFromExcellString(8, 3, 0) + " " + TestUtil
						.readDataFromExcellString(8, 4, 0)),
				"Provided and Get address are not matched");
		TestUtil.writeStringValue(11, 20, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromEmerPhoneNumber(),
				TestUtil.readDataFromExcellString(8, 6, 0),
				"Provided and Get emerPhoneNumber are not matched");
		TestUtil.writeStringValue(11, 21, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromProfession(),
				TestUtil.readDataFromExcellString(8, 7, 0),
				"Provided and Get profession are not matched");
		TestUtil.writeStringValue(11, 22, 1);
		//working company name / school name
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmployer(),
				TestUtil.readDataFromExcellString(8, 8, 0),
				"Provided and Get employer are not matched");
		TestUtil.writeStringValue(11, 23, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromEmployerAddress(),
				TestUtil.readDataFromExcellString(8, 9, 0),
				"Provided and Get countryName are not matched");
		TestUtil.writeStringValue(11, 24, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromEmerPincode(),
				TestUtil.readDataFromExcellString(8, 10, 0),
				"Provided and Get emerPincode are not matched");
		TestUtil.writeStringValue(11, 25, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromEmerCityName(),
				TestUtil.readDataFromExcellString(8, 11, 0),
				"Provided and Get emerCityName are not matched");
		TestUtil.writeStringValue(11, 26, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromEmerState(),
				TestUtil.readDataFromExcellString(8, 12, 0),
				"Provided and Get emerState are not matched");
		TestUtil.writeStringValue(11, 27, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromEmerCountry(),
				TestUtil.readDataFromExcellString(8, 13, 0),
				"Provided and Get emerCountry are not matched");
		TestUtil.writeStringValue(11, 28, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromEmerEmployerPhoneNumber(),
				TestUtil.readDataFromExcellString(8, 14, 0),
				"Provided and Get emerEmployerPhoneNumber are not matched");
		TestUtil.writeStringValue(11, 29, 1);
		softAssertion.assertAll();

	}

	@Test(priority = 10)
	public void getTextTravelInfoTest() throws InterruptedException,
			IOException {
		// Travel Info
		TestUtil.dateAlter(dateOfDeparture);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromDateOfDeparture(),
				TestUtil.readDataFromExcellString(9, 3, 0),
				"Provided and Get dateOfDeparture are not matched");
		TestUtil.writeStringValue(11, 31, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromtTicketNumber(), TestUtil.readDataFromExcellString(9, 5, 0),
				"Provided and Get emerPhoneNumber are not matched");
		TestUtil.writeStringValue(11, 32, 1);
		// primary reference

		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromPrimaryFirstLastName(),
				(TestUtil.readDataFromExcellString(9, 8, 0) + " " + TestUtil.readDataFromExcellString(9, 9, 0)),
				"Provided and Get primaryFirstLastName are not matched");
		TestUtil.writeStringValue(11, 33, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromPrimaryAddress(),
				TestUtil.readDataFromExcellString(9, 10, 0),
				"Provided and Get primaryAddress are not matched");
		TestUtil.writeStringValue(11, 34, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromPrimaryPinCode(),
				TestUtil.readDataFromExcellString(9, 11, 0),
				"Provided and Get primaryPinCode are not matched");
		TestUtil.writeStringValue(11, 35, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromPrimaryCity(), TestUtil.readDataFromExcellString(9, 12, 0),
				"Provided and Get primaryCity are not matched");
		TestUtil.writeStringValue(11, 36, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromPrimaryState(), TestUtil.readDataFromExcellString(9, 13, 0),
				"Provided and Get primaryState are not matched");
		TestUtil.writeStringValue(11, 37, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromPrimaryCountry(),
				TestUtil.readDataFromExcellString(9, 14, 0),
				"Provided and Get primaryCountry are not matched");
		TestUtil.writeStringValue(11, 38, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromPrimaryRefrencePhoneNo(),
				TestUtil.readDataFromExcellString(9, 15, 0),
				"Provided and Get primaryRefrencePhoneNo are not matched");
		TestUtil.writeStringValue(11, 39, 1);
		// Secondary reference

		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromSecondaryFirstLastName(),
				(TestUtil.readDataFromExcellString(9, 16, 0) + " " + TestUtil.readDataFromExcellString(9, 17, 0)),
				"Provided and Get secondaryFirstLastName are not matched");
		TestUtil.writeStringValue(11, 40, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromSecondaryAddress(),
				TestUtil.readDataFromExcellString(9, 18, 0),
				"Provided and Get secondaryAddress are not matched");
		TestUtil.writeStringValue(11, 41, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromSecondaryPinCode(),
				TestUtil.readDataFromExcellString(9, 19, 0),
				"Provided and Get primaryPinCode are not matched");
		TestUtil.writeStringValue(11, 42, 1);
		softAssertion
				.assertEquals(reviewApplicationPage.getTextFromSecondaryCity(),
						TestUtil.readDataFromExcellString(9, 20, 0),
						"Provided and Get secondaryCity are not matched");
		TestUtil.writeStringValue(11, 43, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromSecondaryState(),
				TestUtil.readDataFromExcellString(9, 21, 0),
				"Provided and Get secondaryState are not matched");
		TestUtil.writeStringValue(11, 44, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromSecondaryCountry(),
				TestUtil.readDataFromExcellString(9, 22, 0),
				"Provided and Get secondaryCountry are not matched");
		TestUtil.writeStringValue(11, 45, 1);
		softAssertion.assertEquals(
				reviewApplicationPage.getTextFromSecondaryRefrencePhoneNo(),
				TestUtil.readDataFromExcellString(9, 23, 0),
				"Provided and Get secondaryRefrencePhoneNo are not matched");
		TestUtil.writeStringValue(11, 46, 1);
		softAssertion.assertAll();

	}

}
