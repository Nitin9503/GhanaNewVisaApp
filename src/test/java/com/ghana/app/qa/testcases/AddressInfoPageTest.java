package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static org.testng.Assert.assertEquals;
import static com.ghana.app.qa.util.TestUtil.*;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class AddressInfoPageTest extends DriverInit {

	SoftAssert softAssertion = new SoftAssert();

	public AddressInfoPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 1)
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

		signUpPage.passPhoneNo(TestUtil.readDataFromExcellString(5, 11, 0));
		signUpPage.passEmailId(TestUtil.readDataFromExcellString(5, 12, 0));
		signUpPage.passReEmailId(TestUtil.readDataFromExcellString(5, 13, 0));
		signUpPage.enterCaptchaField();
		// signUpPage.continueBtn();
		// signUpPage.cancelBtn();
		signUpPage.selectDateOfBirth(TestUtil.readDataFromExcellString(5, 14, 0));
		// signUpPage.continueBtn();
		signUpPage.continueBtn();

		// ----------------------Personal info page
		// Test----------------------------------//
		Thread.sleep(2000);
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(6, 5, 0));
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(6, 6, 0));
		personalInfoPage.passLastName(TestUtil.readDataFromExcellString(6, 7, 0));
		personalInfoPage.passPassportNumber(TestUtil.readDataFromExcellString(6, 8, 0));
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		softAssertion.assertTrue(genderRadioButton, "Gender Radio button is not selected");
		softAssertion.assertAll();
		personalInfoPage.selectPassIssueDate(TestUtil.readDataFromExcellString(6, 9, 0));
		personalInfoPage.selectPassExpiryDate(TestUtil.readDataFromExcellString(6, 10, 0));
		personalInfoPage.passPlaceOfBirth(TestUtil.readDataFromExcellString(6, 11, 0));

	}
	
	@Test(priority = 2)
	public void SaveAndContinueFromPersonalInfoTest() throws InterruptedException, IOException {
		personalInfoPage.clickOnSaveAndContinue();
		TestUtil.writeStringValue(7, 1, 1);
		addressInfoPage.getTextAddressInfoPageTitle();
		Assert.assertEquals(addressInfoPage.getTextAddressInfoPageTitle(), TestUtil.readDataFromExcellString(7, 2, 0),
				"it is not navigate to address info page after clicking on Continue and Save button from Personal Info page");
		TestUtil.writeStringValue(7, 2, 1);
	}
	// ----------------------Address Info page
	// Test----------------------------------//
	@Test(priority = 3)
	public void selectFormerNationalityTest() throws InterruptedException, IOException {
		addressInfoPage.selectFormerNaitonality();
		Assert.assertEquals(addressInfoPage.getTextFromFormaernationaltity(), TestUtil.readDataFromExcellString(7, 3, 0),
				"it is not navigate to address info page after clicking on Continue and Save button from Personal Info page");
		TestUtil.writeStringValue(7, 3, 1);
		
		}

	@Test(priority = 4)
	public void filladdressInfoTest1() throws InterruptedException, IOException {
		addressInfoPage.passFlatNumber(TestUtil.readDataFromExcellString(7, 4, 0));
		Assert.assertEquals(addressInfoPage.getTextFlatNumber(), TestUtil.readDataFromExcellString(7, 4, 0),
				"Flat number is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 4, 1);
		addressInfoPage.passStreetName(TestUtil.readDataFromExcellString(7, 5, 0));
		Assert.assertEquals(addressInfoPage.geTextStreetName(), TestUtil.readDataFromExcellString(7, 5, 0),
				"Street name is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 5, 1);
	}
	@Test(priority = 5)
	public void filladdressInfoTest2() throws InterruptedException, IOException {
		addressInfoPage.passLandmark(TestUtil.readDataFromExcellString(7, 6, 0));
		Assert.assertEquals(addressInfoPage.getTextLandmark(), TestUtil.readDataFromExcellString(7, 6, 0),
				"land mark name is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 6, 1);
		addressInfoPage.passPincode(TestUtil.readDataFromExcellString(7, 7, 0));
		Assert.assertEquals(addressInfoPage.getTextPincode(), TestUtil.readDataFromExcellString(7, 7, 0),
				"pincode is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 7, 1);
	
	}
	@Test(priority = 6)
	public void filladdressInfoTest3() throws InterruptedException, IOException {
		addressInfoPage.passCityName(TestUtil.readDataFromExcellString(7, 8, 0));
		Assert.assertEquals(addressInfoPage.getTextCityName(), TestUtil.readDataFromExcellString(7, 8, 0),
				"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 8, 1);
		addressInfoPage.passStateName(TestUtil.readDataFromExcellString(7, 9, 0));
		Assert.assertEquals(addressInfoPage.getTextStateName(), TestUtil.readDataFromExcellString(7, 9, 0),
				"State name is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 9, 1);
		addressInfoPage.passCountryName(TestUtil.readDataFromExcellString(7, 10, 0));
		Assert.assertEquals(addressInfoPage.getTextCountryName(), TestUtil.readDataFromExcellString(7, 10, 0),
				"Country name is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 10, 1);

	}
	@Test(priority = 6)
	public void selectAddressType() throws InterruptedException, IOException {
		addressInfoPage.selectAddressType();
		Assert.assertEquals(addressInfoPage.getTextFromAddressType(), TestUtil.readDataFromExcellString(7, 11, 0),
				"Address Type is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 11, 1);
	}

}

/*	addressInfoPage.PassAddressInfofield(FlatNo, StreetName, Landmark, pinCode, cityName, stateName, countryName);
System.out.println("Birthdate==>" +providedDate);
System.out.println("Application id==>" +applicationID);*/