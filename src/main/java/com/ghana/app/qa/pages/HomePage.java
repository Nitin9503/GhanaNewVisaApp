package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class HomePage extends TestBase {

	
	public HomePage()throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	   
				@FindBy(xpath="//button[text()='Apply Visa']")
				WebElement applyVisa;
				
				@FindBy(xpath="//button[text()='Visa Status']")
				WebElement visaStatus;
				
				@FindBy(xpath="//button[text()='Partially/Filled Application']")
				WebElement partiallyFilledApplication;
				
				@FindBy(xpath="//button[text()='Print Visa Application']")
				WebElement printVisaApplication;
				
				@FindBy(xpath="//button[text()='Visa Payment']")
				WebElement visaPayment;
				
				public String validateHomePageTitle(){
					
					return driver.getTitle();
	}
				public VisaCategoriesPage clickOnApplyVisa() throws IOException, InterruptedException{
					applyVisa.click();
					return new VisaCategoriesPage();
				}
				
				
				
}
