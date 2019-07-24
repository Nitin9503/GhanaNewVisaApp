package com.ghana.app.qa.pages;

import java.io.IOException;
import static com.ghana.app.qa.testdata.ConstantVariable.applicationID;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class ApplicantDashBoardPage extends TestBase {

	public ApplicantDashBoardPage() throws IOException, InterruptedException {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Applicant Information']")
	WebElement applicantInforClick;
	
	@FindBy(xpath = "//span[text()='Address Information']")
	WebElement addressInforClick;

	@FindBy(xpath = "//span[text()='Travel Information']")
	WebElement travelInforClick;
	
	@FindBy(xpath = "//span[text()='Document Verification']")
	WebElement documentVeriClick;
		
	@FindBy(xpath = "//span[text()='Schedule Interview']")
	WebElement scheduleInterviewClick;
	
	@FindBy(id = "applicantID")
	WebElement applicationId ;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail2' and @value='Employment']")
	WebElement yettoconfirm ;
	
	@FindBy(xpath = "//div[@class='col-sm-6']//input[@id='exampleInputEmail2']")
	WebElement visaType ;

	@FindBy(id = "visafee")
	WebElement visaFees ;
	
	@FindBy(id = "firstlastname")
	WebElement fullName ;
	
	@FindBy(id = "passportnumber")
	WebElement passportNumber ;
	
	@FindBy(id = "dateofbirth")
	WebElement dateOfBirth ;
	
	@FindBy(id = "passportexpirydate")
	WebElement passportExpiryDate;
	
	@FindBy(id = "passportdateofissue")
	WebElement dateOfPassportIssue;
	
	@FindBy(id = "placeofbirth")
	WebElement birthPlace;
	
	@FindBy(xpath = "//button[text()='Back']")
	WebElement backButton;
	
	@FindBy(xpath = "//div[@class='form-group row']//button[text()='Cancel' and @type='button']")
	WebElement cancelButton;
	
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//input[@id='txt_comment']")
	WebElement passComment;
	
	@FindBy(xpath = "//button[text()='Add']")
	WebElement addComment;
	
	@FindBy(xpath = "//div[@class='commentText']")
	WebElement textFromPassComment;
		

	public String getTextapplicationId(){
		return applicationId.getAttribute("value");
	}
	
	public String getTextVisaFees(){
		return visaFees.getAttribute("value");
	}
	public String getTextFullName() throws InterruptedException{
		Thread.sleep(3000);
		return fullName.getAttribute("value");

	}
	
	public String getTextPassportNumber(){
		return passportNumber.getAttribute("value");
	}
	public String getTextDateOfBirth(){
		return dateOfBirth.getAttribute("value");
	}
	public String getTextPassportExpiryDate(){
		return passportExpiryDate.getAttribute("value");
	}
	public String getTextDateOfPassportIssue(){
		return dateOfPassportIssue.getAttribute("value");
	}
	
	public String getTextBirthPlace(){
		return birthPlace.getAttribute("value");
	}

	
	
	public void clickOnNextButton(){
		nextButton.click();
	}
	public void clickOnBackButton(){
		backButton.click();
	}
	
	public void clickOnCancelButton(){
		cancelButton.click();
	}
	public void clickOnApplicantInfor(){
		applicantInforClick.click();
	}

	public void clickOnTravelInfor(){
		travelInforClick.click();
	}
	
	public void clickOnDocumentVeri(){
		documentVeriClick.click();
	}
	
	public void clickOnScheduleInterview(){
		TestUtil.clickOnElement(scheduleInterviewClick);
		
	}
	
	public void clickOnAddressInfor(){
		addressInforClick.click();
	}
	
	public String titleOfApplicationDetailsPage(){		
		return driver.getTitle();
		
	}
	
	public void passComment(String comment){		
		passComment.sendKeys(comment);
		
	}
	public void addCooment(){		
		addComment.click();
		
	}
	public void applicationID(){		
		applicationID = applicationId.getText();
		System.out.println("applicationID===>" +applicationID);
		
	}
	public String getTextFromAddedComment(){		
		String str = textFromPassComment.getText();
		String properString =str.substring(0, str.length()-21);
		return properString;
		
	}


}
