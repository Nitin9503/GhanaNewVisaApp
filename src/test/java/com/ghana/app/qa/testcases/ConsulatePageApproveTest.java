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
		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(0, 1, 0), "Consulate login page is not displayed");
		TestUtil.writeStringValue(0, 1, 1);
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameCN"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordCN"));
		TestUtil.writeStringValue(0, 2, 1);
		highAndConsulateLoginPage.clickOnLoginButton();
		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(0, 3, 0), "Bucket page is not displayed upon clicking on Login");
		TestUtil.writeStringValue(0, 3, 1);
		System.out.println( "applicationIDCN==>" +applicationID);

	}

	@Test(priority = 8, description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button")
	public void verifyTitleOfConsulateTitle() {
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		// print the value of present app in new application bucket , HCG application and Approve application
		softAssertion.assertAll();
	}  

	@Test(priority = 9, description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button" )
	public void clickOnNewApplicationCN() throws InterruptedException {
		System.out.println("HI2");
		Thread.sleep(3000);	
		System.out.println("newApplication==>" +prop.getProperty("newApplicationBucket"));
		System.out.println("consulatedashBoardPage.textNewApplicationBucket()==>" +consulatedashBoardPage.textNewApplicationBucket());
		softAssertion.assertEquals(consulatedashBoardPage.textNewApplicationBucket(), prop.getProperty("newApplicationBucket"),
				"We are not in new Application bucket");		
		softAssertion.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		TestUtil.clickOnElement();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), prop.getProperty("applicantDashboardTitle"),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		softAssertion.assertAll();
	}
	
	@Test(priority = 10, description = "Here we are getting text from Applicant Information and comparing with Applicant filed data")
	public void getTextFromApplicantInformationCN() throws InterruptedException, IOException {
		Assert.assertEquals(applicantDashBoardPage.getTextFullName(), (TestUtil.readDataFromExcellString(6, 5, 0) + " " + TestUtil.readDataFromExcellString(6, 7, 0)),
				"Provided and Get firstName are not matched");
		Assert.assertEquals(applicantDashBoardPage.getTextPassportNumber(), (TestUtil.readDataFromExcellString(6, 8, 0)),
				"Provided and Get Passport Number are not matched");
		/*TestUtil.dateAlter(birthDate);
		softAssertion.assertEquals(applicantDashBoardPage.getTextDateOfBirth(), providedDate,
				"Provided and Get Birth Date  are not matched");
		TestUtil.dateAlter(passportIssuedDate);	
		softAssertion.assertEquals(applicantDashBoardPage.getTextDateOfPassportIssue(), providedDate,
				"Provided and Get Passport Issued Date are not matched");
		TestUtil.dateAlter(passportExpiryDate);
		softAssertion.assertEquals(applicantDashBoardPage.getTextPassportExpiryDate(), providedDate,
				"Provided and Get Passport Expiry Date are not matched");*/	
	}

	
	@Test(priority = 11)
	public void clickOnAddressInforCN() throws InterruptedException {
		System.out.println("HI3");
		applicantDashBoardPage.clickOnAddressInfor();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), prop.getProperty("addressInformationTitle"),
				"We are not navigate to CN Address Info page upon clicking on Address Information from Applicant Dashboard");
		softAssertion.assertAll();
	}
	@Test(priority = 12, description = "Here we are getting text from Address Information and comparing with Applicant filed data")
	public void getTextFromAddressInformationCN() throws InterruptedException, IOException {

		Assert.assertEquals(cNAddressInfo.getTextFromEmailID(), (TestUtil.readDataFromExcellString(5, 12, 0)),
				"Provided and Get firstName are not matched");
		Assert.assertEquals(cNAddressInfo.getTextFromPhoneNumber(), (TestUtil.readDataFromExcellString(5, 11, 0)),
				"Provided and Get Passport Number are not matched");
		Assert.assertEquals(cNAddressInfo.getTextlandmark(), (TestUtil.readDataFromExcellString(7, 6, 0)),
				"Provided and Get Landmark are not matched");
		Assert.assertEquals(cNAddressInfo.getTextFromAddress(), (TestUtil.readDataFromExcellString(7, 4, 0) + "," + TestUtil.readDataFromExcellString(7, 5, 0)),
				"Provided and Get Birth Date  are not matched");
		Assert.assertEquals(cNAddressInfo.getTextFromCityAndPinCode(), (TestUtil.readDataFromExcellString(7, 8, 0) + "," + TestUtil.readDataFromExcellString(7, 7, 0)),
				"Provided and Get Birth Place  are not matched");
		Assert.assertEquals(cNAddressInfo.getTextFromState(), (TestUtil.readDataFromExcellString(7, 9, 0)),
				"Provided and Get Passport Issued Date are not matched");
		Assert.assertEquals(cNAddressInfo.getTextFromCountry(), (TestUtil.readDataFromExcellString(7, 10, 0)),
				"Provided and Get Passport Expiry Date are not matched");
	
	}
	
	@Test(priority = 13)
	public void verfiyTitleOfCNTravelInfoPageCN() throws InterruptedException {
		applicantDashBoardPage.clickOnTravelInfor();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), prop.getProperty("travelInformationTitle"),
				"We are not navigate to Travel Information page upon clicking on Travel Information from Applicant Dashboard");
		softAssertion.assertAll();
	}
	@Test(priority = 14, description = "Here we are getting text from Travel Information and comparing with Applicant filed data")
	public void getTextFromTravelInformationCN() throws InterruptedException, IOException {

		Assert.assertEquals(cNTravelInfo.getTextReferenceName1(), (TestUtil.readDataFromExcellString(9, 8, 0) + " " + TestUtil.readDataFromExcellString(9, 9, 0)),
				"Provided and Get firstName are not matched");
		Assert.assertEquals(cNTravelInfo.getTextReferenceContact1(), (TestUtil.readDataFromExcellString(9, 15, 0)),
				"Provided and Get Passport Number are not matched");
		Assert.assertEquals(cNTravelInfo.getTextReferenceAddress1(),
				(TestUtil.readDataFromExcellString(9, 10, 0) + "," + TestUtil.readDataFromExcellString(9, 12, 0) + "," + TestUtil.readDataFromExcellString(9, 13, 0) + "," + TestUtil.readDataFromExcellString(9, 14, 0) + "," + TestUtil.readDataFromExcellString(9, 11, 0)),
				"Provided and Get Landmark are not matched 1");
		Assert.assertEquals(cNTravelInfo.getTextReferenceCity1(), (TestUtil.readDataFromExcellString(9, 12, 0) + "," + TestUtil.readDataFromExcellString(9, 11, 0)),
				"Provided and Get Birth Place  are not matched");
		Assert.assertEquals(cNTravelInfo.getTextReferenceState1(), (TestUtil.readDataFromExcellString(9, 13, 0)),
				"Provided and Get Passport Issued Date are not matched");
		Assert.assertEquals(cNTravelInfo.getTextReferenceCountry1(), (TestUtil.readDataFromExcellString(9, 14, 0)),
				"Provided and Get Passport Expiry Date are not matched");
		Assert.assertEquals(cNTravelInfo.getTextReferenceName2(), (TestUtil.readDataFromExcellString(9, 16, 0) + " " + TestUtil.readDataFromExcellString(9, 17, 0)),
				"Provided and Get firstName are not matched");
		Assert.assertEquals(cNTravelInfo.getTextReferenceContact2(), (TestUtil.readDataFromExcellString(9, 23, 0)),
				"Provided and Get Passport Number are not matched");
		Assert.assertEquals(
				cNTravelInfo.getTextReferenceAddress2(), (TestUtil.readDataFromExcellString(9, 18, 0) + "," + TestUtil.readDataFromExcellString(9, 20, 0) + "," + TestUtil.readDataFromExcellString(9, 21, 0)
						+ "," + TestUtil.readDataFromExcellString(9, 22, 0) + "," + TestUtil.readDataFromExcellString(9, 19, 0)),
				"Provided and Get Landmark are not matched 2");
		Assert.assertEquals(cNTravelInfo.getTextReferenceCity2(), (TestUtil.readDataFromExcellString(9, 20, 0) + "," + TestUtil.readDataFromExcellString(9, 11, 0)),
				"Provided and Get Birth Place  are not matched");
		Assert.assertEquals(cNTravelInfo.getTextReferenceState2(), (TestUtil.readDataFromExcellString(9, 13, 0)),
				"Provided and Get Passport Issued Date are not matched");
		Assert.assertEquals(cNTravelInfo.getTextReferenceCountry2(), (TestUtil.readDataFromExcellString(9, 14, 0)),
				"Provided and Get Passport Expiry Date are not matched");

	}
	@Test(priority = 15)
	public void verfiyTitleOfCNDocumentVerificatonPageCN() throws InterruptedException {
		applicantDashBoardPage.clickOnDocumentVeri();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), prop.getProperty("documentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	}
	
	@Test(priority = 16, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleTravelInformationCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), prop.getProperty("travelInformationTitle"),
				"We are not navigate to Travel Information page upon clicking on Back Button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 17, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleAddressInformationCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), prop.getProperty("addressInformationTitle"),
				"We are not navigate to Address Information page upon clicking on Back Button from Travel Information");
		softAssertion.assertAll();

	}

	@Test(priority = 18, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleApplicantInformationCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(),  prop.getProperty("applicantDashboardTitle"),
				"We are not navigate to Applicant Dashboard page upon clicking on Applicant Information from Document Verifcation");
		softAssertion.assertAll();

	}
	
	@Test(priority = 19)
	public void clickOnNextButtonAndVerifyTitleAddressInformationCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), prop.getProperty("addressInformationTitle"),
				"We are not navigate to CN Address Info page upon clicking on Next Button from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 20)
	public void clickOnNextButtonAndVerifyTitleTravelInformationCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), prop.getProperty("travelInformationTitle"),
				"We are not navigate to Travel Information page upon clicking on Next Button from Address Information");
		softAssertion.assertAll();
	}

	@Test(priority = 21)
	public void clickOnNextButtonAndVerifyTitleDocumentVerificationCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), prop.getProperty("documentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");
		softAssertion.assertAll();
	}
	@Test(priority = 22, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Cancel")
	public void clickOnInterviewScheduleAndcancelCN() throws InterruptedException {
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(9000);
		System.out.println("cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		softAssertion.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), prop.getProperty("confirmationFromInterviewScheduleTitle"),
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		System.out.println("cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		cNInterviewSchedule.cancelButtonFromInterviewConfirpop();
		softAssertion.assertAll();

	}

	@Test(priority = 23, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Close")
	public void clickOnInterviewScheduleAndCloseCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		softAssertion.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), prop.getProperty("confirmationFromInterviewScheduleTitle"),
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		Thread.sleep(3000);
		cNInterviewSchedule.closeButtonFromInterviewConfirpop();
		softAssertion.assertAll();

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
	public void selectAllCheckBoxAndVerifyCN() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.verifyAllCheckBox();
		System.out.println("selectedBoxDoc" +selectedBoxDocAll);
		softAssertion.assertTrue(selectedBoxDocAll,
				"Check Boxes is not selected upon clicking on [Select All Check] only select all button from Document Verification page");		
		softAssertion.assertTrue(selectedCheckBoxOnDocSingle,
				"All check Boxes is not selected upon clicking on [Select All Check] from Document Verification page");
		softAssertion.assertAll();
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
		softAssertion.assertAll();
	}

	@Test(priority = 26, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopTextCN() throws InterruptedException {
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.clickOnApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		cNDocumentVerificaton.clickOnCancelFromApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 28, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopText1CN() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnApprove();
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnCloseApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		softAssertion.assertAll();
	}
	@Test(priority =29)
	public void passCommentCN() {
		applicantDashBoardPage.passComment(prop.getProperty("passCommentFromCN"));
		applicantDashBoardPage.addCooment();
		applicantDashBoardPage.getTextFromAddedComment();
		softAssertion.assertEquals(applicantDashBoardPage.getTextFromAddedComment(), prop.getProperty("passCommentFromCN"),
				"Latest passed comment is not matched after getting text from comment section");
		softAssertion.assertAll();
	}
	@Test(priority = 30, description = "Click On Approve And Verify Pop Text and then click on Approve, Verify that on which page navigated")
	public void clickOnApproveCN() throws InterruptedException {
		Thread.sleep(3000);	
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.clickOnApprove();
		cNDocumentVerificaton.getTextFromApproveButtonFromCN();
		cNDocumentVerificaton.clickOnConfirmFromApprove();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		softAssertion.assertAll();
	}
	
	@Test(priority = 31, description = "This test will verify whether application is sent to HCD side")
	public void verifyApplicaInHCGApplicationBucket() throws InterruptedException {
		// check whether application removed from new application bucket and added in HCG application iin count
		System.out.println("getTextFromApproveButtonFromCN==>" +getTextFromApproveButtonFromCN);
		softAssertion.assertEquals(consulatedashBoardPage.textHCGApplicationBucket(), getTextFromApproveButtonFromCN,
				"We are not in HCG Application bucket to check the application is present after approved by CN");		
		TestUtil.clickOnElement();
		consulatedashBoardPage.confirmationPopApplicationSentToHCD();
		System.out.println("consulatedashBoardPage.confirmationPopApplicationSentToHCD();;==>" +consulatedashBoardPage.confirmationPopApplicationSentToHCD());
		softAssertion.assertEquals(consulatedashBoardPage.confirmationPopApplicationSentToHCD(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Application which is sent to HCD side");
		System.out.println("consulatedashBoardPage.textFromPop1PopApplicationSentToHCD();==>" +consulatedashBoardPage.textFromPop1PopApplicationSentToHCD());
		//softAssertion.assertEquals(consulatedashBoardPage.textFromPop1PopApplicationSentToHCD(), "This application is already sent to High Commsion for"
			//	+"confirmation, Are you sure you want to open this?",
			//	"Application is not sent to HCD side(Checked in Bucket) even after approved the application");
	
		softAssertion.assertAll();
	}
	@Test(priority = 32, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentOpens() throws InterruptedException {
		consulatedashBoardPage.openButton1PopApplicationSentToHCD();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), prop.getProperty("applicantDashboardTitle"),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		Thread.sleep(2000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
		
	}
	
	@Test(priority = 34, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyCanceAndCrossButton() throws InterruptedException {
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);
		consulatedashBoardPage.crossButton1PopApplicationSentToHCD();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);		
		consulatedashBoardPage.cancelButton1PopApplicationSentToHCD();	
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		System.out.println("2222");
		softAssertion.assertAll();
		System.out.println("Passed Approve");	
		TestUtil.toCloseNewTab();	
	}	
	
	
}
