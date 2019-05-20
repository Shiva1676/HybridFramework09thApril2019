/**
 * 
 */
package utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Lenovo
 *
 */
public class CustomeDateFormat {

	public static String getCustomDateAndTime() {

		DateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss");

		Date date = new Date();

		return dateformat.format(date);

	}

}
