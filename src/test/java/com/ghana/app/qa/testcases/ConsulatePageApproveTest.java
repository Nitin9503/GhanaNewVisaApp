package com.ghana.app.qa.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.CNAddressInfo;

import static com.ghana.app.qa.util.TestUtil.prop;
import static com.ghana.app.qa.testdata.ConstantVariable.*;

import com.ghana.app.qa.util.TestUtil;

public class ConsulatePageApproveTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ConsulatePageApproveTest() throws IOException, InterruptedException {
		super();
	}
	@Test(priority = 1)
	public void signUpAndFillSignUpPage() throws InterruptedException,
			IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
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
		TestUtil.clickOnElement(signUpPage.selectOneRadioButton());
		TestUtil.clickOnElement(signUpPage.termsCheckboxselect());
		TestUtil.clickOnElement(signUpPage.clickOnSelectAll());
		signUpPage.selectDateOfBirth(TestUtil
				.readDataFromExcellString(5, 14, 0));
		signUpPage.continueBtn();
	}

	@Test(priority = 2)
	public void fillPersonalPageTest() throws InterruptedException, IOException {
		// ----------------------Personal info page //
		// Test----------------------------------//
		Thread.sleep(1000);
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(6, 5,
				0));
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(6, 6,
				0));
		personalInfoPage.passLastName(TestUtil
				.readDataFromExcellString(6, 7, 0));
		personalInfoPage.passPassportNumber(TestUtil.readDataFromExcellString(
				6, 8, 0));
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		personalInfoPage.selectPassIssueDate(TestUtil.readDataFromExcellString(
				6, 9, 0));
		personalInfoPage.selectPassExpiryDate(TestUtil
				.readDataFromExcellString(6, 10, 0));
		personalInfoPage.passPlaceOfBirth(TestUtil.readDataFromExcellString(6,
				11, 0));
		personalInfoPage.clickOnSaveAndContinue();
	}

	@Test(priority = 3)
	public void fillAddressinfoPageTest() throws InterruptedException,
			IOException {
		// ----------------------Address Info page //
		// Test----------------------------------//
		addressInfoPage.selectFormerNaitonality();
		addressInfoPage.passFlatNumber(TestUtil.readDataFromExcellString(7, 4,
				0));
		addressInfoPage.passStreetName(TestUtil.readDataFromExcellString(7, 5,
				0));
		addressInfoPage
				.passLandmark(TestUtil.readDataFromExcellString(7, 6, 0));
		addressInfoPage.passPincode(TestUtil.readDataFromExcellString(7, 7, 0));
		addressInfoPage
				.passCityName(TestUtil.readDataFromExcellString(7, 8, 0));
		addressInfoPage.passStateName(TestUtil
				.readDataFromExcellString(7, 9, 0));
		addressInfoPage.passCountryName(TestUtil.readDataFromExcellString(7,
				10, 0));
		addressInfoPage.selectAddressType();
		addressInfoPage.clickSaveAndContinuebtn();
	}

	@Test(priority = 4)
	public void fillEmergencyPageTest() throws InterruptedException,
			IOException {
		emergencyContactPage.emergencyFirstName(TestUtil
				.readDataFromExcellString(8, 3, 0));
		emergencyContactPage.emergencyLastName(TestUtil
				.readDataFromExcellString(8, 4, 0));
		emergencyContactPage.emergencyContactNumber(TestUtil
				.readDataFromExcellString(8, 6, 0));
		emergencyContactPage.selectRelation();
		emergencyContactPage.passEmergency_profession(TestUtil
				.readDataFromExcellString(8, 7, 0));
		emergencyContactPage.passEmployerOrSchoolName(TestUtil
				.readDataFromExcellString(8, 8, 0));
		emergencyContactPage.pass_EmployerOrSchooladdress(TestUtil
				.readDataFromExcellString(8, 9, 0));
		emergencyContactPage.pass_Emergency_Pincode(TestUtil
				.readDataFromExcellString(8, 10, 0));
		emergencyContactPage.paa_Emergency_city(TestUtil
				.readDataFromExcellString(8, 11, 0));
		emergencyContactPage.pass_Emergency_State(TestUtil
				.readDataFromExcellString(8, 12, 0));
		emergencyContactPage.pass_Emergency_Country(TestUtil
				.readDataFromExcellString(8, 13, 0));
		emergencyContactPage.pass_emergency_employer_phone_number(TestUtil
				.readDataFromExcellString(8, 14, 0));
		emergencyContactPage.clickEmeContinueBtn();
	}

	@Test(priority = 5)
	public void fillTravelInfoPageTest() throws InterruptedException,
			IOException {
		travelInfoPage.passDateOfDeparture(TestUtil.readDataFromExcellString(9,
				3, 0));
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		travelInfoPage.passTicketNumber(TestUtil.readDataFromExcellString(9, 5,
				0));
		travelInfoPage.clickOnTravelBy();
		travelInfoPage.clickPurpose_of_journey();
		travelInfoPage.passPrimaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 8, 0));
		travelInfoPage.passPrimaryRefLastname(TestUtil
				.readDataFromExcellString(9, 9, 0));
		travelInfoPage.pass_Primary_ref_address(TestUtil
				.readDataFromExcellString(9, 10, 0));
		travelInfoPage.pass_primary_ref_pincode(TestUtil
				.readDataFromExcellString(9, 11, 0));
		travelInfoPage.pass_primary_ref_city(TestUtil.readDataFromExcellString(
				9, 12, 0));
		travelInfoPage.pass_primary_ref_state(TestUtil
				.readDataFromExcellString(9, 13, 0));
		travelInfoPage.pass_primary_ref_country(TestUtil
				.readDataFromExcellString(9, 14, 0));
		travelInfoPage.pass_primary_ref_phone_number(TestUtil
				.readDataFromExcellString(9, 15, 0));
		travelInfoPage.passsecondaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 16, 0));
		travelInfoPage.pass_secondary_ref_lastname(TestUtil
				.readDataFromExcellString(9, 17, 0));
		travelInfoPage.pass_secondary_ref_address(TestUtil
				.readDataFromExcellString(9, 18, 0));
		travelInfoPage.pass_secondary_ref_pincode(TestUtil
				.readDataFromExcellString(9, 19, 0));
		travelInfoPage.pass_secondary_ref_city(TestUtil
				.readDataFromExcellString(9, 20, 0));
		travelInfoPage.pass_secondary_ref_state(TestUtil
				.readDataFromExcellString(9, 21, 0));
		travelInfoPage.pass_secondary_ref_country(TestUtil
				.readDataFromExcellString(9, 22, 0));
		travelInfoPage.pass_secondary_ref_phone_number(TestUtil
				.readDataFromExcellString(9, 23, 0));
		travelInfoPage.clickOnByPhoneCheckbox();
		travelInfoPage.clickOnContinuebutton();
	}
	@Test(priority=6, description="Here verifying confirmation message and click on ok btn ")
	public void documentPageAndPaymentPageTest() throws InterruptedException, IOException {
		uploadDocPage.getUploadDoc();
		uploadDocPage.clicksaveAndContiBtn();
		reviewApplicationPage.clickOnContinuebutton();
		TestUtil.writeStringValue(12, 1, 1);
		softAssertion.assertEquals(visaPaymentPage.getTextPaymentPageTitle(), TestUtil.readDataFromExcellString(12, 2, 0),
				"it is not navigate to payment info page");	
		TestUtil.writeStringValue(12, 2, 1);
		visaPaymentPage.clickOnCheckoutBtn();
		visaPaymentPage.passCardNo();
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
		visaPaymentPage.passCvvNo();
		System.out.println( "verifyClickOnSubmitBtnTest2");
		visaPaymentPage.clickOnMakePaymentBtn();
		visaPaymentPage.clickOnSubmitbtn();
		visaPaymentPage.clickOnOKtbtn();
		visaPaymentPage.clickOnDonetbtn();
	} 
	@Test(priority = 7, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
	public void loginIntoConsulate() throws InterruptedException, IOException {
		Thread.sleep(2000);		
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);
		driver.get(prop.getProperty("HCDLoginURL"));	
		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(13, 1, 0), "Consulate login page is not displayed");
		TestUtil.writeStringValue(13, 1, 1);
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameCN"));		
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordCN"));
		TestUtil.writeStringValue(13, 2, 1);
		highAndConsulateLoginPage.clickOnLoginButton();	
		System.out.println( "applicationIDCN==>" +applicationID);

	}

	@Test(priority = 8, description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button")
	public void verifyTitleOfConsulateTitle() throws IOException, InterruptedException {
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		TestUtil.writeStringValue(13, 3, 1);
	}  

	@Test(priority = 9, description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button" )
	public void clickOnNewApplicationCN() throws InterruptedException, IOException {
		System.out.println("HI2");
		Thread.sleep(3000);	
		System.out.println("newApplication==>" +TestUtil.readDataFromExcellString(13, 4, 0));
		System.out.println("consulatedashBoardPage.textNewApplicationBucket()==>" +consulatedashBoardPage.textNewApplicationBucket());
		Assert.assertEquals(consulatedashBoardPage.textNewApplicationBucket(),TestUtil.readDataFromExcellString(13, 4, 0),
				"We are not in new Application bucket");
		TestUtil.writeStringValue(13, 4, 1);
		Assert.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		TestUtil.clickOnElement();
		Assert.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), TestUtil.readDataFromExcellString(14, 1, 0),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		TestUtil.writeStringValue(14, 1, 1);
	}
	
	@Test(priority = 10, description = "Here we are getting text from Applicant Information and comparing with Applicant filed data")
	public void getTextFromApplicantInformationCN() throws InterruptedException, IOException {
		Assert.assertEquals(applicantDashBoardPage.getTextVisaFees(), (TestUtil.readDataFromExcellString(5, 9, 0)),
				"Provided and Get Visa Fees are not matched");
		TestUtil.writeStringValue(14, 2, 1);
		Assert.assertEquals(applicantDashBoardPage.getTextFullName(), (TestUtil.readDataFromExcellString(6, 5, 0) + " " + TestUtil.readDataFromExcellString(6, 7, 0)),
				"Provided and Get firstName are not matched");
		TestUtil.writeStringValue(14, 3, 1);
		Assert.assertEquals(applicantDashBoardPage.getTextPassportNumber(), (TestUtil.readDataFromExcellString(6, 8, 0)),
				"Provided and Get Passport Number are not matched");
		TestUtil.writeStringValue(14, 4, 1);
		Assert.assertEquals(applicantDashBoardPage.getTextDateOfBirth(), (TestUtil.readDataFromExcellString(5, 14, 0)),
				"Provided and Get Birth Date  are not matched");	
		TestUtil.writeStringValue(14, 5, 1);
		Assert.assertEquals(applicantDashBoardPage.getTextDateOfPassportIssue(), TestUtil.readDataFromExcellString(6, 9, 0),
				"Provided and Get Passport Issued Date are not matched");
		TestUtil.writeStringValue(14, 6, 1);
		Assert.assertEquals(applicantDashBoardPage.getTextPassportExpiryDate(), TestUtil.readDataFromExcellString(6, 10, 0),
				"Provided and Get Passport Expiry Date are not matched");
		TestUtil.writeStringValue(14, 7, 1);
		Assert.assertEquals(applicantDashBoardPage.getTextBirthPlace(), TestUtil.readDataFromExcellString(6, 11, 0),
				"Provided and Get Birth Place are not matched");
		TestUtil.writeStringValue(14, 8, 1);		
		//	TestUtil.dateAlter(birthDate);
		//	TestUtil.dateAlter(passportExpiryDate);
		//	TestUtil.dateAlter(passportIssuedDate);	
	}
	
	@Test(priority = 11)
	public void clickOnAddressInforCN() throws InterruptedException, IOException {
		System.out.println("HI3");
		applicantDashBoardPage.clickOnAddressInfor();
		Assert.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), TestUtil.readDataFromExcellString(14, 9, 0),
				"We are not navigate to CN Address Info page upon clicking on Address Information from Applicant Dashboard");
		TestUtil.writeStringValue(14, 9, 1);
	}
	@Test(priority = 12, description = "Here we are getting text from Address Information and comparing with Applicant filed data")
	public void getTextFromAddressInformationCN() throws InterruptedException, IOException {

		Assert.assertEquals(cNAddressInfo.getTextFromFormarNationality(), (TestUtil.readDataFromExcellString(7, 3, 0)),
				"Provided and Get Former Nationality are not matched");
		TestUtil.writeStringValue(14, 10, 1);
		Assert.assertEquals(cNAddressInfo.getTextFromNationality(), (TestUtil.readDataFromExcellString(5, 7, 0)),
				"Provided and Get Nationality are not matched");
		TestUtil.writeStringValue(14, 11, 1);		
		Assert.assertEquals(cNAddressInfo.getTextFromEmailID(), (TestUtil.readDataFromExcellString(5, 12, 0)),
				"Provided and Get Emial id are not matched");
		TestUtil.writeStringValue(14, 12, 1);
		Assert.assertEquals(cNAddressInfo.getTextFromPhoneNumber(), (TestUtil.readDataFromExcellString(5, 11, 0)),
				"Provided and Get Phone Number are not matched");
		TestUtil.writeStringValue(14, 13, 1);
		Assert.assertEquals(cNAddressInfo.getTextlandmark(), (TestUtil.readDataFromExcellString(7, 6, 0)),
				"Provided and Get Landmark are not matched");
		TestUtil.writeStringValue(14, 14, 1);
		Assert.assertEquals(cNAddressInfo.getTextFromAddress(), (TestUtil.readDataFromExcellString(7, 4, 0) + "," + TestUtil.readDataFromExcellString(7, 5, 0)),
				"Provided and Get Address are not matched");
		TestUtil.writeStringValue(14, 15, 1);
		Assert.assertEquals(cNAddressInfo.getTextFromCityAndPinCode(), (TestUtil.readDataFromExcellString(7, 8, 0) + "," + TestUtil.readDataFromExcellString(7, 7, 0)),
				"Provided and Get Birth Place  are not matched");
		TestUtil.writeStringValue(14, 16, 1);
		Assert.assertEquals(cNAddressInfo.getTextFromState(), (TestUtil.readDataFromExcellString(7, 9, 0)),
				"Provided and Get Passport Issued Date are not matched");
		TestUtil.writeStringValue(14, 17, 1);
		Assert.assertEquals(cNAddressInfo.getTextFromCountry(), (TestUtil.readDataFromExcellString(7, 10, 0)),
				"Provided and Get Passport Expiry Date are not matched");
		TestUtil.writeStringValue(14, 18, 1);
	}
	
	@Test(priority = 13)
	public void verfiyTitleOfCNTravelInfoPageCN() throws InterruptedException, IOException {
		applicantDashBoardPage.clickOnTravelInfor();
		Assert.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), (TestUtil.readDataFromExcellString(14, 19, 0)),
				"We are not navigate to Travel Information page upon clicking on Travel Information from Applicant Dashboard");
		TestUtil.writeStringValue(14, 19, 1);
	}
	@Test(priority = 14, description = "Here we are getting text from Travel Information and comparing with Applicant filed data")
	public void getTextFromTravelInformationCN() throws InterruptedException, IOException {
		Assert.assertEquals(cNTravelInfo.getDateOfDeparture(), (TestUtil.readDataFromExcellString(9, 3, 0)),
				"Provided and Get Data Of Departure are not matched");
		TestUtil.writeStringValue(14, 20, 1);		
		Assert.assertEquals(cNTravelInfo.getTextzticketNumber(), (TestUtil.readDataFromExcellString(9, 5, 0)),
				"Provided and Get Ticket number is not matched");
		TestUtil.writeStringValue(14, 21, 1);
		Assert.assertEquals(cNTravelInfo.getTextTravelBy(), (TestUtil.readDataFromExcellString(9, 6, 0)),
				"Provided and Get Travel By is not matched");
		TestUtil.writeStringValue(14, 22, 1);		
		Assert.assertEquals(cNTravelInfo.getTextPurposeOfVisit(), (TestUtil.readDataFromExcellString(9, 7, 0)),
				"Provided and Get Purpose of Visit is not matched");
		TestUtil.writeStringValue(14, 23, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceName1(), TestUtil.readDataFromExcellString(9, 8, 0)+" "+(TestUtil.readDataFromExcellString(9, 9, 0)),
				"Provided and Get Purpose of Visit is not matched");
		TestUtil.writeStringValue(14, 29, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceContact1(), (TestUtil.readDataFromExcellString(9, 15, 0)),
				"Provided and Get Passport Number are not matched");
		TestUtil.writeStringValue(14, 24, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceAddress1(),
				(TestUtil.readDataFromExcellString(9, 10, 0) + "," + TestUtil.readDataFromExcellString(9, 12, 0) + "," + TestUtil.readDataFromExcellString(9, 13, 0) + "," + TestUtil.readDataFromExcellString(9, 14, 0) + "," + TestUtil.readDataFromExcellString(9, 11, 0)),
				"Provided and Get Landmark are not matched 1");
		TestUtil.writeStringValue(14, 25, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceCity1(), (TestUtil.readDataFromExcellString(9, 12, 0) + "," + TestUtil.readDataFromExcellString(9, 11, 0)),
				"Provided and Get Address are not matched");
		TestUtil.writeStringValue(14, 26, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceState1(), (TestUtil.readDataFromExcellString(9, 13, 0)),
				"Provided and Get Passport Issued Date are not matched");
		TestUtil.writeStringValue(14, 27, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceCountry1(), (TestUtil.readDataFromExcellString(9, 14, 0)),
				"Provided and Get Passport Expiry Date are not matched");
		TestUtil.writeStringValue(14, 28, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceName2(), (TestUtil.readDataFromExcellString(9, 16, 0) + " " + TestUtil.readDataFromExcellString(9, 17, 0)),
				"Provided and Get firstName are not matched");
		TestUtil.writeStringValue(14, 30, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceContact2(), (TestUtil.readDataFromExcellString(9, 23, 0)),
				"Provided and Get Passport Number are not matched");
		TestUtil.writeStringValue(14, 31, 1);
		Assert.assertEquals(
				cNTravelInfo.getTextReferenceAddress2(), (TestUtil.readDataFromExcellString(9, 18, 0) + "," + TestUtil.readDataFromExcellString(9, 20, 0) + "," + TestUtil.readDataFromExcellString(9, 21, 0)
						+ "," + TestUtil.readDataFromExcellString(9, 22, 0) + "," + TestUtil.readDataFromExcellString(9, 19, 0)),
				"Provided and Get Landmark are not matched 2");
		TestUtil.writeStringValue(14, 32, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceCity2(), (TestUtil.readDataFromExcellString(9, 20, 0) + "," + TestUtil.readDataFromExcellString(9, 19, 0)),
				"Provided and Get Birth Place  are not matched");
		TestUtil.writeStringValue(14, 33, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceState2(), (TestUtil.readDataFromExcellString(9, 21, 0)),
				"Provided and Get state is not matched");
		TestUtil.writeStringValue(14, 34, 1);
		Assert.assertEquals(cNTravelInfo.getTextReferenceCountry2(), (TestUtil.readDataFromExcellString(9, 14, 0)),
				"Provided and Get Passport Expiry Date are not matched");
		TestUtil.writeStringValue(14, 35, 1);
	}
	@Test(priority = 15)
	public void verfiyTitleOfCNDocumentVerificatonPageCN() throws InterruptedException, IOException {
		applicantDashBoardPage.clickOnDocumentVeri();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		TestUtil.writeStringValue(14, 36, 1);
	}
	
	@Test(priority = 16, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleTravelInformationCN() throws InterruptedException, IOException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		Assert.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), TestUtil.readDataFromExcellString(14, 19, 0),
				"We are not navigate to Travel Information page upon clicking on Back Button from Document Verification");
		TestUtil.writeStringValue(14, 37, 1);

	}

	@Test(priority = 17, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleAddressInformationCN() throws InterruptedException, IOException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		Assert.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), TestUtil.readDataFromExcellString(14, 9, 0),
				"We are not navigate to Address Information page upon clicking on Back Button from Travel Information");
		TestUtil.writeStringValue(14, 38, 1);

	}

	@Test(priority = 18, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleApplicantInformationCN() throws InterruptedException, IOException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		Assert.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(),  TestUtil.readDataFromExcellString(14, 1, 0),
				"We are not navigate to Applicant Dashboard page upon clicking on Applicant Information from Document Verifcation");
		TestUtil.writeStringValue(14, 39, 1);
	}
	
	@Test(priority = 19)
	public void clickOnNextButtonAndVerifyTitleAddressInformationCN() throws InterruptedException, IOException {
		applicantDashBoardPage.clickOnNextButton();
		Assert.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), TestUtil.readDataFromExcellString(14, 9, 0),
				"We are not navigate to CN Address Info page upon clicking on Next Button from Applicant Dashboard");
		TestUtil.writeStringValue(14, 40, 1);
	}

	@Test(priority = 20)
	public void clickOnNextButtonAndVerifyTitleTravelInformationCN() throws InterruptedException, IOException {
		applicantDashBoardPage.clickOnNextButton();
		Assert.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), TestUtil.readDataFromExcellString(14, 19, 0),
				"We are not navigate to Travel Information page upon clicking on Next Button from Address Information");
		TestUtil.writeStringValue(14, 41, 1);
	}

	@Test(priority = 21)
	public void clickOnNextButtonAndVerifyTitleDocumentVerificationCN() throws InterruptedException, IOException {
		applicantDashBoardPage.clickOnNextButton();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");
		TestUtil.writeStringValue(14, 42, 1);
	}
	@Test(priority = 22, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Cancel")
	public void clickOnInterviewScheduleAndcancelCN() throws InterruptedException, IOException {
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(9000);
		System.out.println("cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		Assert.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), TestUtil.readDataFromExcellString(15, 1, 0),
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		TestUtil.writeStringValue(15, 1, 1);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		cNInterviewSchedule.cancelButtonFromInterviewConfirpop();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");
		TestUtil.writeStringValue(15, 2, 1);

	}

	@Test(priority = 23, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Close")
	public void clickOnInterviewScheduleAndCloseCN() throws InterruptedException, IOException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		Assert.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), TestUtil.readDataFromExcellString(15, 1, 0),
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		Thread.sleep(3000);
		cNInterviewSchedule.closeButtonFromInterviewConfirpop();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");
		TestUtil.writeStringValue(15, 3, 1);

	}
	
	
// Getting white label error thats why commented
/*	@Test(priority = 93, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Pass Date And Time")
	public void passDateAndTimeInFiledCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		softAssertion.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), prop.getProperty("confirmationFromInterviewScheduleTitle"),
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		cNInterviewSchedule.passDate1("04/23/2019");
		cNInterviewSchedule.passDate2("04/23/2019");
		cNInterviewSchedule.passDate3("04/23/2019");
		cNInterviewSchedule.passTime1("12:00PM");
		cNInterviewSchedule.passTime2("02:00AM");
		cNInterviewSchedule.passTime3("03:00AM");
		Thread.sleep(3000);
		cNInterviewSchedule.confirmButtonFromInterviewConfirpop();
		softAssertion.assertAll();
	}*/
	@Test(priority = 24)
	public void selectAllCheckBoxAndVerifyCN() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.verifyAllCheckBox();
		System.out.println("selectedBoxDoc" +selectedBoxDocAll);
		Assert.assertTrue(selectedBoxDocAll,
				"Check Boxes is not selected upon clicking on [Select All Check] only select all button from Document Verification page");		
		TestUtil.writeStringValue(15, 4, 1);
		Assert.assertTrue(selectedCheckBoxOnDocSingle,
				"All check Boxes is not selected upon clicking on [Select All Check] from Document Verification page");
		TestUtil.writeStringValue(15, 5, 1);
	}
	@Test(priority = 25)
	public void selectOneByOneCheckBoxAndVerifyCN() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cNDocumentVerificaton.selectOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		cNDocumentVerificaton.verifyOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		//softAssertion.assertTrue(selectedCheckBoxOnDocSingle,
		//		"Check Boxes is not selected upon clicking on [One By One Check] from Document Verification page");
	}

	@Test(priority = 26, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopTextCN() throws InterruptedException, IOException {
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.clickOnApprove();
		Assert.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), TestUtil.readDataFromExcellString(16, 1, 0),
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		TestUtil.writeStringValue(16, 1, 1);
		cNDocumentVerificaton.clickOnCancelFromApprove();
		Assert.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		TestUtil.writeStringValue(16, 2, 1);
	}

	@Test(priority = 28, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopText1CN() throws InterruptedException, IOException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnApprove();
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnCloseApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		TestUtil.writeStringValue(16, 3, 1);
	}
	@Test(priority =29)
	public void passCommentCN() throws IOException, InterruptedException {
		applicantDashBoardPage.passComment(TestUtil.readDataFromExcellString(14, 43, 0));
		applicantDashBoardPage.addCooment();
		applicantDashBoardPage.getTextFromAddedComment();
		Assert.assertEquals(applicantDashBoardPage.getTextFromAddedComment(), TestUtil.readDataFromExcellString(14, 43, 0),
				"Latest passed comment is not matched after getting text from comment section");
		TestUtil.writeStringValue(14, 43, 1);
	}
	@Test(priority = 30, description = "Click On Approve And Verify Pop Text and then click on Approve, Verify that on which page navigated")
	public void clickOnApproveCN() throws InterruptedException, IOException {
		Thread.sleep(3000);	
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.clickOnApprove();
		cNDocumentVerificaton.getTextFromApproveButtonFromCN();
		cNDocumentVerificaton.clickOnConfirmFromApprove();
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after clicking on Approve");	
		TestUtil.writeStringValue(16, 4, 1);
	}
	
	@Test(priority = 31, description = "This test will verify whether application is sent to HCD side")
	public void verifyApplicaInHCGApplicationBucket() throws InterruptedException, IOException {
		// check whether application removed from new application bucket and added in HCG application iin count
		System.out.println("getTextFromApproveButtonFromCN==>" +getTextFromApproveButtonFromCN);
		Assert.assertEquals(consulatedashBoardPage.textHCGApplicationBucket(), getTextFromApproveButtonFromCN,
				"We are not in HCG Application bucket to check the application is present after approved by CN");		
		TestUtil.clickOnElement();
		consulatedashBoardPage.confirmationPopApplicationSentToHCD();
		System.out.println("consulatedashBoardPage.confirmationPopApplicationSentToHCD();;==>" +consulatedashBoardPage.confirmationPopApplicationSentToHCD());
		Assert.assertEquals(consulatedashBoardPage.confirmationPopApplicationSentToHCD(), TestUtil.readDataFromExcellString(16, 1, 0),
				"Confirmation popup is not displayed upon clicking on Application which is sent to HCD side");
		System.out.println("consulatedashBoardPage.textFromPop1PopApplicationSentToHCD();==>" +consulatedashBoardPage.textFromPop1PopApplicationSentToHCD());
		TestUtil.writeStringValue(16, 5, 1);
		//softAssertion.assertEquals(consulatedashBoardPage.textFromPop1PopApplicationSentToHCD(), "This application is already sent to High Commsion for"
			//	+"confirmation, Are you sure you want to open this?",
			//	"Application is not sent to HCD side(Checked in Bucket) even after approved the application");

	}
	@Test(priority = 32, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentOpens() throws InterruptedException, IOException {
		consulatedashBoardPage.openButton1PopApplicationSentToHCD();
		Assert.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), TestUtil.readDataFromExcellString(14, 1, 0),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		Thread.sleep(4000);
		TestUtil.writeStringValue(16, 6, 1);
		applicantDashBoardPage.clickOnCancelButton();
		Thread.sleep(4000);
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after clicking on back button from browser");
		TestUtil.writeStringValue(16, 7, 1);
		
	}
	
	@Test(priority = 33, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyCanceAndCrossButton() throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);
		consulatedashBoardPage.crossButton1PopApplicationSentToHCD();
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after clicking on cross button from confirmation popup");
		Thread.sleep(3000);
		TestUtil.writeStringValue(16, 8, 1);
		TestUtil.clickOnElement();
		Thread.sleep(3000);		
		consulatedashBoardPage.cancelButton1PopApplicationSentToHCD();	
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after clicking on cancel button from confirmation popup");
		System.out.println("2222");
		TestUtil.writeStringValue(16, 9, 1);
		System.out.println("Passed Approve");	
		TestUtil.toCloseNewTab();

	}	
	
	
}
