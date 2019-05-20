/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import utility.CustomeDateFormat;

/**
 * @author Lenovo
 *
 */
public class BaseClass {

	WebDriver driver;
	
	ExtentReports report;
	
	@BeforeSuite
	public void startReport(){
		
		 report = new ExtentReports(
				System.getProperty("user.dir") + "/Reports/OrangeHRMReport" + CustomeDateFormat.getCustomDateAndTime() + ".html");
		
	}

	@AfterSuite
	public void closeReport(){
		
		report.flush();
	}
	
	
	@BeforeTest
	public void startBrowser() {

		System.out.println("=============Browser Starting==========");

		/*
		 * ConfigDataProvider config = new ConfigDataProvider();
		 * 
		 * String browser = config.getBrowser();
		 * 
		 * String url = config.getURL();
		 */

		driver = BrowserFactory.startBrowser(DataProviderFactory.getConfig().getBrowser(),
				DataProviderFactory.getConfig().getURL());

		System.out.println("========Browser started and application is up and running=======");

	}

	@AfterTest
	public void closeBrowser() {

		System.out.println("============Closing Browser=============");

		driver.quit();

		System.out.println("==========Browser closed==========");

	}

}
