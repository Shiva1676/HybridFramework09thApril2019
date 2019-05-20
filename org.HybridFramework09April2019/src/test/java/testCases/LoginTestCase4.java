/**
 * 
 */
package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

/**
 * @author Lenovo
 *
 */
public class LoginTestCase4 extends BaseClass{

	@Test
	public void loginToApplication(){
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.loginToApplication("Admin", "admin123");
	}
	
}
