package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class HCDDashboardPage extends TestBase {

	public HCDDashboardPage() throws IOException, InterruptedException {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='list-group list-group-flush']")
	List<WebElement> clickOnNewApplication;

	@FindBy(xpath = "//h6[contains(text(),'Mumbai')]")
	WebElement textMumbaiBucket;

	@FindBy(xpath = "//h6[contains(text(),'Approved Applications')]")
	WebElement textapprovedApplicationsBucket;

	@FindBy(xpath = "//h6[contains(text(),'Interview Scheduled')]")
	WebElement textInterviewBucket;

	@FindBy(xpath = "//h6[contains(text(),'Rejected Applications')]")
	WebElement textRejectedBucket;

	@FindBy(xpath = "//h6[contains(text(),'Flagged Applications')]")
	WebElement textFlaggedBucket;

	@FindBy(xpath = "//span[@id='spanMumbai']")
	WebElement mumbaiApplicationCount;

	@FindBy(xpath = "//span[@id='spanInterview']")
	WebElement hCDInterviewCount;

	@FindBy(xpath = "//span[@id='spanApproved']")
	WebElement hCDApproveCount;

	@FindBy(xpath = "//span[@id='spanReject']")
	WebElement hCDRejectCount;

	@FindBy(xpath = "//span[@id='spanReject']")
	WebElement hCDFlaggedCount;

	@FindBy(xpath = "//div[@id='myModal1']//h4[@class='modal-title'][contains(text(),'Confirmation')]")
	WebElement confirmationPop1;

	@FindBy(xpath = "//div[@id='myModal1']//button[@class='close'][contains(text(),'×')]")
	WebElement crossButtonFromApproveBucket;
	
	@FindBy(xpath = "//div[@id='myModal3']//button[@class='close'][contains(text(),'×')]")
	WebElement crossButtonFlag;

	@FindBy(xpath = "//div[@id='myModal2']//button[@class='close'][contains(text(),'×')]")
	WebElement crossButtonFromRejectBucket;

	@FindBy(xpath = "//div[@id='myModal1']//button[@class='btn btn-danger mr-2'][contains(text(),'Cancel')]")
	WebElement cancelButtonApproveBucket;

	@FindBy(xpath = "//div[@id='myModal3']//button[@class='btn btn-danger mr-2'][contains(text(),'Cancel')]")
	WebElement cancelButtonFromFlag;

	@FindBy(xpath = "//div[@id='myModal2']//button[@class='btn btn-danger mr-2'][contains(text(),'Cancel')]")
	WebElement cancelButtonRejectBucket;

	// @FindBy(xpath = "//div[@id='myModal1']//input[@value='Open' and
	// @type='button']")

	@FindBy(xpath = "//div[@id='myModal1']//input[@name='approve']")
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

	public String getTextMumbaiBucket() {
		return textMumbaiBucket.getText();
	}

	public String getTextApprovedApplicationsBucket() {
		return textapprovedApplicationsBucket.getText();
	}

	public String getTextInterviewBucket() {
		return textInterviewBucket.getText();
	}

	public String getTextRejectedBucket() {
		return textRejectedBucket.getText();
	}

	public String getTextMumbaiApplicationCount() {
		return mumbaiApplicationCount.getText();
	}

	public String getTextHCDApproveCount() {
		return hCDApproveCount.getText();
	}

	public String getTextHCDInterviewCount() {
		return hCDInterviewCount.getText();
	}

	public String getTextHCDRejectCount() {
		return hCDRejectCount.getText();
	}

	public String getTextHCDFlaggedCount() {
		return hCDFlaggedCount.getText();
	}

	public String getTextConfirmationPopApproveBucket() throws InterruptedException {
			
		Thread.sleep(3000);
		return confirmationPop1.getText();
	}

	public void crossButtonPopApproveBucket() {
		TestUtil.clickOnElement(crossButtonFromApproveBucket);

	}

	public void crossButtonFromFlagBucket() {
		TestUtil.clickOnElement(crossButtonFlag);

	}

	public void crossButtonPopApplicationSentToRejectBucket() {
		TestUtil.clickOnElement(crossButtonFromRejectBucket);

	}

	public void cancelButtonPopApproveBucket() {
		TestUtil.clickOnElement(cancelButtonApproveBucket);

	}

	public void cancelButtonFromFlag() {
		TestUtil.clickOnElement(cancelButtonApproveBucket);

	}

	public void cancelButtonRejectBucketCN() {
		TestUtil.clickOnElement(cancelButtonRejectBucket);

	}

	public void clickOnOpenButtonFromApproveHCDBucket() {
		// waitForElementToVisible
		TestUtil.waitForElementToVisible(openButtonFromRejectBucket, 30);
		// TestUtil.clickOnElement(openButton1);

	}

	public void clickOnOpenButtonFromFlagApplication() {
		TestUtil.waitForElementToVisible(openButtonFromFlagBucket, 30);
	}

	public void openButton1PopApplicationSentToHCD() {
		TestUtil.waitForElementToVisible(openButton1, 30);

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
			String value = we.getAttribute("onclick");
			System.out.println("value==>" + value);
			we.click();
			break;
		}
	}

	public String titleofHCDDashBoard() {
		return driver.getTitle();

	}

}
