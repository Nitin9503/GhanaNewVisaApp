package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class CNTravelInfo extends TestBase {

	public CNTravelInfo() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ticketnumber")
	WebElement ticketNumber;

	@FindBy(id = "travellingby")
	WebElement travelBy;

	@FindBy(id = "purposeofjourney")
	WebElement purposeOfVisit;

	@FindBy(id = "refName1")
	WebElement referenceName1;

	@FindBy(id = "refName2")
	WebElement referenceName2;

	@FindBy(id = "refContact1")
	WebElement referenceContact1;

	@FindBy(id = "refContact2")
	WebElement referenceContact2;

	@FindBy(id = "refAddress1")
	WebElement referenceAddress1;

	@FindBy(id = "refAddress2")
	WebElement referenceAddress2;

	@FindBy(id = "refZipcode1")
	WebElement referenceCity1;

	@FindBy(id = "refCity2")
	WebElement referenceCity2;

	@FindBy(id = "refState1")
	WebElement referenceState1;

	@FindBy(id = "refState2")
	WebElement referenceState2;

	@FindBy(id = "refCountry1")
	WebElement referenceCountry1;

	@FindBy(id = "refCountry2")
	WebElement referenceCountry2;

	public String titleOfCNTravelInfoPage(){
		return driver.getTitle();
	}
	
	public String getTextticketNumber() {
		return driver.getTitle();

	}

	public String getTextzticketNumber() {
		return ticketNumber.getAttribute("value");

	}
	public String getTextTravelBy() {
		return travelBy.getAttribute("value");

	}
	public String getTextPurposeOfVisit() {
		return purposeOfVisit.getAttribute("value");

	}
	public String getTextReferenceName1() {
		return referenceName1.getAttribute("value");

	}
	public String getTextReferenceContact1() {
		return referenceContact1.getAttribute("value");

	}
	
	public String getTextReferenceName2() {
		return referenceName2.getAttribute("value");

	}

	public String getTextReferenceContact2() {
		return referenceContact2.getAttribute("value");

	}
	public String getTextReferenceAddress1() {
		return referenceAddress1.getAttribute("value");

	}
	public String getTextReferenceAddress2() {
		return referenceAddress2.getAttribute("value");

	}
	public String getTextReferenceCity1() {
		return referenceCity1.getAttribute("value");

	}
	public String getTextReferenceCity2() {
		return referenceCity2.getAttribute("value");

	}
	public String getTextReferenceState1() {
		return referenceState1.getAttribute("value");

	}
	public String getTextReferenceState2() {
		return referenceState2.getAttribute("value");

	}
	public String getTextReferenceCountry1() {
		return referenceCountry1.getAttribute("value");

	}
	public String getTextReferenceCountry2() {
		return referenceCountry2.getAttribute("value");

	}
	
}
