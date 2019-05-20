/**
 * 
 */
package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Lenovo
 *
 */
public class Helper {

	public static String getScreenshot(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "/Screenshots/OrangeHRM" + CustomeDateFormat.getCustomDateAndTime() + ".png";

		File dest = new File(path);

		try {
			FileUtils.copyFile(src, dest);
		} 
		catch (IOException e) {
		
			System.out.println("Not able to capture screenshot");
			
		}
		
		return path;

	}
}
