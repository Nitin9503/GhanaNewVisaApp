package com.ghana.app.qa.testcases;
import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.prop;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.ghana.app.qa.util.TestUtil.prop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class HighCommissionPageApproveTest extends DriverInit{

SoftAssert softAssertion = new SoftAssert();
	
	public HighCommissionPageApproveTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
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
	public void fillFormAndPaymentTest() throws InterruptedException, IOException {
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
		TestUtil.writeStringValue(11, 1, 1);
		Thread.sleep(1000);
		reviewApplicationPage.clickOnContinuebutton();
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
		System.out.println( "applicationID after payment==>visa" +applicationID);
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);
		
		if (prop.getProperty("server").equalsIgnoreCase("Global")) {
			driver.get(prop.getProperty("GhanaWebConsulateGlobalURL"));				 
		} else if (prop.getProperty("server").equalsIgnoreCase("Local")) {
			driver.get(prop.getProperty("GhanaWebConsulateLocalURL"));	
			//driver.get(prop.getProperty("GhanaWebURL"));
		}	
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameCN"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordCN"));
		highAndConsulateLoginPage.clickOnLoginButton();
		System.out.println( "applicationID CN==>" +applicationID);

	} 


	@Test(priority = 7 , description = "This test will approve the application from CN")
	public void getApproveFromCN() throws InterruptedException{
		TestUtil.clickOnElement();
		applicantDashBoardPage.clickOnDocumentVeri();
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.clickOnApprove();
		cNDocumentVerificaton.clickOnConfirmFromApprove();
		Thread.sleep(3000);
		TestUtil.toCloseNewTab();
		TestUtil.toSwitchBetweenWindows(0);
		Thread.sleep(3000);
	}
	
	@Test(priority = 8, description = "This test will verify login functinality of HighCommission with valid creadentials and click on Login button")
	public void loginIntoHighCommission() throws InterruptedException, IOException {
		Thread.sleep(3000);	
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);	
		if (prop.getProperty("server").equalsIgnoreCase("Global")) {
			driver.get(prop.getProperty("GhanaWebConsulateGlobalURL"));				 
		} else if (prop.getProperty("server").equalsIgnoreCase("Local")) {
			driver.get(prop.getProperty("GhanaWebConsulateLocalURL"));	
			//driver.get(prop.getProperty("GhanaWebURL"));
		}
		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(19, 1, 0), "Consulate login page is not displayed");
		TestUtil.writeStringValue(19, 1, 1);
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameHCD"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordHCD"));
		TestUtil.writeStringValue(19, 2, 1);
		highAndConsulateLoginPage.clickOnLoginButton();
				
	}
	
	@Test(priority=9, description = "This test will verify the title of HighCommission page after login" )
	public void verifHighCommissionPageTitle() throws IOException, InterruptedException{
		Assert.assertEquals(		
				hCDDashboardPage.titleofHCDDashBoard(), TestUtil.readDataFromExcellString(19, 3, 0),
				"We are not navigate to High Commission dashboard page after enetering valid creadentials");
		TestUtil.writeStringValue(19, 3, 1);
	}
	@Test(priority = 10, description = "This test will verify we navigated to HCDGeneral Verification page upon cliclking on New Application" )
	public void clickOnNewApplication() throws InterruptedException, IOException {
		Assert.assertEquals(hCDDashboardPage.bucketNameInHCD(), TestUtil.readDataFromExcellString(5, 10, 0),
				"Application is not mumbai bucket as we provided the visa location as mumbai");	
		TestUtil.writeStringValue(19, 4, 1);
		Assert.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");				
		TestUtil.clickOnElement();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"We are not navigate to HCDGeneral Verification page upon clicking on New Application from HCD Dashboard");
		TestUtil.writeStringValue(20, 1, 1);
	}
	
	@Test(priority = 11, description = "Here we are getting text from Applicant Information and comparing with Applicant filed data")
	public void getTextFromApplicantInformation() throws InterruptedException, IOException {
		Thread.sleep(2000);
	/*//	hCDDocumentVerificationPage.previousButtonFromDocument();
		String value  = hCDApplicantInfoPage.getTextFullName().trim();
	System.out.println("valuevaluevalue=>" +value);
		System.out.println("Text from HCD==>"  +hCDApplicantInfoPage.getTextFullName());
		System.out.println("Text From Applicant++" +firstName + " " +lastName);*/
	
		Assert.assertEquals(hCDApplicantInfoPage.getTextVisaFee(), (TestUtil.readDataFromExcellString(5, 9, 0)),
				"Provided and Get Visa fees are not matched in HCD");
		TestUtil.writeStringValue(20, 2, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextFullName(), (TestUtil.readDataFromExcellString(6, 5, 0) + " " + TestUtil.readDataFromExcellString(6, 7, 0)),
				"Provided and Get firstName are not matched in HCD");
		TestUtil.writeStringValue(20, 3, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextPassportNumberHCD(), (passportNumber),
				"Provided and Get Passport Number are not matched");
		TestUtil.writeStringValue(20, 4, 1);		
		Assert.assertEquals(hCDApplicantInfoPage.getTextDateOfBirthHCD(), TestUtil.readDataFromExcellString(5, 14, 0),
				"Provided and Get Birth Date  are not matched");
		TestUtil.writeStringValue(20, 5, 1);		
		Assert.assertEquals(hCDApplicantInfoPage.getTextPassportDateOfIssueHCD(), TestUtil.readDataFromExcellString(6, 9, 0),
				"Provided and Get Passport Issued Date are not matched");
		TestUtil.writeStringValue(20, 6, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextPassportExpiryDateHCD(), TestUtil.readDataFromExcellString(6, 10, 0),
				"Provided and Get Passport Expiry Date are not matched");
		TestUtil.writeStringValue(20, 7, 1);
	}
	
	@Test(priority = 12, description = "Here we are getting text from Address Information and comparing with Applicant filed data")
	public void getTextFromAddressInformation() throws InterruptedException, IOException {
		
		Assert.assertEquals(hCDApplicantInfoPage.getTextFormerNationalityHCD(), (TestUtil.readDataFromExcellString(7, 3, 0)),
				"Provided and Get Former Nationality are not matched in HCD");
		TestUtil.writeStringValue(20, 8, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextNationalityHCD(), (TestUtil.readDataFromExcellString(5, 7, 0)),
				"Provided and Get Nationality are not matched in HCD");
		TestUtil.writeStringValue(20, 9, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextEmailIdHCD(), TestUtil.readDataFromExcellString(5, 12, 0),
				"Provided and Get firstName are not matched in HCD");
		TestUtil.writeStringValue(20, 11, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextPhoneNumberHCD(), TestUtil.readDataFromExcellString(5, 11, 0),
				"Provided and Get Passport Number are not matched in HCD");
		TestUtil.writeStringValue(20, 12, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextLandmarkHCD(), TestUtil.readDataFromExcellString(7, 6, 0),
				"Provided and Get Landmark are not matched in HCD");
		TestUtil.writeStringValue(20, 13, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextAddressLine1HCD(), (TestUtil.readDataFromExcellString(7, 4, 0) + "," + TestUtil.readDataFromExcellString(7, 5, 0)),
				"Provided and Get Birth Date  are not matched");
		TestUtil.writeStringValue(20, 14, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextcityAndPinHCD(), (TestUtil.readDataFromExcellString(7, 8, 0) + "," + TestUtil.readDataFromExcellString(7, 7, 0)),
				"Provided and Get Birth Place  are not matched");
		TestUtil.writeStringValue(20, 15, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextEm_state(), (TestUtil.readDataFromExcellString(7, 9, 0)),
				"Provided and Get Passport Issued Date are not matched");
		TestUtil.writeStringValue(20, 16, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextEm_country(), (TestUtil.readDataFromExcellString(7, 10, 0)),
				"Provided and Get Passport Expiry Date are not matched");
		TestUtil.writeStringValue(20, 17, 1);
	
	
	}

	@Test(priority = 13, description = "Here we are getting text from Travel Information and comparing with Applicant filed data")
	public void getTextFromTravelInformation() throws InterruptedException, IOException {
		
		
		Assert.assertEquals(hCDApplicantInfoPage.getTextDateOfDepartureHCD(), (TestUtil.readDataFromExcellString(9, 3, 0)),
				"Provided and Get Data Of Departure are not matched");
		TestUtil.writeStringValue(20, 19, 1);	
		Assert.assertEquals(hCDApplicantInfoPage.getTextTicketNumberHCD(), (TestUtil.readDataFromExcellString(9, 5, 0)),
				"Provided and Get Ticket number is not matched");
		TestUtil.writeStringValue(20, 20, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextTravellingByHCD(), (TestUtil.readDataFromExcellString(9, 6, 0)),
				"Provided and Get Travel By is not matched");
		TestUtil.writeStringValue(20, 21, 1);		
		Assert.assertEquals(hCDApplicantInfoPage.getTextPurposeToVisitHCD(), (TestUtil.readDataFromExcellString(9, 7, 0)),
				"Provided and Get Purpose of Visit is not matched");
		TestUtil.writeStringValue(20, 22, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefName1HCD(), TestUtil.readDataFromExcellString(9, 8, 0)+" "+(TestUtil.readDataFromExcellString(9, 9, 0)),
				"Provided and Get firstName are not matched");
		TestUtil.writeStringValue(20, 28, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefContact1HCD(), TestUtil.readDataFromExcellString(9, 15, 0),
				"Provided and Get Passport Number are not matched");
		TestUtil.writeStringValue(20, 23, 1);
		System.out.println("Text from HCD==>"  +hCDApplicantInfoPage.getTextRefAddress1HCD());
		System.out.println("Text From Applicant++" +primaryAddress + "," + primaryCity + "," + primaryState + "," + primaryCountry + "," + primaryPinCode);	
		
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefAddress1HCD(),
				TestUtil.readDataFromExcellString(9, 10, 0) + "," + TestUtil.readDataFromExcellString(9, 12, 0) + "," + TestUtil.readDataFromExcellString(9, 13, 0) + "," + TestUtil.readDataFromExcellString(9, 14, 0) + "," + TestUtil.readDataFromExcellString(9, 11, 0),
				"Provided and Get Landmark are not matched 1");
		TestUtil.writeStringValue(20, 24, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefCity1HCD(), (TestUtil.readDataFromExcellString(9, 12, 0) + "," + TestUtil.readDataFromExcellString(9, 11, 0)),
				"Provided and Get Birth Place  are not matched");
		TestUtil.writeStringValue(20, 25, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefState1HCD(), TestUtil.readDataFromExcellString(9, 13, 0),
				"Provided and Get Passport Issued Date are not matched");
		TestUtil.writeStringValue(20, 26, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefCountry1HCD(), (TestUtil.readDataFromExcellString(9, 14, 0)),
				"Provided and Get Passport Expiry Date are not matched");
		TestUtil.writeStringValue(20, 27, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefName2HCD(), (TestUtil.readDataFromExcellString(9, 16, 0) + " " + TestUtil.readDataFromExcellString(9, 17, 0)),
				"Provided and Get firstName are not matched");
		TestUtil.writeStringValue(20, 29, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefContact2HCD(),(TestUtil.readDataFromExcellString(9, 23, 0)),
				"Provided and Get Passport Number are not matched");
		TestUtil.writeStringValue(20, 30, 1);
		Assert.assertEquals(
				hCDApplicantInfoPage.getTextRefAddress2HCD(), (TestUtil.readDataFromExcellString(9, 18, 0) + "," + TestUtil.readDataFromExcellString(9, 20, 0) + "," + TestUtil.readDataFromExcellString(9, 21, 0)
						+ "," + TestUtil.readDataFromExcellString(9, 22, 0) + "," + TestUtil.readDataFromExcellString(9, 19, 0)),
				"Provided and Get Landmark are not matched 2");
		TestUtil.writeStringValue(20, 31, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefCity2HCD(), (TestUtil.readDataFromExcellString(9, 20, 0) + "," + TestUtil.readDataFromExcellString(9, 19, 0)),
				"Provided and Get Birth Place  are not matched");
		TestUtil.writeStringValue(20, 32, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextRefState2HCD(), (TestUtil.readDataFromExcellString(9, 21, 0)),
				"Provided and Get Passport Issued Date are not matched");
		TestUtil.writeStringValue(20, 33, 1);
		Assert.assertEquals(hCDApplicantInfoPage.getTextrefCountry2HCD(), (TestUtil.readDataFromExcellString(9, 14, 0)),
				"Provided and Get Passport Expiry Date are not matched");
		TestUtil.writeStringValue(20, 34, 1);
		
	}
	
	@Test(priority = 14, description = "click On Document verification and verified the title of Document verification page")
	public void verfiyTitleOfCNDocumentVerificatonPage() throws InterruptedException, IOException {
		hCDGeneralVerificationPage.clickOnDocumentVeri();
		Assert.assertEquals(hCDGeneralVerificationPage.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(20, 35, 0),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		TestUtil.writeStringValue(20, 35, 1);
	}
	
	@Test(priority = 15, description = "This test will verify whether we navigate to applicant info page upon clicking on previous button from Document verification page")
	public void clickOnPreviousButtonAndVerifyTitleApplicantInformation() throws InterruptedException, IOException {
		hCDDocumentVerificationPage.previousButtonFromDocument();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"We are not navigate to HCDGeneral Verification page upon clicking on Previous Button from Applicant Information");
		TestUtil.writeStringValue(20, 36, 1);
	}
	@Test(priority = 16, description = "This test will verify whether we navigate to Document verification page upon clicking on next button from applicant info page ")
	public void clickOnNextButtonAndVerifyTitleDocumentVerifi() throws InterruptedException, IOException {
		hCDGeneralVerificationPage.clickOnnNxtButton();
		Assert.assertEquals(hCDGeneralVerificationPage.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(20, 35, 0), "We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		TestUtil.writeStringValue(20, 37, 1);
	
	}

	@Test(priority = 17 , description = "This test will verify whether check boxes is selected or not on Document verification")
	public void selectAllCheckBoxAndVerify() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		hCDDocumentVerificationPage.selectAllCheckBoxes();
		hCDDocumentVerificationPage.verifyAllCheckBox();
		System.out.println("selectedBoxDoc" +selectedBoxDocAll);
		Assert.assertTrue(selectedBoxDocAll,
				"Check Boxes is not selected upon clicking on [Select All Check] only select all button from Document Verification page");		
		TestUtil.writeStringValue(21, 1, 1);
		Assert.assertTrue(selectedCheckBoxOnDocSingle,
				"All check Boxes is not selected upon clicking on [Select All Check] from Document Verification page");
		TestUtil.writeStringValue(21, 2, 1);
	}
	@Test(priority = 18, description = "This test will verify whether check boxes is selected (one by one)or not on Document verification")
	public void selectOneByOneCheckBoxAndVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hCDDocumentVerificationPage.selectAllCheckBoxes();
		hCDDocumentVerificationPage.selectOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		hCDDocumentVerificationPage.verifyOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		Assert.assertTrue(selectedCheckBoxOnDocSingle,
				"Check Boxes is not selected upon clicking on [One By One Check] from Document Verification page");
	}

		@Test(priority = 19, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
		public void clickOnApproveAndVerifyPopText() throws InterruptedException, IOException {
			hCDDocumentVerificationPage.clickOnApprove();
			Assert.assertEquals(hCDDocumentVerificationPage.getTextFromAcceptConfirmationPop(), TestUtil.readDataFromExcellString(20, 35, 0),
					"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
			TestUtil.writeStringValue(21, 3, 1);
			hCDDocumentVerificationPage.clickOnCancelFromApprove();
			Assert.assertEquals(hCDDocumentVerificationPage.titleOfCNDocumentVerificatonPage(),  TestUtil.readDataFromExcellString(20, 35, 0),
					"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
			TestUtil.writeStringValue(21, 4, 1);
		}

		@Test(priority = 20, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
		public void clickOnApproveAndVerifyPopText1() throws InterruptedException, IOException {
			Thread.sleep(3000);
			hCDDocumentVerificationPage.clickOnApprove();
			hCDDocumentVerificationPage.clickOnCloseApprove();
			Assert.assertEquals(hCDDocumentVerificationPage.titleOfCNDocumentVerificatonPage(),  TestUtil.readDataFromExcellString(20, 35, 0),
					"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
			TestUtil.writeStringValue(21, 5, 1);
			
		}
		@Test(priority =21, description = "Application is verified and approved")
		public void passComment() throws IOException, InterruptedException {
			hCDDocumentVerificationPage.passComment(TestUtil.readDataFromExcellString(21, 6, 0));
			hCDDocumentVerificationPage.addCooment();
			hCDDocumentVerificationPage.getTextFromAddedComment();
			Assert.assertEquals(hCDDocumentVerificationPage.getTextFromAddedComment(), TestUtil.readDataFromExcellString(21, 6, 0),
					"Latest passed comment is not matched after getting text from comment section");
		}
	
	@Test(priority = 22, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void approveApplication() throws InterruptedException, IOException {
		hCDDocumentVerificationPage.selectAllCheckBoxes();	
		System.out.println("approveApplication");
		hCDDocumentVerificationPage.clickOnApprove();
		hCDDocumentVerificationPage.getTextFromApproveButtonPop();
		hCDDocumentVerificationPage.clickOnConfirmFromApprove();
		System.out.println("approveApplication1");
		Assert.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), TestUtil.readDataFromExcellString(19, 3, 0),
				"We are not navigate to High Commission dashboard page after enetering valid creadentials");
		TestUtil.writeStringValue(21, 7, 1);	
	}
	@Test(priority = 23, description = "This test will verify Approved application by HCD Whether it is in Approved Bucket in HCD")
	public void verifyApprovedApplicaIsInApproveBucketHCD() throws InterruptedException, IOException {
		Thread.sleep(3000);	
		System.out.println("getTextFromApproveFromHCD==>" +getTextFromApproveFromHCD);
		System.out.println("hCDDashboardPage.getTextApprovedApplicationsBucket()==>" +hCDDashboardPage.getTextApprovedApplicationsBucket());
		hCDDocumentVerificationPage.getTextconfirmFromApproveHCD();
		Assert.assertEquals(hCDDashboardPage.getTextApprovedApplicationsBucket(), getTextFromApproveFromHCD,
				"We are not in Approve Application bucket to check the application is present after approved by HCD");	
		TestUtil.writeStringValue(21, 8, 1);	
		Assert.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"Application is not matched with each other so it did not click on Application");
		TestUtil.clickOnElement();
		TestUtil.writeStringValue(21, 9, 1);	
	//	TestUtil.toCloseNewTab();
		
	}
	@Test(priority = 24, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentOpens() throws InterruptedException, IOException {
		Thread.sleep(3000);
		hCDDashboardPage.getTextConfirmationPopApproveBucket();
		System.out.println("Confirmation popup==>" +hCDDashboardPage.getTextConfirmationPopApproveBucket());
		Assert.assertEquals(hCDDashboardPage.getTextConfirmationPopApproveBucket(), TestUtil.readDataFromExcellString(21, 10, 0),
				"Confirmation popup is not displayed upon clicking on Application which is sent to Approve Bucket");
		TestUtil.writeStringValue(21, 10, 1);	
		System.out.println("consulatedashBoardPage.textFromPop1PopApplicationSentToHCD();==>" +consulatedashBoardPage.textFromPop1PopApplicationSentToHCD());
		hCDDashboardPage.clickOnOpenButtonFromApproveHCDBucket();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		TestUtil.writeStringValue(21, 11, 1);	
		hCDApplicantInfoPage.clickOnCancelButton();	
		Assert.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), TestUtil.readDataFromExcellString(19, 3, 0),
				"We are not navigate to HCD dashboard page after clicking on back button from Applicant Dashboard at HCD");
		TestUtil.writeStringValue(21, 12, 1);
		
	}
	
	@Test(priority = 25, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyCanceAndCrossButton() throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);
		hCDDashboardPage.crossButtonPopApproveBucket();
		Assert.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), TestUtil.readDataFromExcellString(19, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		TestUtil.writeStringValue(21, 13, 1);
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);		
		hCDDashboardPage.cancelButtonPopApproveBucket();	
		Assert.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), TestUtil.readDataFromExcellString(19, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		TestUtil.writeStringValue(21, 14, 1);
		System.out.println("2222");
		System.out.println("Passed");	
		TestUtil.toCloseNewTab();	
	}
	
	@Test(priority = 26, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
	public void loginIntoConsulate() throws InterruptedException {
		Thread.sleep(5000);		
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);
		if (prop.getProperty("server").equalsIgnoreCase("Global")) {
			driver.get(prop.getProperty("GhanaWebConsulateGlobalURL"));				 
		} else if (prop.getProperty("server").equalsIgnoreCase("Local")) {
			driver.get(prop.getProperty("GhanaWebConsulateLocalURL"));	
			//driver.get(prop.getProperty("GhanaWebURL"));
		}
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameCN"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordCN"));
		highAndConsulateLoginPage.clickOnLoginButton();
		System.out.println( "applicationIDCN==>" +applicationID);

	}
	@Test(priority = 27, description = "This test will verify whether application is sent to CN side from HCD side and application present in Approve Bucket")
	public void verifyApproveBucktInCN() throws InterruptedException, IOException{	
		hCDDocumentVerificationPage.getTextconfirmFromApproveHCD();
		softAssertion.assertEquals(consulatedashBoardPage.textApprovedApplicationsBucket(), getTextFromApproveFromHCD,
				"We are not in Approve Application bucket to check the application is present after approved by HCD");	
		TestUtil.clickOnElement();
		TestUtil.writeStringValue(21, 14, 1);
		System.out.println("Application is approved by HCD");

	}
	
	
}


