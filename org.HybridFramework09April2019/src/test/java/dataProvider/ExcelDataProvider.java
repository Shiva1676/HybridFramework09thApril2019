/**
 * 
 */
package dataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Lenovo
 *
 */
public class ExcelDataProvider {

	FileInputStream fis;

	XSSFWorkbook wb;

	public ExcelDataProvider() {

		File src = new File(System.getProperty("user.dir") + "/TestData/LoginData.xlsx");

		try {
			fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);

			// System.out.println("=============Excel loaded============");

		} catch (Exception e) {

			System.out.println("Not able to read excel data" + " " + e.getMessage());
		}
	}

	public int getRows(String sheetName) {

		int rows = wb.getSheet(sheetName).getPhysicalNumberOfRows();

		return rows;
	}

	public int getColumns(String sheetName) {

		int columns = wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		return columns;
	}

	public String getData(String sheetName, int rows, int columns) {

		XSSFCell cell = wb.getSheet(sheetName).getRow(rows).getCell(columns);

		DataFormatter df = new DataFormatter();

		String data = df.formatCellValue(cell);

		// return
		//
		// return
		// wb.getSheet(sheetName).getRow(rows).getCell(columns).getStringCellValue();
		//
		return data;
	}

}
