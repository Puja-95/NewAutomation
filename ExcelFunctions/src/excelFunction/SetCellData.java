package excelFunction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetCellData {

	public static void main(String[] args) throws IOException {
		String path = "C:\\27062020\\Selenium\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);//
		// wb.getSheet("Sheet1");
		XSSFSheet sheet = wb.getSheet("Test");

		XSSFRow row = sheet.getRow(0);

		if (row == null) {
			row = sheet.createRow(0);
		}
		XSSFCell cell = row.getCell(0);

		if (cell == null) {
			cell = row.createCell(0);
		}

		cell.setCellValue("PujaJADHAV");
		FileOutputStream fileout = new FileOutputStream(path);
		wb.write(fileout);

	}

}
