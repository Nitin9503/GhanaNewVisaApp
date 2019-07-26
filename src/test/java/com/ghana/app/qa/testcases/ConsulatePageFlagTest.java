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

public class ConsulatePageFlagTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ConsulatePageFlagTest() throws IOException, InterruptedException {
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

	} 


	@Test(priority = 7, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
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
	
	@Test(priority = 10)
	public void verfiyTitleOfCNDocumentVerificatonPageCN() throws InterruptedException, IOException {
		applicantDashBoardPage.clickOnDocumentVeri();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		TestUtil.writeStringValue(14, 36, 1);
	}

	@Test(priority =11, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText2CN() throws IOException, InterruptedException{
		cNDocumentVerificaton.clickOnReject();
		cNDocumentVerificaton.passInReason(TestUtil.readDataFromExcellString(18, 1, 0));
		TestUtil.writeStringValue(18, 1, 1);
		cNDocumentVerificaton.getTextFromFlagButtonFromCN();
		cNDocumentVerificaton.clickOnFlagAndReject();
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");			
		TestUtil.writeStringValue(18, 2, 1);
	}
	@Test(priority = 12, description = "This test will verify whether application is sent to HCD side")
	public void verifyApplicaInRejectApplicationBucket() throws InterruptedException, IOException {
		// check whether application removed from new application bucket and added in HCG application iin count
		System.out.println("HEllllllllllllllllllllllOO");
		System.out.println("getTextFromFlagButtonFromCN==>" +getTextFromFlagButtonFromCN);
		Assert.assertEquals(consulatedashBoardPage.textFlaggedApplicationBucket(), getTextFromFlagButtonFromCN,
				"We are not in Flagged Application bucket to check the application is present after Flagged by CN");		
		TestUtil.clickOnElement();
		consulatedashBoardPage.confirmationPop2ApplicationSentToFlag();
		System.out.println("consulatedashBoardPage.confirmationPop2ApplicationSentToFlag();;==>" +consulatedashBoardPage.confirmationPop2ApplicationSentToFlag());
		Assert.assertEquals(consulatedashBoardPage.confirmationPop2ApplicationSentToFlag(), TestUtil.readDataFromExcellString(17, 22, 0),
				"Confirmation popup is not displayed upon clicking on Application which is sent to Flag bucket");
		TestUtil.writeStringValue(18, 3, 1);
		System.out.println("consulatedashBoardPage.textFromPop1PopApplicationSentToHCD();==>" +consulatedashBoardPage.textFromPop2ApplicationSentToRejected());
		//softAssertion.assertEquals(consulatedashBoardPage.textFromPop1PopApplicationSentToHCD(), "This application is already sent to High Commsion for"
			//	+"confirmation, Are you sure you want to open this?",
			//	"Application is not sent to HCD side(Checked in Bucket) even after approved the application");	
	
	}
	
	@Test(priority = 13, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentToRejectBucketOpens() throws InterruptedException, IOException {
		consulatedashBoardPage.clickOnOpenButtonFromFlagApplication();
		Assert.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), TestUtil.readDataFromExcellString(14, 1, 0),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		TestUtil.writeStringValue(18, 4, 1);
		applicantDashBoardPage.clickOnCancelButton();
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(),  TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		TestUtil.writeStringValue(18, 5, 1);
		
	}
	@Test(priority = 14, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyCanceAndCrossButton() throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);
		consulatedashBoardPage.crossButtonFromFlagBucket();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		Thread.sleep(3000);
		TestUtil.writeStringValue(18, 6, 1);
		TestUtil.clickOnElement();
		Thread.sleep(3000);		
		consulatedashBoardPage.cancelButtonFromFlag();	
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		System.out.println("2222");
		TestUtil.writeStringValue(18, 7, 1);
		System.out.println("Passed");	
		TestUtil.toCloseNewTab();	
	}	
	
	
}
