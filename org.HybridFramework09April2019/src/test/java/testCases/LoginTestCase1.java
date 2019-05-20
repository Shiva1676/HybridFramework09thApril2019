/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

/**
 * @author Lenovo
 *
 */
public class LoginTestCase1 {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.loginToApplication("Admin", "admin123");; 
		

	}

}
