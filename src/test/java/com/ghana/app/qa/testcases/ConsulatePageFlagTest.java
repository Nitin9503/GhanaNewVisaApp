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

public class ConsulatePageFlagTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ConsulatePageFlagTest() throws IOException, InterruptedException {
		super();

	}
	
	@Test(priority = 114)
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
		Thread.sleep(2000);
		System.out.println("home page title"
				+ homePage.validateHomePageTitle());
		softAssertion.assertEquals(homePage.validateHomePageTitle(), prop.getProperty("homePageTitle"), "We are not navigate to Home page after payment");
		System.out.println( "applicationID==>visa" +applicationID);
	}	

	@Test(priority = 115, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
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

	@Test(priority = 116 , description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button")
	public void verifyTitleOfConsulateTitle() {
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		// print the value of present app in new application bucket , HCG application and Approve application
		softAssertion.assertAll();
	}  

	@Test(priority = 117, description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button" )
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
	
	@Test(priority = 118)
	public void verfiyTitleOfCNDocumentVerificatonPageCN() throws InterruptedException {
		applicantDashBoardPage.clickOnDocumentVeri();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), prop.getProperty("documentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority =119, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText2CN(){
		cNDocumentVerificaton.clickOnReject();
		cNDocumentVerificaton.passInReason(prop.getProperty("reasonOfFlagCN"));
		cNDocumentVerificaton.getTextFromFlagButtonFromCN();
		cNDocumentVerificaton.clickOnFlagAndReject();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");			
		softAssertion.assertAll();
	
	}
	@Test(priority = 120, description = "This test will verify whether application is sent to HCD side")
	public void verifyApplicaInRejectApplicationBucket() throws InterruptedException {
		// check whether application removed from new application bucket and added in HCG application iin count
		System.out.println("HEllllllllllllllllllllllOO");
		System.out.println("getTextFromApproveButtonFromCN==>" +getTextFromFlagButtonFromCN);
		softAssertion.assertEquals(consulatedashBoardPage.textFlaggedApplicationBucket(), getTextFromFlagButtonFromCN,
				"We are not in Flagged Application bucket to check the application is present after Flagged by CN");		
		TestUtil.clickOnElement();
		consulatedashBoardPage.confirmationPop2ApplicationSentToFlag();
		System.out.println("consulatedashBoardPage.confirmationPop2ApplicationSentToFlag();;==>" +consulatedashBoardPage.confirmationPop2ApplicationSentToFlag());
		softAssertion.assertEquals(consulatedashBoardPage.confirmationPop2ApplicationSentToFlag(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Application which is sent to Flag bucket");
		System.out.println("consulatedashBoardPage.textFromPop1PopApplicationSentToHCD();==>" +consulatedashBoardPage.textFromPop2ApplicationSentToRejected());
		//softAssertion.assertEquals(consulatedashBoardPage.textFromPop1PopApplicationSentToHCD(), "This application is already sent to High Commsion for"
			//	+"confirmation, Are you sure you want to open this?",
			//	"Application is not sent to HCD side(Checked in Bucket) even after approved the application");	
		softAssertion.assertAll();
	}
	
	@Test(priority = 121, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentToRejectBucketOpens() throws InterruptedException {
		consulatedashBoardPage.clickOnOpenButtonFromFlagApplication();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), prop.getProperty("applicantDashboardTitle"),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(),  prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
		
	}
	@Test(priority = 122, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyCanceAndCrossButton() throws InterruptedException {
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);
		consulatedashBoardPage.crossButtonFromFlagBucket();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);		
		consulatedashBoardPage.cancelButtonFromFlag();	
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		System.out.println("2222");
		softAssertion.assertAll();
		System.out.println("Passed");	
		TestUtil.toCloseNewTab();	
	}	
	
	
}
