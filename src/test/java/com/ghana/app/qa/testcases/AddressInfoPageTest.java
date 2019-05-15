package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static org.testng.Assert.assertEquals;
import static com.ghana.app.qa.util.TestUtil.*;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;

public class AddressInfoPageTest extends DriverInit {

	SoftAssert softAssertion = new SoftAssert();

	public AddressInfoPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 28)
	public void signUpAndFillPersonalInfo() throws InterruptedException, IOException {
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

	}
	
	@Test(priority = 29)
	public void SaveAndContinueFromPersonalInfoTest() throws InterruptedException, IOException {
		personalInfoPage.clickOnSaveAndContinue();
		addressInfoPage.getTextAddressInfoPageTitle();
		softAssertion.assertEquals(addressInfoPage.getTextAddressInfoPageTitle(), prop.getProperty("addressInformationText"),
				"it is not navigate to address info page");
		softAssertion.assertAll();

	}
	// ----------------------Address Info page
	// Test----------------------------------//
	@Test(priority = 30)
	public void selectFormerNationalityTest() throws InterruptedException, IOException {
		addressInfoPage.selectFormerNaitonality();
		}

	@Test(priority = 31)
	public void filladdressInfoTest() throws InterruptedException, IOException {
		addressInfoPage.PassAddressInfofield(FlatNo, StreetName, Landmark, pinCode, cityName, stateName, countryName);

	}


}
