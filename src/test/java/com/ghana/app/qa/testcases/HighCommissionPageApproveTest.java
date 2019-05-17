package com.ghana.app.qa.testcases;
import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.prop;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class HighCommissionPageApproveTest extends ConsulatePageApproveTest{

SoftAssert softAssertion = new SoftAssert();
	
	public HighCommissionPageApproveTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(priority = 102, description = "This test will verify login functinality of HighCommission with valid creadentials and click on Login button")
	public void loginIntoHighCommission() throws InterruptedException {
		Thread.sleep(5000);
		
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);	
		driver.get(prop.getProperty("HCDLoginURL"));
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameHCD"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordHCD"));
		highAndConsulateLoginPage.clickOnLoginButton();
	}
	
	@Test(priority=103, description = "This test will verify the title of HighCommission page after login" )
	public void verifHighCommissionPageTitle(){
		softAssertion.assertEquals(		
				hCDDashboardPage.titleofHCDDashBoard(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to High Commission dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
	}
	@Test(priority = 104 ,description = "This test will verify we navigated to HCDGeneral Verification page upon cliclking on New Application" )
	public void clickOnNewApplication() throws InterruptedException {
		//hCDDashboardPage.clickOnNewApplication();
		// Get count of application from mumbai consulate and approve bucket and then perform verification
		TestUtil.clickOnElement();
		softAssertion.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), prop.getProperty("hCDGeneralVerificationTitle"),
				"We are not navigate to HCDGeneral Verification page upon clicking on New Application from HCD Dashboard");
		softAssertion.assertAll();
	}
	@Test(priority = 105, description = "Here we are getting text from Applicant Information and comparing with Applicant filed data")
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
	
	@Test(priority = 106, description = "Here we are getting text from Address Information and comparing with Applicant filed data")
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

	@Test(priority = 107, description = "Here we are getting text from Travel Information and comparing with Applicant filed data")
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
	@Test(priority =108, description = "Application is verified and approved")
	public void passComment() {
		hCDDocumentVerificationPage.passComment(prop.getProperty("passCommentFromHCDSide"));
		hCDDocumentVerificationPage.addCooment();
		hCDDocumentVerificationPage.getTextFromAddedComment();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextFromAddedComment(), prop.getProperty("passCommentFromHCDSide"),
				"Latest passed comment is not matched after getting text from comment section");
		softAssertion.assertAll();
	}

	
	@Test(priority = 123 , description = "click On Document verification and verified the title of Document verification page")
	public void verfiyTitleOfCNDocumentVerificatonPage() throws InterruptedException {
		hCDGeneralVerificationPage.clickOnDocumentVeri();
		softAssertion.assertEquals(hCDGeneralVerificationPage.titleOfCNDocumentVerificatonPage(), prop.getProperty("HCDDoccumentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	}
	
	@Test(priority = 124, description = "This test will verify whether we navigate to applicant info page upon clicking on previous button from Document verification page")
	public void clickOnPreviousButtonAndVerifyTitleApplicantInformation() throws InterruptedException {
		hCDDocumentVerificationPage.previousButtonFromDocument();
		softAssertion.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), prop.getProperty("hCDGeneralVerificationTitle"),
				"We are not navigate to HCDGeneral Verification page upon clicking on Previous Button from Applicant Information");
		softAssertion.assertAll();
	}
	@Test(priority = 125, description = "This test will verify whether we navigate to Document verification page upon clicking on next button from applicant info page ")
	public void clickOnNextButtonAndVerifyTitleDocumentVerifi() throws InterruptedException {
		hCDGeneralVerificationPage.clickOnnNxtButton();
		softAssertion.assertEquals(hCDGeneralVerificationPage.titleOfCNDocumentVerificatonPage(), prop.getProperty("HCDDoccumentVerificationTitle"),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	
	}
	
	@Test(priority = 129, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Cancel")
	public void clickOnInterviewScheduleAndcancel() throws InterruptedException {
		hCDGeneralVerificationPage.clickOnScheduleInterview();
		Thread.sleep(9000);
		System.out.println("hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		softAssertion.assertEquals(hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), prop.getProperty("confirmationFromInterviewScheduleTitle"),
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		System.out.println("hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		hCDInterviewSchedule.cancelButtonFromInterviewConfirpop();
		softAssertion.assertAll();

	}

	@Test(priority = 130, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Close")
	public void clickOnInterviewScheduleAndClose() throws InterruptedException {
		Thread.sleep(3000);
		hCDGeneralVerificationPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		softAssertion.assertEquals(hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), prop.getProperty("confirmationFromInterviewScheduleTitle"),
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		Thread.sleep(3000);
		hCDInterviewSchedule.closeButtonFromInterviewConfirpop();
		softAssertion.assertAll();

	}

	@Test(priority = 131, description = "This test will verify validation of interview schedule(Empty field and click on Confirm button)")
	public void validationForDateAndTimeField() throws InterruptedException {
		Thread.sleep(3000);
		hCDGeneralVerificationPage.clickOnScheduleInterview();
		Thread.sleep(3000);		
		softAssertion.assertEquals(hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), prop.getProperty("confirmationFromInterviewScheduleTitle"),
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		hCDInterviewSchedule.confirmButtonFromInterviewConfirpop();	
		softAssertion.assertEquals(hCDInterviewSchedule.getTextFromWarningPopup(), prop.getProperty("interviewScheduleWarning"),
				"Verifying the title text from Warning Popup");
		softAssertion.assertEquals(hCDInterviewSchedule.warningMessage(), prop.getProperty("interviewScheduleWarningTextz"),
				"Verifying the  text from Warning Popup");	
		hCDInterviewSchedule.clickOnOKButton();
		softAssertion.assertAll();
		
	}
		@Test(priority = 131, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Pass Date And Time")
		public void passDateAndTimeInFiled() throws InterruptedException {
		softAssertion.assertEquals(hCDInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), prop.getProperty("confirmationFromInterviewScheduleTitle"),
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		hCDInterviewSchedule.passDate1("04/23/2019");
		hCDInterviewSchedule.passDate2("04/23/2019");
		hCDInterviewSchedule.passDate3("04/23/2019");
		hCDInterviewSchedule.passTime1("12:00PM");
		hCDInterviewSchedule.passTime2("02:00AM");
		hCDInterviewSchedule.passTime3("03:00AM");
		Thread.sleep(3000);
		hCDInterviewSchedule.confirmButtonFromInterviewConfirpop();
		softAssertion.assertAll();
	}
	
	@Test(priority = 126  , description = "This test will verify whether check boxes is selected or not on Document verification")
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
	@Test(priority = 127, description = "This test will verify whether check boxes is selected (one by one)or not on Document verification")
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

		@Test(priority = 128, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
		public void clickOnApproveAndVerifyPopText() throws InterruptedException {
			hCDDocumentVerificationPage.clickOnApprove();
			softAssertion.assertEquals(hCDDocumentVerificationPage.getTextFromAcceptConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
					"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
			hCDDocumentVerificationPage.clickOnCancelFromApprove();
			softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(),  prop.getProperty("HCDDoccumentVerificationTitle"),
					"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
			softAssertion.assertAll();
		}

		@Test(priority = 126, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
		public void clickOnApproveAndVerifyPopText1() throws InterruptedException {
			Thread.sleep(3000);
			hCDDocumentVerificationPage.clickOnApprove();
			softAssertion.assertEquals(hCDDocumentVerificationPage.getTextFromAcceptConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
					"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
			Thread.sleep(3000);
			hCDDocumentVerificationPage.clickOnCloseApprove();
			softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(),  prop.getProperty("HCDDoccumentVerificationTitle"),
					"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		
			softAssertion.assertAll();
		}
	
	
	@Test(priority = 132, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void approveApplication() throws InterruptedException {
		hCDDocumentVerificationPage.selectAllCheckBoxes();	
		System.out.println("approveApplication");
		hCDDocumentVerificationPage.clickOnApprove();
		hCDDocumentVerificationPage.clickOnConfirmFromApprove();
		System.out.println("approveApplication1");
		softAssertion.assertEquals(		
				hCDDashboardPage.titleofHCDDashBoard(), prop.getProperty("titleOfBucketPage"),
				"We are not navigate to High Commission dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
		
		
	}
	@Test(priority = 133, description = "This test will verify Approved application by HCD Whether it is in Approved Bucket in HCD")
	public void verifyApprovedApplicaIsInApproveBucketHCD() throws InterruptedException {
		Thread.sleep(3000);	
		softAssertion.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"Application is not matched with each other so it did not click on Application");
		TestUtil.clickOnElement();
		softAssertion.assertAll();
		TestUtil.toCloseNewTab();
	}
	@Test(priority = 134, description = "This test will verify whether application is in Approve bucket of CN after got approve from HCD")
	public void verifyApplicationInApproveBucketInCN() throws InterruptedException {
		System.out.println("Last");
		Thread.sleep(3000);	
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);	
		driver.get(prop.getProperty("HCDLoginURL"));
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameCN"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordCN"));
		highAndConsulateLoginPage.clickOnLoginButton();
		Thread.sleep(3000);	
		hCDDocumentVerificationPage.getTextFromApprovePopButton();
		System.out.println("getTextFromApproveFromHCD==>" +getTextFromApproveFromHCD);
		System.out.println("consulatedashBoardPage.textApprovedApplicationsBucket()==>" +consulatedashBoardPage.textApprovedApplicationsBucket());
		softAssertion.assertEquals(consulatedashBoardPage.textApprovedApplicationsBucket(), getTextFromApproveFromHCD,
				"Application is not present in Approved Application from HCD ");
		softAssertion.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"Application is not matched with each other so it did not click on Application");
		TestUtil.clickOnElement();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		softAssertion.assertAll();
	}
	
}


