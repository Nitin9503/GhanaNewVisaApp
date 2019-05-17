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

public class HighCommissionPageFlagTest extends ConsulatePageApproveTest{

SoftAssert softAssertion = new SoftAssert();
	
	public HighCommissionPageFlagTest() throws IOException, InterruptedException {
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


