package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory_LoginPage {

	WebDriver driver;
	
	
	public PageFactory_LoginPage(WebDriver ldriver) 
	{
		this.driver= ldriver;
		
		
	}
	
	
	@FindBy(id="email")
	WebElement UserName;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginbutton\"]")
	WebElement Login_Button;
	
	@FindBy(how =How.LINK_TEXT, using ="Forgot Password?")
	WebElement Forget_password_Link;
	
	
	public void LoginTONaukri(String uid,String pass) 
	{
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		UserName.sendKeys(uid);
		password.sendKeys(pass);
		Login_Button.click();
		
	}
}
