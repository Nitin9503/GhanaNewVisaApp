package com.ghana.app.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static com.ghana.app.qa.base.DriverInit.*;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import com.ghana.app.qa.base.TestBase;
import com.google.common.base.Function;

public class TestUtil extends TestBase {

	public TestUtil() throws IOException, InterruptedException {
		super();

	}

	public static DesiredCapabilities caps;
	public static Properties prop;
	public static String driverPath;
	public static String OSName = "";

	public static long PAGE_LOAD_TIMEOUT = 120;
	public static long IMPLICIT_WAIT = 120;
	public static String title = "";
	public static String screenshotName = "";

	public static String providedDate = " ";
	// Static variable for Launch activety of browser

	public static String hubURL = "http://192.168.1.39:5568/wd/hub";
	public static final String USERNAME = "sachin1";
	public static final String ACCESS_KEY = "0576f84d-89b5-4a1e-8eee-f19e4bb26729";
	public static final String SauceLabURL = "https://" + USERNAME + ":"
			+ ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	// Static methods
	public static void scrollUpByPixel(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 'pixel')");

	}

	public static void scrollUpAtEndOFPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	public static void scrollUpHorizontalORVIsibilityOFElement(
			WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void toOpenNewTab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");

	}

	public static void toCloseNewTab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.close()");

	}

	public static void typeText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static void clickOnElement() throws InterruptedException {
		System.out.println("applicationID==>" + applicationID);
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By
				.xpath("//strong[contains(text(),'" + applicationID + "')]"));
		System.out.println(ele.getText());
		ele.click(); // what ever the action needed .
	}

	public static String getTextFromApplicationID() throws InterruptedException {
		System.out.println("applicationID==>" + applicationID);
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By
				.xpath("//strong[contains(text(),'" + applicationID + "')]"));
		return ele.getText();
	}

	public static void selectValuefromDropDown(WebElement element, String month) {
		Select sel = new Select(element);
		sel.selectByVisibleText(month);
	}

	public static boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public static void runJavaScript(String command) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(command);
	}

	public static void clickOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void uploadfile(WebElement element, String path) {
		element.sendKeys(path);
	}

	public static void waitForElemenToClick(WebElement element, int maxTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void waitForElementToVisible(WebElement element,
			int maxTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public static void waitForElementToVisibleOnly(WebElement element,
			int maxTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void actionClassMethod(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();

	}

	public static void datePickerMethod(WebElement element) {
		((JavascriptExecutor) driver)
				.executeScript("document.getElementById(element).removeAttribute('readonly',0);"); // Enables

	}

	public static void passDateInField(String element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('" + element
				+ "').removeAttribute('readonly',0);");

	}

	public static void dateAlter(String dateChange) {
		String str = new StringBuffer(dateChange).insert(
				dateChange.length() - 6, "/").toString();
		providedDate = new StringBuffer(str).insert(str.length() - 4, "/")
				.toString();
		System.out.println("Birthdate==>" + providedDate);
		System.out.println("Application id==>" + applicationID);
	}

	public static void fluentWait(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("foo"));
			}
		});
	}

	public static void HandleAlertPopupAccept() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception e) {
			System.out.println("Alert is not present");
		}

	}

	public static void HandleAlertPopupReject() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present");
		}
	}

	public static void HandleAlertPopupGetText() {
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
		} catch (Exception e) {
			System.out.println("Alert is not present");
		}

	}

	public static void toSwitchBetweenWindows(int i) {
		try {
			ArrayList<String> tabs = new ArrayList<String>(
					driver.getWindowHandles());
			driver.switchTo().window(tabs.get(i));
		} catch (Exception e) {
			System.out.println("Window is not available");

		}
	}

	public static void switchToFrameByIndex(int i) {

		try {

			driver.switchTo().frame(i);
		} catch (Exception e) {
			System.out.println("Frame is not available");
		}
	}

	public static void switchToFrameByString(String name) {
		try {
			driver.switchTo().frame(name);
		} catch (Exception e) {
			System.out.println("Frame is not available");
		}
	}

	public static void switchToFrameByWebElement(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			System.out.println("Frame is not available");
		}
	}

	public static String readDataFromExcellString(int sheetName,
			int row_number, int colomn_number) throws IOException,
			InterruptedException {
		XSSFSheet sheet = workbook.getSheetAt(sheetName);
		// System.out.println("===========>"+sheet.getRow(row_number).getCell(colomn_number).getStringCellValue());
		return sheet.getRow(row_number).getCell(colomn_number)
				.getStringCellValue();
	}

	public static String readDataFromExcellNumeric(int sheetName,
			int row_number, int colomn_number) throws IOException {
		XSSFSheet sheet = workbook.getSheetAt(sheetName);
		// System.out.println("Mobile number ===>"+String.valueOf(sheet.getRow(row_number).getCell(colomn_number).getNumericCellValue()));
		return String.valueOf(sheet.getRow(row_number).getCell(colomn_number)
				.getNumericCellValue());
	}

	public static void writeStringValue(int sheetName, int row_number,
			int colomn_number) throws IOException {
		File src = new File(
				".//src//main//java//com//ghana//app//qa//testdata//GhanaVisaTestData1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(sheetName);
		sheet.getRow(row_number).createCell(colomn_number).setCellValue("PASS");

		FileOutputStream fos = new FileOutputStream(
				".//src//main//java//com//ghana//app//qa//testdata//GhanaVisaTestData1.xlsx");
		workbook.write(fos);
		fos.close();
		// System.out.println("Mobile number ===>"+String.valueOf(sheet.getRow(row_number).getCell(colomn_number).getNumericCellValue()));

		// return
		// String.valueOf(sheet.getRow(row_number).getCell(colomn_number).getNumericCellValue());
	}
}
