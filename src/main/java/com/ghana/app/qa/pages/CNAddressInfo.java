package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class CNAddressInfo extends TestBase {

	public CNAddressInfo() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "formarnationality")
	WebElement farmerNationality;

	@FindBy(id = "nationality")
	WebElement nationality;
		
	@FindBy(id = "emailID")
	WebElement emailID;
		
	@FindBy(id = "phoneNumber")
	WebElement phoneNumber;
		
	@FindBy(id = "addressText")
	WebElement address;
	
	@FindBy(id = "landmarkText")
	WebElement landmark;
	
	@FindBy(id = "zipCode")
	WebElement cityAndPinCode;

	@FindBy(id = "state")
	WebElement state;

	@FindBy(id = "country")
	WebElement country;
	

	public String titleOfCNAddressInfoPage(){	
		return driver.getTitle();
		
	}
	
	public String getTextFromFormarNationality(){	
		return farmerNationality.getAttribute("value");
	}
	
	public String getTextFromNationality(){	
		return nationality.getAttribute("value");
		
	}
	public String getTextFromEmailID() throws InterruptedException{	
		Thread.sleep(3000);
		return emailID.getAttribute("value");
		
	}
	public String getTextFromPhoneNumber(){	
		return phoneNumber.getAttribute("value");
		
	}
	
	public String getTextlandmark(){
		return landmark.getAttribute("value");
	}
	public String getTextFromAddress(){	
		return address.getAttribute("value");
		
	}
	public String getTextFromCityAndPinCode(){	
		return cityAndPinCode.getAttribute("value");
		
	}
	public String getTextFromState(){	
		return state.getAttribute("value");
		
	}
	public String getTextFromCountry(){	
		return country.getAttribute("value");
		
	}
}
