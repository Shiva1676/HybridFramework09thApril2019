/**
 * 
 */
package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageObjects.LoginPage;

/**
 * @author Lenovo
 *
 */
public class LoginTestCase6 extends BaseClass {

	ExtentTest logger;

	@BeforeMethod
	public void setUpReport() {

		logger = report.startTest("Login to WordPress application");

	}

	@AfterMethod
	public void tearDown() {

		report.endTest(logger);
	}

	@Test
	public void loginToApplication() {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		logger.log(LogStatus.INFO, "Application is loaded");

		boolean status = login.loginToApplication("Admin", "admin123");

		if (status) {

			logger.log(LogStatus.PASS, "User is able to login");

		}else{
			
			logger.log(LogStatus.FAIL, "User is not able to login");
		}

	}

}
