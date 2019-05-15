package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class VisaCategoriesPage extends TestBase {
	
	public VisaCategoriesPage()throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[@class='title-a']")
	WebElement visaCategorisText;
	
	@FindBy(id="btn_tourist")
	WebElement touristVisa;
	
	@FindBy(id="btn_business")
	WebElement businessVisa;
	
	@FindBy(id="btn_transit")
	WebElement transitVisa;
	
	@FindBy(id="btn_employment")
	WebElement employmentVisa;
	
	@FindBy(id="btn_student")
	WebElement studentVisa;
	
	public String validateVisaTypeTitle(){
		return driver.getTitle();
	}
	
	public String visaCategorisText(){
		return visaCategorisText.getText();
	}
	
	public void clickOnVisaType(){
		touristVisa.click();
		
	}
	
	
}
