/**
 * 
 */
package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Lenovo
 *
 */
public class LoginPage {

	@FindBy(how = How.ID, using = "txtUsername")
	WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	WebElement password;

	@FindBy(how = How.ID, using = "btnLogin")
	WebElement loginButton;

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public boolean loginToApplication(String uname, String pass) {

		username.sendKeys(uname);

		System.out.println(uname);

		password.sendKeys(pass);

		System.out.println(pass);

		loginButton.click();

		boolean status = false;

		WebDriverWait wait = new WebDriverWait(driver, 5);

		try {
			WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("welcome")));

			status = ele.isDisplayed();

			ele.click();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		} catch (Exception e) {

			System.out.println("=========Element not found======");

//			 Assert.assertTrue(status);

		}

		return status;

	}

}
