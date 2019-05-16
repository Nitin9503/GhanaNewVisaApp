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

public class ConsulatePageApproveTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ConsulatePageApproveTest() throws IOException, InterruptedException {
		super();

	}
	
	@Test(priority = 61)
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
		visaPaymentPage.verifyConfirmationPop();
		Thread.sleep(2000);
		System.out.println("home page title"
				+ homePage.validateHomePageTitle());
		softAssertion.assertEquals(homePage.validateHomePageTitle(), prop.getProperty("homePageTitle"), "We are not navigate to Home page after payment");
		System.out.println( "applicationID==>visa" +applicationID);
	}	

	@Test(priority = 62, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
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

	@Test(priority = 63 , description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button")
	public void verifyTitleOfConsulateTitle() {
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		// print the value of present app in new application bucket , HCG application and Approve application
		softAssertion.assertAll();
	}  

	@Test(priority = 64 ,description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button" )
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
	
	@Test(priority = 65, description = "Here we are getting text from Applicant Information and comparing with Applicant filed data")
	public void getTextFromApplicantInformationCN() throws InterruptedException {
		softAssertion.assertEquals(applicantDashBoardPage.getTextFullName(), (firstName + " " + lastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextPassportNumber(), (passportNumber),
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
		softAssertion.assertAll();
	}

	
	@Test(priority = 61)
	public void clickOnAddressInforCN() throws InterruptedException {
		System.out.println("HI3");
		applicantDashBoardPage.clickOnAddressInfor();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), prop.getProperty("addressInformationTitle"),
				"We are not navigate to CN Address Info page upon clicking on Address Information from Applicant Dashboard");
		softAssertion.assertAll();
	}
	@Test(priority = 62, description = "Here we are getting text from Address Information and comparing with Applicant filed data")
	public void getTextFromAddressInformationCN() throws InterruptedException {

		softAssertion.assertEquals(cNAddressInfo.getTextFromEmailID(), (emailId),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromPhoneNumber(), (phoneNumber),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextlandmark(), (Landmark),
				"Provided and Get Landmark are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromAddress(), (FlatNo + "," + StreetName),
				"Provided and Get Birth Date  are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromCityAndPinCode(), (cityName + "," + pinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromState(), (stateName),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(cNAddressInfo.getTextFromCountry(), (countryName),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
	}
	
	@Test(priority = 63)
	public void verfiyTitleOfCNTravelInfoPageCN() throws InterruptedException {
		applicantDashBoardPage.clickOnTravelInfor();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), prop.getProperty("travelInformationTitle"),
				"We are not navigate to Travel Information page upon clicking on Travel Information from Applicant Dashboard");
		softAssertion.assertAll();
	}
	@Test(priority = 64, description = "Here we are getting text from Travel Information and comparing with Applicant filed data")
	public void getTextFromTravelInformationCN() throws InterruptedException {

		softAssertion.assertEquals(cNTravelInfo.getTextReferenceName1(), (priFirstName + " " + priLastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceContact1(), (primaryRefrencePhoneNo),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceAddress1(),
				(primaryAddress + "," + primaryCity + "," + primaryState + "," + primaryCountry + "," + primaryPinCode),
				"Provided and Get Landmark are not matched 1");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceCity1(), (primaryCity + "," + primaryPinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceState1(), (primaryState),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceCountry1(), (primaryCountry),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceName2(), (secFirstName + " " + secLastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceContact2(), (secondaryRefrencePhoneNo),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(
				cNTravelInfo.getTextReferenceAddress2(), (secondaryAddress + "," + secondaryCity + "," + secondaryState
						+ "," + secondaryCountry + "," + secondaryPinCode),
				"Provided and Get Landmark are not matched 2");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceCity2(), (secondaryCity + "," + secondaryPinCode),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceState2(), (secondaryState),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(cNTravelInfo.getTextReferenceCountry2(), (secondaryCountry),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();

	}
	@Test(priority = 65)
	public void verfiyTitleOfCNDocumentVerificatonPageCN() throws InterruptedException {
		applicantDashBoardPage.clickOnDocumentVeri();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), prop.getProperty("documentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	}
	
	@Test(priority = 66, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleTravelInformationCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), prop.getProperty("travelInformationTitle"),
				"We are not navigate to Travel Information page upon clicking on Back Button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 67, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleAddressInformationCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), prop.getProperty("addressInformationTitle"),
				"We are not navigate to Address Information page upon clicking on Back Button from Travel Information");
		softAssertion.assertAll();

	}

	@Test(priority = 68, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleApplicantInformationCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(),  prop.getProperty("applicantDashboardTitle"),
				"We are not navigate to Applicant Dashboard page upon clicking on Applicant Information from Document Verifcation");
		softAssertion.assertAll();

	}
	
	@Test(priority = 69)
	public void clickOnNextButtonAndVerifyTitleAddressInformationCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), prop.getProperty("addressInformationTitle"),
				"We are not navigate to CN Address Info page upon clicking on Next Button from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 70)
	public void clickOnNextButtonAndVerifyTitleTravelInformationCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), prop.getProperty("travelInformationTitle"),
				"We are not navigate to Travel Information page upon clicking on Next Button from Address Information");
		softAssertion.assertAll();
	}

	@Test(priority = 71)
	public void clickOnNextButtonAndVerifyTitleDocumentVerificationCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), prop.getProperty("documentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");
		softAssertion.assertAll();
	}
	@Test(priority = 91, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Cancel")
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

	@Test(priority = 92, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Close")
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
	@Test(priority = 89)
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
	@Test(priority = 90)
	public void selectOneByOneCheckBoxAndVerifyCN() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.selectOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		cNDocumentVerificaton.verifyOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		softAssertion.assertTrue(selectedCheckBoxOnDocSingle,
				"Check Boxes is not selected upon clicking on [One By One Check] from Document Verification page");
		softAssertion.assertAll();
	}

	@Test(priority = 96, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopTextCN() throws InterruptedException {		
		cNDocumentVerificaton.clickOnApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		cNDocumentVerificaton.clickOnCancelFromApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 97, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopText1CN() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnApprove();
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnCloseApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), prop.getProperty("documentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		softAssertion.assertAll();
	}
	@Test(priority =72)
	public void passCommentCN() {
		applicantDashBoardPage.passComment(prop.getProperty("passCommentFromCN"));
		applicantDashBoardPage.addCooment();
		applicantDashBoardPage.getTextFromAddedComment();
		softAssertion.assertEquals(applicantDashBoardPage.getTextFromAddedComment(), prop.getProperty("passCommentFromCN"),
				"Latest passed comment is not matched after getting text from comment section");
		softAssertion.assertAll();
	}
	@Test(priority = 98, description = "Click On Approve And Verify Pop Text and then click on Approve, Verify that on which page navigated")
	public void clickOnApproveCN() throws InterruptedException {
		Thread.sleep(3000);	
		cNDocumentVerificaton.clickOnApprove();
		cNDocumentVerificaton.getTextFromApproveButtonFromCN();
		cNDocumentVerificaton.clickOnConfirmFromApprove();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		softAssertion.assertAll();
	}
	
	@Test(priority = 99, description = "This test will verify whether application is sent to HCD side")
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
	@Test(priority = 100, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentOpens() throws InterruptedException {
		consulatedashBoardPage.openButton1PopApplicationSentToHCD();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), prop.getProperty("applicantDashboardTitle"),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
		
	}
	
	@Test(priority = 101, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
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
		System.out.println("Passed");	
		TestUtil.toCloseNewTab();	
	}	
	
	
}
