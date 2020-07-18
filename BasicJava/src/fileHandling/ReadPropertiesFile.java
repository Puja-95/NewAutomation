package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception  {
	Properties obj=new Properties();
	FileInputStream file=new FileInputStream("C:\\27062020\\Selenium\\BasicJava\\src\\fileHandling\\TestData.properties");
	// // skip sequence
	
	obj.load(file);

	System.out.println(obj.get("name"));
	System.out.println(obj.get("surname"));
	
	/*Exception classification- Complile time(check exception) eg-IOexception, filenot found exception
	and Run time(Unchecked Exception), eg Nullpointer exception*/
	//Exceptions and Error(can't be recovered-out of memory exception)
	throw new Exception("Testing");
	
	
	}

}
