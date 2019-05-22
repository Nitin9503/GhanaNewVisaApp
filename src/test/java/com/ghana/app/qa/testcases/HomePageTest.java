package com.ghana.app.qa.testcases;

import static org.testng.Assert.assertEquals;
import static com.ghana.app.qa.util.TestUtil.*;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.HomePage;
import com.ghana.app.qa.pages.VisaCategoriesPage;

public class HomePageTest extends DriverInit {

	public HomePageTest() throws IOException, InterruptedException {
		super();

	}
	

   @Test(priority = 1)
	public void verifyHomePageTitleTest() {
		System.out.println("home page title   "
				+ homePage.validateHomePageTitle());
		Assert.assertEquals(homePage.validateHomePageTitle(), prop.getProperty("homePageTitle"),
				"We are navigate to HOme page");
	}

	@Test(priority = 2)
	public void verifyVisaCategoriesTest() throws IOException,
			InterruptedException {
		homePage.clickOnApplyVisa();
		//Thread.sleep(2000);
		System.out.println("visa category heading title "+visaCategoriesPage.visaCategorisText());
		visaCategoriesPage.visaCategorisText();
		Assert.assertEquals(visaCategoriesPage.visaCategorisText(), prop.getProperty("vISACATEGORIESText"), "We are not navigate to visa categories page upon clicking on Apply Visa Button");
		Assert.assertEquals(visaCategoriesPage.validateVisaTypeTitle(), "Visa Types", "Visa category page title not match");

	}

	
}
