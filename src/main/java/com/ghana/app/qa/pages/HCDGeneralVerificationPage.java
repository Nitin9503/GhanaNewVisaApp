package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class HCDGeneralVerificationPage extends TestBase {

	public HCDGeneralVerificationPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Applicant Information']")
	WebElement applicantInforClick;

	@FindBy(xpath = "//span[text()='Document Verification']")
	WebElement documentVeriClick;

	@FindBy(xpath = "//span[text()='Schedule Interview']")
	WebElement scheduleInterviewClick;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement nextButton;

	public void clickOnnNxtButton() {

		TestUtil.clickOnElement(nextButton);
	}

	public void clickOnDocumentVeri() {

		TestUtil.clickOnElement(documentVeriClick);
	}

	public void clickOnApplicantInfor() {

		TestUtil.clickOnElement(applicantInforClick);
	}

	public void clickOnScheduleInterview() {
		TestUtil.clickOnElement(scheduleInterviewClick);

	}

	public String titleOfCNDocumentVerificatonPage() {

		return driver.getTitle();
	}

}
