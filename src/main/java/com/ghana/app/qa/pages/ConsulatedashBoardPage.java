package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class ConsulatedashBoardPage extends TestBase {

	public ConsulatedashBoardPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='list-group list-group-flush']")
	List<WebElement> clickOnNewApplication;
	
	@FindBy(xpath = "//h6[contains(text(),'New Application')]")
	WebElement newApplicationBucket;
	
	@FindBy(xpath = "//h6[contains(text(),'Approved Applications')]")
	WebElement approvedApplicationsBucket;

	@FindBy(xpath = "//h6[contains(text(),'Rejected Application')]")
	WebElement rejectedApplicationBucket;
	
	@FindBy(xpath = "//h6[contains(text(),'Interview Scheduled')]")
	WebElement interviewScheduledBucket;

	@FindBy(xpath = "//h6[contains(text(),'HCG Application')]")
	WebElement HCGApplicationBucket;
	
	@FindBy(xpath = "//h6[contains(text(),'Flagged Application')]")
	WebElement flaggedApplicationBucket;
	
	@FindBy(xpath = "//span[@id='spanNewApp']")
	WebElement newApplicationCount;
	
	@FindBy(xpath = "//span[@id='spanHcgapp']")
	WebElement hCGApplicationCount;
	
	@FindBy(xpath = "//span[@id='spanAppro']")
	WebElement approveApplicationCount;
	
	@FindBy(xpath = "//span[@id='spanRej']")
	WebElement rejApplicationCount;
	
	@FindBy(xpath = "//span[@id='spanInterSc']")
	WebElement interviewApplicationCount;
	
	@FindBy(xpath = "//span[@id='spanFlagged']")
	WebElement flaggedApplicationCount;
	
	

	// Element of applicantion which is sent to HCD in CN side
	@FindBy(xpath = "//div[@id='myModal1']//h4[@class='modal-title'][contains(text(),'Confirmation')]")
	WebElement confirmationPop1;

	@FindBy(xpath = "//div[@id='myModal1']//button[@type='button'][contains(text(),'×')]")
	WebElement crossButton1;
	
	@FindBy(xpath = "//div[@id='myModal3']//button[@class='close'][contains(text(),'×')]")
	WebElement crossButtonFlag;
	
	@FindBy(xpath = "//div[@id='myModal2']//button[@class='close'][contains(text(),'×')]")
	WebElement crossButtonFromRejectBucket;
	
	@FindBy(xpath = "//div[@id='myModal1']//button[@type='button'][contains(text(),'Cancel')]")
	WebElement cancelButton1;
	
	@FindBy(xpath = "//div[@id='myModal3']//button[@class='btn btn-danger mr-2'][contains(text(),'Cancel')]")
	WebElement cancelButtonFromFlag;

	@FindBy(xpath = "//div[@id='myModal2']//button[@class='btn btn-danger mr-2'][contains(text(),'Cancel')]")
	WebElement cancelButtonRejectBucket;
	

	//@FindBy(xpath = "//div[@id='myModal1']//input[@value='Open' and @type='button']")
	
	@FindBy(xpath = "//div[@id='myModal1']//input[@class='btn btn-success mr-2']")
	WebElement openButton1;
	
	@FindBy(xpath = "//div[@id='myModal2']//input[@name='approve']")
	WebElement openButtonFromRejectBucket;
	
	@FindBy(xpath = "//div[@id='myModal3']//input[@name='approve']")
	WebElement openButtonFromFlagBucket;
	
	@FindBy(xpath = "//label[contains(text(),'This application is already sent to High Commsion')]")
	WebElement textFromPop1;

	@FindBy(xpath = "//div[@id='myModal2']//h4[@class='modal-title'][contains(text(),'Confirmation')]")
	WebElement confirmationPop2;
	
	@FindBy(xpath = "//div[@id='myModal3']//h4[@class='modal-title'][contains(text(),'Confirmation')]")
	WebElement confirmationPopFromFlag;
	
	@FindBy(xpath = "//div[@id='myModal2']//button[@type='button'][contains(text(),'Cancel')]")
	WebElement cancelButton2;
	
	@FindBy(xpath = "//div[@id='myModal2']//input[@value='Open']")
	WebElement openButton2;

	@FindBy(xpath = "//div[@id='myModal2']//button[@type='button'][contains(text(),'×')]")
	WebElement crossButton2;

	@FindBy(xpath = "//label[contains(text(),'This application is rejected, ')]")
	WebElement textFromPop2;
	
	public String getTextNewApplicationCount(){
		return newApplicationCount.getText();
	}
	
	public String getTexthCGApplicationCount(){
		return hCGApplicationCount.getText();
	}
	public String getTextrejApplicationCount(){
		return rejApplicationCount.getText();
	}
	public String getTextinterviewApplicationCount(){
		return interviewApplicationCount.getText();
	}
	public String getTextapproveApplicationCount(){
		return approveApplicationCount.getText();
	}
	public String getTextflaggedApplicationCount(){
		return flaggedApplicationCount.getText();
	}
	
	
	
	public String textNewApplicationBucket() throws InterruptedException {
        Thread.sleep(3000);
		return newApplicationBucket.getText();
	}
	public String textApprovedApplicationsBucket() throws InterruptedException {
        Thread.sleep(3000);
		return approvedApplicationsBucket.getText();
	}
	public String textRejectedApplicationBucket() throws InterruptedException {
        Thread.sleep(3000);
		return rejectedApplicationBucket.getText();
	}
	public String textInterviewScheduledBucket() throws InterruptedException {
        Thread.sleep(3000);
		return interviewScheduledBucket.getText();
	}
	public String textHCGApplicationBucket() throws InterruptedException {
        Thread.sleep(3000);
		return HCGApplicationBucket.getText();
	}
	public String textFlaggedApplicationBucket() throws InterruptedException {
        Thread.sleep(3000);
		return flaggedApplicationBucket.getText();
	}
	

	public String confirmationPopApplicationSentToHCD() throws InterruptedException {
           Thread.sleep(3000);
		return confirmationPop1.getText();
	}

	public void crossButton1PopApplicationSentToHCD() {
		TestUtil.clickOnElement(crossButton1);
	
	}
	public void crossButtonFromFlagBucket() {
		TestUtil.clickOnElement(crossButtonFlag);
	
	}
	
	
	
	public void crossButtonPopApplicationSentToRejectBucket() {
		TestUtil.clickOnElement(crossButtonFromRejectBucket);
	
	}
	
	
	public void cancelButton1PopApplicationSentToHCD() {
        TestUtil.clickOnElement(cancelButton1);
		
	}
	public void cancelButtonFromFlag() {
        TestUtil.clickOnElement(cancelButton1);
		
	}
	
	public void cancelButtonRejectBucketCN() {
        TestUtil.clickOnElement(cancelButtonRejectBucket);
		
	}
	
	public void openButton1PopApplicationSentToopenButtonFromRejectBucketHCD() {
		//waitForElementToVisible
		TestUtil.waitForElementToVisible(openButtonFromRejectBucket, 30);
		//TestUtil.clickOnElement(openButton1);
	
	}
	public void clickOnOpenButtonFromFlagApplication() {
		//waitForElementToVisible
		TestUtil.waitForElementToVisible(openButtonFromFlagBucket, 30);
		//TestUtil.clickOnElement(openButton1);
	
	}
	
	
	
	
	public void openButton1PopApplicationSentToHCD() {
		//waitForElementToVisible
		TestUtil.waitForElementToVisible(openButton1, 30);
		//TestUtil.clickOnElement(openButton1);
	
	}
	public String textFromPop1PopApplicationSentToHCD() {

		return textFromPop1.getText();
	}
	public String confirmationPop2ApplicationSentToHCD() throws InterruptedException {
		 Thread.sleep(3000);
		return confirmationPop2.getText();
	}
	public String confirmationPop2ApplicationSentToRejected() throws InterruptedException {
		 Thread.sleep(3000);
		return confirmationPop2.getText();
	}
	
	public String confirmationPop2ApplicationSentToFlag() throws InterruptedException {
		 Thread.sleep(3000);
		return confirmationPopFromFlag.getText();
	}
	
	
	public void crossButton2PopApplicationSentToHCD() {
		TestUtil.clickOnElement(crossButton2);
	
	}
	public void cancelButton2PopApplicationSentToHCD() {
		TestUtil.clickOnElement(cancelButton2);
		
	}
	public void openButton2PopApplicationSentToHCD() {
		TestUtil.clickOnElement(openButton2);

	}
	public String textFromPop2ApplicationSentToHCD() throws InterruptedException {
		 Thread.sleep(3000);
		return textFromPop2.getText();
	}
	public String textFromPop2ApplicationSentToRejected() throws InterruptedException {
		 Thread.sleep(3000);
		return textFromPop2.getText();
	}
	
	
	public void clickOnNewApplication() {

		for (WebElement we : clickOnNewApplication) {
			we.click();
			break;
		}

	}
	// location.href="HCDGeneralInfoVerification/0F8B99BC2AE0/tourist/processing;"
}
