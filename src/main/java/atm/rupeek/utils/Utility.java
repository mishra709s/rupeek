package atm.rupeek.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility 
{
	protected WebDriver driver = null;

	public void launchBrowser() {
		try {

			// Set the driver path
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			
			// Create instance of the driver
			driver = new ChromeDriver();
			
			// Implicit wait for elements
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			// Delete all cookies
			driver.manage().deleteAllCookies();
			
			// Maximize the browser
			driver.manage().window().maximize();
			
			// Wait for page load
			Thread.sleep(3000);
			
			// URL Launching
			driver.get("http://automationpractice.com/index.php");
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
