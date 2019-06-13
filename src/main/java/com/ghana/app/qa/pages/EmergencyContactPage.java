package com.ghana.app.qa.pages;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

public class EmergencyContactPage extends TestBase {

	public EmergencyContactPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// element id for emergency contact
	@FindBy(xpath = "//h5[contains(text(),'Emergency Contact')]")
	WebElement emePageTitle;
	@FindBy(xpath = "//h5[contains(text(),'Travel Information')]")
	WebElement travelInfoPageTitle;
	@FindBy(xpath = "//input[@id='emergency_firstname']")
	WebElement emergency_firstname;
	@FindBy(xpath = "//input[@id='emergency_lastname']")
	WebElement emergency_lastname;
	@FindBy(xpath = "//span[text()='Relationship']")
	WebElement Relationship;

	@FindBy(xpath = "//div[@class='selrel__box sel--superman']//span[@class='sel__box__options sel--superman']")
	List<WebElement> totalRelation;

	@FindBy(xpath = "//select[@id='sel_relation']")
	WebElement getTextFromrelation;

	@FindBy(xpath = "//div[@id='nav-contact']//span[text()='Mother']")
	WebElement Mother;
	@FindBy(xpath = "//input[@id='emergency_phone_number']")
	WebElement emergency_phone_number;
	@FindBy(xpath = "//input[@id='emergency_profession']")
	WebElement emergency_profession;
	@FindBy(xpath = "//input[@id='emergency_employer_name']")
	WebElement emergencyCompanyOrSchoolname;
	@FindBy(xpath = "//input[@id='emergency_employer_address']")
	WebElement emergency_employer_address;
	@FindBy(xpath = "//input[@id='emergency_pincode']")
	WebElement emergency_pincode;
	@FindBy(xpath = "//input[@id='emergency_city']")
	WebElement emergency_city;
	@FindBy(xpath = "//input[@id='emergency_state']")
	WebElement emergency_state;
	@FindBy(xpath = "//input[@id='emergency_country']")
	WebElement emergency_country;
	@FindBy(xpath = "//input[@id='emergency_employer_phone_number']")
	WebElement emergency_employer_phone_number;
	@FindBy(xpath = "//div[@id='nav-contact']//input[@value='Previous']")
	WebElement Previousbtn;
	@FindBy(xpath = "//button[@id='applicant_emergency_contact_form_btn']")
	WebElement emergencySaveAndContinuebtn;

	public String getTextEmerPageTitle() {
		return emePageTitle.getText();

	}

	public void emergencyFirstName(String eFirstName) {
		emergency_firstname.sendKeys(eFirstName);

	}

	public String getTextEmergencyFirstName() {
		return emergency_firstname.getAttribute("value");
	}

	public void emergencyLastName(String eLastName) {
		emergency_lastname.sendKeys(eLastName);

	}

	public String gettextEmergencyLastName() {
		return emergency_lastname.getAttribute("value");

	}

	public void emergencyContactNumber(String eContactNo) {
		emergency_phone_number.sendKeys(eContactNo);
	}

	public String getTextEmergencyContactNumber() {
		return emergency_phone_number.getAttribute("value");
	}

	public void selectRelation() throws IOException, InterruptedException {
		TestUtil.actionClassMethod(Relationship);
		System.out.println("Total relation count=====>" + totalRelation.size());
		for (int i = 0; i < totalRelation.size(); i++) {
			// System.out.println("Total relation count=====>"
			// +totalRelation.get(i).getText());
			if (totalRelation.get(i).getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(8, 5, 0))) {
				totalRelation.get(i).click();
				System.out.println("Selected relation text here=====>"
						+ getTextFromRelation());
			}

		}
	}

	public String getTextFromRelation() {
		return getTextFromrelation.getAttribute("value");
	}

	public void passEmergency_profession(String empProfession) {
		emergency_profession.sendKeys(empProfession);
	}

	public String getTextEmergency_profession() {
		return emergency_profession.getAttribute("value");
	}

	public void passEmployerOrSchoolName(String employerOrSchoolName) {
		emergencyCompanyOrSchoolname.sendKeys(employerOrSchoolName);

	}

	public String getTextEmployerOrSchoolName() {
		return emergencyCompanyOrSchoolname.getAttribute("value");
	}

	public void pass_EmployerOrSchooladdress(String employerOrSchooladdress) {
		emergency_employer_address.sendKeys(employerOrSchooladdress);

	}

	public String getText_EmployerOrSchooladdress() {
		return emergency_employer_address.getAttribute("value");

	}

	public void pass_Emergency_Pincode(String ePincode) {
		emergency_pincode.sendKeys(ePincode);

	}

	public String getText_Emergency_Pincode() {
		return emergency_pincode.getAttribute("value");

	}

	public void paa_Emergency_city(String eCity) {
		emergency_city.sendKeys(eCity);

	}

	public String getText_Emergency_city() {
		return emergency_city.getAttribute("value");

	}

	public void pass_Emergency_State(String eState) {
		emergency_state.sendKeys(eState);

	}

	public String getText_Emergency_State() {
		return emergency_state.getAttribute("value");

	}

	public void pass_Emergency_Country(String eCountry) {

		emergency_country.sendKeys(eCountry);

	}

	public String getText_Emergency_Country() {

		return emergency_country.getAttribute("value");

	}

	public void pass_emergency_employer_phone_number(String eSchoolContactNo) {
		emergency_employer_phone_number.sendKeys(eSchoolContactNo);

	}

	public String getText_emergency_employer_phone_number() {
		return emergency_employer_phone_number.getAttribute("value");

	}

	public void clickEmeContinueBtn() {
		emergencySaveAndContinuebtn.click();
	}
}

/*
 * driver.findElement(By.xpath("//span[contains(text(),'" + selectRelationship +
 * "')]")).click(); // Mother.click();
 */
/*
 * public void emergencyProfessionDetails(String empProfession, String
 * employerOrSchoolName, String employerOrSchooladdress, String ePincode, String
 * eCity, String eState, String eCountry, String eSchoolContactNo) {
 * emergency_profession.sendKeys(empProfession);
 * emergencyCompanyOrSchoolname.sendKeys(employerOrSchoolName);
 * emergency_pincode.sendKeys(ePincode);
 * emergency_employer_address.sendKeys(employerOrSchooladdress);
 * emergency_city.sendKeys(eCity); emergency_state.sendKeys(eState);
 * emergency_country.sendKeys(eCountry);
 * emergency_employer_phone_number.sendKeys(eSchoolContactNo);
 * 
 * }
 */