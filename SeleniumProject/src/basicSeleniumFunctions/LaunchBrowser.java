package basicSeleniumFunctions;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// set chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumdata\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		//dr.get("https://www.google.com/");
	}

}
