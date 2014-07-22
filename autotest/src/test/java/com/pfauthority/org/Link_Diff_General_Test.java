package com.pfauthority.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uscommunities.general.HomePageComponent;

public class Link_Diff_General_Test {

	@Test
	
	public void validateLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/");
		System.out.println("\nTest general-information link.................................\n");
		Assert.assertEquals(58, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateWNLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/whats-new/");
		System.out.println("\nTest whats-new link.................................\n");
		Assert.assertEquals(61, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateCULinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/contact-us/");
		System.out.println("\nTest contact-us link.................................\n");
		Assert.assertEquals(61, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateFaqLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/faqs/");
		System.out.println("\nTest faqs link.................................\n");
		Assert.assertEquals(67, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validatePbmImageDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/pfa-board-meetings/");
		System.out.println("\nTest pfa-board-meetings link.................................\n");
		Assert.assertEquals(58, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateBdsLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/general-information/board-of-directors-and-sponsors/");
		System.out.println("\nTest board-of-directors-and-sponsors link.................................\n");
		Assert.assertEquals(68, action.checkLinkDiff(driver)); 
		driver.quit();
	}
	
	@Test
	
	public void validateIBLinkDiff() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePageComponent action=new HomePageComponent(driver);
		driver.get("http://www.pfauthority.org/pfaappforms/mos/generalInfo");
		System.out.println("\nTest generalInfo link.................................\n");
		Assert.assertEquals(90, action.checkLinkDiff(driver));  
		driver.quit();
	}
	
}
