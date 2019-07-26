package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import static com.ghana.app.qa.util.TestUtil.*;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class PersonalInfoPageTest extends DriverInit {

	SoftAssert softAssertion = new SoftAssert();

	public PersonalInfoPageTest() throws IOException, InterruptedException {
		super();

	}

	@Test(priority = 1)
	public void fillSignUpFormTest() throws InterruptedException, IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		signUpPage.SelectPassportType();
		signUpPage.selectNationality();
		Thread.sleep(2000);		
		signUpPage.selectVisaType();
		signUpPage.selectVisaLocation();
		signUpPage.selectPortOfArrival();
		signUpPage.passPhoneNo(TestUtil.readDataFromExcellString(5, 11, 0));
		signUpPage.selectDateOfBirth(TestUtil.readDataFromExcellString(5, 14, 0));
		signUpPage.passEmailId(TestUtil.readDataFromExcellString(5, 12, 0));
		signUpPage.passReEmailId(TestUtil.readDataFromExcellString(5, 13, 0));
		signUpPage.enterCaptchaField();	
		TestUtil.clickOnElement(signUpPage.selectOneRadioButton());
		TestUtil.clickOnElement(signUpPage.termsCheckboxselect());
		TestUtil.clickOnElement(signUpPage.clickOnSelectAll());
		// signUpPage.continueBtn();
		signUpPage.continueBtn();
		TestUtil. writeStringValue(6, 1,1);

	}

	@Test(priority = 2)
	public void verifyPersonalInfoTest() throws InterruptedException, IOException {
		System.out.println("Hello in personal");
		Assert.assertEquals(personalInfoPage.getTextPersonalInfoPageTitle(), TestUtil.readDataFromExcellString(6, 2, 0),
				"it is not match with personal info page title hence it is not navigated");
		TestUtil. writeStringValue(6, 2,1);
	}

	// ----------------------Personal info page
	// Test----------------------------------//
	@Test(priority = 3)
	public void getApplicationPageTitleTest() throws InterruptedException, IOException {
		Thread.sleep(2000);
		Assert.assertEquals(personalInfoPage.getApplicantPageTitle(), TestUtil.readDataFromExcellString(6, 3, 0), "Title of personal info page is not matched when match with Test Data");
		TestUtil.writeStringValue(6, 3, 1);
	}

	@Test(priority = 4)
	public void getApplicationIdTest() throws InterruptedException, IOException   {
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		TestUtil.writeStringValue(6, 4, 1);
	}

	@Test(priority = 5)
	public void passFirstNameTest() throws InterruptedException, IOException {
	
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(6, 5, 2));
		Assert.assertEquals(personalInfoPage.getTextFromFirstName(), TestUtil.readDataFromExcellString(6, 5, 0), "First name is not matched when match with Test Data");
		TestUtil.writeStringValue(6, 5, 1);
	}

	@Test(priority = 6)
	public void passMiddleNameTest() throws InterruptedException, IOException {
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(6, 6, 0));
		Assert.assertEquals(personalInfoPage.getTextFromMiddleName(), TestUtil.readDataFromExcellString(6, 6, 0), "Middle name is not matched when match with Test Data");
		TestUtil.writeStringValue(6, 6, 1);
	}

	@Test(priority = 7)
	public void passLastNameTest() throws InterruptedException, IOException {
	
		personalInfoPage.passLastName(TestUtil.readDataFromExcellString(6, 7, 0));
		Assert.assertEquals(personalInfoPage.getTextFromLastName(), TestUtil.readDataFromExcellString(6, 7, 0), "Last name is not matched when match with Test Data");
		TestUtil.writeStringValue(6, 7, 1);

	}

	@Test(priority = 8)
	public void passPassportNumberTest() throws InterruptedException, IOException {
	
		personalInfoPage.passPassportNumber(TestUtil.readDataFromExcellString(6, 8, 0));
		Assert.assertEquals(personalInfoPage.getTextFrompassPortNumber(), TestUtil.readDataFromExcellString(6, 8, 0), "PassPort Number is not matched when match with Test Data");
		TestUtil.writeStringValue(6, 8, 1);

	}
	@Test(priority = 9)
	public void clickOnGenderTest() throws InterruptedException, IOException {
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		softAssertion.assertTrue(genderRadioButton, "Gender Radio button is not selected");
		softAssertion.assertAll();
	}

	@Test(priority = 10)
	public void selectPassIssueDateTest() throws InterruptedException, IOException {
		System.out.println("Passport Issue date====>"+TestUtil.readDataFromExcellString(6, 9, 0));
		Thread.sleep(4000);
		personalInfoPage.selectPassIssueDate(TestUtil.readDataFromExcellString(6, 9, 0));
		Assert.assertEquals(personalInfoPage.getTextFromPassIssueDate(), TestUtil.readDataFromExcellString(6, 9, 0),  "Pass passport issue date and get Birth date  is not matched while comparing from TestData");
		TestUtil. writeStringValue(6, 9,1);
		System.out.println("Verification done for selectpassPortIssueTest");
	}

	@Test(priority = 11)
	public void selectPassExpiryDateTest() throws InterruptedException, IOException {
		Thread.sleep(4000);
		System.out.println("Passport Expiry date====>"+TestUtil.readDataFromExcellString(6, 10, 0));
		personalInfoPage.selectPassExpiryDate(TestUtil.readDataFromExcellString(6, 10, 0));
		Assert.assertEquals(personalInfoPage.getTextFromPassExpiryDate(), TestUtil.readDataFromExcellString(6, 10, 0),  "Pass passport Expiry date and get Birth date  is not matched while comparing from TestData");
		TestUtil. writeStringValue(6, 10,1);
		System.out.println("Verification done for selectpassPortExpiryTest");
	}

	@Test(priority = 12)
	public void passPlaceOfBirthTest() throws InterruptedException, IOException {
	//personalInfoPage.passPlaceOfBirth(birthPlace);
		personalInfoPage.passPlaceOfBirth(TestUtil.readDataFromExcellString(6, 11, 0));
		Assert.assertEquals(personalInfoPage.getTextFromPassPlaceOfBirth(), TestUtil.readDataFromExcellString(6, 11, 0), "Place of Birth is not matched when match with Test Data");
		TestUtil.writeStringValue(6, 11, 1);
	}

}
