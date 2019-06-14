package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

public class TravelInfoPage extends TestBase {

	public TravelInfoPage() throws IOException, InterruptedException {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[contains(text(),'Travel Information')]")
	WebElement travelInfoPageTitle;

	@FindBy(xpath = "//input[@id='departure_date']")
	WebElement departureDate;

	@FindBy(xpath = "//span[text()='Do you have a round trip ticket?']")
	WebElement isApplicantPossessionRoundTicket;
	
	@FindBy(xpath = "//select[@id='sel_roundTkt']")
	WebElement getTextFromRoundTicket;
	
	
	
	@FindBy(xpath = "//div[@class='sel sel--superman active']//span[@class='sel__box__options sel__box__options--superman']")
	List<WebElement> totalApplicantPossessionRoundTicket;

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement yes;

	@FindBy(xpath = "//span[text()='No']")
	WebElement no;

	@FindBy(id = "ticket_number")
	WebElement ticketNumber;

	@FindBy(xpath = "//span[text()='Traveling By']")
	WebElement travelingBy;
	
	@FindBy(xpath = "//div[@class='sel sel--superman active']//span[@class='sel__box__options sel__box__options--superman']")
	List<WebElement> totalTravelingOption;
	
	@FindBy(xpath = "//select[@id='sel_travelBy']")
	WebElement getTextTravelingBy;

	@FindBy(xpath = "//span[text()='Air']")
	WebElement air;

	@FindBy(xpath = "//span[text()='Ship']")
	WebElement ship;

	@FindBy(xpath = "//span[text()='Road']")
	WebElement road;

	@FindBy(xpath = "//span[text()='Train']")
	WebElement train;

	@FindBy(xpath = "//span[text()='Purpose of journey']")
	WebElement purpose_of_journey;
	
	@FindBy(xpath = "//div[@class='sel sel--superman active']//span[@class='sel__box__options sel__box__options--superman']")
	List<WebElement> totalOptionOfPurposeJourney;
	
	@FindBy(xpath = "//select[@id='sel_purpose']")
	WebElement getTextpurpose_of_journey;
	
	@FindBy(xpath = "//div[@id='nav-travel']//span[text()='Visit Family']")
	WebElement VisitFamily;

	@FindBy(xpath = "//input[@id='primary_ref_firstname']")
	WebElement primaryRefFirstname;

	@FindBy(id = "primary_ref_lastname")
	WebElement primary_ref_lastname;

	@FindBy(xpath = "//input[@id='primary_ref_address']")
	WebElement primary_ref_address;

	@FindBy(id = "primary_ref_pincode")
	WebElement primary_ref_pincode;

	@FindBy(xpath = "//input[@id='primary_ref_city']")
	WebElement primary_ref_city;

	@FindBy(xpath = "//input[@id='primary_ref_state']")
	WebElement primary_ref_state;

	@FindBy(xpath = "//input[@id='primary_ref_country']")
	WebElement primary_ref_country;

	@FindBy(xpath = "//input[@id='primary_ref_phone_number']")
	WebElement primary_ref_phone_number;

	@FindBy(xpath = "//input[@id='secondary_ref_firstname']")
	WebElement secondaryRefFirstname;

	@FindBy(id = "secondary_ref_lastname")
	WebElement secondary_ref_lastname;

	@FindBy(xpath = "//input[@id='secondary_ref_address']")
	WebElement secondary_ref_address;

	@FindBy(id = "secondary_ref_pincode")
	WebElement secondary_ref_pincode;

	@FindBy(xpath = "//input[@id='secondary_ref_city']")
	WebElement secondary_ref_city;

	@FindBy(xpath = "//input[@id='secondary_ref_state']")
	WebElement secondary_ref_state;

	@FindBy(xpath = "//input[@id='secondary_ref_country']")
	WebElement secondary_ref_country;

	@FindBy(xpath = "//input[@id='secondary_ref_phone_number']")
	WebElement secondary_ref_phone_number;

	@FindBy(id = "by_phone_checkbox")
	WebElement by_phone_checkbox;

	@FindBy(id = "by_email_checkbox")
	WebElement by_email_checkbox;

	@FindBy(id = "by_text_message_checkbox")
	WebElement by_text_message_checkbox;
	
	@FindBy(name = "other_way_checkbox")
	WebElement otherwaycheckbox;

	@FindBy(id = "txtReach")
	WebElement txtReach;
	
	@FindBy(id = "applicant_travel_information_form_btn")
	WebElement applicant_travel_information_form_btn;

	@FindBy(xpath = "//form[@name='applicant_travel_information_form']//input[@value='Previous']")
	WebElement previous;

	public String getTextTravelInfoPagetitle() throws InterruptedException {
		Thread.sleep(2000);
		TestUtil.waitForElementToVisible(travelInfoPageTitle, 60);
		return travelInfoPageTitle.getText();
	}

    public void passDateOfDeparture(String date) {
    	TestUtil.actionClassMethod(departureDate);
		departureDate.sendKeys(date);

	}
    public String getTextDateOfDeparture() {
    	
		return departureDate.getAttribute("value");
	}
    
	public void clickOnIsApplicantPossessionRoundTicket() throws IOException, InterruptedException {
		TestUtil.actionClassMethod(isApplicantPossessionRoundTicket);
		System.out.println("Total round of ticket===>" +totalApplicantPossessionRoundTicket.size());
		for (WebElement ticket : totalApplicantPossessionRoundTicket){
			System.out.println("Total round of ticket===>" +ticket.getText());
			if (ticket.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 4, 0))){
				ticket.click();
				System.out.println("Round text===>" +getTextFromRoundTicket());				
			}		
		}		
	}
	public boolean getTextFromRoundTicket() throws InterruptedException{
		return getTextFromRoundTicket.isDisplayed();
	}

	public void clickOnYes() {
		yes.click();

	}

	public void passTicketNumber(String ticketNO) {
		ticketNumber.sendKeys(ticketNO);

	}
	public String getTextTicketNumber() {
		return ticketNumber.getAttribute("value");

	}

	public void clickOnTravelBy() throws IOException, InterruptedException {
		TestUtil.actionClassMethod(travelingBy);
		System.out.println("Total travel options are==>"+totalTravelingOption.size());
		for (WebElement travelOptions:totalTravelingOption){
			System.out.println("travel options ===>" +travelOptions.getText() );
			if (travelOptions.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 6, 0)))
				travelOptions.click();
			System.out.println("Which option is selected==>" +getTextTravelingBy());
			
		}
		
	}

	public String getTextTravelingBy(){
		
		return getTextTravelingBy.getAttribute("value");
	}
	public void clickOnTravelByAir() {
		air.click();

	}

	public void clickOnTravelByShip() {
		ship.click();

	}

	public void clickOnTravelByRoad() {
		road.click();

	}

	public void clickOnTravelByTrain() {
		train.click();

	}

	public void clickPurpose_of_journey() throws InterruptedException, IOException {
		TestUtil.actionClassMethod(purpose_of_journey);

		System.out.println("totalOptionOfPurposeJourney=====>" +totalOptionOfPurposeJourney.size());
		
		for (WebElement perposeJourneyOptions : totalOptionOfPurposeJourney){
			
			System.out.println("perposeJourneyOptions text=====>" +perposeJourneyOptions.getText());
			
			if (perposeJourneyOptions.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 7, 0))){
				perposeJourneyOptions.click();
				System.out.println("getTextpurpose_of_journey=====>" +getTextpurpose_of_journey());
				
			}
		}

	}

	
	public String getTextpurpose_of_journey(){
		
		return getTextpurpose_of_journey.getAttribute("value");
	}
	public void passPrimaryRefFirstname(String firstname) {
		primaryRefFirstname.sendKeys(firstname);

	}
	public String getTextPrimaryRefFirstname() {
		return primaryRefFirstname.getAttribute("value");

	}

	public void passPrimaryRefLastname(String lastName) {
		primary_ref_lastname.sendKeys(lastName);

	}
	public String getTextPrimaryRefLastname() {
		return primary_ref_lastname.getAttribute("value");

	}

	public void pass_Primary_ref_address(String adress) {
		primary_ref_address.sendKeys(adress);

	}
	public String getText_Primary_ref_address() {
		return primary_ref_address.getAttribute("value");

	}
	public void pass_primary_ref_pincode(String pincode) {
		primary_ref_pincode.sendKeys(pincode);

	}
	public String getText_primary_ref_pincode() {
		return primary_ref_pincode.getAttribute("value");

	}

	public void pass_primary_ref_city(String city) {
		primary_ref_city.sendKeys(city);

	}
	
	public String getText_primary_ref_city() {
		return primary_ref_city.getAttribute("value");

	}

	public void pass_primary_ref_state(String state) {
		primary_ref_state.sendKeys(state);

	}
	public String getText_primary_ref_state() {
		return primary_ref_state.getAttribute("value");

	}

	public void pass_primary_ref_country(String country) {
		primary_ref_country.sendKeys(country);

	}
	public String getText_primary_ref_country() {
		return primary_ref_country.getAttribute("value");

	}

	public void pass_primary_ref_phone_number(String phoneNo) {
		primary_ref_phone_number.sendKeys(phoneNo);

	}
	public String getText_primary_ref_phone_number() {
		return primary_ref_phone_number.getAttribute("value");

	}

	public void passsecondaryRefFirstname(String firstname) {
		secondaryRefFirstname.sendKeys(firstname);

	}
	public String getTextsecondaryRefFirstname() {
		return secondaryRefFirstname.getAttribute("value");

	}


	public void pass_secondary_ref_lastname(String lastName) {
		secondary_ref_lastname.sendKeys(lastName);

	}
	public String geText_secondary_ref_lastname() {
		return secondary_ref_lastname.getAttribute("value");
	}

	public void pass_secondary_ref_address(String adress) {
		 secondary_ref_address.sendKeys(adress);

	}
	public String getText_secondary_ref_address() {
		return secondary_ref_address.getAttribute("value");

	}

	public void pass_secondary_ref_pincode(String pincode) {
		secondary_ref_pincode.sendKeys(pincode);

	}
	public String getText_secondary_ref_pincode() {
		return secondary_ref_pincode.getAttribute("value");

	}

	public void pass_secondary_ref_city(String city) {
		secondary_ref_city.sendKeys(city);

	}
	public String geText_secondary_ref_city() {
		return secondary_ref_city.getAttribute("value");

	}

	public void pass_secondary_ref_state(String state) {
		secondary_ref_state.sendKeys(state);

	}
	public String getText_secondary_ref_state() {
		return secondary_ref_state.getAttribute("value");

	}

	public void pass_secondary_ref_country(String country) {
		secondary_ref_country.sendKeys(country);

	}
	public String getText_secondary_ref_country() {
		return secondary_ref_country.getAttribute("value");

	}

	public void pass_secondary_ref_phone_number(String phoneNo) {
		secondary_ref_phone_number.sendKeys(phoneNo);

	}
	public String getText_secondary_ref_phone_number() {
		return secondary_ref_phone_number.getAttribute("value");

	}

	public void PassSecondaryRefDetails(String sec_firstname,
			String sec_lastName, String sec_adress, String sec_pincode,
			String sec_city, String sec_state, String sec_country,
			String sec_phoneNo) {
		secondaryRefFirstname.sendKeys(sec_firstname);
		secondary_ref_lastname.sendKeys(sec_lastName);
		secondary_ref_address.sendKeys(sec_adress);
		secondary_ref_pincode.sendKeys(sec_pincode);
		secondary_ref_city.sendKeys(sec_city);
		secondary_ref_state.sendKeys(sec_state);
		secondary_ref_country.sendKeys(sec_country);
		secondary_ref_phone_number.sendKeys(sec_phoneNo);
	}


	
	public void clickOnByPhoneCheckbox() {
		TestUtil.actionClassMethod(by_phone_checkbox);

	}
	public boolean verifyByPhoneCheckbox() {
		return by_phone_checkbox.isSelected();

	}
	public void clickOnByEmailCheckbox() {
		TestUtil.actionClassMethod(by_email_checkbox);

	}
	public boolean verifyByEmailCheckbox() {
		return by_email_checkbox.isSelected();

	}
	public void clickOnByTextMessageCheckbox() {
		TestUtil.actionClassMethod(by_text_message_checkbox);
		

	}
	public boolean verifyByTextMessageCheckbox() {
		return  by_text_message_checkbox.isSelected();

	}
	public void clickOnOtherWayCheckbox() throws InterruptedException {
		Thread.sleep(2000);
		TestUtil.actionClassMethod(otherwaycheckbox);

	}
	public boolean verifyOnOtherWayCheckbox() {
		return otherwaycheckbox.isSelected();

	}
	public void passOtherWayToReach(String passWay ) {
		txtReach.sendKeys(passWay);

	}
	public String getTextOtherWayToReach() {
		return txtReach.getAttribute("value");

	}

	public void clickOnContinuebutton() {
		applicant_travel_information_form_btn.click();

	}

	public void clickOnPreviuosbutton() {
		previous.click();

	}

}
