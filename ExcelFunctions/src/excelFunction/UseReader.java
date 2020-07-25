package excelFunction;

import java.io.IOException;

public class UseReader {

	
	public static void main(String[] args) throws IOException {
		String path = "C:\\27062020\\Selenium\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";
		Xls_Reader xl = new Xls_Reader(path);
		//String path = "C:\\27062020\\Selenium\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";
		String data = xl.getCelldata("Sheet1", 0, 0);
		System.out.println(data);

	}

}
