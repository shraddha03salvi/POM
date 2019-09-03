package Learnautomation_Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Learnautomation_utility.Browser_Factory;

public class BaseClass {

	public WebDriver driver;
	@BeforeClass
	public void setUp() 
	{
	driver = Browser_Factory.startApplication(driver,"Chrome","https://www.naukri.com/nlogin/login");
		
	}
	@AfterClass
	public void tearDown() 
	{
		
		Browser_Factory.quitBrowser(driver);
	}
}
