package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import java.io.IOException;

import static com.ghana.app.qa.util.TestUtil.*;

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
		signUpPage.selectVisaType();
		signUpPage.selectVisaLocation();
		signUpPage.selectPortOfArrival();
		signUpPage.passPhoneNo(phoneNumber);
		signUpPage.passEmailId(emailId);
		signUpPage.passReEmailId(emailId);
		signUpPage.enterCaptchaField();
		// signUpPage.continueBtn();
		// signUpPage.cancelBtn();
		signUpPage.selectDateOfBirth(birthDate);
		// signUpPage.continueBtn();
		signUpPage.continueBtn();
		TestUtil. writeStringValue(5, 15,1);

	}

	@Test(priority = 2)
	public void verifyPersonalInfoTest() throws InterruptedException, IOException {
		System.out.println("Hello in personal");
		Assert.assertEquals(personalInfoPage.getTextPersonalInfoPageTitle(), TestUtil.readDataFromExcellString(5, 16, 0),
				"it is not match with personal info page title hence it is not navigated");
		TestUtil. writeStringValue(5, 16,1);
	}

	// ----------------------Personal info page
	// Test----------------------------------//
	@Test(priority = 3)
	public void getApplicationPageTitleTest() throws InterruptedException, IOException {
		Thread.sleep(2000);
		Assert.assertEquals(personalInfoPage.getApplicantPageTitle(), TestUtil.readDataFromExcellString(5, 17, 0), "Title of personal info page is not matched when match with Test Data");
		TestUtil.writeStringValue(5, 17, 1);
	}

	@Test(priority = 4)
	public void getApplicationIdTest() throws InterruptedException, IOException   {
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		TestUtil.writeStringValue(5, 18, 1);
	}

	@Test(priority = 5)
	public void passFirstNameTest() throws InterruptedException, IOException {
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(5, 19, 0));
		Assert.assertEquals(personalInfoPage.getTextFromFirstName(), TestUtil.readDataFromExcellString(5, 19, 0), "First name is not matched when match with Test Data");
		TestUtil.writeStringValue(5, 19, 1);
	}

	@Test(priority = 6)
	public void passMiddleNameTest() throws InterruptedException, IOException {
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(5, 20, 0));
		Assert.assertEquals(personalInfoPage.getTextFromMiddleName(), TestUtil.readDataFromExcellString(5, 20, 0), "Middle name is not matched when match with Test Data");
		TestUtil.writeStringValue(5, 20, 1);
	}

	@Test(priority = 7)
	public void passLastNameTest() throws InterruptedException, IOException {
		personalInfoPage.passLastName(lastName);

	}

	@Test(priority = 8)
	public void passPassportNumberTest() throws InterruptedException, IOException {
		personalInfoPage.passPassportNumber(passportNumber);

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
		personalInfoPage.selectPassIssueDate(passportIssuedDate);

	}

	@Test(priority = 11)
	public void selectPassExpiryDateTest() throws InterruptedException, IOException {
		personalInfoPage.selectPassExpiryDate(passportExpiryDate);

	}

	@Test(priority = 12)
	public void passPlaceOfBirthTest() throws InterruptedException, IOException {
		personalInfoPage.passPlaceOfBirth(birthPlace);

	}

}
