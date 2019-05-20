/**
 * 
 */
package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class SikuliDemo {

	@Test
	public void test() throws  InterruptedException, AWTException, FindFailed{
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_WINDOWS);
	    r.keyPress(KeyEvent.VK_D);	
		

		r.keyRelease(KeyEvent.VK_WINDOWS);
	    r.keyRelease(KeyEvent.VK_D);	
		
		Screen s = new Screen();
		
		s.doubleClick("G:\\SikuliImages\\Capture1.PNG");
		
}
	
	
}
