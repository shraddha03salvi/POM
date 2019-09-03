package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

	WebDriver driver;
	
	By username =By.id("usernameField");
	By password = By.id("passwordField");
	By LoginButton =By.xpath("//*[@id=\"loginForm\"]/div[5]/div/button");
	//Constructor
	public Login_Page(WebDriver driver) 
	{
		
	this.driver= driver;
	}
	//methods
	public void TypeUserName(String uid) {
		
		driver.findElement(username).sendKeys(uid);
	}
	
	public void TypePassword(String pass) {
		
		driver.findElement(password).sendKeys(pass);
	}
	public void ClickonLogin() {
		
		driver.findElement(LoginButton).click();
	}
	/*to reduce code===
	 * 
	 * public void LogintoNaukri(String userid, String pass)
	 * {driver.findElement(username).sendKeys(userid);
	 * driver.findElement(password).sendKeys(pass);
	 * driver.findElement(LoginButton).click();
	 * 
	 * }*/
}
