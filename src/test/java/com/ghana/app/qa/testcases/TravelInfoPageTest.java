package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.*;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class TravelInfoPageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public TravelInfoPageTest() throws IOException, InterruptedException {
		super();
	}

	@Test(priority = 1)
	public void signUpAndFillSignUpPage() throws InterruptedException,
			IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
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
		TestUtil.clickOnElement(signUpPage.selectOneRadioButton());
		TestUtil.clickOnElement(signUpPage.termsCheckboxselect());
		TestUtil.clickOnElement(signUpPage.clickOnSelectAll());
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

	}

	@Test(priority = 5)
	public void ContinueAndSaveEmergTest() throws InterruptedException,
			IOException {
		emergencyContactPage.clickEmeContinueBtn();
		TestUtil.writeStringValue(9, 1, 1);
		travelInfoPage.getTextTravelInfoPagetitle();
		Assert.assertEquals(travelInfoPage.getTextTravelInfoPagetitle(),
				TestUtil.readDataFromExcellString(9, 2, 0),
				"it is not navigate to travel info page when compared with Test Data");
		TestUtil.writeStringValue(9, 2, 1);
	}

	@Test(priority = 6)
	public void passDateOfDepartureTest() throws InterruptedException,
			IOException {
		Thread.sleep(3000);
		travelInfoPage.passDateOfDeparture(TestUtil.readDataFromExcellString(9,
				3, 0));
		Assert.assertEquals(travelInfoPage.getTextDateOfDeparture(),
				TestUtil.readDataFromExcellString(9, 3, 0),
				"Date of departure is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 3, 1);
		// travelInfoPage.clickOnContinuebutton();
	}

	@Test(priority = 7)
	public void clickOnIsApplicantPossessionRoundTicketTest()
			throws InterruptedException, IOException {
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
	/*	Assert.assertTrue(travelInfoPage.getTextFromRoundTicket(),
				"it is not navigate to travel info page when compared with Test Data");
		TestUtil.writeStringValue(9, 4, 1);*/

	}

	@Test(priority = 8)
	public void passTicketNumberTest() throws InterruptedException, IOException {
		travelInfoPage.passTicketNumber(TestUtil.readDataFromExcellString(9, 5,0));
		Assert.assertEquals(travelInfoPage.getTextTicketNumber(),
				TestUtil.readDataFromExcellString(9, 5, 0),
				"Ticket number is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 5, 1);
	}

	@Test(priority = 9)
	public void clickOnTravelByTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnTravelBy();
		Assert.assertEquals(travelInfoPage.getTextTravelingBy(),
				TestUtil.readDataFromExcellString(9, 6, 0),
				"Travel by option is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 6, 1);
	}

	@Test(priority = 10)
	public void clickPurpose_of_journeyTest() throws InterruptedException,
			IOException {
		travelInfoPage.clickPurpose_of_journey();
		Assert.assertEquals(travelInfoPage.getTextpurpose_of_journey(),
				TestUtil.readDataFromExcellString(9, 7, 0),
				"purpose of journey is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 7, 1);
	}

	@Test(priority = 11)
	public void passPrimaryRefFirstnameTest() throws InterruptedException,
			IOException {
		travelInfoPage.passPrimaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 8, 0));
		Assert.assertEquals(travelInfoPage.getTextPrimaryRefFirstname(),
				TestUtil.readDataFromExcellString(9, 8, 0),
				"First name of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 8, 1);

	}

	@Test(priority = 12)
	public void passPrimaryRefLastnameTest() throws InterruptedException,
			IOException {
		travelInfoPage.passPrimaryRefLastname(TestUtil.readDataFromExcellString(9, 9, 0));
		Assert.assertEquals(travelInfoPage.getTextPrimaryRefLastname(),
				TestUtil.readDataFromExcellString(9, 9, 0),
				"Last name of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 9, 1);

	}

	@Test(priority = 13)
	public void pass_Primary_ref_addressTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_Primary_ref_address(TestUtil.readDataFromExcellString(9, 10, 0));
		Assert.assertEquals(travelInfoPage.getText_Primary_ref_address(),
				TestUtil.readDataFromExcellString(9, 10, 0),
				"Address of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 10, 1);

	}

	@Test(priority = 14)
	public void pass_primary_ref_pincodeTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_pincode(TestUtil.readDataFromExcellString(9, 11, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_pincode(),
				TestUtil.readDataFromExcellString(9, 11, 0),
				"Pincode of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 11, 1);

	}

	@Test(priority = 15)
	public void pass_primary_ref_cityTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_city(TestUtil.readDataFromExcellString(9, 12, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_city(),
				TestUtil.readDataFromExcellString(9, 12, 0),
				"City of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 12, 1);

	}

	@Test(priority = 16)
	public void pass_primary_ref_stateTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_state(TestUtil.readDataFromExcellString(9, 13, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_state(),
				TestUtil.readDataFromExcellString(9, 13, 0),
				"State of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 13, 1);

	}

	@Test(priority = 17)
	public void pass_primary_ref_countryTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_country(TestUtil.readDataFromExcellString(9, 14, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_country(),
				TestUtil.readDataFromExcellString(9, 14, 0),
				"Country of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 14, 1);

	}

	@Test(priority = 18)
	public void pass_primary_ref_phone_numberTest()throws InterruptedException, IOException {

		travelInfoPage.pass_primary_ref_phone_number(TestUtil.readDataFromExcellString(9, 15, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_phone_number(),
				TestUtil.readDataFromExcellString(9, 15, 0),
				"Contact number of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 15, 1);
	}

	@Test(priority = 19)
	public void pass_firstName_SecRef() throws InterruptedException,IOException {
		travelInfoPage.passsecondaryRefFirstname(TestUtil.readDataFromExcellString(9, 16, 0));
		Assert.assertEquals(
				travelInfoPage.getTextsecondaryRefFirstname(),
				TestUtil.readDataFromExcellString(9, 16, 0),
				"First name number of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 16, 1);

	}

	@Test(priority = 20)
	public void pass_LastName_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_lastname(TestUtil.readDataFromExcellString(9, 17, 0));
		Assert.assertEquals(travelInfoPage.geText_secondary_ref_lastname(),
				TestUtil.readDataFromExcellString(9, 17, 0),
				"Last name number of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 17, 1);

	}

	@Test(priority = 21)
	public void pass_Address_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_address(TestUtil.readDataFromExcellString(9, 18, 0));
		Assert.assertEquals(travelInfoPage.getText_secondary_ref_address(),
				TestUtil.readDataFromExcellString(9, 18, 0),
				"Address number of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 18, 1);

	}

	@Test(priority = 22)
	public void pass_Pincode_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_pincode(TestUtil.readDataFromExcellString(9, 19, 0));
		Assert.assertEquals(travelInfoPage.getText_secondary_ref_pincode(),
				TestUtil.readDataFromExcellString(9, 19, 0),
				"Pincode number of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 19, 1);

	}

	@Test(priority = 23)
	public void pass_City_SecRef() throws InterruptedException, IOException {

		travelInfoPage.pass_secondary_ref_city(TestUtil.readDataFromExcellString(9, 20, 0));
		Assert.assertEquals(travelInfoPage.geText_secondary_ref_city(),
				TestUtil.readDataFromExcellString(9, 20, 0),
				"City name of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 20, 1);

	}

	@Test(priority = 24)
	public void pass_State_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_state(TestUtil.readDataFromExcellString(9, 21, 0));
		Assert.assertEquals(travelInfoPage.getText_secondary_ref_state(),
				TestUtil.readDataFromExcellString(9, 21, 0),
				"State name of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 21, 1);

	}

	@Test(priority = 25)
	public void pass_Country_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_country(TestUtil.readDataFromExcellString(9, 22, 0));
		Assert.assertEquals(travelInfoPage.getText_secondary_ref_country(),
				TestUtil.readDataFromExcellString(9, 22, 0),
				"Country name of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 22, 1);

	}

	@Test(priority = 26)
	public void pass_secondary_ref_phone_number() throws InterruptedException,
			IOException {
		travelInfoPage.pass_secondary_ref_phone_number(TestUtil.readDataFromExcellString(9, 23, 0));
		Assert.assertEquals(
				travelInfoPage.getText_secondary_ref_phone_number(),
				TestUtil.readDataFromExcellString(9, 23, 0),
				"Conatct name of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 23, 1);
	}

	@Test(priority = 27)
	public void verifyCheckBoxTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnByPhoneCheckbox();
		System.out.println("travelInfoPage.verifyByPhoneCheckbox()"
				+ travelInfoPage.verifyByPhoneCheckbox());
		Assert.assertTrue(travelInfoPage.verifyByPhoneCheckbox(),
				"Phone Check box is not selected");
		travelInfoPage.clickOnByTextMessageCheckbox();
		System.out.println("travelInfoPage.verifyByTextMessageCheckbox()"
				+ travelInfoPage.verifyByTextMessageCheckbox());
		Assert.assertTrue(travelInfoPage.verifyByTextMessageCheckbox(),
				"By Text Message Check box is not selected");
		travelInfoPage.clickOnByEmailCheckbox();
		System.out.println("travelInfoPage.verifyByEmailCheckbox()"
				+ travelInfoPage.verifyByEmailCheckbox());
		Assert.assertTrue(travelInfoPage.verifyByEmailCheckbox(),
				"By Email Check box is not seletced");
		travelInfoPage.passOtherWayToReach(TestUtil.readDataFromExcellString(9,
				24, 0));
		Assert.assertEquals(travelInfoPage.getTextOtherWayToReach(),
				TestUtil.readDataFromExcellString(9, 24, 0),
				"Other waay to contact is not matched with TestData");
	}

}
