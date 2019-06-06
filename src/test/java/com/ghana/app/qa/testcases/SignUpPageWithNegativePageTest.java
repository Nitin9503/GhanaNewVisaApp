package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.birthDate;
import static com.ghana.app.qa.testdata.ConstantVariable.emailId;
import static com.ghana.app.qa.testdata.ConstantVariable.phoneNumber;
import static com.ghana.app.qa.testdata.ConstantVariable.selectedBoxOnSignUp;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;

public class SignUpPageWithNegativePageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public SignUpPageWithNegativePageTest() throws IOException,
			InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 0)
	public void launchAndGotoSignUP() throws InterruptedException, IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		Thread.sleep(2000);
		softAssertion.assertEquals(signUpPage.validateSignUpPageTitle(),
				"Sign Up", "sign up is not open while clickin on Apply Visa");
	}
	@Test(priority = 1)
	public void verifyCancelBtnAndNavToCategoryPage()
			throws InterruptedException, IOException {
		signUpPage.cancelBtn();
		softAssertion.assertEquals(visaCategoriesPage.visaCategorisText(),
				"VISA CATEGORIES", "Visa category text title not match");
		visaCategoriesPage.clickOnVisaType();
	}
	@Test(priority = 2)
	public void verifyCheckboxesAndRadiobutonsClickOnContinue() throws InterruptedException,
			IOException {
		signUpPage.SelectPassportType();
		signUpPage.clickOnCheckBoxes();
		signUpPage.verifyCheckBoxIsSelected();
		System.out.println("selectedBoxOnSignUp2==>" + selectedBoxOnSignUp);
		// softAssertion.assertTrue(selectedBoxOnSignUp,
		// "Check boxes are not selected from SignUp page");
		signUpPage.selectRadioButton();
		signUpPage.verifyRadioButtonSelected();
		// softAssertion.assertTrue(selectedRadioButtonOnSignUp,
		// "Check boxes are not selected from SignUp page");
        softAssertion.assertAll();
		signUpPage.continueBtn();
		//phone_number
	}
	/*@Test(priority = 2)
	public void sellctAllcheckboxesAnd() throws InterruptedException,
			IOException {
		signUpPage.SelectPassportType();
	}

	@Test(priority = 2)
	public void selectPassportTypeTest() throws InterruptedException,
			IOException {
		signUpPage.SelectPassportType();
	}

	@Test(priority = 2)
	public void selectNationalityTest() throws InterruptedException,
			IOException {
		signUpPage.selectNationality();

	}

	@Test(priority = 3)
	public void selectPortOfArrivalTest() throws InterruptedException,
			IOException {
		signUpPage.selectPortOfArrival();

	}

	@Test(priority = 4)
	public void selectVisaType() throws InterruptedException, IOException {
		signUpPage.selectVisaType();

	}

	@Test(priority = 5)
	public void selectVisaLocation() throws InterruptedException, IOException {
		signUpPage.selectVisaLocation();

	}

	@Test(priority = 6)
	public void passPhoneNoTest() throws InterruptedException, IOException {
		signUpPage.passPhoneNo(phoneNumber);
	}

	@Test(priority = 7)
	public void passEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passEmailId(emailId);
	}

	@Test(priority = 8)
	public void passReEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passReEmailId(emailId);
	}

	@Test(priority = 9)
	public void enterCaptchaFieldTest() throws InterruptedException,
			IOException {
		signUpPage.enterCaptchaField();
		// signUpPage.continueBtn();
		// signUpPage.cancelBtn();
	}

	@Test(priority = 10)
	public void selectDateOfBirthTest() throws InterruptedException,
			IOException {
		Thread.sleep(3000);
		signUpPage.selectDateOfBirth(birthDate);
	}
*/
	}
