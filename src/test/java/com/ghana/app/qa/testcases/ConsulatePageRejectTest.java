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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.CNAddressInfo;

import static com.ghana.app.qa.util.TestUtil.prop;
import static com.ghana.app.qa.testdata.ConstantVariable.*;

import com.ghana.app.qa.util.TestUtil;

public class ConsulatePageRejectTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ConsulatePageRejectTest() throws IOException, InterruptedException {
		super();

	}
	
	@Test(priority = 1)
	public void signUpAndPayment() throws InterruptedException, IOException {
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
		signUpPage.selectPortOfArrival();
		signUpPage.selectVisaType();
		signUpPage.selectVisaLocation();
		signUpPage.passPhoneNo(phoneNumber);
		signUpPage.passEmailId(emailId);
		signUpPage.passReEmailId(emailId);
		signUpPage.enterCaptchaField();
		// signUpPage.continueBtn();
		// signUpPage.cancelBtn();
		signUpPage.selectDateOfBirth(birthDate);
		// signUpPage.continueBtn();
		signUpPage.continueBtn();

		// ----------------------Personal info page
		// Test----------------------------------//
		Thread.sleep(2000);
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		personalInfoPage.passFirstName(firstName);
		personalInfoPage.passMiddleName(middleName);
		personalInfoPage.passLastName(lastName);
		personalInfoPage.passPassportNumber(passportNumber);
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		softAssertion.assertTrue(genderRadioButton, "Gender Radio button is not selected");
		softAssertion.assertAll();
		personalInfoPage.selectPassIssueDate(passportIssuedDate);
		personalInfoPage.selectPassExpiryDate(passportExpiryDate);
		personalInfoPage.passPlaceOfBirth(birthPlace);
		personalInfoPage.clickOnSaveAndContinue();
		// ----------------------Address Info page
		// Test----------------------------------//
		addressInfoPage.selectFormerNaitonality();
		addressInfoPage.PassAddressInfofield(FlatNo, StreetName, Landmark, pinCode, cityName, stateName, countryName);
		addressInfoPage.clickSaveAndContinuebtn();
		emergencyContactPage.emergencyContactDetails(emerContactName, emerContactSurname, emerPhoneNumber);
		emergencyContactPage.selectRelation();
		emergencyContactPage.emergencyProfessionDetails(profession, employer, employerAddress, emerPincode,
				emerCityName, emerState, emerCountry, emerEmployerPhoneNumber);
		emergencyContactPage.clickEmeContinueBtn();
		travelInfoPage.getTextTravelInfoPagetitle();
	// ----------------------Travel Info page
	// Test----------------------------------//
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		travelInfoPage.passDateOfDeparture(dateOfDeparture);
		travelInfoPage.clickOnContinuebutton();
		travelInfoPage.passTicketNumber(ticketNumber);
		travelInfoPage.clickOnTravelBy();
		travelInfoPage.clickPurpose_of_journey();
		travelInfoPage.passPrimaryRefFirstname(priFirstName);
		travelInfoPage.passPrimaryRefLastname(priLastName);
		travelInfoPage.pass_Primary_ref_address(primaryAddress);
		travelInfoPage.pass_primary_ref_pincode(primaryPinCode);
		travelInfoPage.pass_primary_ref_city(primaryCity);
		travelInfoPage.pass_primary_ref_state(primaryState);
		travelInfoPage.pass_primary_ref_country(primaryCountry);
		travelInfoPage.pass_primary_ref_phone_number(primaryRefrencePhoneNo);
		travelInfoPage.PassSecondaryRefDetails(secFirstName, secLastName, secondaryAddress, secondaryPinCode,
				secondaryCity, secondaryState, secondaryCountry, secondaryRefrencePhoneNo);
		travelInfoPage.clickOnByPhoneCheckbox();
		travelInfoPage.clickOnByTextMessageCheckbox();
		travelInfoPage.clickOnByEmailCheckbox();
		travelInfoPage.passOtherWayToReach("Skype");
		travelInfoPage.clickOnContinuebutton();
		uploadDocPage.getUploadDoc();
		uploadDocPage.clicksaveAndContiBtn();
		reviewApplicationPage.clickOnContinuebutton();
		System.out.println("applicationID==>Revie2" + applicationID);
		//visaPaymentPage.getTextsubmitBtn();	
		visaPaymentPage.clickOnCheckoutBtn();
		visaPaymentPage.passCardNo();
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
		visaPaymentPage.passCvvNo();
		visaPaymentPage.clickOnMakePaymentBtn();
		visaPaymentPage.clickOnSubmitbtn();
		visaPaymentPage.clickOnOKtbtn();
		visaPaymentPage.clickOnDonetbtn();
		//visaPaymentPage.verifyConfirmationPop();
		Thread.sleep(2000);
		System.out.println("home page title"
				+ homePage.validateHomePageTitle());
		softAssertion.assertEquals(homePage.validateHomePageTitle(), prop.getProperty("homePageTitle"), "We are not navigate to Home page after payment");
		System.out.println( "applicationID==>visa" +applicationID);
	}	

	@Test(priority = 2, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
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

	@Test(priority = 3 , description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button")
	public void verifyTitleOfConsulateTitle() {
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		// print the value of present app in new application bucket , HCG application and Approve application
		softAssertion.assertAll();
	}  
	
	@Test(priority = 4)
	public void verfiyTitleOfCNDocumentVerificatonPageCN() throws InterruptedException {
		Thread.sleep(2000);
		TestUtil.clickOnElement();
		applicantDashBoardPage.clickOnDocumentVeri();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), prop.getProperty("documentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	}
	
	
	@Test(priority = 5, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnConfirmedAirTicketWindowCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), prop.getProperty("confirmedairticketTitle"),
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow1();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("1");
	}	

	@Test(priority = 6, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page  ")
	public void clickOnConfirmedAirTicketWindowCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), prop.getProperty("confirmedairticketTitle"),
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("2");
	}

	@Test(priority = 7, description = "click On Photo and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOnPhotoCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), prop.getProperty("RecentpassportsizephotoTitle"),
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		cNDocumentVerificaton.closeButtonToCloseWindow2();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("4");
	}

	@Test(priority = 8, description = "click On Photo and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOnPhotoCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), prop.getProperty("RecentpassportsizephotoTitle"),
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("3");
	}

	@Test(priority = 9, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), prop.getProperty("yellowfevervaccinationTitle"),
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		cNDocumentVerificaton.closeButtonToCloseWindow3();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 10, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), prop.getProperty("yellowfevervaccinationTitle"),
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 11, description = "click On Covering Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnCoveringLetterCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), prop.getProperty("coveringletterTitle"),
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow4();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 12, description = "click On Covering Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnCoveringLetterCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), prop.getProperty("coveringletterTitle"),
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 13, description = "click On Id Proof Reference and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnIdProofReferenceCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), prop.getProperty("iDproofofreferenceTitle"),
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow5();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 14, description = "click On Id Proof Reference and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnIdProofReferenceCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), prop.getProperty("iDproofofreferenceTitle"),
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 15, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetterCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(),
				prop.getProperty("originalinvitationletterTitle"),
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow6();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 16, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetterCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(),
				prop.getProperty("originalinvitationletterTitle"),
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 17, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(),
				prop.getProperty("proofoftransitvalidvisaTitle"),
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		cNDocumentVerificaton.closeButtonToCloseWindow7();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		softAssertion.assertAll();
	}

	@Test(priority = 18, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(),
				prop.getProperty("proofoftransitvalidvisaTitle"),
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		softAssertion.assertAll();
	}


	@Test(priority = 19, description = "Click On Reject And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopTextCN() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		softAssertion.assertEquals(cNDocumentVerificaton.textFromRejectConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		cNDocumentVerificaton.clickOnCancelFromRejectPop();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority =20, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText1CN() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		softAssertion.assertEquals(cNDocumentVerificaton.textFromRejectConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnCloseFromRejectConfir();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		softAssertion.assertAll();
	}
	@Test(priority =21, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText2CN() throws InterruptedException{
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		cNDocumentVerificaton.passInReason(prop.getProperty("reasonOfrejectionCN"));
		cNDocumentVerificaton.getTextFromRejectButtonFromCN();
		cNDocumentVerificaton.clickOnRejectFromRejectConfir();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		
		softAssertion.assertAll();
	
	}
	@Test(priority = 22, description = "This test will verify whether application is sent to HCD side")
	public void verifyApplicaInRejectApplicationBucket() throws InterruptedException {
		// check whether application removed from new application bucket and added in HCG application iin count
		System.out.println("getTextFromApproveButtonFromCN==>" +getTextFromRejectButtonFromCN);
		softAssertion.assertEquals(consulatedashBoardPage.textRejectedApplicationBucket(), getTextFromRejectButtonFromCN,
				"We are not in HCG Application bucket to check the application is present after approved by CN");		
		TestUtil.clickOnElement();
		consulatedashBoardPage.confirmationPop2ApplicationSentToRejected();
		System.out.println("consulatedashBoardPage.confirmationPopApplicationSentToHCD();;==>" +consulatedashBoardPage.confirmationPop2ApplicationSentToRejected());
		softAssertion.assertEquals(consulatedashBoardPage.confirmationPop2ApplicationSentToRejected(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Application which is sent to Reject bucket");
		System.out.println("consulatedashBoardPage.textFromPop1PopApplicationSentToHCD();==>" +consulatedashBoardPage.textFromPop2ApplicationSentToRejected());
		//softAssertion.assertEquals(consulatedashBoardPage.textFromPop1PopApplicationSentToHCD(), "This application is already sent to High Commsion for"
			//	+"confirmation, Are you sure you want to open this?",
			//	"Application is not sent to HCD side(Checked in Bucket) even after approved the application");	
		softAssertion.assertAll();
	}
	
	@Test(priority = 23, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentToRejectBucketOpens() throws InterruptedException {
		consulatedashBoardPage.openButton1PopApplicationSentToopenButtonFromRejectBucketHCD();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), prop.getProperty("applicantDashboardTitle"),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(),  prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
		
	}
	
	
	@Test(priority = 24, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyCanceAndCrossButton() throws InterruptedException {
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);
		consulatedashBoardPage.crossButtonPopApplicationSentToRejectBucket();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);		
		consulatedashBoardPage.cancelButtonRejectBucketCN();	
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		System.out.println("2222");
		softAssertion.assertAll();
		System.out.println("Passed");	
		TestUtil.toCloseNewTab();	
	}	
	
	
}
