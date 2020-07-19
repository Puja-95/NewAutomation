package excelFunction;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	//path is common throughout the functions
	public String getCelldata(String path, String sheetname, int rowNum, int colNum) throws IOException 
	{
		//String path = "C:\\27062020\\Selenium\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);//
		// wb.getSheet("Sheet1");
		XSSFSheet sheet = wb.getSheet(sheetname);
		
		int rows = sheet.getPhysicalNumberOfRows();//what is difference between physical row
		
		System.out.println(rows);

		XSSFRow row = sheet.getRow(rowNum);
		int cols = row.getLastCellNum();
		
		System.out.println(cols);
		XSSFCell cell = row.getCell(colNum);
		String data = cell.getStringCellValue();

		//System.out.println(data);
		
		return data;
	}
}
