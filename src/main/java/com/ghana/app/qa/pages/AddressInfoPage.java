package com.ghana.app.qa.pages;

import static com.ghana.app.qa.testdata.ConstantVariable.visaFees;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class AddressInfoPage extends TestBase {

	public AddressInfoPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from address information page
	@FindBy(xpath = "//h5[contains(text(),'Address Information')]")
	WebElement addressInfoPageTitle;

	@FindBy(xpath = "//span[text()='Former Nationality']")
	WebElement FormerNationality;

	@FindBy(xpath = "//select[@id='sel_formar']")
	WebElement getTextfromFormerNationality;

	@FindBy(xpath = "//span[@class='sel__box__options sel--superman']")
	List<WebElement> TotalFormerNationality;

	@FindBy(xpath = "//input[@id='former_nationality_search']")
	WebElement former_nationality_search;

	@FindBy(xpath = "//div[@class='selfrm sel--superman active']")
	WebElement formaerNationalty;

	@FindBy(xpath = "//div[@id='nav-address']//span[text()='None']")
	WebElement former_nationality_click;
	@FindBy(xpath = "//input[@id='nationalityText']")
	WebElement nationalityText;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='phone_number']")
	WebElement phone_number;

	// manage address
	@FindBy(xpath = "//input[@id='flat_no']")
	WebElement flat_no;

	@FindBy(xpath = "//input[@id='street']")
	WebElement street;

	@FindBy(xpath = "//input[@id='landmark']")
	WebElement landmark;

	@FindBy(xpath = "//input[@id='pincode']")
	WebElement pincode;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	@FindBy(xpath = "//input[@id='mailing_country']")
	WebElement mailing_country;
	
	@FindBy(xpath = "//span[text()='Address Type']")
	WebElement AddressType;
	
	@FindBy(xpath = "//div[@class='sel sel--superman active']//span[@class='sel__box__options sel__box__options--superman']")
	List<WebElement> totalAddressType;
	
	@FindBy(xpath = "//select[@id='sel_addresstype']")
	WebElement getTextAddressType;
	
	@FindBy(xpath = "//span[text()='Present Address']")
	WebElement PresentAddress;
	@FindBy(xpath = "//div[@id='nav-address']//input[@value='Previous']")
	WebElement PreviousBtn;
	@FindBy(id = "applicant_address_info_form_btn")
	WebElement saveContinueBtn;
	@FindBy(xpath = "//input[@id='emergency_firstname']")
	WebElement emergency_firstname;
	@FindBy(xpath = "//input[@id='emergency_lastname']")
	WebElement emergency_lastname;

	public String getTextAddressInfoPageTitle() throws InterruptedException {
		Thread.sleep(2000);
		return addressInfoPageTitle.getText();

	}

	public void selectFormerNaitonality() throws InterruptedException,
			IOException {
		TestUtil.actionClassMethod(FormerNationality);
		System.out.println("Element ========================>"
				+ TotalFormerNationality.size());
		for (WebElement formarNaionality : TotalFormerNationality) {
			if (formarNaionality.getText().equalsIgnoreCase(
					TestUtil.readDataFromExcellString(7, 3, 0))) {
				formarNaionality.click();
			}

		}

	}

	public String getTextFromFormaernationaltity() throws InterruptedException {
		return getTextfromFormerNationality.getAttribute("value");
	}

	public void passFlatNumber(String FlatNo) throws InterruptedException {
		flat_no.sendKeys(FlatNo);
	}

	public String getTextFlatNumber() throws InterruptedException {
		return flat_no.getAttribute("value");

	}

	public void passStreetName(String StreetName) {
		street.sendKeys(StreetName);
	}

	public String geTextStreetName() throws InterruptedException {
		return street.getAttribute("value");
	}

	public void passLandmark(String Landmark) {
		landmark.sendKeys(Landmark);
	}

	public String getTextLandmark() throws InterruptedException {
		return landmark.getAttribute("value");
	}

	public void passPincode(String Pincode) {
	
		pincode.sendKeys(Pincode);
	}

	public String getTextPincode() throws InterruptedException {
		return pincode.getAttribute("value");

	}

	public void passCityName(String Cityname) {
		city.sendKeys(Cityname);
	}
	public String getTextCityName() throws InterruptedException {
		return city.getAttribute("value");
	}

	public void passStateName(String State) {
		state.sendKeys(State);
	}
	public String getTextStateName() throws InterruptedException {
		return state.getAttribute("value");
	}
	
	public void passCountryName(String CountryName) {
		mailing_country.sendKeys(CountryName);
	}
	public String getTextCountryName() throws InterruptedException {
		return mailing_country.getAttribute("value");
	}
	
	public void selectAddressType() throws IOException, InterruptedException {
		TestUtil.actionClassMethod(AddressType);
		System.out.println("Total address type===>"+ totalAddressType.size());
		for (WebElement addressType : totalAddressType){
			System.out.println("Total address type===>"+ addressType.getText());
			if(addressType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(7, 11, 0))){
				addressType.click();
			}
		}

	}
	public String getTextFromAddressType() throws InterruptedException{
		return getTextAddressType.getAttribute("value");
	}

	public void clickSaveAndContinuebtn() {
		saveContinueBtn.click();

	}
}


/*driver.findElement(
				By.xpath("//span[contains(text(),'" + selectAddressType + "')]"))
				.click();
 * public void PassAddressInfofield(String FlatNo, String StreetName, String
 * Landmark, String Pincode, String Cityname, String State, String CountryName)
 * { flat_no.sendKeys(FlatNo); street.sendKeys(StreetName);
 * landmark.sendKeys(Landmark); pincode.sendKeys(Pincode);
 * city.sendKeys(Cityname); state.sendKeys(State);
 * mailing_country.sendKeys(CountryName);
 * 
 * TestUtil.actionClassMethod(AddressType); driver.findElement(
 * By.xpath("//span[contains(text(),'" + selectAddressType + "')]")) .click();
 * 
 * }
 */