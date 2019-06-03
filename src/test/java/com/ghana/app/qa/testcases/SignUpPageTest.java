package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;

public class SignUpPageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public SignUpPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 0)
	public void launchAndGotoSignUP() throws InterruptedException, IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		Thread.sleep(2000);
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
	}

	@Test(priority = 1)
	public void selectPassportTypeTest() throws InterruptedException, IOException {	
		signUpPage.SelectPassportType();
		Assert.assertEquals(totalPassportTypeInReq, signUpPage.sizePassportType(), "Passport values are not matched when compare the requirement conutry and get value from application");
		Assert.assertEquals(passPortType, signUpPage.getTextPassportTypeName(), "Passport selected values is not displayed when selected from drop down and comapare with test data");
		ArrayList<String> expectedPassport = new ArrayList<String>();
	
		
		System.out.println("Verification done for passport type");
	}

	@Test(priority = 2)
	public void selectNationalityTest() throws InterruptedException, IOException {
		signUpPage.selectNationality();
		Assert.assertEquals(signUpPage.totalCountryCount(), totalCountryListInReq,
				"Countries values are not matched when compare the requirement conutry and get value from application");
		Assert.assertEquals(nationalityName, signUpPage.getFromSelectedNationality(), "Nationality selected values is not displayed when selected from drop down and comapare with test data");
		System.out.println("Verification done for selectNationalityTest ");
	}

	@Test(priority = 3)
	public void selectPortOfArrivalTest() throws InterruptedException, IOException {
		signUpPage.selectPortOfArrival();
		Assert.assertEquals(signUpPage.totalPortArrival(), totalPortArrivalInReq,
				"Total port of arrival values are not matched when compare the requirement conutry and get value from application");
		Assert.assertEquals(portOfArrival, signUpPage.getTextFromPortofArrival(), "Port Of Arrival selected values is not displayed when selected from drop down and comapare with test data");
		System.out.println("Verification done for selectPortOfArrivalTest");

	}

	@Test(priority = 4)
	public void selectVisaType() throws InterruptedException, IOException {
		signUpPage.selectVisaType();
		Assert.assertEquals(signUpPage.totalVisaFeeCountActual(), totalVisaTypeExpecteed,
				"Total visa fee values are not matched when compare the requirement and get value from application");
		Assert.assertEquals(signUpPage.getTextFromVisaType(), visaFees,  "Port Of Arrival selected values is not displayed when selected from drop down and comapare with test data");
		System.out.println("Verification done for selectVisaType");
	}

	@Test(priority = 5)
	public void selectVisaLocation() throws InterruptedException, IOException {
		signUpPage.selectVisaLocation();
		Assert.assertEquals(signUpPage.totalVisaLocationActual(), totalVisaLocationExpected,
				"Total Visa Location values are not matched when compare the requirement and get value from application");
		Assert.assertEquals(signUpPage.getTextFromSelectVisaLocation(), VisaLocations,  "Visa Location selected values is not displayed when selected from drop down and comapare with test data");
		System.out.println("Verification done for selectVisaLocation");
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
	public void enterCaptchaFieldTest() throws InterruptedException, IOException {
		signUpPage.enterCaptchaField();
		// signUpPage.continueBtn();
		// signUpPage.cancelBtn();
	}

	@Test(priority = 10)
	public void selectDateOfBirthTest() throws InterruptedException, IOException {
		Thread.sleep(3000);
		signUpPage.selectDateOfBirth(birthDate);
	}
}
