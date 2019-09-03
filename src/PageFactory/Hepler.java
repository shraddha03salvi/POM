package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hepler {

	
	static WebDriver driver;
	public static WebDriver startBrowser(String BrowserName,String url) {
		if (BrowserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			
			driver = new ChromeDriver();
		} else 
		{
			 driver = new FirefoxDriver();
			 //System.out.println("Application get open into Google Chrome Browser");
		}
		driver.manage().window().maximize();
		driver.get(url);
		 return driver;
	}
}
