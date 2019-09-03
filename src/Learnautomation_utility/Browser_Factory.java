package Learnautomation_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Factory {

	public static WebDriver startApplication(WebDriver driver,String BrowserName, String Url) 
	{
		if (BrowserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		} else 
		{
			 driver = new FirefoxDriver();
			 //System.out.println("Application get open into Google Chrome Browser");
		}
		driver.manage().window().maximize();
		driver.get(Url);
		 return driver;
	}
	
	public static void quitBrowser(WebDriver driver) 
	{
		driver.quit();
		
	}
}
