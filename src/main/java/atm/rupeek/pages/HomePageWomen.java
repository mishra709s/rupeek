package atm.rupeek.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import atm.rupeek.utils.Utility;

public class HomePageWomen extends Utility{
	public void homePageWomen() {
		try {
			launchBrowser();
			System.out.println("Browser Opened");
			Thread.sleep(3000);

			// Click on Women's Tab
			driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li")).click();
			System.out.println("Women Clicked");
			Thread.sleep(3000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");

			List<WebElement> cards =  driver.findElements(By.xpath("//div[@id='center_column']/ul/li"));
			System.out.println(cards.size());

			for( int i=1; i <= cards.size(); i++) {
				String DressName = driver.findElement(By.xpath(("//*[@id=\"center_column\"]/ul/li["+i+"]/div/div[2]/h5/a"))).getText();
				String priceWithoutDollarSign = (driver.findElement(By.xpath(("//*[@id=\"center_column\"]/ul/li["+i+"]/div/div[2]/div[1]/span"))).getText()).substring(1);
				String Price = driver.findElement(By.xpath(("//*[@id=\"center_column\"]/ul/li["+i+"]/div/div[2]/div[1]/span"))).getText();
				if(Double.parseDouble(priceWithoutDollarSign) <= 28.00) {
					System.out.println("Filtered Items - "+ DressName + ": " + Price);
				}
			}
			
			// Calling close and then quit will kill the driver running process.
			driver.close();
			driver.quit();
		}

		catch(Exception e) {
			e.printStackTrace();

			// Calling close and then quit will kill the driver running process.
			driver.close();
			driver.quit();
		}
	}
}
