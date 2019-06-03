package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class SignUpPage extends TestBase {

	// public ArrayList<String> passportype;
	public SignUpPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from signup page
	@FindBy(xpath = "//span[text()='Passport Type']")
	public static WebElement PassportType;

	@FindBy(xpath = "//ul[@id='passport_type']//li")
	List<WebElement> totalPassportType;

	@FindBy(id = "passport_type")
	// Diplomatic, Service, Special, Ordinary
	WebElement PassportTypeName;

	@FindBy(xpath = "//span[text()='Nationality']")
	WebElement Nationality;

	@FindBy(id = "nationality")
	WebElement getTextnationality;

	@FindBy(xpath = "//ul[@id='ul_nationality']//li")
	List<WebElement> countrys;

	@FindBy(xpath = "//ul[@id='ul_nationality']//li[text()='India']")
	WebElement selectNationality;

	@FindBy(xpath = "//span[text()='Select Visa Type']")
	WebElement clickvisaFees;

	@FindBy(xpath = "//ul[@id='ul_visa_type']//li")
	List<WebElement> totalVisaFees;

	@FindBy(id = "visa_type")
	WebElement getTextSelectedVisaFees;

	@FindBy(xpath = "//form[@id='applicant_personal_info_form']//span[text()='Single entry(3 months) visa Rs.8500.0']")
	WebElement selectVisaFees;//

	@FindBy(xpath = "//span[text()='Select Visa Location']")
	WebElement visaLocation;

	@FindBy(id = "div_visa_location")
	WebElement selectVisaLocation;

	@FindBy(xpath = "//ul[@id='ul_visa_location']//li")
	List<WebElement> VisaLocationCount;

	// @FindBy(xpath =
	// "//ul[@id='img_category_options']//span[text()='Mumbai']")
	@FindBy(xpath = "//form[@id='applicant_personal_info_form']//span[text()='Mumbai']")
	WebElement clickVisaLocation;//

	@FindBy(id = "nationality_search")
	WebElement nationalitySearchField;

	@FindBy(xpath = "//span[text()='Port of Arrival']")
	WebElement PortofArrival;

	@FindBy(id = "port_of_arrival")
	WebElement getTextPortofArrival;

	@FindBy(xpath = "//ul[@id='portArrival']//li")
	List<WebElement> totalPortOfArrival;

	@FindBy(xpath = "//ul[@id='img_category_options']//li[text()='Ghana Airport']")
	WebElement selectPortofArrival;

	@FindBy(id = "phone_number")
	WebElement PhoneNumber;

	@FindBy(xpath = "//input[@id='dateofbirth']")
	WebElement dateofbirth;

	@FindBy(id = "useremail")
	WebElement emailId;

	@FindBy(id = "renter_email")
	WebElement reenterEmailId;

	/*
	 * @FindBy(xpath="//input[@id='renter_email']") WebElement renter_email;
	 * 
	 * @FindBy(xpath="//input[@id='useremail']") WebElement useremail;
	 */

	@FindBy(xpath = "//input[@id='customCheck1']")
	WebElement customCheck1;

	@FindBy(xpath = "//input[@id='customRadio3']")
	WebElement visaTypeCheckBox;

	@FindBy(xpath = "//input[@id='usercaptchacode']")
	WebElement usercaptchacode;
	@FindBy(id = "text_captcha")
	WebElement usercaptatext;

	@FindBy(xpath = "//input[@id='customCheck3' and @type='checkbox']")
	WebElement basicDoccheckbox;

	@FindBy(xpath = "//input[@id='customCheck1' and @name='example1']")
	WebElement termsCheckkbox;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//input[@value='Sign Up']")
	WebElement SignUp;

	@FindBy(xpath = "//div[@class ='custom-control custom-checkbox']")
	List<WebElement> checkBoxesClick;

	@FindBy(xpath = "//div[@class ='custom-control custom-radio custom-control-inline']")
	List<WebElement> selectRadioButton;

	public String validateSignUpPageTitle() {

		return driver.getTitle();
	}

	public void SelectPassportType() {
		TestUtil.actionClassMethod(PassportType);
		System.out.println("Total size of passport type==>" + sizePassportType());
		ArrayList<String> passNo = new ArrayList<String>();
		for (WebElement PassportType : totalPassportType) {
			System.out.println("print the value of passport tyep=>" + PassportType.getText());
		
			System.out.println("Values from Arraylist hooo==>" +passNo);

			passNo.add(PassportType.getText());
		

			if (PassportType.getText().equalsIgnoreCase(passPortType)) {
				PassportType.click();
				System.out.println("See which passport type is selected str 1 selected=>" + getTextPassportTypeName());
			}
		}
		 System.out.println("Values from Arraylist==>" +passNo.get(0));

	}

	public String getTextPassportTypeName() {
		return PassportTypeName.getText();
	}

	public int sizePassportType() {
		return totalPassportType.size();
	}

	public void selectNationality() throws InterruptedException {
		Thread.sleep(3000);
		TestUtil.actionClassMethod(Nationality);
		System.out.println("Total countries are=>" + countrys.size());
		for (WebElement country : countrys) {
			if (country.getText().equalsIgnoreCase(nationalityName)) {
				country.click();
				Thread.sleep(5000);
				System.out.println("See which country str 1 selected=>" + getFromSelectedNationality());
				break;
			}
		}
	}

	public String getFromSelectedNationality() {

		return getTextnationality.getText();
	}

	public int totalCountryCount() {
		return countrys.size();
	}

	public void selectVisaType() throws InterruptedException {
		TestUtil.actionClassMethod(clickvisaFees);
		System.out.println("Total visa fee count=>>" + totalVisaFees.size());
		for (WebElement visaFee : totalVisaFees) {
			Thread.sleep(2000);
			System.out.println("Total visa fee printed=>>" + visaFee.getText());
			if (visaFee.getText().equalsIgnoreCase(visaFees)) {
				visaFee.click();
				Thread.sleep(5000);
			}
		}
	}

	public String getTextFromVisaType() {
		return getTextSelectedVisaFees.getText();

	}

	public int totalVisaFeeCountActual() {
		return totalVisaFees.size();
	}

	public void selectVisaLocation() throws InterruptedException {
		TestUtil.actionClassMethod(visaLocation);
		System.out.println("Total visa count ==>" + totalVisaLocationActual());
		for (WebElement visa : VisaLocationCount) {
			System.out.println("Visa Location ==>" + visa.getText());
			if (visa.getText().equalsIgnoreCase(VisaLocations)) {
				visa.click();
				Thread.sleep(5000);
				System.out.println("Text from selected visa location=======>" + getTextFromSelectVisaLocation());
			}

		}
	}

	public String getTextFromSelectVisaLocation() {
		return selectVisaLocation.getText();
	}

	public int totalVisaLocationActual() {
		return VisaLocationCount.size();
	}

	public void selectPortOfArrival() throws InterruptedException {
		TestUtil.actionClassMethod(PortofArrival);
		System.out.println("totalPortOfArrival => " + totalPortOfArrival.size());
		for (WebElement portOfArrivale : totalPortOfArrival) {
			System.out.println("totalPortOfArrival get Text => " + portOfArrivale.getText());
			if (portOfArrivale.getText().equalsIgnoreCase(portOfArrival)) {
				portOfArrivale.click();
				Thread.sleep(5000);
				System.out.println("See which port of arrival type is selected==>" + getTextFromPortofArrival());

				break;
			}
		}

	}

	public String getTextFromPortofArrival() {
		return getTextPortofArrival.getText();
	}

	public int totalPortArrival() {
		return totalPortOfArrival.size();
	}

	public void passPhoneNo(String phoneNo) {
		PhoneNumber.sendKeys(phoneNo);
		
	}

	public void selectDateOfBirth(String birthDate) throws InterruptedException {

		TestUtil.actionClassMethod(dateofbirth);
		dateofbirth.sendKeys(birthDate);

	}

	public void passEmailId(String EmailId) {
		emailId.sendKeys(EmailId);// nitinthaokar9@gmail.com
	}

	public void passReEmailId(String EmailId) {
		TestUtil.actionClassMethod(reenterEmailId);
		reenterEmailId.sendKeys(EmailId);
	}

	public void visaTypeRadioBtn() {
		visaTypeCheckBox.click();
	}

	public void enterCaptchaField() throws InterruptedException {
		Thread.sleep(2000);
		String captcha = usercaptatext.getText();
		Thread.sleep(2000);
		System.out.println(captcha);
		usercaptchacode.sendKeys(captcha);
	}

	public void cancelBtn() {
		Cancel.click();
	}

	public void continueBtn() {
		SignUp.click();
	}

	public void termsCheckboxselect() {
		termsCheckkbox.click();
	}

	public void clickOnCheckBoxes() {

		try {
			for (WebElement we : checkBoxesClick) {
				System.out.println("checkBoxesClick==>" + checkBoxesClick.size());
				TestUtil.actionClassMethod(we);
			}

		} catch (Exception e) {
			System.out.println("all check boxes click done");

		}
	}

	public void verifyCheckBoxIsSelected() throws InterruptedException {
		int j = checkBoxesClick.size();

		Thread.sleep(2000);
		for (int i = 0; i < j; i++) {

			selectedBoxOnSignUp = checkBoxesClick.get(i).isSelected();

		}
		System.out.println("selectedBoxOnSignUp1==>" + selectedBoxOnSignUp);

	}

	public void selectRadioButton() {

		try {
			for (WebElement we : selectRadioButton) {
				TestUtil.actionClassMethod(we);
			}

		} catch (Exception e) {
			System.out.println("all check boxes click done");

		}

	}

	public void verifyRadioButtonSelected() {

		int size = selectRadioButton.size();
		for (int i = 0; i < size; i++) {
			boolean selectedRadioButtonOnSignUp = selectRadioButton.get(i).isSelected();
			System.out.println("selectedRadioButtonOnSignUp==>" + selectedRadioButtonOnSignUp);

		}

	}

}
