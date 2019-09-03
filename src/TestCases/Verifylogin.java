/**
 * 
 */
package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Login_Page;

/**
 * @author Bridgelabz
 *
 */
public class Verifylogin {

	@Test
	public void verifyLoginPage() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		
		Login_Page login = new Login_Page(driver);
		login.TypeUserName("dhatavkarshraddha@gmail.com");
		login.TypePassword("shraddhacom");
		login.ClickonLogin();
		//login.LogintoNaukri("dhatavkarshraddha@gmail.com","shraddhacom");
		//driver.quit();
	}
}
