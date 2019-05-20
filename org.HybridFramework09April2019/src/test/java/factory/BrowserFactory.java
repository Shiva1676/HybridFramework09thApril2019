/**
 * 
 */
package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Lenovo
 *
 */
public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver startBrowser(String browsername, String appURL) {

		if (browsername.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("IE")) {

			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get(appURL);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}

}
