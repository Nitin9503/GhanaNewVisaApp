package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class TouristVisaAppPage extends TestBase {

	public TouristVisaAppPage() throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	
	}
// elements from signup page
	@FindBy(xpath="h//span[text()='Passport Type']")
	WebElement PassportType;
	@FindBy(xpath="//span[text()='Nationality']")
	WebElement Nationality;
	@FindBy(xpath="//span[text()='Port of Arrival']")
	WebElement PortofArrival;
	@FindBy(xpath="//label[text()='Phone Number']")
	WebElement PhoneNumber;
	@FindBy(xpath="//input[@id='dateofbirth']")
	WebElement dateofbirth;
	@FindBy(xpath="//input[@id='renter_email']")
	WebElement renter_email;
	@FindBy(xpath="//input[@id='useremail']")
	WebElement useremail;
	@FindBy(xpath="//input[@id='customCheck1']")
	WebElement customCheck1;
	@FindBy(xpath="//div[@id='touristVisa']//input[@type='radio' and @value='1']")
	WebElement visaTypeCheckBox;
	@FindBy(xpath="//input[@id='usercaptchacode']")
	WebElement usercaptchacode;
	@FindBy(xpath="//input[@id='customCheck3' and @type='checkbox']")
	WebElement basicDoccheckbox;
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement Cancel;
	@FindBy(xpath="//input[@value='//input[@value='Continue']']")
	WebElement Continue;
	
//elements from personnel information page
	@FindBy(xpath="//div[@id='nav-personal']/div/div[2]/div[1]/div[2]/h6")
	WebElement getApplicationId;
	@FindBy(xpath="//span[text()='Visa Fees']")
	WebElement visaFees;//li[@id='1']
	@FindBy(xpath="//input[@id='firstname']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='lastname']")
	WebElement lastname;
	@FindBy(xpath="//input[@type='radio' and @value='Male']")//gender radio btn change value=Female, Male, Other
	WebElement gender;
	WebElement VisaFees;//li[@id='1']
	@FindBy(xpath="//input[@id='passport_number']")
	WebElement passport_number;
	@FindBy(xpath="//input[@id='date_of_issued']")
	WebElement date_of_issued;
	@FindBy(xpath="//input[@id='passport_expiry']")
	WebElement passport_expiry;
	@FindBy(xpath="//input[@id='birth_place']")
	WebElement birth_place;
	@FindBy(xpath="//form[@id='applicant_personal_info_form']//button[text()='Cancel']")
	WebElement cancel;
	@FindBy(xpath="//button[@id='applicant_personal_info_form_btn']")
	WebElement saveAndContinue;
	
//elements from address information page
	
	@FindBy(xpath="//span[text()='Former Nationality']")
	WebElement FormerNationality;
	@FindBy(xpath="//input[@id='former_nationality_search']")
	WebElement former_nationality_search;
	@FindBy(xpath="//ul[@id='ul_former_nationality']//li[text()='Andorra']")
	WebElement former_nationality_click;
	@FindBy(xpath="//input[@id='nationalityText']")
	WebElement nationalityText;
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='phone_number']")
	WebElement phone_number;
	
	//manage address
	@FindBy(xpath="//input[@id='flat_no']")
	WebElement flat_no;
	@FindBy(xpath="//input[@id='street']")
	WebElement street;
	@FindBy(xpath="//input[@id='landmark']")
	WebElement landmark;
	@FindBy(xpath="//input[@id='pincode']")
	WebElement pincode;
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	@FindBy(xpath="//input[@id='state']")
	WebElement state;
	@FindBy(xpath="//input[@id='mailing_country']")
	WebElement mailing_country;
	@FindBy(xpath="//span[text()='Address Type']")
	WebElement AddressType;
	@FindBy(xpath="//li[text()='Present Address']")
	WebElement PresentAddress;
	@FindBy(xpath="//div[@id='nav-address']//input[@value='Previous']")
	WebElement PreviousBtn;
	@FindBy(xpath="//input[@id='emergency_firstname']")
	WebElement emergency_firstname;
	@FindBy(xpath="//input[@id='emergency_lastname']")
	WebElement emergency_lastname;
	
	
	
	
	
	
	
	
	
	
	
	
	   //give as required present or permanent address
	
	//div[@id='nav-address']//button[text()='Save & Continue']
	
// element id for emergency contact
	
	
	//span[text()='Relationship']
	//ul[@id='img_category_options']/li[text()='Mother']
	//input[@id='emergency_phone_number']
	//input[@id='emergency_profession']
	//input[@id='emergency_employer_name']
	//input[@id='emergency_pincode']
	//input[@id='emergency_city']
	//input[@id='emergency_state']
	//input[@id='emergency_country']
	//input[@id='emergency_employer_phone_number']
	//div[@id='nav-contact']//input[@value='Previous']
	//button[@id='applicant_emergency_contact_form_btn'] //save and continue
	
	
//element id for consulate list of application id
	@FindBy(xpath=".//*[@id='myElement']/div[2]/div/div[4]/ul/li[2]")
	WebElement CNAppliId;
	//h6[text()='New Application']
//Clicking on application from new application tab.
	//input[@id='applicantID' and @value='AP12354']
	//input[@id='exampleInputEmail2' and @value='Employment']
	//input[@id='exampleInputEmail2' and @value='Transit Multiple Visa â¹6500']
	//input[@id='exampleInputEmail2' and @value='Akashay Khanna']
	//input[@id='exampleInputEmail2' and @value='AK7897GH']

	//input[@id='exampleInputEmail2' and @value='28/04/1992']
	//input[@id='exampleInputEmail2' and @value='02/12/2017']
	//input[@id='exampleInputEmail2' and @value='New Delhi']
	//input[@id='exampleInputEmail2' and @value='12/12/2023']
	//button[text()='Back']
	//button[text()='Next']
	//span[text()='Applicant Information']
	//span[text()='Address Information']
	//span[text()='Travel Information']
	//span[text()='Document Verification']
	//span[text()='Schedule Interview']
	//input[@id='txt_comment']

	//button[text()='Add']
	//div[@class='commentText']

	//input[@id='exampleInputEmail2' and @value='Indian']

	//input[@id='exampleInputEmail2' and @value='Indian']
	//input[@id='exampleInputEmail2' and @value='vikas@namet.com']
	//input[@id='exampleInputEmail2' and @value='+91-9850290120']
	//textarea[@id='exampleInputEmail2' and text()='ganesh chawl ,New Delhi']
	//input[@id='exampleInputEmail2' and @value='Mumbai,424004']
	//input[@id='exampleInputEmail2' and @value='Maharastra']
	//input[@id='exampleInputEmail2' and @value='India']
	//input[@id='exampleInputEmail2' and @value='HGD76332']
	//input[@id='exampleInputEmail2' and @value='AirIndia']
	//input[@id='exampleInputEmail2' and @value=' visit Familly']
	//input[@id='exampleInputEmail2' and @value='+233-24 222 3344']
	//input[@id='exampleInputEmail2' and @value='Yaw Kwakye']
	//input[@id='exampleInputEmail2' and @value='Kweku Kwakye']
	//input[@id='exampleInputEmail2' and @value='+233-24 9654 5412']
	//textarea[@id='exampleInputEmail2' and text()='1301 Summer Lee DR Accra.,Acrea,South Ghana,Ghana,GA188']
	//button[text()='Reject']
	//button[text()='Approve']
	//div[@id='rejectModel']//h4[text()='Confirmation' and @class='modal-title']
	//input[@value='Flag Passport']
	//div[@id='rejectModel']//button[text()='Cancel' and @type='button']
	//input[@value='Reject']
	//div[@id='rejectModel']//button[@class='close' and @type='button']
	//input[@value='Cancel']
	//input[@value='Confirm']
	//div[@id='acceptModel']//button[@type='button'][contains(text(),'×')]
	//h6[text()='Reverification']
	//h6[contains(text(), 'Reverification')]
	//h6[contains(text(),'Approved Applications')]
	//h6[contains(text(),'Rejected Application')]
	//h6[contains(text(),'Interview Scheduled')]
	//h6[contains(text(),'HCG Application')]


	//HCG Side==
	//Increment div and li
	//Application id = //div[@id='myElement']//div[@class='simplebar-content']//div[1]//ul[1]//li[1]

	//h6[text()='New Delhi']
	//h6[text()='Mumbai']
	//h6[text()=‘Kolkata’]
	//h6[text()='Interview Scheduled']
	//h6[text()='Approved Applications']
	//h6[text()='Rejected Applications']
	//h6[text()='Flagged Applications']
	//input[@id='applicantID' and @value='AP12354']
	//input[@id='exampleInputEmail2' and @value='Employment']
	//input[@id='exampleInputEmail2' and @value='Transit Multiple Visa â¹6500']
	//input[@id='exampleInputEmail2' and @value='Akashay Khanna']
	//input[@id='exampleInputEmail2' and @value='AK7897GH']

	//input[@id='exampleInputEmail2' and @value='28/04/1992']
	//input[@id='exampleInputEmail2' and @value='02/12/2017']
	//input[@id='exampleInputEmail2' and @value='New Delhi']
	//input[@id='exampleInputEmail2' and @value='12/12/2023']
	//button[text()='Back']
	//button[text()='Next']
	//span[text()='Applicant Information']
	//span[text()='Address Information']
	//span[text()='Travel Information']
	//span[text()='Document Verification']
	//span[text()='Schedule Interview']
	//input[@id='txt_comment']
	//input[@id='exampleInputEmail2' and @value='Indian']
	//input[@id='exampleInputEmail2' and @value='vikas@namet.com']
	//input[@id='exampleInputEmail2' and @value='+91-9850290120']
	//textarea[@id='exampleInputEmail2' and text()='ganesh chawl ,New Delhi']
	//input[@id='exampleInputEmail2' and @value='Mumbai,424004']
	//input[@id='exampleInputEmail2' and @value='Maharastra']
	//input[@id='exampleInputEmail2' and @value='India']
	//input[@id='exampleInputEmail2' and @value='HGD76332']
	//input[@id='exampleInputEmail2' and @value='AirIndia']
	//input[@id='exampleInputEmail2' and @value=' visit Familly']
	//input[@id='exampleInputEmail2' and @value='+233-24 222 3344']
	//input[@id='exampleInputEmail2' and @value='Yaw Kwakye']
	//input[@id='exampleInputEmail2' and @value='Kweku Kwakye']
	//input[@id='exampleInputEmail2' and @value='+233-24 9654 5412']
	//textarea[@id='exampleInputEmail2' and text()='1301 Summer Lee DR Accra.,Acrea,South Ghana,Ghana,GA188']
	//button[text()='Add']
	//div[@class='commentText']

	//input[@id='exampleInputEmail2' and @value='Indian']

	//input[@id='exampleInputEmail2' and @value='Indian']
	//input[@id='exampleInputEmail2' and @value='vikas@namet.com']
	//input[@id='exampleInputEmail2' and @value='+91-9850290120']
	//textarea[@id='exampleInputEmail2' and text()='ganesh chawl ,New Delhi']
	//input[@id='exampleInputEmail2' and @value='Mumbai,424004']
	//input[@id='exampleInputEmail2' and @value='Maharastra']
	//input[@id='exampleInputEmail2' and @value='India']
	//input[@id='exampleInputEmail2' and @value='Nashik,425111']
	//input[@id='exampleInputEmail2' and @value='Jalgaon,455122']
	//input[@id='exampleInputEmail2' and @value='India']
	
	
}
