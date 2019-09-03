package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageFactory.Hepler;
import Pages.PageFactory_LoginPage;

public class VerifyLogin_PageFact {

	@Test
	public void CheckForLogin() 
	{
		// This will launch browser and specific URL
	WebDriver driver=Hepler.startBrowser("chrome","https://www.facebook.com/");
	
	// Created page object using page factory
	PageFactory_LoginPage login=PageFactory.initElements(driver,PageFactory_LoginPage.class );
	
	login.LoginTONaukri("dhatavkarshraddha@gmail.com","shivganga1993");
}
}