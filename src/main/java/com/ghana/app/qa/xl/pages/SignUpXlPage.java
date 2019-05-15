package com.ghana.app.qa.xl.pages;

import java.io.IOException;
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

public class SignUpXlPage extends TestBase {

	public SignUpXlPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from signup page
	@FindBy(xpath = "//span[text()='Passport Type']")
	public static WebElement PassportType;

	@FindBy(id = "Official")
	// Diplomatic, Service, Special, Ordinary
	WebElement PassportTypeName;

	@FindBy(xpath = "//span[text()='Nationality']")
	WebElement Nationality;

	@FindBy(xpath = "//ul[@id='ul_nationality']//li[text()='India']")
	WebElement selectNationality;

	@FindBy(id = "nationality_search")
	WebElement nationalitySearchField;

	@FindBy(xpath = "//span[text()='Port of Arrival']")
	WebElement PortofArrival;

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

	@FindBy(xpath = "//input[@id='customCheck1']")
	WebElement customCheck1;

	@FindBy(xpath = "//input[@id='customRadio3']")
	WebElement visaTypeCheckBox;

	@FindBy(xpath = "//input[@id='usercaptchacode']")
	WebElement usercaptchacode;

	@FindBy(xpath = "//input[@id='customCheck3' and @type='checkbox']")
	WebElement basicDoccheckbox;

	@FindBy(xpath = "//input[@id='customCheck1' and @name='example1']")
	WebElement termsCheckkbox;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continue;

	@FindBy(xpath = "//div[@class ='custom-control custom-checkbox']")
	List<WebElement> checkBoxesClick;

	@FindBy(xpath = "//div[@class ='custom-control custom-radio custom-control-inline']")
	List<WebElement> selectRadioButton;

	public String validateSignUpPageTitle() {

		return driver.getTitle();
	}

	public void SelectPassportType(String PaType) {
		TestUtil.actionClassMethod(PassportType);
		driver.findElement(By.xpath("//li[@id='" + PaType + "']")).click();
		
	}

	public void selectNationality(String NaName) throws InterruptedException {
		TestUtil.actionClassMethod(Nationality);
		nationalitySearchField.sendKeys(NaName);
		driver.findElement(By.xpath("//li[text()='" + NaName + "']")).click();

	}

	public void selectPortOfArrival(String PoArrival) {
		TestUtil.actionClassMethod(PortofArrival);
		driver.findElement(By.xpath("//li[text()='" + PoArrival + "']")).click();
	
	}

	public void passPhoneNo(String phoneNo) {
		PhoneNumber.sendKeys(phoneNo);
	}

	public void selectDateOfBirth(String birthDate) throws InterruptedException {
		/*((JavascriptExecutor) driver)
				.executeScript("document.getElementById('dateofbirth').removeAttribute('readonly',0);");
		dateofbirth.sendKeys(birthDate); // Enter date in required format
*/	     TestUtil.actionClassMethod(dateofbirth);
	        dateofbirth.sendKeys(birthDate);
	        
	}

	public void passEmailIdAndPhoneNo(String EmailId, String PhoneNo) {
		PhoneNumber.sendKeys(PhoneNo);
		emailId.sendKeys(EmailId);// nitinthaokar9@gmail.com
		reenterEmailId.sendKeys(EmailId);
		
		
	}

	public void passReEmailId(String EmailId) {
		reenterEmailId.sendKeys(EmailId);
	}

	public void visaTypeRadioBtn() {
		visaTypeCheckBox.click();
	}

	public void enterCaptchaField(String captchacode) {
		usercaptchacode.sendKeys(captchacode);
	}

	public void cancelBtn() {
		Cancel.click();
	
	}

	public void continueBtn() {
		Continue.click();
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

	
		for (int i = 0; i <j; i++) {
			Thread.sleep(2000);
	selectedBoxOnSignUp = checkBoxesClick.get(i).isSelected();	
	
			}
		System.out.println("selectedBoxOnSignUp1==>" +selectedBoxOnSignUp);
	
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

		int size  = selectRadioButton.size();
		for (int i=0; i<size; i++){
			boolean selectedRadioButtonOnSignUp = selectRadioButton.get(i).isSelected();
			System.out.println("selectedRadioButtonOnSignUp==>" +selectedRadioButtonOnSignUp);
			
		}

	}

}
