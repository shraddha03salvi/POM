package Learnautomation_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Learnautomation_Pages.BaseClass;
import Learnautomation_Pages.Naukri_LoginPage;
import Learnautomation_utility.Browser_Factory;

public class Login_testcase extends BaseClass {

	
	@Test
	public void Loginapp()
	{
	
		Naukri_LoginPage Lp = PageFactory.initElements(driver,Naukri_LoginPage.class);
		 Lp.LoginTONaukri("dhatavkarshraddha@gmail.com","shraddhacom");
		 
	}
	
}
