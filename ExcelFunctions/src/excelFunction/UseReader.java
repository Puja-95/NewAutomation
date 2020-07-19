package excelFunction;

import java.io.IOException;

public class UseReader {

	public static void main(String[] args) throws IOException {

		Xls_Reader xl = new Xls_Reader();
		String path = "C:\\27062020\\Selenium\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";
		String data = xl.getCelldata(path, "Sheet1", 0, 0);
		System.out.println(data);

	}

}
