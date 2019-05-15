package com.ghana.app.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static org.testng.Assert.assertEquals;

public class ApplicationFormFilling extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ApplicationFormFilling() throws IOException, InterruptedException {
		super();
	}

	// ---------------------SignUp page Test----------------------------------//
	@Test(priority = 14)
	public void selectPassPortType() throws InterruptedException, IOException {
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

		signUpPage.passPhoneNo(phoneNumber);
		signUpPage.passEmailId(emailId);

		signUpPage.passReEmailId(emailId);

		signUpPage.enterCaptchaField("AUX125P");
		// signUpPage.continueBtn();
		// signUpPage.cancelBtn();

		signUpPage.selectDateOfBirth(birthDate);
		// signUpPage.continueBtn();

		signUpPage.continueBtn();

	}
	
	
	@Test(priority = 15)
	public void verifyPersonalInfoTest() throws InterruptedException {
		softAssertion.assertEquals(personalInfoPage.getTextPersonalInfoPageTitle(), "Personal Information",
				"it is not match with personal info page title hence it is not navigated");
		softAssertion.assertAll();
	}
	
	// ----------------------Personal info page
	// Test----------------------------------//
	@Test(priority = 16)
	public void getApplicationPageTitleTest() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(personalInfoPage.getApplicantPageTitle(), "Applicant Form");
		softAssertion.assertAll();
	}

	@Test(priority = 17)
	public void getApplicationIdTest() throws InterruptedException {
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
	}

	@Test(priority = 18)
	public void selectVisaFeesTest() throws InterruptedException, IOException {
		personalInfoPage.SelectvisaFees();

	}

	@Test(priority = 19)
	public void selectVisaLocationTest() throws InterruptedException, IOException {
		personalInfoPage.SelectvisaLocation();

	}

	@Test(priority = 20)
	public void passFirstNameTest() throws InterruptedException, IOException {
		personalInfoPage.passFirstName(firstName);

	}

	@Test(priority = 21)
	public void passLastNameTest() throws InterruptedException, IOException {
		personalInfoPage.passLastName(lastName);

	}

	@Test(priority = 22)
	public void passPassportNumberTest() throws InterruptedException, IOException {
		personalInfoPage.passPassportNumber(passportNumber);

	}

	@Test(priority = 23)
	public void clickOnGenderTest() throws InterruptedException, IOException {
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		softAssertion.assertTrue(genderRadioButton, "Gender Radio button is not selected");
		softAssertion.assertAll();
	}

	@Test(priority = 24)
	public void selectPassIssueDateTest() throws InterruptedException, IOException {
		personalInfoPage.selectPassIssueDate(passportIssuedDate);

	}

	@Test(priority = 25)
	public void selectPassExpiryDateTest() throws InterruptedException, IOException {
		personalInfoPage.selectPassExpiryDate(passportExpiryDate);

	}

	@Test(priority = 26)
	public void passPlaceOfBirthTest() throws InterruptedException, IOException {
		personalInfoPage.passPlaceOfBirth(birthPlace);

	}

	@Test(priority = 27)
	public void clickOnSaveAndContinueTest() throws InterruptedException, IOException {
		personalInfoPage.clickOnSaveAndContinue();
		addressInfoPage.getTextAddressInfoPageTitle();
		softAssertion.assertEquals(addressInfoPage.getTextAddressInfoPageTitle(), "Address Information",
				"it is not navigate to address info page");
		softAssertion.assertAll();

	}

	// ----------------------Address Info page
	// Test----------------------------------//
	@Test(priority = 27)
	public void selectFormerNationalityTest() throws InterruptedException, IOException {
		assertEquals(addressInfoPage.getTextAddressInfoPageTitle(), "Address Information",
				"after compairing both text not match   ");
		;
		addressInfoPage.selectFormerNaitonality();
		softAssertion.assertAll();
	}

	@Test(priority = 28)
	public void filladdressInfoTest() throws InterruptedException, IOException {
		addressInfoPage.PassAddressInfofield(FlatNo, StreetName, Landmark, pinCode, cityName, stateName, countryName);

	}

	@Test(priority = 29)
	public void clickSaveAndContinuebtnTest() throws InterruptedException, IOException {
		addressInfoPage.clickSaveAndContinuebtn();
		emergencyContactPage.getTextEmerPageTitle();
		softAssertion.assertEquals(emergencyContactPage.getTextEmerPageTitle(), "Emergency Contact",
				"it is not navigate to Emergency Contact page");
		softAssertion.assertAll();
	}

	// ----------------------Emergency contact page
	// Test----------------------------------//
	@Test(priority = 30)
	public void emergencyContactDetailsTest() throws InterruptedException, IOException {
		emergencyContactPage.emergencyContactDetails(emerContactName, emerContactSurname, emerPhoneNumber);

	}

	@Test(priority = 31)
	public void selectRelationTest() throws InterruptedException, IOException {
		emergencyContactPage.selectRelation();

	}

	@Test(priority = 32)
	public void emergencyProfessionDetailsTest() throws InterruptedException, IOException {
		emergencyContactPage.emergencyProfessionDetails(profession, employer, employerAddress, emerPincode,
				emerCityName, emerState, emerCountry, emerEmployerPhoneNumber);

	}

	@Test(priority = 33)
	public void clickOnCintinueBtnTest() throws InterruptedException, IOException {
		emergencyContactPage.clickEmeContinueBtn();
		travelInfoPage.getTextTravelInfoPagetitle();
		softAssertion.assertEquals(travelInfoPage.getTextTravelInfoPagetitle(), "Travel Information",
				"it is not navigate to travel info page");
		softAssertion.assertAll();
	}

	// ----------------------Travel Info page
	// Test----------------------------------//
	@Test(priority = 34)
	public void clickOnIsApplicantPossessionRoundTicketTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();

	}

	@Test(priority = 35)
	public void passDateOfDepartureTest() throws InterruptedException, IOException {
		travelInfoPage.passDateOfDeparture(dateOfDeparture);
		travelInfoPage.clickOnContinuebutton();
	}

	@Test(priority = 36)
	public void passTicketNumberTest() throws InterruptedException, IOException {
		travelInfoPage.passTicketNumber(ticketNumber);

	}

	@Test(priority = 37)
	public void clickOnTravelByTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnTravelBy();

	}

	@Test(priority = 38)
	public void clickPurpose_of_journeyTest() throws InterruptedException, IOException {
		travelInfoPage.clickPurpose_of_journey();

	}

	@Test(priority = 39)
	public void passPrimaryRefFirstnameTest() throws InterruptedException, IOException {
		travelInfoPage.passPrimaryRefFirstname(priFirstName);

	}

	@Test(priority = 40)
	public void passPrimaryRefLastnameTest() throws InterruptedException, IOException {
		travelInfoPage.passPrimaryRefLastname(priLastName);

	}

	@Test(priority = 41)
	public void pass_Primary_ref_addressTest() throws InterruptedException, IOException {
		travelInfoPage.pass_Primary_ref_address(primaryAddress);

	}

	@Test(priority = 42)
	public void pass_primary_ref_pincodeTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_pincode(primaryPinCode);

	}

	@Test(priority = 43)
	public void pass_primary_ref_cityTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_city(primaryCity);

	}

	@Test(priority = 44)
	public void pass_primary_ref_stateTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_state(primaryState);

	}

	@Test(priority = 45)
	public void pass_primary_ref_countryTest() throws InterruptedException, IOException {
		travelInfoPage.pass_primary_ref_country(primaryCountry);

	}

	@Test(priority = 46)
	public void pass_primary_ref_phone_numberTest() throws InterruptedException, IOException {

		travelInfoPage.pass_primary_ref_phone_number(primaryRefrencePhoneNo);

	}

	@Test(priority = 47)
	public void PassSecondaryRefDetailsTest() throws InterruptedException, IOException {
		travelInfoPage.PassSecondaryRefDetails(secFirstName, secLastName, secondaryAddress, secondaryPinCode,
				secondaryCity, secondaryState, secondaryCountry, secondaryRefrencePhoneNo);

	}

	@Test(priority = 48)
	public void clickOnContinuebuttonTest() throws InterruptedException, IOException {
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
		softAssertion.assertAll();
	}

	// ----------------------Upload Doc page
	// Test----------------------------------//
	@Test(priority = 49)
	public void getUploadDocTest() throws InterruptedException, IOException {

		uploadDocPage.getUploadDoc();

	}

	@Test(priority = 50)
	public void clickOnContinuebuttonTest1() throws IOException {

		uploadDocPage.clicksaveAndContiBtn();
		softAssertion.assertEquals(reviewApplicationPage.getTextReviewPageTtle(), "Review Application",
				"here visa Payment title not match hence it is not navigated to this page");
		softAssertion.assertAll();
		System.out.println("applicationID==>Applicationform filling" + applicationID);
	}

}