package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class SignUpPageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public SignUpPageTest() throws IOException, InterruptedException {
		super();		
	}


	
	@Test(priority = 1)
	public void launchAndGotoSignUP() throws InterruptedException, IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();

		//System.out.println();
	}

/*	@Test(priority = 2)
	public void SignUpPageTest() throws InterruptedException, IOException {	
		
		Thread.sleep(2000);
		//signUpPage.clickOnCheckBoxes();
		//signUpPage.verifyCheckBoxIsSelected();
		//signUpPage.clickOnSelectAll();
		//System.out.println("selectedBoxOnSignUp2==>" + selectedBoxOnSignUp);
		// softAssertion.assertTrue(selectedBoxOnSignUp,
		// "Check boxes are not selected from SignUp page");
	//	signUpPage.selectRadioButton();
		//signUpPage.verifyRadioButtonSelected();
		// softAssertion.assertTrue(selectedRadioButtonOnSignUp,
		// "Check boxes are not selected from SignUp page");
		softAssertion.assertAll();
		
		
	}*/
	
	@Test(priority = 3)
	public void selectPassportTypeTest() throws InterruptedException, IOException {	
		signUpPage.SelectPassportType();
		Assert.assertEquals(totalPassportTypeInReq, signUpPage.sizePassportType(), "Passport values are not matched when compare the requirement conutry and get value from application");
		Assert.assertEquals(TestUtil.readDataFromExcellString(5, 6, 0), signUpPage.getTextPassportTypeName(), "Passport selected values is not displayed when selected from drop down and comapare with test data");
		TestUtil. writeStringValue(5, 6,1);
		ArrayList<String> expectedPassport = new ArrayList<String>();	
		System.out.println("Verification done for passport type");
	}

	@Test(priority = 4)
	public void selectNationalityTest() throws InterruptedException, IOException {
		signUpPage.selectNationality();
		Assert.assertEquals(signUpPage.totalCountryCount(), totalCountryListInReq,
				"Countries values are not matched when compare the requirement conutry and get value from application");
		Assert.assertEquals(TestUtil.readDataFromExcellString(5, 7, 0), signUpPage.getFromSelectedNationality(), "Nationality selected values is not displayed when selected from drop down and comapare with test data");
		TestUtil. writeStringValue(5, 7,1);
		System.out.println("Verification done for selectNationalityTest ");
	}

	@Test(priority = 5)
	public void selectPortOfArrivalTest() throws InterruptedException, IOException {
		signUpPage.selectPortOfArrival();
		Assert.assertEquals(signUpPage.totalPortArrival(), totalPortArrivalInReq,
				"Total port of arrival values are not matched when compare the requirement conutry and get value from application");
		Assert.assertEquals(TestUtil.readDataFromExcellString(5, 8, 0), signUpPage.getTextFromPortofArrival(), "Port Of Arrival selected values is not displayed when selected from drop down and comapare with test data");
		TestUtil. writeStringValue(5, 8,1);
		System.out.println("Verification done for selectPortOfArrivalTest");
	}

	@Test(priority = 6)
	public void selectVisaType() throws InterruptedException, IOException {
		signUpPage.selectVisaType();
		Assert.assertEquals(signUpPage.totalVisaFeeCountActual(), totalVisaTypeExpecteed,
				"Total visa fee values are not matched when compare the requirement and get value from application");
		Assert.assertEquals(signUpPage.getTextFromVisaType(), TestUtil.readDataFromExcellString(5, 9, 0),  "Port Of Arrival selected values is not displayed when selected from drop down and comapare with test data");
		TestUtil. writeStringValue(5, 9,1);
		System.out.println("Verification done for selectVisaType");
	}

	@Test(priority = 7)
	public void selectVisaLocation() throws InterruptedException, IOException {
		signUpPage.selectVisaLocation();
		Assert.assertEquals(signUpPage.totalVisaLocationActual(), totalVisaLocationExpected,
				"Total Visa Location values are not matched when compare the requirement and get value from application");
		Assert.assertEquals(signUpPage.getTextFromSelectVisaLocation(), TestUtil.readDataFromExcellString(5, 10, 0),  "Visa Location selected values is not displayed when selected from drop down and comapare with test data");	
		TestUtil. writeStringValue(5, 10,1);
		System.out.println("Verification done for selectVisaLocation");
	}
	@Test(priority = 8)
	public void passPhoneNoTest() throws InterruptedException, IOException {
		System.out.println("Mobile number==>" +TestUtil.readDataFromExcellString(5, 11, 0));
		signUpPage.passPhoneNo(TestUtil.readDataFromExcellString(5, 11, 0));
		Assert.assertEquals(signUpPage.getTextFromPhoneFiled(), TestUtil.readDataFromExcellString(5, 11, 0),  "Pass phone number and get phone number is not matched while comparing from TestData");
		TestUtil. writeStringValue(5, 11,1);
		System.out.println("Verification done for passPhoneNoTest");
	}

	@Test(priority = 9)
	public void selectDateOfBirthTest() throws InterruptedException, IOException {
		Thread.sleep(3000);
		System.out.println("Birth date====>"+TestUtil.readDataFromExcellString(5, 14, 0));
		signUpPage.selectDateOfBirth(TestUtil.readDataFromExcellString(5, 14, 0));
		Assert.assertEquals(signUpPage.getBirthDate(), TestUtil.readDataFromExcellString(5, 14, 0),  "Pass Birth date and get Birth date  is not matched while comparing from TestData");
		TestUtil. writeStringValue(5, 14,1);
		//signUpPage.clickOnSelectAll();
		System.out.println("Verification done for selectDateOfBirthTest");
	}
	
	@Test(priority = 10)
	public void passEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passEmailId(TestUtil.readDataFromExcellString(5, 12, 0));
		Assert.assertEquals(signUpPage.getTextFromEmailField(), TestUtil.readDataFromExcellString(5, 12, 0),  "Pass Email-Id and get Email-Id is not matched while comparing from TestData");
		TestUtil. writeStringValue(5, 12,1);
		System.out.println("Verification done for passEmailIdTest");
	}

	@Test(priority = 11)
	public void passReEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passReEmailId(TestUtil.readDataFromExcellString(5, 13, 0));
		Assert.assertEquals(signUpPage.getTextFromReEmailField(), TestUtil.readDataFromExcellString(5, 13, 0),  "Pass Email-Id and get Email-Id is not matched while comparing from TestData");
		TestUtil. writeStringValue(5, 13,1);
		System.out.println("Verification done for passReEmailIdTest");
	}

	@Test(priority = 12)
	public void enterCaptchaFieldTest() throws InterruptedException, IOException {
		signUpPage.enterCaptchaField();
		// signUpPage.continueBtn();
		// signUpPage.cancelBtn();
		TestUtil.clickOnElement(signUpPage.selectOneRadioButton());
		TestUtil.clickOnElement(signUpPage.termsCheckboxselect());
		
		TestUtil.clickOnElement(signUpPage.clickOnSelectAll());
		
		
		
	}

}
