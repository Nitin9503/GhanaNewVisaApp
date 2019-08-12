package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class HCDApplicantInfoPage extends TestBase {

	public HCDApplicantInfoPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "visafeeHCD")
	WebElement visafee;

	@FindBy(id = "firstlastHCD")
	WebElement fullName;

	@FindBy(id = "gender")
	WebElement Gender;

	@FindBy(id = "passportNumberHCD")
	WebElement passportNumberHCD;

	@FindBy(id = "dateOfBirthHCD")
	WebElement dateOfBirthHCD;

	@FindBy(id = "passportDateOfIssueHCD")
	WebElement passportDateOfIssueHCD;

	@FindBy(id = "placeOfBirthHCD")
	WebElement placeOfBirthHCD;

	@FindBy(id = "passportExpiryDateHCD")
	WebElement passportExpiryDateHCD;

	@FindBy(id = "formerNationalityHCD")
	WebElement formerNationalityHCD;

	@FindBy(id = "nationalityHCD")
	WebElement nationalityHCD;

	@FindBy(id = "emailIdHCD")
	WebElement emailIdHCD;

	@FindBy(id = "phoneNumberHCD")
	WebElement phoneNumberHCD;

	@FindBy(id = "addressType")
	WebElement addressType;

	@FindBy(id = "addressLine1HCD")
	WebElement addressLine1HCD;

	@FindBy(id = "landmarkHCD")
	WebElement landmarkHCD;

	@FindBy(id = "cityHCD")
	WebElement cityAndPinHCD;

	@FindBy(id = "stateHCD")
	WebElement stateHCD;

	@FindBy(id = "countryHCD")
	WebElement countryHCD;

	@FindBy(id = "DateOfDepartureHCD")
	WebElement DateOfDepartureHCD;

	@FindBy(id = "ticketNumberHCD")
	WebElement ticketNumberHCD;

	@FindBy(id = "travellingByHCD")
	WebElement travellingByHCD;

	@FindBy(id = "purposeHCD")
	WebElement purposeHCD;

	@FindBy(id = "refName1HCD")
	WebElement refName1HCD;

	@FindBy(id = "refContact1HCD")
	WebElement refContact1HCD;

	@FindBy(id = "refAddress1HCD")
	WebElement refAddress1HCD;

	@FindBy(id = "refCity1HCD")
	WebElement refCity1HCD;

	@FindBy(id = "refState1HCD")
	WebElement refState1HCD;

	@FindBy(id = "refCountry1HCD")
	WebElement refCountry1HCD;

	@FindBy(id = "refName2HCD")
	WebElement refName2HCD;

	@FindBy(id = "refContact2HCD")
	WebElement refContact2HCD;

	@FindBy(id = "refAddress2HCD")
	WebElement refAddress2HCD;

	@FindBy(id = "refCity2HCD")
	WebElement refCity2HCD;

	@FindBy(id = "refState2HCD")
	WebElement refState2HCD;

	@FindBy(id = "refCountry2HCD")
	WebElement refCountry2HCD;

	@FindBy(id = "em_name")
	WebElement em_name;

	@FindBy(id = "em_relation")
	WebElement em_relation;

	@FindBy(id = "em_contact")
	WebElement em_contact;

	@FindBy(id = "em_profession")
	WebElement em_profession;

	@FindBy(id = "em_school")
	WebElement em_school;

	@FindBy(id = "em_address")
	WebElement em_address;

	@FindBy(id = "em_pincode")
	WebElement em_pincode;

	@FindBy(id = "em_city")
	WebElement em_city;

	@FindBy(id = "em_state")
	WebElement em_state;

	@FindBy(id = "em_country")
	WebElement em_country;

	@FindBy(id = "em_school_contact")
	WebElement em_school_contact;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;

	public String getTitleOfHCDGGeneralVerifi() {

		return driver.getTitle();
	}

	public void clickOnNextButton() {

		nextButton.click();
	}

	public void clickOnCancelButton() {

		Cancel.click();
	}

	public String getTextEm_school_contact() {

		return em_school_contact.getAttribute("value");
	}

	public String getTextEm_country() {

		return em_country.getAttribute("value");
	}

	public String getTextEm_state() {

		return em_state.getAttribute("value");
	}

	public String getTextEm_city() {

		return em_city.getAttribute("value");
	}

	public String getTextEm_pincode() {

		return em_pincode.getAttribute("value");
	}

	public String getTextEm_address() {

		return em_address.getAttribute("value");
	}
	
	
	public String getTextcityAndPinHCD() {

		return cityAndPinHCD.getAttribute("value");
	}
	public String getTextEm_school() {

		return em_school.getAttribute("value");
	}

	public String getTextEm_profession() {

		return em_profession.getAttribute("value");
	}

	public String getTextEm_contact() {

		return em_contact.getAttribute("value");
	}

	public String getTextEm_relation() {

		return em_relation.getAttribute("value");
	}

	public String getTextEm_name() {

		return em_name.getAttribute("value");
	}

	public String getTextrefCountry2HCD() {

		return refCountry2HCD.getAttribute("value");
	}

	public String getTextRefState2HCD() {

		return refState2HCD.getAttribute("value");
	}

	public String getTextRefCity2HCD() {

		return refCity2HCD.getAttribute("value");
	}

	public String getTextRefAddress2HCD() {

		return refAddress2HCD.getAttribute("value");
	}

	public String getTextRefContact2HCD() {

		return refContact2HCD.getAttribute("value");
	}

	public String getTextRefName2HCD() {

		return refName2HCD.getAttribute("value");
	}

	public String getTextRefCountry1HCD() {

		return refCountry1HCD.getAttribute("value");
	}

	public String getTextRefState1HCD() {

		return refState1HCD.getAttribute("value");
	}

	public String getTextRefCity1HCD() {

		return refCity1HCD.getAttribute("value");
	}

	public String getTextRefAddress1HCD() {

		return refAddress1HCD.getAttribute("value");
	}

	public String getTextRefContact1HCD() {

		return refContact1HCD.getAttribute("value");
	}

	public String getTextRefName1HCD() {

		return refName1HCD.getAttribute("value");
	}

	public String getTextTravellingByHCD() {

		return travellingByHCD.getAttribute("value");
	}

	public String getTextTicketNumberHCD() {

		return ticketNumberHCD.getAttribute("value");
	}

	public String getTextDateOfDepartureHCD() {

		return DateOfDepartureHCD.getAttribute("value");
	}
	public String getTextPurposeToVisitHCD() {

		return purposeHCD.getAttribute("value");
	}

	public String getTextCountryHCD() {

		return countryHCD.getAttribute("value");
	}

	public String getTextStateHCD() {

		return stateHCD.getAttribute("value");
	}

	public String getTextLandmarkHCD() {

		return landmarkHCD.getAttribute("value");
	}

	public String getTextAddressType() {

		return addressType.getAttribute("value");
	}

	public String getTextAddressLine1HCD() {

		return addressLine1HCD.getAttribute("value");
	}

	public String getTextPhoneNumberHCD() {

		return phoneNumberHCD.getAttribute("value");
	}

	public String getTextEmailIdHCD() {

		return emailIdHCD.getAttribute("value");
	}

	public String getTextNationalityHCD() {

		return nationalityHCD.getAttribute("value");
	}

	public String getTextFormerNationalityHCD() {

		return formerNationalityHCD.getAttribute("value");
	}

	public String getTextPassportExpiryDateHCD() {

		return passportExpiryDateHCD.getAttribute("value");
	}

	public String getTextPlaceOfBirthHCD() {

		return placeOfBirthHCD.getAttribute("value");
	}

	public String getTextPassportDateOfIssueHCD() {

		return passportDateOfIssueHCD.getAttribute("value");
	}

	public String getTextDateOfBirthHCD() {

		return dateOfBirthHCD.getAttribute("value");
	}

	public String getTextPassportNumberHCD() {

		return passportNumberHCD.getAttribute("value");
	}

	public String getTextGender() {

		return Gender.getAttribute("value");
	}

	public String getTextVisaFee() {

		return visafee.getAttribute("value");
	}

	public String getTextFullName() throws InterruptedException {
		Thread.sleep(3000);
		return fullName.getAttribute("value");

	}

}
