package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;

public class TravelInfoPageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public TravelInfoPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 37)
	public void signUpAndFillEmergInfo() throws InterruptedException, IOException {
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

	}

	@Test(priority = 38)
	public void ContinueAndSaveEmergTest() throws InterruptedException, IOException {
		emergencyContactPage.clickEmeContinueBtn();
		travelInfoPage.getTextTravelInfoPagetitle();
		softAssertion.assertEquals(travelInfoPage.getTextTravelInfoPagetitle(), "Travel Information",
				"it is not navigate to travel info page");
		softAssertion.assertAll();
	}

	// ----------------------Travel Info page
	// Test----------------------------------//
	@Test(priority = 39)
	public void clickOnIsApplicantPossessionRoundTicketTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();

	}

	@Test(priority = 40)
	public void passDateOfDepartureTest() throws InterruptedException, IOException {
		travelInfoPage.passDateOfDeparture(dateOfDeparture);
		travelInfoPage.clickOnContinuebutton();
	}

	@Test(priority = 41)
	public void passTicketNumberTest() throws InterruptedException, IOException {
		travelInfoPage.passTicketNumber(ticketNumber);

	}

	@Test(priority = 42)
	public void clickOnTravelByTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnTravelBy();

	}

	@Test(priority = 43)
	public void clickPurpose_of_journeyTest() throws InterruptedException, IOException {
		travelInfoPage.clickPurpose_of_journey();

	}

	@Test(priority = 44)
	public void passPrimaryRefFirstnameTest() throws InterruptedException, IOException {
		travelInfoPage.passPrimaryRefFirstname(priFirstName);

	}

	@Test(priority = 45)
	public void passPrimaryRefLastnameTest() throws InterruptedException, IOException {
		travelInfoPage.passPrimaryRefLastname(priLastName);

	}

	@Test(priority = 46)
	public void pass_Primary_ref_addressTest() throws InterruptedException, IOException {
		travelInfoPage.pass_Primary_ref_address(primaryAddress);

	}

	@Test(priority = 47)
	public void pass_primary_ref_pincodeTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_pincode(primaryPinCode);

	}

	@Test(priority = 48)
	public void pass_primary_ref_cityTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_city(primaryCity);

	}

	@Test(priority = 49)
	public void pass_primary_ref_stateTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_state(primaryState);

	}

	@Test(priority = 50)
	public void pass_primary_ref_countryTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_country(primaryCountry);

	}

	@Test(priority = 51)
	public void pass_primary_ref_phone_numberTest() throws InterruptedException, IOException {

		travelInfoPage.pass_primary_ref_phone_number(primaryRefrencePhoneNo);

	}

	@Test(priority = 52)
	public void PassSecondaryRefDetailsTest() throws InterruptedException, IOException {
		travelInfoPage.PassSecondaryRefDetails(secFirstName, secLastName, secondaryAddress, secondaryPinCode,
				secondaryCity, secondaryState, secondaryCountry, secondaryRefrencePhoneNo);

	}

	@Test(priority = 53)
	public void verifyCheckBoxTest() throws InterruptedException, IOException {
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
	}

}
