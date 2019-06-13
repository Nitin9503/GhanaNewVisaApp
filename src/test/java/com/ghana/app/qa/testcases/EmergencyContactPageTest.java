package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.*;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class EmergencyContactPageTest extends DriverInit{

	SoftAssert softAssertion = new SoftAssert();

	public EmergencyContactPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 1)
	public void signUpAndFillSignUpPage() throws InterruptedException, IOException {
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
		// signUpPage.continueBtn();
		// signUpPage.cancelBtn();
		signUpPage.selectDateOfBirth(TestUtil.readDataFromExcellString(5, 14, 0));
		// signUpPage.continueBtn();
		signUpPage.continueBtn();
		// ----------------------Personal info page
		// Test----------------------------------//
	}
	@Test(priority = 2)
	public void fillPersonalPageTest() throws InterruptedException, IOException {
		Thread.sleep(2000);	
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(6, 5, 0));
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(6, 6, 0));
		personalInfoPage.passLastName(TestUtil.readDataFromExcellString(6, 7, 0));
		personalInfoPage.passPassportNumber(TestUtil.readDataFromExcellString(6, 8, 0));
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		personalInfoPage.selectPassIssueDate(TestUtil.readDataFromExcellString(6, 9, 0));
		personalInfoPage.selectPassExpiryDate(TestUtil.readDataFromExcellString(6, 10, 0));
		personalInfoPage.passPlaceOfBirth(TestUtil.readDataFromExcellString(6, 11, 0));
		personalInfoPage.clickOnSaveAndContinue();
	}
	@Test(priority = 3)
	public void fillAddressinfoPageTest() throws InterruptedException, IOException {
	// ----------------------Address Info page
	// Test----------------------------------//
		addressInfoPage.selectFormerNaitonality();
		addressInfoPage.passFlatNumber(TestUtil.readDataFromExcellString(7, 4, 0));
		addressInfoPage.passStreetName(TestUtil.readDataFromExcellString(7, 5, 0));
		addressInfoPage.passLandmark(TestUtil.readDataFromExcellString(7, 6, 0));
		addressInfoPage.passPincode(TestUtil.readDataFromExcellString(7, 7, 0));
		addressInfoPage.passCityName(TestUtil.readDataFromExcellString(7, 8, 0));
		addressInfoPage.passStateName(TestUtil.readDataFromExcellString(7, 9, 0));
		addressInfoPage.passCountryName(TestUtil.readDataFromExcellString(7, 10, 0));
		addressInfoPage.selectAddressType();
	}
		
	@Test(priority = 4)
	public void SaveAndContinueAddressInfoTest() throws InterruptedException, IOException {
		addressInfoPage.clickSaveAndContinuebtn();
		TestUtil.writeStringValue(8, 1, 1);
		emergencyContactPage.getTextEmerPageTitle();
		Assert.assertEquals(emergencyContactPage.getTextEmerPageTitle(), TestUtil.readDataFromExcellString(8, 2, 0),
				"it is not navigate to Emergency Contact page when compare with Test data");
		TestUtil.writeStringValue(8, 2, 1);
	}
	@Test(priority = 5)
	public void emergencyContactDetailsTest() throws InterruptedException, IOException {
		emergencyContactPage.emergencyFirstName(TestUtil.readDataFromExcellString(8, 3, 0));
		Assert.assertEquals(emergencyContactPage.getTextEmergencyFirstName(), TestUtil.readDataFromExcellString(8, 3, 0),
				"First name from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 3, 1);
		emergencyContactPage.emergencyLastName(TestUtil.readDataFromExcellString(8, 4, 0));
		Assert.assertEquals(emergencyContactPage.gettextEmergencyLastName(), TestUtil.readDataFromExcellString(8, 4, 0),
				"Last name from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 4, 1);
		emergencyContactPage.emergencyContactNumber(TestUtil.readDataFromExcellString(8, 6, 0));
		Assert.assertEquals(emergencyContactPage.getTextEmergencyContactNumber(), TestUtil.readDataFromExcellString(8, 6, 0),
				"Contact number from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 6, 1);
	}

	@Test(priority = 6)
	public void selectRelationTest() throws InterruptedException, IOException {
		emergencyContactPage.selectRelation();
		Assert.assertEquals(emergencyContactPage.getTextFromRelation(), TestUtil.readDataFromExcellString(8, 5, 0),
				"Contact number from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 5, 1);
	}

	@Test(priority = 7)
	public void emergencyProfessionDetailsTest1() throws InterruptedException, IOException {
		emergencyContactPage.passEmergency_profession(TestUtil.readDataFromExcellString(8, 7, 0));
		Assert.assertEquals(emergencyContactPage.getTextEmergency_profession(), TestUtil.readDataFromExcellString(8, 7, 0),
				"Profession from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 7, 1);		
		emergencyContactPage.passEmployerOrSchoolName(TestUtil.readDataFromExcellString(8, 8, 0));		
		Assert.assertEquals(emergencyContactPage.getTextEmployerOrSchoolName(), TestUtil.readDataFromExcellString(8, 8, 0),
				"School Name number from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 8, 1);
		emergencyContactPage.pass_EmployerOrSchooladdress(TestUtil.readDataFromExcellString(8, 9, 0));
		Assert.assertEquals(emergencyContactPage.getText_EmployerOrSchooladdress(), TestUtil.readDataFromExcellString(8, 9, 0),
				"Employer/Scholl Name from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 9, 1);
	}
	
	@Test(priority = 8)
	public void emergencyProfessionDetailsTest2() throws InterruptedException, IOException {		
		emergencyContactPage.pass_Emergency_Pincode(TestUtil.readDataFromExcellString(8, 10, 0));
		Assert.assertEquals(emergencyContactPage.getText_Emergency_Pincode(), TestUtil.readDataFromExcellString(8, 10, 0),
				"Profession from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 10, 1);		
		emergencyContactPage.paa_Emergency_city(TestUtil.readDataFromExcellString(8, 11, 0));		
		Assert.assertEquals(emergencyContactPage.getText_Emergency_city(), TestUtil.readDataFromExcellString(8, 11, 0),
				"School Name number from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 11, 1);
		emergencyContactPage.pass_Emergency_State(TestUtil.readDataFromExcellString(8, 12, 0));
		Assert.assertEquals(emergencyContactPage.getText_Emergency_State(), TestUtil.readDataFromExcellString(8, 12, 0),
				"Employer/Scholl Name from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 12, 1);
	}
	@Test(priority = 9)
	public void emergencyProfessionDetailsTest3() throws InterruptedException, IOException {
		emergencyContactPage.pass_Emergency_Country(TestUtil.readDataFromExcellString(8, 13, 0));
		Assert.assertEquals(emergencyContactPage.getText_Emergency_Country(), TestUtil.readDataFromExcellString(8, 13, 0),
				"Profession from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 13, 1);		
		emergencyContactPage.pass_emergency_employer_phone_number(TestUtil.readDataFromExcellString(8, 14, 0));		
		Assert.assertEquals(emergencyContactPage.getText_emergency_employer_phone_number(), TestUtil.readDataFromExcellString(8, 14, 0),
				"School Name number from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 14, 1);
		

	}

	
}
