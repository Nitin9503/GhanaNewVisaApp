package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class HCDDashboardPage extends TestBase {

	public HCDDashboardPage() throws IOException, InterruptedException {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='list-group list-group-flush']")
	List<WebElement> clickOnNewApplication;
	
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
	
	
	
	public void clickOnNewApplication(){
		
		for (WebElement we :clickOnNewApplication ){
			String value =we.getAttribute("onclick");
			System.out.println("value==>" +value);
		we.click();
		break;
		}
	}
		public String titleofHCDDashBoard (){		
			return driver.getTitle();
			
		}
		
	
	
	
	
}
