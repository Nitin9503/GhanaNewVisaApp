package com.ghana.app.qa.xl.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class SignUpXlPage extends TestBase {

	public SignUpXlPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from signup page
	@FindBy(xpath = "//span[text()='Passport Type']")
	public static WebElement PassportType;

	@FindBy(xpath="//ul[@id='passport_type']//li")
	List<WebElement> TotalPassportType;
	
	@FindBy(id = "Official")
	// Diplomatic, Service, Special, Ordinary
	WebElement PassportTypeName;

	@FindBy(xpath = "//span[text()='Nationality']")
	WebElement Nationality;
   
	@FindBy(xpath = "//ul[@id='ul_nationality']//li")
	List<WebElement> TotalCountry;
	
	@FindBy(xpath = "//ul[@id='ul_nationality']//li[text()='India']")
	WebElement selectNationality;

	@FindBy(id = "nationality_search")
	WebElement nationalitySearchField;

	@FindBy(xpath = "//span[text()='Port of Arrival']")
	WebElement PortofArrival;

	@FindBy(xpath = "//ul[@id='img_category_options']//li[text()='Ghana Airport']")
	WebElement selectPortofArrival;

	@FindBy(xpath = "//span[text()='Select Visa Type']")
	WebElement SelectvisaType;
	
	@FindBy(xpath = "//ul[@id='ul_visa_type']//li")
	List<WebElement> TotalVisaType;
	
	@FindBy(xpath = "//span[text()='Select Visa Location']")
	WebElement visaLocations;


	
	@FindBy(xpath = "//ul[@id='ul_visa_location']//li")
	List<WebElement> TotalVisaLocation;
	
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
	
	@FindBy(xpath = "//label[@id='text_captcha']")
	WebElement usercaptatext;
	
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

	public int passportTypesize(){
		return TotalPassportType.size();
		
	}
	public void SelectPassportType(String PaType) {
		TestUtil.actionClassMethod(PassportType);
		System.out.println(passportTypesize());
		//ArrayList<String> paType = new ArrayList<String>();
		for(WebElement PaTypeList : TotalPassportType){
			//paType.add(PaTypeList.getText());
			if(PaTypeList.getText().equalsIgnoreCase(PaType)){
				PaTypeList.click();
			}
		}
		//driver.findElement(By.xpath("//li[@id='" + PaType + "']")).click();
		
	}

	public void selectNationality(String NaName) throws InterruptedException {
		TestUtil.actionClassMethod(Nationality);
		//nationalitySearchField.sendKeys(NaName);
		//driver.findElement(By.xpath("//li[text()='" + NaName + "']")).click();
		System.out.println(TotalCountry.size());
        for(WebElement country : TotalCountry){
        	//System.out.println(country.getText());
        	if(country.getText().equalsIgnoreCase(NaName)){
        		country.click();
        		break;
        		
        	}
        	
        }
		
	}

	public void selectPortOfArrival(String PoArrival) {
		TestUtil.actionClassMethod(PortofArrival);
		driver.findElement(By.xpath("//li[text()='" + PoArrival + "']")).click();
	
	}
public void selectVisaType(String visaType) throws InterruptedException{
	TestUtil.actionClassMethod(SelectvisaType);
	for(WebElement viType :TotalVisaType){
		if(viType.getText().equalsIgnoreCase(visaType)){
			viType.click();
			break;
		
			
		}
		
	}
	
}
public void selectVisaLocation(String visaLocation) throws InterruptedException{
	Thread.sleep(2000);
	// Create object of WebDriverWait class and it will wait max of 20 seconds.
			// By default it will accepts in Seconds
			WebDriverWait wait = new WebDriverWait(driver, 20);
	 
			// Here we will wait until element is not visible, if element is visible then it will return web element
			// or else it will throw exception
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Select Visa Location']")));
	TestUtil.actionClassMethod(visaLocations);

	System.out.println("click on visalocation");
	for(WebElement viLocation : TotalVisaLocation){
		//System.out.println(viLocation.getText());
		System.out.println(visaLocation);
		if(viLocation.getText().equalsIgnoreCase(visaLocation)){
			System.out.println("before click");
			viLocation.click();
			System.out.println("after click");
			
		}
		
	}
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

	public void enterCaptchaField() throws InterruptedException {
		Thread.sleep(1000);
		String captcha = usercaptatext.getText();
		System.out.println(captcha);
		usercaptchacode.sendKeys(captcha);
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
