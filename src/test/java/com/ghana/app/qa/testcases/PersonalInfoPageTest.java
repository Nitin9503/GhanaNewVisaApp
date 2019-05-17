package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import java.io.IOException;
import static com.ghana.app.qa.util.TestUtil.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;

public class PersonalInfoPageTest extends DriverInit {

	SoftAssert softAssertion = new SoftAssert();

	public PersonalInfoPageTest() throws IOException, InterruptedException {
		super();

	}

	@Test(priority = 16)
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

	}

	@Test(priority = 17)
	public void verifyPersonalInfoTest() throws InterruptedException {
		System.out.println("Hello in personal");
		softAssertion.assertEquals(personalInfoPage.getTextPersonalInfoPageTitle(), prop.getProperty("PersonalInformationText"),
				"it is not match with personal info page title hence it is not navigated");
		softAssertion.assertAll();
	}

	// ----------------------Personal info page
	// Test----------------------------------//
	@Test(priority = 18)
	public void getApplicationPageTitleTest() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(personalInfoPage.getApplicantPageTitle(), prop.getProperty("applicantFormTitle"));
		softAssertion.assertAll();
	}

	@Test(priority = 19)
	public void getApplicationIdTest() throws InterruptedException {
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
	}

	@Test(priority = 20)
	public void passFirstNameTest() throws InterruptedException, IOException {
		personalInfoPage.passFirstName(firstName);

	}

	@Test(priority = 21)
	public void passMiddleNameTest() throws InterruptedException, IOException {
		System.out.println("enter midill");
		personalInfoPage.passMiddleName(middleName);
		System.out.println("enter done");
	}

	@Test(priority = 22)
	public void passLastNameTest() throws InterruptedException, IOException {
		personalInfoPage.passLastName(lastName);

	}

	@Test(priority = 23)
	public void passPassportNumberTest() throws InterruptedException, IOException {
		personalInfoPage.passPassportNumber(passportNumber);

	}
	@Test(priority = 24)
	public void clickOnGenderTest() throws InterruptedException, IOException {
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		softAssertion.assertTrue(genderRadioButton, "Gender Radio button is not selected");
		softAssertion.assertAll();
	}

	@Test(priority = 25)
	public void selectPassIssueDateTest() throws InterruptedException, IOException {
		personalInfoPage.selectPassIssueDate(passportIssuedDate);

	}

	@Test(priority = 26)
	public void selectPassExpiryDateTest() throws InterruptedException, IOException {
		personalInfoPage.selectPassExpiryDate(passportExpiryDate);

	}

	@Test(priority = 27)
	public void passPlaceOfBirthTest() throws InterruptedException, IOException {
		personalInfoPage.passPlaceOfBirth(birthPlace);

	}

}
