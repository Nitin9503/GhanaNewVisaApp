package com.ghana.app.qa.testcases;
import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.prop;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.ghana.app.qa.util.TestUtil.prop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		driver.get(prop.getProperty("HCDLoginURL"));	
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
		TestUtil.toCloseNewTab();
		TestUtil.toSwitchBetweenWindows(0);
		Thread.sleep(3000);
	}
	
	@Test(priority = 8, description = "This test will verify login functinality of HighCommission with valid creadentials and click on Login button")
	public void loginIntoHighCommission() throws InterruptedException {
		Thread.sleep(3000);	
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);	
		driver.get(prop.getProperty("HCDLoginURL"));
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameHCD"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordHCD"));
		highAndConsulateLoginPage.clickOnLoginButton();
	}
	
	@Test(priority=9, description = "This test will verify the title of HighCommission page after login" )
	public void verifHighCommissionPageTitle(){
		softAssertion.assertEquals(		
				hCDDashboardPage.titleofHCDDashBoard(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to High Commission dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
	}
	@Test(priority = 10, description = "This test will verify we navigated to HCDGeneral Verification page upon cliclking on New Application" )
	public void clickOnNewApplication() throws InterruptedException {
		//hCDDashboardPage.clickOnNewApplication();
		// Get count of application from mumbai consulate and approve bucket and then perform verification
		TestUtil.clickOnElement();
		softAssertion.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), prop.getProperty("hCDGeneralVerificationTitle"),
				"We are not navigate to HCDGeneral Verification page upon clicking on New Application from HCD Dashboard");
		softAssertion.assertAll();
	}
	@Test(priority = 11, description = "Here we are getting text from Applicant Information and comparing with Applicant filed data")
	public void getTextFromApplicantInformation() throws InterruptedException {
		Thread.sleep(2000);
	//	hCDDocumentVerificationPage.previousButtonFromDocument();
		String value  = hCDApplicantInfoPage.getTextFullName().trim();
	System.out.println("valuevaluevalue=>" +value);
		System.out.println("Text from HCD==>"  +hCDApplicantInfoPage.getTextFullName());
		System.out.println("Text From Applicant++" +firstName + " " +lastName);
		softAssertion.assertEquals(value, (firstName + " " +lastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextPassportNumberHCD(), (passportNumber),
				"Provided and Get Passport Number are not matched");
		/*softAssertion.assertEquals(hCDApplicantInfoPage.getTextDateOfBirthHCD(), (birthDate),
				"Provided and Get Birth Date  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextPassportDateOfIssueHCD(), (passportIssuedDate),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextPassportExpiryDateHCD(), (passportExpiryDate),
				"Provided and Get Passport Expiry Date are not matched");*/
		softAssertion.assertAll();
	}
	
	@Test(priority = 12, description = "Here we are getting text from Address Information and comparing with Applicant filed data")
	public void getTextFromAddressInformation() throws InterruptedException {

		softAssertion.assertEquals(hCDApplicantInfoPage.getTextEmailIdHCD(), (emailId),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextPhoneNumberHCD(), (phoneNumber),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextLandmarkHCD(), (Landmark),
				"Provided and Get Landmark are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextAddressLine1HCD(), (FlatNo + "," + StreetName),
				"Provided and Get Birth Date  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextcityAndPinHCD(), (cityName + "," + pinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextEm_state(), (stateName),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextEm_country(), (countryName),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
	
	}

	@Test(priority = 13, description = "Here we are getting text from Travel Information and comparing with Applicant filed data")
	public void getTextFromTravelInformation() throws InterruptedException {

		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefName1HCD(), (priFirstName + " " +priLastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefContact1HCD(), (primaryRefrencePhoneNo),
				"Provided and Get Passport Number are not matched");
		System.out.println("Text from HCD==>"  +hCDApplicantInfoPage.getTextRefAddress1HCD());
		System.out.println("Text From Applicant++" +primaryAddress + "," + primaryCity + "," + primaryState + "," + primaryCountry + "," + primaryPinCode);	
		
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefAddress1HCD(),
				(primaryAddress + "," + primaryCity + "," + primaryState + "," + primaryCountry + "," + primaryPinCode),
				"Provided and Get Landmark are not matched 1");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefCity1HCD(), (primaryCity + "," + primaryPinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefState1HCD(), (primaryState),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefCountry1HCD(), (primaryCountry),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefName2HCD(), (secFirstName + " " + secLastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefContact2HCD(), (secondaryRefrencePhoneNo),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(
				hCDApplicantInfoPage.getTextRefAddress2HCD(), (secondaryAddress + "," + secondaryCity + "," + secondaryState
						+ "," + secondaryCountry + "," + secondaryPinCode),
				"Provided and Get Landmark are not matched 2");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefCity2HCD(), (secondaryCity + "," + secondaryPinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextRefState2HCD(), (secondaryState),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(hCDApplicantInfoPage.getTextrefCountry2HCD(), (secondaryCountry),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
		
	}
	
	@Test(priority = 14, description = "click On Document verification and verified the title of Document verification page")
	public void verfiyTitleOfCNDocumentVerificatonPage() throws InterruptedException {
		hCDGeneralVerificationPage.clickOnDocumentVeri();
		softAssertion.assertEquals(hCDGeneralVerificationPage.titleOfCNDocumentVerificatonPage(), prop.getProperty("HCDDoccumentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	}
	
	@Test(priority = 15, description = "This test will verify whether we navigate to applicant info page upon clicking on previous button from Document verification page")
	public void clickOnPreviousButtonAndVerifyTitleApplicantInformation() throws InterruptedException {
		hCDDocumentVerificationPage.previousButtonFromDocument();
		softAssertion.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), prop.getProperty("hCDGeneralVerificationTitle"),
				"We are not navigate to HCDGeneral Verification page upon clicking on Previous Button from Applicant Information");
		softAssertion.assertAll();
	}
	@Test(priority = 16, description = "This test will verify whether we navigate to Document verification page upon clicking on next button from applicant info page ")
	public void clickOnNextButtonAndVerifyTitleDocumentVerifi() throws InterruptedException {
		hCDGeneralVerificationPage.clickOnnNxtButton();
		softAssertion.assertEquals(hCDGeneralVerificationPage.titleOfCNDocumentVerificatonPage(), prop.getProperty("HCDDoccumentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	
	}

	@Test(priority = 17 , description = "This test will verify whether check boxes is selected or not on Document verification")
	public void selectAllCheckBoxAndVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		hCDDocumentVerificationPage.selectAllCheckBoxes();
		hCDDocumentVerificationPage.verifyAllCheckBox();
		System.out.println("selectedBoxDoc" +selectedBoxDocAll);
		softAssertion.assertTrue(selectedBoxDocAll,
				"Check Boxes is not selected upon clicking on [Select All Check] only select all button from Document Verification page");		
		softAssertion.assertTrue(selectedCheckBoxOnDocSingle,
				"All check Boxes is not selected upon clicking on [Select All Check] from Document Verification page");
		softAssertion.assertAll();
	}
	@Test(priority = 18, description = "This test will verify whether check boxes is selected (one by one)or not on Document verification")
	public void selectOneByOneCheckBoxAndVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hCDDocumentVerificationPage.selectAllCheckBoxes();
		hCDDocumentVerificationPage.selectOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		hCDDocumentVerificationPage.verifyOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		softAssertion.assertTrue(selectedCheckBoxOnDocSingle,
				"Check Boxes is not selected upon clicking on [One By One Check] from Document Verification page");
		softAssertion.assertAll();
	}

		@Test(priority = 19, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
		public void clickOnApproveAndVerifyPopText() throws InterruptedException {
			hCDDocumentVerificationPage.clickOnApprove();
			softAssertion.assertEquals(hCDDocumentVerificationPage.getTextFromAcceptConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
					"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
			hCDDocumentVerificationPage.clickOnCancelFromApprove();
			softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfCNDocumentVerificatonPage(),  prop.getProperty("HCDDoccumentVerificationTitle"),
					"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
			softAssertion.assertAll();
		}

		@Test(priority = 20, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
		public void clickOnApproveAndVerifyPopText1() throws InterruptedException {
			Thread.sleep(3000);
			hCDDocumentVerificationPage.clickOnApprove();
			softAssertion.assertEquals(hCDDocumentVerificationPage.getTextFromAcceptConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
					"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
			Thread.sleep(3000);
			hCDDocumentVerificationPage.clickOnCloseApprove();
			softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfCNDocumentVerificatonPage(),  prop.getProperty("HCDDoccumentVerificationTitle"),
					"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		
			softAssertion.assertAll();
		}
		@Test(priority =21, description = "Application is verified and approved")
		public void passComment() {
			hCDDocumentVerificationPage.passComment(prop.getProperty("passCommentFromHCDSide"));
			hCDDocumentVerificationPage.addCooment();
			hCDDocumentVerificationPage.getTextFromAddedComment();
			softAssertion.assertEquals(hCDDocumentVerificationPage.getTextFromAddedComment(), prop.getProperty("passCommentFromHCDSide"),
					"Latest passed comment is not matched after getting text from comment section");
			softAssertion.assertAll();
		}
	
	@Test(priority = 22, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void approveApplication() throws InterruptedException {
		hCDDocumentVerificationPage.selectAllCheckBoxes();	
		System.out.println("approveApplication");
		hCDDocumentVerificationPage.clickOnApprove();
		hCDDocumentVerificationPage.getTextFromApproveButtonPop();
		hCDDocumentVerificationPage.clickOnConfirmFromApprove();
		System.out.println("approveApplication1");
		softAssertion.assertEquals(		
				hCDDashboardPage.titleofHCDDashBoard(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to High Commission dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
			
	}
	@Test(priority = 23, description = "This test will verify Approved application by HCD Whether it is in Approved Bucket in HCD")
	public void verifyApprovedApplicaIsInApproveBucketHCD() throws InterruptedException {
		Thread.sleep(3000);	
		System.out.println("getTextFromApproveFromHCD==>" +getTextFromApproveFromHCD);
		System.out.println("hCDDashboardPage.getTextApprovedApplicationsBucket()==>" +hCDDashboardPage.getTextApprovedApplicationsBucket());
		hCDDocumentVerificationPage.getTextconfirmFromApproveHCD();
		softAssertion.assertEquals(hCDDashboardPage.getTextApprovedApplicationsBucket(), getTextFromApproveFromHCD,
				"We are not in Approve Application bucket to check the application is present after approved by HCD");		
		softAssertion.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"Application is not matched with each other so it did not click on Application");
		TestUtil.clickOnElement();
		softAssertion.assertAll();
	//	TestUtil.toCloseNewTab();
		
	}
	@Test(priority = 24, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentOpens() throws InterruptedException {
		Thread.sleep(3000);
		hCDDashboardPage.getTextConfirmationPopApproveBucket();
		System.out.println("Confirmation popup==>" +hCDDashboardPage.getTextConfirmationPopApproveBucket());
		softAssertion.assertEquals(hCDDashboardPage.getTextConfirmationPopApproveBucket(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Application which is sent to Approve Bucket");
		System.out.println("consulatedashBoardPage.textFromPop1PopApplicationSentToHCD();==>" +consulatedashBoardPage.textFromPop1PopApplicationSentToHCD());
		hCDDashboardPage.clickOnOpenButtonFromApproveHCDBucket();
		softAssertion.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), prop.getProperty("hCDGeneralVerificationTitle"),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		hCDApplicantInfoPage.clickOnBackButton();
		softAssertion.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to HCD dashboard page after clicking on back button from Applicant Dashboard at HCD");
		softAssertion.assertAll();
		
	}
	
	@Test(priority = 25, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyCanceAndCrossButton() throws InterruptedException {
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);
		hCDDashboardPage.crossButtonPopApproveBucket();
		softAssertion.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);		
		hCDDashboardPage.cancelButtonPopApproveBucket();	
		softAssertion.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		System.out.println("2222");
		softAssertion.assertAll();
		System.out.println("Passed");	
		TestUtil.toCloseNewTab();	
	}
	
	@Test(priority = 26, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
	public void loginIntoConsulate() throws InterruptedException {
		Thread.sleep(5000);		
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);
		driver.get(prop.getProperty("HCDLoginURL"));	
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameCN"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordCN"));
		highAndConsulateLoginPage.clickOnLoginButton();
		System.out.println( "applicationIDCN==>" +applicationID);

	}
	@Test(priority = 27, description = "This test will verify whether application is sent to CN side from HCD side and application present in Approve Bucket")
	public void verifyApproveBucktInCN() throws InterruptedException{	
		hCDDocumentVerificationPage.getTextconfirmFromApproveHCD();
		softAssertion.assertEquals(consulatedashBoardPage.textApprovedApplicationsBucket(), getTextFromApproveFromHCD,
				"We are not in Approve Application bucket to check the application is present after approved by HCD");	
		TestUtil.clickOnElement();
		System.out.println("Application is approved by HCD");
		softAssertion.assertAll();
	}
	
	
}


