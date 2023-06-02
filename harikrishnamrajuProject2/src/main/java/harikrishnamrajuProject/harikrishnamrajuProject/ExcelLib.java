package harikrishnamrajuProject.harikrishnamrajuProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WorkBook -> Sheet -> Rows -> Cell
// Excel version -> above 2007 XSSF --> XML Spread sheet Format - .xlsx
//Excel version -> below 2007 HSSF --> Horrible Spread Sheet Format - .xls

public class ExcelLib {
public String getstringExcelData(String sheetname, int rownum, int cellnum) throws Exception{
	
	FileInputStream fis = new FileInputStream(constants.filepath);
	// Have the control over the workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			// Get the control over the desired sheet
			XSSFSheet sheet = workbook.getSheet(sheetname);

			// get the control of the desired the row
			XSSFRow row = sheet.getRow(rownum);
			// get the data from the cell
			String data = row.getCell(cellnum).getStringCellValue();
return data;

}

public double getNumericExcelData(String sheetname, int rownum, int cellnum) throws Exception{
	
	FileInputStream fis = new FileInputStream(constants.filepath);
	// Have the control over the workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			// Get the control over the desired sheet
			XSSFSheet sheet = workbook.getSheet(sheetname);

			// get the control of the desired the row
			XSSFRow row = sheet.getRow(rownum);
			// get the data from the cell
			double data = row.getCell(cellnum).getNumericCellValue();
return data;

}
		
		

	
	public static void setStringExcelData(String sheetname, int rownum, int cellnum, String data) throws Exception {
		FileInputStream fis = new FileInputStream(constants.filepath);
	
		
		// Have the control over the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Get the control over the desired sheet
		XSSFSheet sheet = workbook.getSheet(sheetname);

		// get the control of the desired the row
		XSSFRow row = sheet.getRow(rownum);

		XSSFCell cell = row.createCell(cellnum);

		FileOutputStream fos = new FileOutputStream(constants.filepath);

		cell.setCellValue(data);

		workbook.write(fos);

		//mandatory line
		workbook.close();

	}

	
}
