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

public class HighCommissionPageRejectTest extends ConsulatePageApproveTest{

SoftAssert softAssertion = new SoftAssert();
	
	public HighCommissionPageRejectTest() throws IOException, InterruptedException {
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
	@Test(priority = 109, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnConfirmedAirTicketWindowClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnConfirmAirTicket();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfConfirmedAirTicketWindow(), prop.getProperty("confirmedairticketTitle"),
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.closeButtonToCloseWindow1();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(),  prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("1");
	}	

	@Test(priority = 110, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page  ")
	public void clickOnConfirmedAirTicketWindow() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnConfirmAirTicket();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfConfirmedAirTicketWindow(), prop.getProperty("confirmedairticketTitle"),
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(),  prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("2");
	}

	@Test(priority = 111, description = "click On Photo and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOnPhotoClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnPhoto();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfRecentPhotoWindow(), prop.getProperty("RecentpassportsizephotoTitle"),
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow2();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(),  prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("4");
	}

	@Test(priority = 112, description = "click On Photo and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOnPhoto() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnPhoto();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfRecentPhotoWindow(), prop.getProperty("RecentpassportsizephotoTitle"),
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("3");
	}

	@Test(priority = 113, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnYellowFevervaccination();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfYellowFeverWindow(), prop.getProperty("yellowfevervaccinationTitle"),
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow3();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 114, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnYellowFevervaccination() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnYellowFevervaccination();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfYellowFeverWindow(), prop.getProperty("yellowfevervaccinationTitle"),
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 115, description = "click On Covering Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnCoveringLetterClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnCoveringLetter();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfCoveringLetterWindow(), prop.getProperty("coveringletterTitle"),
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow4();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 116, description = "click On Covering Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnCoveringLetter() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnCoveringLetter();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfCoveringLetterWindow(), prop.getProperty("coveringletterTitle"),
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}


	@Test(priority = 117, description = "click On Id Proof Reference and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnIdProofReferenceClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnIdProofReference();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfIDProofOfReferenceWindow(), prop.getProperty("iDproofofreferenceTitle"),
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.closeButtonToCloseWindow6();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 118, description = "click On Id Proof Reference and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnIdProofReference() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnIdProofReference();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfIDProofOfReferenceWindow(), prop.getProperty("iDproofofreferenceTitle"),
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 119, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetterClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfOriginalInvitationLetterWindow(),
				prop.getProperty("originalinvitationletterTitle"),
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow7();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 120, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetter() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfOriginalInvitationLetterWindow(),
				prop.getProperty("originalinvitationletterTitle"),
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 121, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaClose() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfProofOfTransitValidVisaWindow(),
				prop.getProperty("proofoftransitvalidvisaTitle"),
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		hCDDocumentVerificationPage.closeButtonToCloseWindow8();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		softAssertion.assertAll();
	}

	@Test(priority = 122, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisa() throws InterruptedException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(hCDDocumentVerificationPage.titleOfProofOfTransitValidVisaWindow(),
				prop.getProperty("proofoftransitvalidvisaTitle"),
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("hCDGeneralVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
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

	@Test(priority = 127, description = "Click On Reject And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText() throws InterruptedException {
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnReject();
		softAssertion.assertEquals(hCDDocumentVerificationPage.textFromRejectConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		hCDDocumentVerificationPage.clickOnCancelFromRejectPop();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(),  prop.getProperty("HCDDoccumentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority =128, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText1() throws InterruptedException {
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnReject();
		softAssertion.assertEquals(hCDDocumentVerificationPage.textFromRejectConfirmationPop(), prop.getProperty("confirmationFromRejectAndApprovePopup"),
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnCloseFromRejectConfir();
		softAssertion.assertEquals(hCDDocumentVerificationPage.getTextDocumentVerification(), prop.getProperty("HCDDoccumentVerificationTitle"),
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
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


