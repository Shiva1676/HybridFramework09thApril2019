/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import pageObjects.LoginPage;

/**
 * @author Lenovo
 *
 */
public class LoginTestCase3 {

	WebDriver driver;
	
	@Test
	public void test(){
		
		driver = BrowserFactory.startBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.loginToApplication("Admin", "admin123");
		
	}

}
