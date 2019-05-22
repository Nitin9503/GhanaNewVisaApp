package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.HomePage;
import com.ghana.app.qa.pages.VisaCategoriesPage;
import com.ghana.app.qa.util.TestUtil;

public class VisaCategoriesPageTest extends DriverInit {

	public VisaCategoriesPageTest() throws IOException, InterruptedException {
		super();
	}

	@Test(priority = 0)
	public void validateVisaPageTiltleTest() throws IOException, InterruptedException {
		homePage.clickOnApplyVisa();
		Thread.sleep(2000);
		System.out.println("visa Page Title is  " + visaCategoriesPage.validateVisaTypeTitle());
		Assert.assertEquals(visaCategoriesPage.validateVisaTypeTitle(), "Visa Types",
				"Visa category page title not match");

	}

	@Test(priority = 1)
	public void getVisaCategoriesText() throws IOException, InterruptedException {
		// Thread.sleep(2000);
		System.out.println("visa Page Title is  " + visaCategoriesPage.visaCategorisText());
		Assert.assertEquals(visaCategoriesPage.visaCategorisText(), "VISA CATEGORIES",
				"Visa category text title not match");

	}

	@Test(priority = 2)
	public void clickOnVisaTypeTest() throws IOException, InterruptedException {
		visaCategoriesPage.clickOnVisaType();
		System.out.println("sign up page title is " + signUpPage.validateSignUpPageTitle());
		Assert.assertEquals(signUpPage.validateSignUpPageTitle(), "Sign Up",
				"sign up is not open while clickin on Apply Visa");
	}
}