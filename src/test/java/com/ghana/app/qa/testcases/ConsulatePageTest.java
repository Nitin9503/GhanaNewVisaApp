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

public class ConsulatePageTest extends VisaPaymentPageTest {
	SoftAssert softAssertion = new SoftAssert();

	public ConsulatePageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 57, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
	public void loginIntoConsulate() throws InterruptedException {
		Thread.sleep(5000);		
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);
		driver.get(prop.getProperty("HCDLoginURL"));	
		highAndConsulateLoginPage.passUserName("CN1234");
		highAndConsulateLoginPage.passPassword("1234");
		highAndConsulateLoginPage.clickOnLoginButton();
		System.out.println( "applicationIDCN==>" +applicationID);

	}

	@Test(priority = 58 , description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button")
	public void verifyTitleOfConsulateTitle() {
		System.out.println("HI1");
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
	}  

	@Test(priority = 59 ,description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button" )
	public void clickOnNewApplicationCN() throws InterruptedException {
		System.out.println("HI2");
		Thread.sleep(3000);	
		System.out.println("newApplication==>" +newApplication);
		System.out.println("consulatedashBoardPage.textNewApplicationBucket()==>" +consulatedashBoardPage.textNewApplicationBucket());
		softAssertion.assertEquals(consulatedashBoardPage.textNewApplicationBucket(), newApplication,
				"We are not in new Application bucket");
		
		softAssertion.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		TestUtil.clickOnElement();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 60)
	public void clickOnAddressInforCN() throws InterruptedException {
		System.out.println("HI3");
		applicantDashBoardPage.clickOnAddressInfor();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to CN Address Info page upon clicking on Address Information from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 61)
	public void verfiyTitleOfCNTravelInfoPageCN() throws InterruptedException {
		applicantDashBoardPage.clickOnTravelInfor();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Travel Information from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 62)
	public void verfiyTitleOfCNDocumentVerificatonPageCN() throws InterruptedException {
		applicantDashBoardPage.clickOnDocumentVeri();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification",
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		softAssertion.assertAll();
	}
	@Test(priority = 63, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnApproveCN() throws InterruptedException {
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.clickOnApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		cNDocumentVerificaton.getTextFromApproveButtonFromCN();
		cNDocumentVerificaton.clickOnConfirmFromApprove();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
	}
	@Test(priority = 64, description = "This test will verify whether application is sent to HCD side")
	public void verifyApplicaInHCGApplicationBucket() throws InterruptedException {
	
		System.out.println("getTextFromApproveButtonFromCN==>" +getTextFromApproveButtonFromCN);
		softAssertion.assertEquals(consulatedashBoardPage.textHCGApplicationBucket(), getTextFromApproveButtonFromCN,
				"We are not in HCG Application bucket to check the application is present after approved by CN");		
		TestUtil.clickOnElement();
		consulatedashBoardPage.confirmationPopApplicationSentToHCD();
		System.out.println("consulatedashBoardPage.confirmationPopApplicationSentToHCD();;==>" +consulatedashBoardPage.confirmationPopApplicationSentToHCD());
		softAssertion.assertEquals(consulatedashBoardPage.confirmationPopApplicationSentToHCD(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Application which is sent to HCD side");
		System.out.println("consulatedashBoardPage.textFromPop1PopApplicationSentToHCD();==>" +consulatedashBoardPage.textFromPop1PopApplicationSentToHCD());
		//softAssertion.assertEquals(consulatedashBoardPage.textFromPop1PopApplicationSentToHCD(), "This application is already sent to High Commsion for"
			//	+"confirmation, Are you sure you want to open this?",
			//	"Application is not sent to HCD side(Checked in Bucket) even after approved the application");
	
		softAssertion.assertAll();
	}
	@Test(priority = 65, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentOpens() throws InterruptedException {
		consulatedashBoardPage.openButton1PopApplicationSentToHCD();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		softAssertion.assertAll();
		
	}
	@Test(priority = 66, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyCanceAndCrossButton() throws InterruptedException {
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);
		consulatedashBoardPage.crossButton1PopApplicationSentToHCD();
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);		
		consulatedashBoardPage.cancelButton1PopApplicationSentToHCD();	
		softAssertion.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), "Welcome To Ghana Embassy",
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		System.out.println("2222");
		softAssertion.assertAll();
		System.out.println("Passed");	
		TestUtil.toCloseNewTab();	
	}	
		
		
	
	
	/*@Test(priority =63)
	public void passCommentCN() {
		applicantDashBoardPage.passComment("Verifying your Application");
		applicantDashBoardPage.addCooment();
		applicantDashBoardPage.getTextFromAddedComment();
		softAssertion.assertEquals(applicantDashBoardPage.getTextFromAddedComment(), "Verifying your Application",
				"Latest passed comment is not matched after getting text from comment section");
		softAssertion.assertAll();
	}

	@Test(priority = 64, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnConfirmedAirTicketWindowCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), "Confirmed air ticket",
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow1();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("1");
	}	

	@Test(priority = 65, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page  ")
	public void clickOnConfirmedAirTicketWindowCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), "Confirmed air ticket",
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		softAssertion.assertAll();
		System.out.println("2");
	}

	@Test(priority = 66, description = "click On Photo and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOnPhotoCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), "Recent passport size photo",
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		cNDocumentVerificaton.closeButtonToCloseWindow2();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("4");
	}

	@Test(priority = 67, description = "click On Photo and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOnPhotoCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), "Recent passport size photo",
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		softAssertion.assertAll();
		System.out.println("3");
	}

	@Test(priority = 68, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), "Yellow fever vaccination",
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		cNDocumentVerificaton.closeButtonToCloseWindow3();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 69, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), "Yellow fever vaccination",
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		softAssertion.assertAll();
	}

	@Test(priority = 70, description = "click On Covering Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnCoveringLetterCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), "Covering letter",
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow4();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 71, description = "click On Covering Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnCoveringLetterCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), "Covering letter",
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 72, description = "click On Photo Of Draft and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnPhotoOfDraftCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhotoOfDraft();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfPhotocopyOfDraftWindow(), "Photocopy of draft",
				"Photocopy of draft window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Photocopy of draft)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow5();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Photocopy of draft");
		softAssertion.assertAll();
	}

	@Test(priority = 73, description = "click On Photo Of Draft and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnPhotoOfDraftCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhotoOfDraft();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfPhotocopyOfDraftWindow(), "Photocopy of draft",
				"Photocopy of draft window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Photocopy of draft)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Photocopy of draft");
		softAssertion.assertAll();
	}

	@Test(priority = 74, description = "click On Id Proof Reference and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnIdProofReferenceCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), "ID proof of reference",
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow6();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 75, description = "click On Id Proof Reference and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnIdProofReferenceCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), "ID proof of reference",
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		softAssertion.assertAll();
	}

	@Test(priority = 76, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetterCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(),
				"Original invitation letter",
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		cNDocumentVerificaton.closeButtonToCloseWindow7();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 78, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetterCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnOriginalInvitationLetter();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(),
				"Original invitation letter",
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		softAssertion.assertAll();
	}

	@Test(priority = 79, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaCloseCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(),
				"Proof of transit valid visa",
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		cNDocumentVerificaton.closeButtonToCloseWindow8();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		softAssertion.assertAll();
	}

	@Test(priority = 80, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaCN() throws InterruptedException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(),
				"Proof of transit valid visa",
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		softAssertion.assertAll();
	}

	@Test(priority = 81)
	public void clickOnApplicantInforCN() throws InterruptedException {
		Thread.sleep(2000);
		applicantDashBoardPage.clickOnApplicantInfor();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on Applicant Information from Document Verifcation");
		softAssertion.assertAll();

	}

	@Test(priority = 82)
	public void clickOnNextButtonAndVerifyTitleAddressInformationCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to CN Address Info page upon clicking on Next Button from Applicant Dashboard");
		softAssertion.assertAll();
	}

	@Test(priority = 83)
	public void clickOnNextButtonAndVerifyTitleTravelInformationCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Next Button from Address Information");
		softAssertion.assertAll();
	}

	@Test(priority = 84)
	public void clickOnNextButtonAndVerifyTitleDocumentVerificationCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification",
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");
		softAssertion.assertAll();
	}

	@Test(priority = 85)
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
	@Test(priority = 86)
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
	

	@Test(priority = 87, description = "Click On Approve And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopTextCN() throws InterruptedException {
		cNDocumentVerificaton.clickOnApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		cNDocumentVerificaton.clickOnCancelFromApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 88, description = "Click On Approve And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnApproveAndVerifyPopText1CN() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextFromAcceptConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Approve from Document Verification");
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnCloseApprove();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 89, description = "Click On Reject And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopTextCN() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		softAssertion.assertEquals(cNDocumentVerificaton.textFromRejectConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		cNDocumentVerificaton.clickOnCancelFromRejectPop();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority =90, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText1CN() throws InterruptedException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		softAssertion.assertEquals(cNDocumentVerificaton.textFromRejectConfirmationPop(), "Confirmation",
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnCloseFromRejectConfir();
		softAssertion.assertEquals(cNDocumentVerificaton.getTextDocumentVerification(), "Document Verification",
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		softAssertion.assertAll();
	}

	@Test(priority = 91, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleTravelInformationCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNTravelInfo.titleOfCNTravelInfoPage(), "Travel Information",
				"We are not navigate to Travel Information page upon clicking on Back Button from Document Verification");
		softAssertion.assertAll();

	}

	@Test(priority = 92, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleAddressInformationCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(cNAddressInfo.titleOfCNAddressInfoPage(), "Address Information",
				"We are not navigate to Address Information page upon clicking on Back Button from Travel Information");
		softAssertion.assertAll();

	}

	@Test(priority = 93, description = "Click On Back Button From Document Verification Page And Verify Title of Travel Information")
	public void clickOnBackButtonAndVerifyTitleApplicantInformationCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnBackButton();
		softAssertion.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), "Applicant Dashboard",
				"We are not navigate to Applicant Dashboard page upon clicking on Applicant Information from Document Verifcation");
		softAssertion.assertAll();

	}

	@Test(priority = 94, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Cancel")
	public void clickOnInterviewScheduleAndcancelCN() throws InterruptedException {
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(9000);
		System.out.println("cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		softAssertion.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), "Confirmation",
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		System.out.println("cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview()"
				+ cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview());
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		cNInterviewSchedule.cancelButtonFromInterviewConfirpop();
		softAssertion.assertAll();

	}

	@Test(priority = 95, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Close")
	public void clickOnInterviewScheduleAndCloseCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		softAssertion.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), "Confirmation",
				"We are not navigate to Invterview schedule popup upon clicking on Schedule Interview FromDashBoard");
		Thread.sleep(3000);
		cNInterviewSchedule.closeButtonFromInterviewConfirpop();
		softAssertion.assertAll();

	}

	@Test(priority = 96, description = "Click On Schedule Interview And Verify Title of Set Invterview pop window and Pass Date And Time")
	public void passDateAndTimeInFiledCN() throws InterruptedException {
		Thread.sleep(3000);
		applicantDashBoardPage.clickOnScheduleInterview();
		Thread.sleep(3000);
		softAssertion.assertEquals(cNInterviewSchedule.getTextFromConfrmationPopTitleFromInterview(), "Confirmation",
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
	}

	@Test(priority = 97, description = "Here we are getting text from Applicant Information and comparing with Applicant filed data")
	public void getTextFromApplicantInformationCN() throws InterruptedException {

		softAssertion.assertEquals(applicantDashBoardPage.getTextFullName(), (firstName + " " + lastName),
				"Provided and Get firstName are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextPassportNumber(), (passportNumber),
				"Provided and Get Passport Number are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextDateOfBirth(), (birthDate),
				"Provided and Get Birth Date  are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextBirthPlace(), (birthPlace),
				"Provided and Get Birth Place  are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextDateOfPassportIssue(), (passportIssuedDate),
				"Provided and Get Passport Issued Date are not matched");
		softAssertion.assertEquals(applicantDashBoardPage.getTextPassportExpiryDate(), (passportExpiryDate),
				"Provided and Get Passport Expiry Date are not matched");
		softAssertion.assertAll();
		applicantDashBoardPage.clickOnNextButton();
	}

	@Test(priority = 98, description = "Here we are getting text from Address Information and comparing with Applicant filed data")
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
		applicantDashBoardPage.clickOnNextButton();
	}

	@Test(priority = 99, description = "Here we are getting text from Travel Information and comparing with Applicant filed data")
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
	@Test(priority = 100)
	public void clickOnNextButtonCN() throws InterruptedException {
		applicantDashBoardPage.clickOnNextButton();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), "Document Verification",
				"We are not navigate to Document Verification page upon clicking on Next Button from Travel Information");
		cNDocumentVerificaton.selectAllCheckBoxes();
		softAssertion.assertAll();
	}*/
	
	
	
}
