package basicSeleniumFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumdata\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		// set chromedriver path
		
		// dr.close();// one window will get close for that
		// dr.quit();// all the windows will get close which are launched by current
		// driver

		/*
		 * Radio buttons dropdwon checkbox text fields images buttons link search box
		 * webtable alerts pop up iframes windows
		 */
		Thread.sleep(1000);
		
		
		EnterVehicleData enter=new EnterVehicleData();
		enter.data();
		
	}

}
