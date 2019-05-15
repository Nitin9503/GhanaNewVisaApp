package com.ghana.app.qa.xl.pages;

import static com.ghana.app.qa.testdata.ConstantVariable.visaFees;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import static com.ghana.app.qa.testdata.ConstantVariable.*;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class AddressInfoXlPage extends TestBase {

	public AddressInfoXlPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from address information page
	@FindBy(xpath = "//h5[contains(text(),'Address Information')]")
	WebElement addressInfoPageTitle;
	@FindBy(xpath = "//span[text()='Former Nationality']")
	WebElement FormerNationality;
	@FindBy(xpath = "//input[@id='former_nationality_search']")
	WebElement former_nationality_search;
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

	public String getTextAddressInfoPageTitle() throws InterruptedException{
		Thread.sleep(2000);
		return addressInfoPageTitle.getText();
		
	}
	public void selectFormerNaitonality(String formerNationalty ) throws InterruptedException {
		TestUtil.actionClassMethod(FormerNationality);
		driver.findElement(By.xpath("//div[@id='nav-address']//span[text()='"+formerNationalty+"']")).click();
		//former_nationality_search.sendKeys("India");
		//Thread.sleep(2000);sel_formar
		//former_nationality_click.click();
		/*Select oSelect = new Select(driver.findElement(By.id("sel_formar")));
		Thread.sleep(2000);
		oSelect.selectByVisibleText(selectFormerNationlity);*/

	}

	public void PassAddressInfofield(String FlatNo, String StreetName,
			String Landmark, String Pincode, String Cityname, String State,
			String CountryName, String AddressTypes) {
		flat_no.sendKeys(FlatNo);
		street.sendKeys(StreetName);
		landmark.sendKeys(Landmark);
		pincode.sendKeys(Pincode);
		city.sendKeys(Cityname);
		state.sendKeys(State);
		mailing_country.sendKeys(CountryName);
		
		TestUtil.actionClassMethod(AddressType);
		driver.findElement(
				By.xpath("//span[contains(text(),'" + AddressTypes + "')]"))
				.click();

	}
   public void clickSaveAndContinuebtn(){
	   saveContinueBtn.click();
	   
	
}
}
