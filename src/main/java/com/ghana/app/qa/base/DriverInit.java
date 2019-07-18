package com.ghana.app.qa.base;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ghana.app.qa.pages.EmergencyContactPage;
import com.ghana.app.qa.pages.HCDApplicantInfoPage;
import com.ghana.app.qa.pages.HCDDashboardPage;
import com.ghana.app.qa.pages.HCDDocumentVerificationPage;
import com.ghana.app.qa.pages.HCDGeneralVerificationPage;
import com.ghana.app.qa.pages.HCDInterviewSchedule;
import com.ghana.app.qa.pages.ConsulatedashBoardPage;
import com.ghana.app.qa.pages.HighAndConsulateLoginPage;
import com.ghana.app.qa.pages.AddressInfoPage;
import com.ghana.app.qa.pages.HomePage;
import com.ghana.app.qa.pages.ApplicantDashBoardPage;
import com.ghana.app.qa.pages.CNAddressInfo;
import com.ghana.app.qa.pages.CNDocumentVerificaton;
import com.ghana.app.qa.pages.CNInterviewSchedule;
import com.ghana.app.qa.pages.CNTravelInfo;
import com.ghana.app.qa.pages.PartiallyFilledApplicationPage;
import com.ghana.app.qa.pages.PersonalInfoPage;
import com.ghana.app.qa.pages.ReviewApplicationPage;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.pages.TravelInfoPage;
import com.ghana.app.qa.pages.UploadDocPage;
import com.ghana.app.qa.pages.VisaCategoriesPage;
import com.ghana.app.qa.pages.VisaPaymentPage;
import com.ghana.app.qa.pages.VisaStatusPage;
import com.ghana.app.qa.xl.pages.AddressInfoXlPage;
import com.ghana.app.qa.xl.pages.EmergencyContactXlPage;
import com.ghana.app.qa.xl.pages.PersonalInfoXlPage;
import com.ghana.app.qa.xl.pages.SignUpXlPage;
import com.ghana.app.qa.xl.pages.TravelInfoXlPage;
import com.ghana.app.qa.xl.pages.UploadDocXlPage;

public class DriverInit extends TestBase {

	public DriverInit() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static HomePage homePage;
	public static PartiallyFilledApplicationPage partiallyFilledApplicationPage;
	public static VisaStatusPage visaStatusPage;
	public static VisaCategoriesPage visaCategoriesPage;
	public static SignUpPage signUpPage;
	public static SignUpXlPage signUpXlPage;
	public static PersonalInfoPage personalInfoPage;
	public static PersonalInfoXlPage personalInfoXlPage;
	public static AddressInfoPage addressInfoPage;
	public static AddressInfoXlPage addressInfoXlPage;
	public static EmergencyContactPage emergencyContactPage;
	public static EmergencyContactXlPage emergencyContactXlPage;
	public static TravelInfoPage travelInfoPage;
	public static TravelInfoXlPage travelInfoXlPage;
	public static ReviewApplicationPage reviewApplicationPage;
	public static VisaPaymentPage visaPaymentPage;
	public static UploadDocPage uploadDocPage;
	public static UploadDocXlPage uploadDocXlPage;
	
	
	

	// Consulate side
	public static HighAndConsulateLoginPage highAndConsulateLoginPage;
	public static ConsulatedashBoardPage consulatedashBoardPage;
	public static ApplicantDashBoardPage applicantDashBoardPage;
	public static CNAddressInfo cNAddressInfo;
	public static CNTravelInfo cNTravelInfo;
	public static CNDocumentVerificaton cNDocumentVerificaton;
	public static CNInterviewSchedule cNInterviewSchedule;

	//HighCommission side
	public static HCDDashboardPage hCDDashboardPage;	
	public static HCDGeneralVerificationPage hCDGeneralVerificationPage;
	public static HCDApplicantInfoPage hCDApplicantInfoPage;
	public static HCDDocumentVerificationPage hCDDocumentVerificationPage;
	public static HCDInterviewSchedule hCDInterviewSchedule;
	
	


	@BeforeClass
	public void setUp() throws Exception {

		initialization();
		homePage = new HomePage();
		
		visaCategoriesPage = new VisaCategoriesPage();
		signUpPage = new SignUpPage();
		signUpXlPage = new SignUpXlPage();
		personalInfoPage = new PersonalInfoPage();
		personalInfoXlPage = new PersonalInfoXlPage();
        highAndConsulateLoginPage =new HighAndConsulateLoginPage();
		addressInfoPage = new AddressInfoPage();
		addressInfoXlPage = new AddressInfoXlPage();
		emergencyContactPage = new EmergencyContactPage();
		emergencyContactXlPage = new EmergencyContactXlPage();
		travelInfoPage =new TravelInfoPage();
		travelInfoXlPage =new TravelInfoXlPage();
		uploadDocPage = new UploadDocPage();
		uploadDocXlPage = new UploadDocXlPage();
		reviewApplicationPage = new ReviewApplicationPage();
		visaPaymentPage = new VisaPaymentPage();
		partiallyFilledApplicationPage = new PartiallyFilledApplicationPage();
		visaStatusPage = new VisaStatusPage();
		
		highAndConsulateLoginPage = new HighAndConsulateLoginPage();
		consulatedashBoardPage = new ConsulatedashBoardPage();
		applicantDashBoardPage = new ApplicantDashBoardPage();
		cNAddressInfo = new CNAddressInfo();
		cNTravelInfo = new CNTravelInfo();
		cNDocumentVerificaton = new CNDocumentVerificaton();
		cNInterviewSchedule = new CNInterviewSchedule();
		
		//High Commission
		hCDDashboardPage = new HCDDashboardPage();
		hCDGeneralVerificationPage =new HCDGeneralVerificationPage();
		
		hCDApplicantInfoPage = new HCDApplicantInfoPage();
		hCDDocumentVerificationPage = new HCDDocumentVerificationPage();
		hCDInterviewSchedule = new HCDInterviewSchedule(); 
	}
	


	
	  @AfterClass
	  public void tearDown() {
	 
	 // driver.quit();
	  }
	

}
