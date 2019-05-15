package com.ghana.app.qa.xl.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

public class PersonalInfoXlPage extends TestBase {

	public PersonalInfoXlPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from personnel information page

	@FindBy(xpath = "//h5[contains(text(),'Personal Information')]")
	WebElement personalInfoTitle;

	@FindBy(xpath = ".//*[@id='nav-personal']/div/div[2]/div[1]/div[2]/h6")
	WebElement applicationId;
	@FindBy(xpath = "//span[text()='Visa Fees']")
	WebElement clickvisaFees;//

	@FindBy(id = "sel_visaFee")
	WebElement select;//

	// @FindBy(xpath =
	// "//ul[@id='img_category_options']//li[text()='Single entry(3 months) visa Rs.8500.0']")
	@FindBy(xpath = "//form[@id='applicant_personal_info_form']//span[text()='Single entry(3 months) visa Rs.8500.0']")
	WebElement clickVisaFees;//

	@FindBy(xpath = "//span[text()='Select Visa Location']")
	WebElement visaLocation;//
	// @FindBy(xpath =
	// "//ul[@id='img_category_options']//span[text()='Mumbai']")
	@FindBy(xpath = "//form[@id='applicant_personal_info_form']//span[text()='Mumbai']")
	WebElement clickVisaLocation;//
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstname;
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastname;
	@FindBy(xpath = "//input[@type='radio' and @value='Male']")
	// gender radio btn change value=Female, Male, Other
	WebElement gender;
	WebElement VisaFees;// li[@id='1']
	@FindBy(xpath = "//input[@id='passport_number']")
	WebElement passport_number;
	@FindBy(xpath = "//input[@id='date_of_issued']")
	WebElement date_of_issued;
	@FindBy(xpath = "//input[@id='passport_expiry']")
	WebElement date_of_expiry;
	@FindBy(xpath = "//input[@id='birth_place']")
	WebElement birth_place;
	@FindBy(xpath = "//form[@id='applicant_personal_info_form']//button[text()='Cancel']")
	WebElement cancel;
	@FindBy(xpath = "//button[@id='applicant_personal_info_form_btn']")
	WebElement saveAndContinue;

	public String getTextPersonalInfoPageTitle() throws InterruptedException {
		Thread.sleep(2000);
		return personalInfoTitle.getText();

	}

	public String getApplicantPageTitle() {
		return driver.getTitle();
	}

	public String getApplicationId() {
		return applicationId.getText().substring(16);
	}

	public void SelectvisaFees(String VisaFee) throws InterruptedException {
		TestUtil.actionClassMethod(clickvisaFees);
		driver.findElement(
				By.xpath("//span[contains(text(),'" + VisaFee + "')]"))
				.click();

	}

	public void SelectvisaLocation(String VisaLocatioN) throws InterruptedException {

		TestUtil.actionClassMethod(visaLocation);
		driver.findElement(
				By.xpath("//span[contains(text(),'" + VisaLocatioN + "')]")).click();

	}

	public void passFirstName(String firstName) {
		firstname.sendKeys(firstName);
	}

	public void passLastName(String lastName) {
		lastname.sendKeys(lastName);
		// return lastname.getText();
	}

	public void passPassportNumber(String passportNO) {
		passport_number.sendKeys(passportNO);
	}

	public void clickOnGender() {
		TestUtil.actionClassMethod(gender);
	}
	
	public void verifiedGenderSelected() throws InterruptedException {
		Thread.sleep(2000);
		genderRadioButton =	gender.isSelected();
		System.out.println("genderRadioButton==>"  +genderRadioButton);
	}
	

	public void selectPassIssueDate(String PassIssuDate)
			throws InterruptedException {
		((JavascriptExecutor) driver)
				.executeScript("document.getElementById('date_of_issued').removeAttribute('readonly',0);");
		date_of_issued.sendKeys(PassIssuDate); // Enter date in required format
	}

	public void selectPassExpiryDate(String PassExpirDate)
			throws InterruptedException {
		((JavascriptExecutor) driver)
				.executeScript("document.getElementById('passport_expiry').removeAttribute('readonly',0);");
		date_of_expiry.sendKeys(PassExpirDate); // Enter date in required
													// format
	}

	public void passPlaceOfBirth(String Birthplace) {
		birth_place.sendKeys(Birthplace);
	}

	public void clickOnSaveAndContinue() {
		saveAndContinue.click();
	}

}