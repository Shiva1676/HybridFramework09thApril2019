/**
 * 
 */
package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.DataProviderFactory;
import pageObjects.LoginPage;
import utility.Helper;

/**
 * @author Lenovo
 *
 */
public class LoginTestCase10 extends BaseClass {

	ExtentTest logger;

	@BeforeMethod
	public void setUpReport() {

		logger = report.startTest("Login to OrangeHRM application");

	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			logger.log(LogStatus.FAIL, logger.addScreenCapture(Helper.getScreenshot(driver)));
		}

		report.endTest(logger);
	}

	@Test
	public void loginToApplication() throws InterruptedException {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		logger.log(LogStatus.INFO, "Application is loaded");

		int rows = DataProviderFactory.getExcel().getRows("Sheet1");

		int columns = DataProviderFactory.getExcel().getColumns("Sheet1");

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns - 1; j++) {

				boolean status = login.loginToApplication(DataProviderFactory.getExcel().getData("Sheet1", i, j),
						DataProviderFactory.getExcel().getData("Sheet1", i, j + 1));

				if (status) {

					logger.log(LogStatus.PASS, "User is able to login");

					logger.log(LogStatus.PASS, logger.addScreenCapture(Helper.getScreenshot(driver)));

				} else {

					logger.log(LogStatus.FAIL, "User is not able to login");

					// logger.log(LogStatus.FAIL,
					// logger.addScreenCapture(Helper.getScreenshot(driver)));

//					Assert.assertTrue(status);
				}

			}
		}

	}

}
