package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AppiumFile\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver(); 
	       DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities = DesiredCapabilities.chrome();
	        driver.get("http://35.244.36.46:8081/HCDLogin");
		    driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("CN1234");
	        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("1234");
	        driver.findElement(By.xpath("//input[@name = 'Login' and @value='Login']")).click();
	        Thread.sleep(2000);
	        String st=driver.findElement(By.xpath(".//*[@id='myElement']/div[2]/div/div[1]/ul/li[1]")).getText();
	        System.out.println(st);

	 
	}

}
