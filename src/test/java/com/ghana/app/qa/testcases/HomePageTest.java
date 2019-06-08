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
import com.ghana.app.qa.util.TestUtil;

public class HomePageTest extends DriverInit {

	public HomePageTest() throws IOException, InterruptedException {
		super();

	}
	
   @Test(priority = 1)
	public void verifyHomePageTitleTest() throws IOException, InterruptedException {
	   System.out.println("home page title==>"
				+ homePage.validateHomePageTitle());
		Assert.assertEquals(homePage.validateHomePageTitle(), TestUtil.readDataFromExcellString(5, 1, 0),
				"We are navigate to HOme page");
		TestUtil.writeStringValue(5, 1, 1);
	}

	@Test(priority = 2)
	public void verifyVisaCategoriesTest() throws IOException,
			InterruptedException {
		homePage.clickOnApplyVisa();
		System.out.println("=====================>"+TestUtil.readDataFromExcellString(5, 2, 0));
		visaCategoriesPage.visaCategorisText();
		Assert.assertEquals(visaCategoriesPage.visaCategorisText(), TestUtil.readDataFromExcellString(5, 4, 0), "We are not navigate to visa categories page upon clicking on Apply Visa Button");
		TestUtil.writeStringValue(5, 4, 1);
		Assert.assertEquals(visaCategoriesPage.validateVisaTypeTitle(), TestUtil.readDataFromExcellString(5, 3, 0), "Visa category page title not match");
		TestUtil.writeStringValue(5, 3, 1);
	}

	
}
