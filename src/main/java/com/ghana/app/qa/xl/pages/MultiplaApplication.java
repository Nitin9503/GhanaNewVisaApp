package com.ghana.app.qa.xl.pages;



import static com.ghana.app.qa.testdata.ConstantVariable.month;
import static com.ghana.app.qa.testdata.ConstantVariable.year;
import static com.ghana.app.qa.util.TestUtil.OSName;
import static com.ghana.app.qa.util.TestUtil.prop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import bsh.util.Util;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.testcases.VisaCategoriesPageTest;
import com.ghana.app.qa.util.*;
public class MultiplaApplication extends VisaCategoriesPageTest {
	
	public MultiplaApplication() throws IOException, InterruptedException {
		super();
		
	}
	public static int rowCount;
	public static XlsReader reader;
	public static int rowNum;
	
 public static void xlsReaderMethod(){
	 if (OSName.equalsIgnoreCase("Mac")) {
			System.out.println("Hello in mac");
		reader = new XlsReader("./src/main/java/com/ghana/app/qa/testdata/GhanaVisaTestData1.xlsx");
	        System.out.println(OSName);
		} else if (OSName.equalsIgnoreCase("Win")) {
			System.out.println("Hello in Win");
			System.out.println(OSName);
			reader = new XlsReader(".\\src\\main\\java\\com\\ghana\\app\\qa\\testdata\\GhanaVisaTestData1.xlsx");
		}
 }
 @Test(priority = 6)
	public static void selectPassPortType() throws InterruptedException, IOException {
		xlsReaderMethod();
		/*homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();*/
		Thread.sleep(2000);
		/*int rowCount2=reader.getRowCount("SignUp");
		for(int i=0; i<=5; i++ ){*/
		int rowCount=reader.getRowCount("SignUp");
		for(rowNum=2; rowNum<=rowCount; rowNum++)
		 {
			   //Get Data for Signup Page
				    String passportType = reader.getCellData("SignUp", "Passport_Type", rowNum); 
				    System.out.println(passportType);
				    String nationalityName = reader.getCellData("SignUp", "Nationality_Name", rowNum);
			        System.out.println(nationalityName);
			        String PoOfArrival = reader.getCellData("SignUp", "PortOf_Arrival", rowNum);
			        System.out.println(PoOfArrival);
			        String VisaFee = reader.getCellData("SignUp", "Visa_Fees", rowNum);
			        System.out.println(VisaFee);
			        String VisaLocatioN = reader.getCellData("SignUp", "Visa_Location", rowNum);
			        System.out.println(VisaLocatioN);
			        String DateBirth = reader.getCellData("SignUp", "Date_Birth", rowNum);
			        System.out.println(DateBirth);
			        String phoneNo = reader.getCellData("SignUp", "phone_No.", rowNum);
			        System.out.println(phoneNo);
			        String emailAddress = reader.getCellData("SignUp", "email_Address", rowNum);
			        System.out.println(emailAddress);
			        
			        signUpXlPage.SelectPassportType(passportType);
			        signUpXlPage.selectNationality(nationalityName);
			        signUpXlPage.selectPortOfArrival(PoOfArrival);
			        signUpXlPage.selectVisaType(VisaFee);
			        Thread.sleep(1000);
			        signUpXlPage.selectVisaLocation("Mumbai");
			       /* Thread.sleep(1000);
			        signUpXlPage.selectDateOfBirth(DateBirth);
			        signUpXlPage.passEmailIdAndPhoneNo(emailAddress, phoneNo );
			        signUpXlPage.clickOnCheckBoxes();
					signUpXlPage.verifyCheckBoxIsSelected();
					signUpXlPage.enterCaptchaField();*/
					//signUpXlPage.continueBtn();
					// signUpXlPage.cancelBtn();
					
					/*//Get Data for Personal Info Page
						 String visafee = reader.getCellData("PersonalInfo", "Visa_fees", rowNum); 
						    System.out.println(visafee);
						    String visaLoc = reader.getCellData("PersonalInfo", "Visa_Location", rowNum);
					        System.out.println(visaLoc);
					        String Fname = reader.getCellData("PersonalInfo", "first_name", rowNum);
					        System.out.println(Fname);
					        String Midname = reader.getCellData("PersonalInfo", "middle_name", rowNum);
					        System.out.println(Midname);
					        String Lname = reader.getCellData("PersonalInfo", "last_name", rowNum);
					        System.out.println(Lname);
					        String Gender = reader.getCellData("PersonalInfo", "gender.", rowNum);
					        System.out.println(Gender);
					        String passptnumber = reader.getCellData("PersonalInfo", "passport_number", rowNum);
					        System.out.println(passptnumber);
					        String passDateIssue = reader.getCellData("PersonalInfo", "passport_date_of_issue", rowNum);
					        System.out.println(passDateIssue);
					        String Birthplace = reader.getCellData("PersonalInfo", "place_of_birth", rowNum);
					        System.out.println(Birthplace);
					        String passDateExpired = reader.getCellData("PersonalInfo", "passport_expiry_date", rowNum);
					        System.out.println(passDateExpired);
					        
					        personalInfoXlPage.SelectvisaFees(visafee);
					        personalInfoXlPage.SelectvisaLocation(visaLoc);
					        personalInfoXlPage.passFirstName(Fname);
					        personalInfoXlPage.passmiddleName(Midname);
					        personalInfoXlPage.passLastName(Lname);
					        personalInfoXlPage.passPassportNumber(passptnumber);
					        personalInfoXlPage.selectPassIssueDate(passDateIssue);
					        personalInfoXlPage.selectPassExpiryDate(passDateExpired);
					        System.out.println(Birthplace);
					        personalInfoXlPage.passPlaceOfBirth(Birthplace);
					        
							//signUpXlPage.cancelBtn();
					        personalInfoXlPage.clickOnSaveAndContinue();
						
				      
				//Get Data for Address Info Page
				  String formernationality = reader.getCellData("AddressInfo", "former_nationality", rowNum); 
					    System.out.println(formernationality);
					    String addressline1 = reader.getCellData("AddressInfo", "address_line1", rowNum);
				        System.out.println(addressline1);
				        String addressline2 = reader.getCellData("AddressInfo", "address_line2", rowNum);
				        System.out.println(addressline2);
				        String landmark = reader.getCellData("AddressInfo", "landmark", rowNum);
				        System.out.println(landmark);
				        String zipcode = reader.getCellData("AddressInfo", "zip_code", rowNum);
				        System.out.println(zipcode);
				        String city = reader.getCellData("AddressInfo", "city", rowNum);
				        System.out.println(city);
				        String state = reader.getCellData("AddressInfo", "state", rowNum);
				        System.out.println(state);
				        String country = reader.getCellData("AddressInfo", "country", rowNum);
				        System.out.println(country);
				        String addresstype = reader.getCellData("AddressInfo", "address_type", rowNum);
				        System.out.println(addresstype);
				        
				       addressInfoXlPage.selectFormerNaitonality(formernationality);
				       addressInfoXlPage.PassAddressInfofield(addressline1, addressline2, landmark, zipcode, city, state, country, addresstype);
				       
						//signUpXlPage.cancelBtn();
				       addressInfoXlPage.clickSaveAndContinuebtn();
				        
				       
				       //Get Data for Emergency Contact Page
				       
				       
				       String eFirstName = reader.getCellData("EmergencyContact", "first_name", rowNum); 
					    System.out.println(eFirstName);
					    String eLastName = reader.getCellData("EmergencyContact", "last_name", rowNum);
				        System.out.println(eLastName);
				        String eContactNo = reader.getCellData("EmergencyContact", "contact_number", rowNum);
				        System.out.println(eContactNo);
				        String relatioN = reader.getCellData("EmergencyContact", "relation", rowNum);
				        System.out.println(relatioN);
				        String professioN = reader.getCellData("EmergencyContact", "profession", rowNum);
				        System.out.println(professioN);
				        String employerName = reader.getCellData("EmergencyContact", "name_of_employer_or_school", rowNum);
				        System.out.println(employerName);
				        String empAddress = reader.getCellData("EmergencyContact", "address_of_employer_or_school", rowNum);
				        System.out.println(empAddress);
				        String pinCode = reader.getCellData("EmergencyContact", "pincode", rowNum);
				        System.out.println(pinCode);
				        String empCity = reader.getCellData("EmergencyContact", "city", rowNum);
				        System.out.println(empCity);
				        String empState = reader.getCellData("EmergencyContact", "state", rowNum);
				        System.out.println(empState);
				        String empCountry = reader.getCellData("EmergencyContact", "country", rowNum);
				        System.out.println(empCountry);
				        String empployerContactNo = reader.getCellData("EmergencyContact", "contact_of_employer_or_school", rowNum);
				        System.out.println(empployerContactNo);
				        
				        emergencyContactXlPage.emergencyContactDetails(eFirstName, eLastName, eContactNo);
				        emergencyContactXlPage.selectRelation(relatioN);
				        emergencyContactXlPage.emergencyProfessionDetails(professioN, employerName, empAddress, pinCode, empCity, empState, empCountry, empployerContactNo);
				        emergencyContactXlPage.clickEmeContinueBtn();
				      
				       
				     //Get Data for Travel info Page
				       
				        String dateofdeparture = reader.getCellData("TravelInfo", "date_of_departure", rowNum);
				        System.out.println(dateofdeparture);
				        Thread.sleep(2000);
				        String roundticketstatus = reader.getCellData("TravelInfo", "round_ticket_status", rowNum);
				        System.out.println(roundticketstatus);
				        String ticketNumber = reader.getCellData("TravelInfo", "ticket_number", rowNum);
				        System.out.println(ticketNumber);
				        String travellingBy = reader.getCellData("TravelInfo", "travelling_by", rowNum);
				        System.out.println(travellingBy);
				        String Purpose = reader.getCellData("TravelInfo", "purpose", rowNum);
				        System.out.println(Purpose);
				        
				        String refFname1 = reader.getCellData("TravelInfo", "ref_Fname1", rowNum);
				        System.out.println(refFname1);
				        String refLname1 = reader.getCellData("TravelInfo", "ref_Lname1", rowNum);
				        System.out.println(refLname1);
				        String refaddress1 = reader.getCellData("TravelInfo", "ref_address1", rowNum);
				        System.out.println(refaddress1);
				        String refzipcode1 = reader.getCellData("TravelInfo", "ref_zipcode1", rowNum);
				        System.out.println(refzipcode1);
				        String refcity1 = reader.getCellData("TravelInfo", "ref_city1", rowNum);
				        System.out.println(refcity1);
				        String refstate1 = reader.getCellData("TravelInfo", "ref_state1", rowNum);
				        System.out.println(refstate1);
				        String refcountry1 = reader.getCellData("TravelInfo", "ref_country1", rowNum);
				        System.out.println(refcountry1);
				        String refcontact1 = reader.getCellData("TravelInfo", "ref_contact1", rowNum);
				        System.out.println(refcontact1);
				        
				        String refFname2 = reader.getCellData("TravelInfo", "ref_Fname2", rowNum);
				        System.out.println(refFname2);
				        String refLname2 = reader.getCellData("TravelInfo", "ref_Lname2", rowNum);
				        System.out.println(refLname2);
				        String refaddress2 = reader.getCellData("TravelInfo", "ref_address2", rowNum);
				        System.out.println(refaddress2);
				        String refzipcode2 = reader.getCellData("TravelInfo", "ref_zipcode2", rowNum);
				        System.out.println(refzipcode2);
				        String refcity2 = reader.getCellData("TravelInfo", "ref_city2", rowNum);
				        System.out.println(refcity2);
				        String refstate2 = reader.getCellData("TravelInfo", "ref_state2", rowNum);
				        System.out.println(refstate2);
				        String refcountry2 = reader.getCellData("TravelInfo", "ref_country2", rowNum);
				        System.out.println(refcountry2);
				        String refcontact2 = reader.getCellData("TravelInfo", "ref_contact2", rowNum);
				        System.out.println(refcontact2);
				    
				       
				        travelInfoXlPage.passDateOfDeparture(dateofdeparture);
				        System.out.println("hii");
				        travelInfoXlPage.clickOnIsApplicantPossessionRoundTicket(roundticketstatus);
				        System.out.println("By");
				        travelInfoXlPage.passTicketNumber(ticketNumber);
				        System.out.println("pass ticket");
				        travelInfoXlPage.clickOnTravelBy(travellingBy);
				        travelInfoXlPage.clickPurpose_of_journey(Purpose);
				        travelInfoXlPage.passPrimaryReferenceDetails(refFname1, refLname1, refaddress1, refzipcode1, refcity1, refstate1, refcountry1, refcontact1);
			            travelInfoXlPage.PassSecondaryRefDetails(refFname2, refLname2, refaddress2, refzipcode2, refcity2, refstate2, refcountry2, refcontact2);
			           travelInfoXlPage.clickOnContinuebutton();  
			            
			          //Get Data for Document info Page
			            
			            uploadDocXlPage.getUploadDoc(); 
			            uploadDocXlPage.clicksaveAndContiBtn();
			            
			            //Get Data for review Doc Page
			            reviewApplicationPage.clickOnContinuebutton();
			            Thread.sleep(2000);
			            visaPaymentPage.clickOnCheckoutBtn();
			            Thread.sleep(2000);
			    		visaPaymentPage.passCardNo();
			    		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
			    		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
			    		visaPaymentPage.passCvvNo();
			    		System.out.println( "verifyClickOnSubmitBtnTest2");
			    		visaPaymentPage.clickOnMakePaymentBtn();
			    		Thread.sleep(2000);
			    		visaPaymentPage.clickOnSubmitbtn();
			    		visaPaymentPage.clickOnOKtbtn();
			    		visaPaymentPage.clickOnDonetbtn();
			            //Get Data for payment page Page
			            visaPaymentPage.clickOnSubmitBtn();
			    		visaPaymentPage.verifyConfirmationPop();
			    		driver.manage().deleteAllCookies();
			    		Thread.sleep(2000);
			    		
			    		System.out.println("home page title   "
			    				+ homePage.validateHomePageTitle());
			    		Assert.assertEquals(homePage.validateHomePageTitle(), "Home",
			    				"given title not match nence it is not navigated to home page");
			            TestUtil.toOpenNewTab();
			            TestUtil.toCloseNewTab();
			            TestUtil.toSwitchBetweenWindows(1);
			            driver.get(prop.getProperty("GhanaWebLocalURL"));
			            Thread.sleep(2000);
			    		homePage.clickOnApplyVisa();
			    		visaCategoriesPage.clickOnVisaType(); */
			 }
			
			 }
 
		   
		 }
	

