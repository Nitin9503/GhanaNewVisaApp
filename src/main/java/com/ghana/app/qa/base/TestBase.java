package com.ghana.app.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static com.ghana.app.qa.util.TestUtil.prop;
import static com.ghana.app.qa.util.TestUtil.USERNAME;
import static com.ghana.app.qa.util.TestUtil.ACCESS_KEY;
import static com.ghana.app.qa.util.TestUtil.SauceLabURL;
import static com.ghana.app.qa.util.TestUtil.driver;
import static com.ghana.app.qa.util.TestUtil.driverPath;
import static com.ghana.app.qa.util.TestUtil.caps;
import static com.ghana.app.qa.util.TestUtil.OSName;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
//@Listeners(com.ghana.app.qa.listener.Listener.class)
public class TestBase {
	// public static String hubURL1 = "http://192.168.1.32:5566/wd/hub";
	// Logger log = Logger.getLogger(TestBase.class) ;
	// E:\SeleniumWorkSpace\torenzowebsite\TorenzoWebSite\FileDriver\chromedriver.exe
	
	public static WebDriver driver;
	
   File src;
   public static XSSFWorkbook workbook;
  
   
 static HashMap<String , String> hm = new HashMap<String , String>();
   
	public TestBase() throws IOException, InterruptedException {
		driverPath = System.getProperty("user.dir");
		System.out.println("path==>" + driverPath);
		OSName = System.getProperty("os.name").substring(0,3);
		
		hm.put("system", OSName);
	
	
		if (hm.get("system").equalsIgnoreCase("Win")) {
			 src = new File(
					".\\src\\main\\java\\com\\ghana\\app\\qa\\testdata\\GhanaVisaTestData1.xlsx");
		} else if (hm.get("system").equalsIgnoreCase("Mac")) {
			 src = new File(
					"./src/main/java/com/ghana/app/qa/testdata/GhanaVisaTestData1.xlsx");		
		}
			
		FileInputStream fis1 = new FileInputStream(src);
		 workbook = new XSSFWorkbook(fis1);
	
			if (hm.get("system").equalsIgnoreCase("Mac")) {
				System.out.println(OSName);
				prop = new Properties();
				FileInputStream fis = new FileInputStream("./src/main/java/com/ghana/app/qa/config/config.properties");
				prop.load(fis);
			} else if (hm.get("system").equalsIgnoreCase("Win")) {
				System.out.println(OSName);
				prop = new Properties();
				System.out.println(OSName);
				FileInputStream fis = new FileInputStream(".\\src\\main\\java\\com\\ghana\\app\\qa\\config\\config.properties");
				prop.load(fis);
			}
		}
	
	
	public static void initialization() throws InterruptedException, MalformedURLException {
		hm.put("broweserName", prop.getProperty("browser"));
	
	//	String broweserName = prop.getProperty("browser");
		String headlessmode = prop.getProperty("headlessmode");
		String testOnCloud = prop.getProperty("cloud");
		 String cloudBrowser = prop.getProperty("browserOnCloud");

		if (hm.get("system").equalsIgnoreCase("Win")) {

			if (hm.get("broweserName").equalsIgnoreCase("FF")) {
				if (headlessmode.equalsIgnoreCase("headless")) {
					System.out.println("Execution on HeadLess FF Browser");
					FirefoxBinary binary = new FirefoxBinary();
					binary.addCommandLineOptions("--headless");
					WebDriverManager.firefoxdriver().setup();
					FirefoxOptions option = new FirefoxOptions();
					option.setBinary(binary);
					driver = new FirefoxDriver(option);
				} else {
					System.out.println("Execution on Normal FF Browser");
					// System.setProperty("webdriver.gecko.driver",
					// "/usr/local/bin/geckodriver");
					// System.setProperty("webdriver.firefox.marionette",
					// "false");
			
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}

			} else if (hm.get("broweserName").equalsIgnoreCase("chrome")) {
				if (headlessmode.equalsIgnoreCase("headless")) {
					System.out.println("Execution on HeadLess Chrome Browser");
					WebDriverManager.chromedriver().setup();
					ChromeOptions option = new ChromeOptions();
					option.addArguments("window-size=1400,800");
					option.addArguments("headless");
					driver = new ChromeDriver(option);
				} else {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();

				}
			}
		 else if (hm.get("broweserName").equalsIgnoreCase("IE")) {
				// System.setProperty("webdriver.chrome.driver",
				// "/Users/rahul.kardel/Documents/browser/chromedriver");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			} else if (hm.get("broweserName").equalsIgnoreCase("safari")) {
				// System.setProperty("webdriver.chrome.driver",
				// "/Users/rahul.kardel/Documents/browser/chromedriver");
				driver = new SafariDriver();
			}

			else if (testOnCloud.equalsIgnoreCase("SauceLab")) {
				System.out.println("Testing Sauce Lab Cloud");
				switch (prop.getProperty("browserOnCloud")) {

				case "firefox-win-saucelab":
					caps = DesiredCapabilities.firefox();
					caps.setCapability("platform", "Windows 8.1");
					caps.setCapability("version", "63.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on Firfox 63.0");
					break;
				case "chrome-win-saucelab":
					caps = DesiredCapabilities.chrome();
					caps.setCapability("platform", "Windows 10");
					caps.setCapability("version", "71.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on Chrome 71.0");
					break;
				case "ie-win-saucelab":
					DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
					caps.setCapability("platform", "Windows 10");
					caps.setCapability("version", "11.285");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on IE 11.285");
					break;
				case "chrome-mac-saucelab":
					caps = DesiredCapabilities.chrome();
					caps.setCapability("platform", "OS X 10.11");
					caps.setCapability("version", "70.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on Chrome 70.0");
					break;
				case "firefox-mac-saucelab":
					caps = DesiredCapabilities.firefox();
					caps.setCapability("platform", "OS X 10.11");
					caps.setCapability("version", "64.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on FireFox 64.0");
					break;
				case "safari-mac-saucelab":
					caps = DesiredCapabilities.safari();
					caps.setCapability("platform", "OS X 10.11");
					caps.setCapability("version", "10.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on Safaro 10.0");
					break;
				case "safari-ipad-saucelab":
					caps = DesiredCapabilities.iphone();
					caps.setCapability("appiumVersion", "1.9.1");
					caps.setCapability("deviceName", "iPad Pro (10.5 inch) Simulator");
					caps.setCapability("deviceOrientation", "portrait");
					caps.setCapability("platformVersion", "12.0");
					caps.setCapability("platformName", "iOS");
					caps.setCapability("browserName", "Safari");
					caps.setCapability("name", "Testing on Safari ipad");
					break;

				default:
					System.out.println("Browser provide is not matched");

				}

				driver = new RemoteWebDriver(new URL(SauceLabURL), caps);				
			}						
		
		

		} else if (hm.get("system").equalsIgnoreCase("Mac")) {

			if (hm.get("broweserName").equals("FF")) {
			//	System.setProperty("webdriver.gecko.driver", driverPath + "\\FileDriver\\geckodriver.exe");
				//System.setProperty("webdriver.firefox.marionette", "false");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();



			}
			else if (hm.get("broweserName").equalsIgnoreCase("chrome")) {
				//System.setProperty("webdriver.chrome.driver",driverPath+"\\FileDriver\\chromedriver.exe" );
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-infobars");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
			}

			else if (hm.get("broweserName").equalsIgnoreCase("IE")) {
			//	System.setProperty("webdriver.ie.driver", driverPath + "\\FileDriver\\IEDriverServer.exe");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			} else if (testOnCloud.equalsIgnoreCase("SauceLab")) {
				System.out.println("Testing Sauce Lab Cloud");
				switch (prop.getProperty("browserOnCloud")) {

				case "firefox-win-saucelab":
					caps = DesiredCapabilities.firefox();
					caps.setCapability("platform", "Windows 10");
					caps.setCapability("version", "63.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on Firfox 63.0");
					break;
				case "chrome-win-saucelab":
					caps = DesiredCapabilities.chrome();
					caps.setCapability("platform", "Windows 10");
					caps.setCapability("version", "71.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on Chrome 71.0");
					break;
				case "ie-win-saucelab":
					DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
					caps.setCapability("platform", "Windows 10");
					caps.setCapability("version", "11.285");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on IE 11.285");
					break;
				case "chrome-mac-saucelab":
					caps = DesiredCapabilities.chrome();
					caps.setCapability("platform", "OS X 10.11");
					caps.setCapability("version", "70.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on Chrome 70.0");
					break;
				case "firefox-mac-saucelab":
					caps = DesiredCapabilities.firefox();
					caps.setCapability("platform", "OS X 10.11");
					caps.setCapability("version", "64.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on FireFox 64.0");
					break;
				case "safari-mac-saucelab":
					caps = DesiredCapabilities.safari();
					caps.setCapability("platform", "OS X 10.11");
					caps.setCapability("version", "10.0");
					caps.setCapability("extendedDebugging", true);
					caps.setCapability("name", "Testing on Safaro 10.0");
					break;
				case "safari-ipad-saucelab":
					caps = DesiredCapabilities.iphone();
					caps.setCapability("appiumVersion", "1.9.1");
					caps.setCapability("deviceName", "iPad Pro (10.5 inch) Simulator");
					caps.setCapability("deviceOrientation", "portrait");
					caps.setCapability("platformVersion", "12.0");
					caps.setCapability("platformName", "iOS");
					caps.setCapability("browserName", "Safari");
					caps.setCapability("name", "Testing on Safari ipad");
					break;
				case "52":

				default:
					System.out.println("Browser provide is not matched");

				}
				driver = new RemoteWebDriver(new URL(SauceLabURL), caps);
			}	


	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("ServerUrl"));    //---localhost
		//GhanaWebLocalURL
		//driver.get(prop.getProperty("GhanaWebURL"));	
		//driver.get(prop.getProperty("HCDLoginURL"));	

}
}

