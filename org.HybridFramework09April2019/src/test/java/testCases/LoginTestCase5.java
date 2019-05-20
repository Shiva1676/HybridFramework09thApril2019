/**
 * 
 */
package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageObjects.LoginPage;

/**
 * @author Lenovo
 *
 */
public class LoginTestCase5 extends BaseClass {

	@Test
	public void loginToApplication() {

		ExtentReports report = new ExtentReports(
				System.getProperty("user.dir") + "/Reports/WordPressReport" + System.currentTimeMillis() + ".html");
		
		ExtentTest logger = report.startTest("Login to OrangeHRM application");

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		logger.log(LogStatus.INFO, "Application is loaded");

		login.loginToApplication("Admin", "admin123");

		logger.log(LogStatus.PASS, "User is able to login");
		
		report.endTest(logger);
		
		report.flush();
	} 

}
