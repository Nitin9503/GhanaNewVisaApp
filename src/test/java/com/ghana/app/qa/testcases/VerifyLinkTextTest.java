package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.LinkTextsPage;

public class VerifyLinkTextTest extends DriverInit {

	public VerifyLinkTextTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void verifyallLinkextsAtHeader() throws IOException,
			InterruptedException {
		String[] linktextName = { "Home", "Immigration", "Consular Services",
				"Professionals", "Required" };
		for (int i = 0; i < linktextName.length; i++) {
			String element = linktextName[i];
			System.out.println(element);
			LinkTextsPage Lt = new LinkTextsPage();
			Lt.verifyAllLinksTexts(element);
			String Link = element;

			switch (Link) {
			case "Home":
				System.out.println("Excellent!");
				break;
			case "Immigration":
				Assert.assertEquals(Lt.getImigrationText(),
						"Important Immigration Notice");
				System.out.println("Well done");
				break;
			case "Consular Services":
				Assert.assertEquals(Lt.getConsularSerText(),
						"Introduction to Consular Services");
				System.out.println("You passed");
				break;
			case "Professionals":
				Assert.assertEquals(Lt.getprofessionlaText(), "Professionals");
				System.out.println("Better try again");
				break;
			case "Required":
				Assert.assertEquals(Lt.getRequirementText(),
						"Basic Requirements");
				System.out.println("Better try again");
				break;
			default:
				System.out.println("Invalid grade");
			}
		}

	}
}
