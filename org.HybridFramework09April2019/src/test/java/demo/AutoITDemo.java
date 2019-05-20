/**
 * 
 */
package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo
 *
 */
public class AutoITDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Lenovo/Desktop/uploadfile.html");
		 
		driver.findElement(By.id("1")).click();
		
		Runtime.getRuntime().exec("G:\\AutoItScript\\FileUpload.exe");
		
		
	}

}
