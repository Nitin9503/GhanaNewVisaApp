package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.*;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;

public class EmergencyContactPageTest extends DriverInit{

	SoftAssert softAssertion = new SoftAssert();

	public EmergencyContactPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 32)
	public void signUpAndFillAddressInfo() throws InterruptedException, IOException {
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
	}
	
	@Test(priority = 33)
	public void SaveAndContinueAddressInfoTest() throws InterruptedException, IOException {
		addressInfoPage.clickSaveAndContinuebtn();
		emergencyContactPage.getTextEmerPageTitle();
		softAssertion.assertEquals(emergencyContactPage.getTextEmerPageTitle(), prop.getProperty("emergencyContactText"),
				"it is not navigate to Emergency Contact page");
		softAssertion.assertAll();
	}
	@Test(priority = 34)
	public void emergencyContactDetailsTest() throws InterruptedException, IOException {
		emergencyContactPage.emergencyContactDetails(emerContactName, emerContactSurname, emerPhoneNumber);

	}

	@Test(priority = 35)
	public void selectRelationTest() throws InterruptedException, IOException {
		emergencyContactPage.selectRelation();

	}

	@Test(priority = 36)
	public void emergencyProfessionDetailsTest() throws InterruptedException, IOException {
		emergencyContactPage.emergencyProfessionDetails(profession, employer, employerAddress, emerPincode,
				emerCityName, emerState, emerCountry, emerEmployerPhoneNumber);

	}

	
}
