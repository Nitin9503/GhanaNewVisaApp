package com.ghana.app.qa.pages;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;
public class HCDDocumentVerificationPage extends TestBase {

	public HCDDocumentVerificationPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Reject']")
	WebElement reject;

	@FindBy(xpath = "//button[text()='Approve']")
	WebElement approve;

	@FindBy(xpath = "//div[@id='myModal1']//h4[@class='modal-title'][contains(text(),'Confirmation')]")
	WebElement acceptConfirmationPop;
	
	@FindBy(xpath = "//div[@id='myModal']//h4[@class='modal-title'][contains(text(),'Confirmation')]")
	WebElement rejectConfirmationPop;

	@FindBy(xpath = "//div[@id='myModal']//button[@type='button'][contains(text(),'Cancel')]")
	WebElement cancelFromRejectPop;

	@FindBy(xpath = "//input[@value='Reject']")
	WebElement rejectFromRejectConfir;

	@FindBy(xpath = "//div[@id='myModal']//button[@type='button'][contains(text(),'×')]")
	WebElement closeFromRejectConfir;

	@FindBy(xpath = "//textarea[@id='reasonId']")
	WebElement reason;
	
	@FindBy(xpath = "//div[@id='myModal1']//button[@type='button'][contains(text(),'Cancel')]")
	WebElement cancelFromApprove;

	@FindBy(xpath = "//input[@value='Approve']")
	WebElement confirmFromApprove;

	@FindBy(xpath = "//div[@id='myModal1']//button[@type='button'][contains(text(),'×')]")
	WebElement closeApprove;

	@FindBy(xpath = "//input[@value='Flag And Reject']")
	WebElement flagAndReject;

	@FindBy(xpath = "//input[@name='chkBox']")
	List<WebElement> checkBox;

	@FindBy(id = "selectAllCheck")
	private WebElement selectAllCheckBox;

	@FindBy(xpath = "//div[@class='form-group row']//div[1]//img[1]")
	private WebElement confirmAirTicket;

	@FindBy(xpath = "//div[@class='col-sm-4 stretch-card']//div[2]//img[1]")
	private WebElement clickOnPhoto;

	@FindBy(xpath = "//div[3]//img[1]")
	private WebElement yellowFeverVaccination;

	@FindBy(xpath = "//div[4]//img[1]")
	private WebElement coveringLetter;

	@FindBy(xpath = "//div[5]//img[1]")
	private WebElement photoCopyOfDraft;

	@FindBy(xpath = "//div[6]//img[1]")
	private WebElement idProofOfReference;

	@FindBy(xpath = "//div[7]//img[1]")
	WebElement originalInvitationLetter;

	@FindBy(xpath = "//div[8]//img[1]")
	WebElement proofOfTransitValidVisa;

	@FindBy(xpath = "//h4[text()='Confirmed air ticket']")
	WebElement titleOfConfirmedAirTicketWindow;

	@FindBy(xpath = "//h4[contains(text(),'Recent passport size photo')]")
	WebElement titleOfRecentPhotoWindow;

	@FindBy(xpath = "//h4[contains(text(),'Yellow fever vaccination')]")
	WebElement titleOfYellowFeverWindow;

	@FindBy(xpath = "//h4[contains(text(),'Covering letter')]")
	WebElement titleOfCoveringLetterWindow;

	@FindBy(xpath = "//h4[contains(text(),'Photocopy of draft')]")
	WebElement titleOfPhotocopyOfDraftWindow;

	@FindBy(xpath = "//h4[contains(text(),'ID proof of reference')]")
	WebElement titleOfIDProofOfReferenceWindow;

	@FindBy(xpath = "//h4[contains(text(),'Original invitation letter')]")
	WebElement titleOfOriginalInvitationLetterWindow;

	@FindBy(xpath = "//h4[contains(text(),'Proof of transit valid visa')]")
	WebElement titleOfProofOfTransitValidVisaWindow;

	@FindBy(xpath = "//div[@class='modal fade show']//button[@type='button'][contains(text(),'×')]")
	WebElement crossButtonToCloseWindow;

	@FindBy(xpath = "//button[@type='button'][contains(text(),'Close')]")
	List<WebElement> closeButtonToCloseWindow;

	@FindBy(xpath = "//h1[@class='card-title']")
	WebElement documentVerificationText;
	
	@FindBy(xpath = "//input[@id='txt_comment']")
	WebElement passComment;
	
	@FindBy(xpath = "//button[text()='Add']")
	WebElement addComment;
	
	@FindBy(xpath = "//div[@class='commentText']")
	WebElement textFromPassComment;
	
	@FindBy(xpath = "//button[contains(text(),'Previous')]")
	WebElement previous;
	
	
	public void previousButtonFromDocument(){		
		previous.click();
		
	}
	
	public void passComment(String comment){		
		passComment.sendKeys(comment);
		
	}
	public void addCooment(){		
		addComment.click();
		
	}
	public void getTextFromApprovePopButton(){		
		
		String value = confirmFromApprove.getAttribute("value");
		getTextFromApproveFromHCD	= value.replaceAll(value, "Approve Application");
		
	}
	
	
	
	
	
	public String getTextFromAddedComment(){		
		String str = textFromPassComment.getText();
		String properString =str.substring(0, str.length()-21);
		return properString;
		
	}

	public String getTextDocumentVerification() {
		return documentVerificationText.getText();

	}

	public void crossButtonToCloseWindow() throws InterruptedException {
		/*
		 * TestUtil.waitForElemenToClick(crossButtonToCloseWindow.get(0), 60);
		 * System.out.println("crossButtonToCloseWindow.get(0)==>"
		 * +crossButtonToCloseWindow.get(0));
		 */
		Thread.sleep(5000);
		// WebElement crossCloseButton = crossButtonToCloseWindow.get(0);
		TestUtil.clickOnElement(crossButtonToCloseWindow);

	}

	public void closeButtonToCloseWindow1() {
		TestUtil.waitForElemenToClick(closeButtonToCloseWindow.get(0), 60);
		WebElement closeButton = closeButtonToCloseWindow.get(0);
		TestUtil.actionClassMethod(closeButton);
	}

	public void closeButtonToCloseWindow2() {
		TestUtil.waitForElemenToClick(closeButtonToCloseWindow.get(1), 60);
		WebElement closeButton = closeButtonToCloseWindow.get(1);
		TestUtil.actionClassMethod(closeButton);
	}

	public void closeButtonToCloseWindow3() {
		TestUtil.waitForElemenToClick(closeButtonToCloseWindow.get(2), 60);
		WebElement closeButton = closeButtonToCloseWindow.get(2);
		TestUtil.actionClassMethod(closeButton);
	}

	public void closeButtonToCloseWindow4() {
		TestUtil.waitForElemenToClick(closeButtonToCloseWindow.get(3), 60);
		WebElement closeButton = closeButtonToCloseWindow.get(3);
		TestUtil.actionClassMethod(closeButton);
	}

	public void closeButtonToCloseWindow5() {
		TestUtil.waitForElemenToClick(closeButtonToCloseWindow.get(4), 60);
		WebElement closeButton = closeButtonToCloseWindow.get(4);
		TestUtil.actionClassMethod(closeButton);
	}

	public void closeButtonToCloseWindow6() {
		TestUtil.waitForElemenToClick(closeButtonToCloseWindow.get(5), 60);
		WebElement closeButton = closeButtonToCloseWindow.get(5);
		TestUtil.actionClassMethod(closeButton);
	}

	public void closeButtonToCloseWindow7() {
		TestUtil.waitForElemenToClick(closeButtonToCloseWindow.get(6), 60);
		WebElement closeButton = closeButtonToCloseWindow.get(6);
		TestUtil.actionClassMethod(closeButton);
	}

	public void closeButtonToCloseWindow8() {
		TestUtil.waitForElemenToClick(closeButtonToCloseWindow.get(7), 60);
		WebElement closeButton = closeButtonToCloseWindow.get(7);
		TestUtil.actionClassMethod(closeButton);
	}

	public void clickOnConfirmAirTicket() throws InterruptedException {
		TestUtil.clickOnElement(confirmAirTicket);

	}

	public void clickOnYellowFevervaccination() throws InterruptedException {
		TestUtil.clickOnElement(yellowFeverVaccination);

	}

	public void clickOnCoveringLetter() throws InterruptedException {
		TestUtil.clickOnElement(coveringLetter);

	}

	public void clickOnPhotoOfDraft() throws InterruptedException {
		Thread.sleep(2000);
		TestUtil.clickOnElement(photoCopyOfDraft);

	}

	public void clickOnIdProofReference() {
		TestUtil.clickOnElement(idProofOfReference);

	}

	public void clickOnOriginalInvitationLetter() {
		TestUtil.clickOnElement(originalInvitationLetter);

	}

	public void clickOnProofOfTransitVisa() {
		TestUtil.clickOnElement(proofOfTransitValidVisa);

	}

	public void clickOnPhoto() {
		TestUtil.clickOnElement(clickOnPhoto);

	}

	public String titleOfConfirmedAirTicketWindow() throws InterruptedException {
		Thread.sleep(2000);
		TestUtil.waitForElementToVisible(titleOfConfirmedAirTicketWindow, 60);
		return titleOfConfirmedAirTicketWindow.getText();
	}

	public String titleOfRecentPhotoWindow() throws InterruptedException {
		TestUtil.waitForElementToVisible(titleOfRecentPhotoWindow, 60);
		return titleOfRecentPhotoWindow.getText();

	}

	public String titleOfYellowFeverWindow() {
		TestUtil.waitForElementToVisible(titleOfYellowFeverWindow, 60);
		return titleOfYellowFeverWindow.getText();

	}

	public String titleOfCoveringLetterWindow() {
		TestUtil.waitForElementToVisible(titleOfCoveringLetterWindow, 60);
		return titleOfCoveringLetterWindow.getText();
	}

	public String titleOfPhotocopyOfDraftWindow() {
		TestUtil.waitForElementToVisible(titleOfPhotocopyOfDraftWindow, 60);
		return titleOfPhotocopyOfDraftWindow.getText();

	}

	public String titleOfIDProofOfReferenceWindow() {
		TestUtil.waitForElementToVisible(titleOfIDProofOfReferenceWindow, 60);
		return titleOfIDProofOfReferenceWindow.getText();

	}

	public String titleOfOriginalInvitationLetterWindow() {
		TestUtil.waitForElementToVisible(titleOfOriginalInvitationLetterWindow, 60);
		return titleOfOriginalInvitationLetterWindow.getText();

	}

	public String titleOfProofOfTransitValidVisaWindow() {
		TestUtil.waitForElementToVisible(titleOfProofOfTransitValidVisaWindow, 60);
		return titleOfProofOfTransitValidVisaWindow.getText();

	}

	public String getTextFromAcceptConfirmationPop() {
		TestUtil.waitForElementToVisible(acceptConfirmationPop, 60);
		return acceptConfirmationPop.getText();

	}

	public void clickOnReject() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TestUtil.actionClassMethod(reject);

	}

	public void selectAllCheckBoxes() throws InterruptedException {
		Thread.sleep(2000);
		selectAllCheckBox.click();
	}

	public void verifyAllCheckBox() throws InterruptedException {
		Thread.sleep(2000);
		selectedBoxDocAll = selectAllCheckBox.isSelected();
		System.out.println("selectedBox==>" + selectedBoxDocAll);
		int size = checkBox.size();
		System.out.println("size==>" + size);
		for (int i = 0; i < checkBox.size(); i++) {
			WebElement check = checkBox.get(i);
			selectedCheckBoxOnDocSingle = check.isSelected();
		}
	}

	public void selectOneByOneCheckBox() throws InterruptedException {

		int size = checkBox.size();
		System.out.println("size==>" + size);
		for (int i = 0; i < checkBox.size(); i++) {
			WebElement check = checkBox.get(i);
			TestUtil.actionClassMethod(check);

		}

	}

	public void verifyOneByOneCheckBox() throws InterruptedException {

		int size = checkBox.size();
		System.out.println("size==>" + size);
		for (int i = 0; i < checkBox.size(); i++) {
			WebElement check = checkBox.get(i);
			selectedCheckBoxOnDocSingle = check.isSelected();
		}
	}

	public void clickOnApprove() {
		/*
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * TestUtil.actionClassMethod(approve);
		 */
		TestUtil.clickOnElement(approve);
	}


	public void clickOnCancelFromRejectPop() {
		cancelFromRejectPop.click();

	}

	public void clickOnRejectFromRejectConfir() {
		rejectFromRejectConfir.click();

	}

	public void clickOnCloseFromRejectConfir() {
		closeFromRejectConfir.click();

	}

	public String textFromRejectConfirmationPop() {
		TestUtil.waitForElementToVisible(rejectConfirmationPop, 60);
		return rejectConfirmationPop.getText();
	}

	public void clickOnAcceptConfirmationPop() {
		acceptConfirmationPop.click();

	}

	public void clickOnCancelFromApprove() {
		cancelFromApprove.click();

	}

	public void clickOnConfirmFromApprove() throws InterruptedException {
		Thread.sleep(3000);
		TestUtil.clickOnElement(confirmFromApprove);
	

	}

	public void clickOnFlagAndReject() {
		flagAndReject.click();

	}

	public void clickOnCloseApprove() {
		closeApprove.click();

	}

	public String titleOfCNDocumentVerificatonPage() {
		return driver.getTitle();

	}

}
