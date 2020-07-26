package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData extends LaunchBrowser{
	WebElement dr;
public void data() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\Seleniumdata\\Drivers\\chromedriver.exe");

	ChromeDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("http://sampleapp.tricentis.com/101/");
	
	dr.findElement(By.id("nav_automobile")).click();

	/*
	 * WebElement ele=dr.findElement(By.id("nav_automobile")); String
	 * data=ele.getText(); System.out.println(data);
	 * 
	 * dr.findElement(By.id("search_form")).sendKeys("BMW");
	 */
	Thread.sleep(1000);
	WebElement ele = dr.findElement(By.id("make"));
	Select sel1=new Select(ele);
	sel1.selectByIndex(4);
	ele.click();
	//ele.sendKeys("BMW");
	//ele.sendKeys(Keys.ENTER);
	Thread.sleep(1000);

	WebElement ele2=dr.findElement(By.id("engineperformance"));
	
	ele2.sendKeys("1");
	Thread.sleep(1000);
	
	WebElement ele3=dr.findElement(By.id("dateofmanufacture"));
	ele3.sendKeys("07/07/2020");
	
	Thread.sleep(1000);
	WebElement ele4=dr.findElement(By.id("numberofseats"));
	Select select = new Select(ele4);
	select.selectByVisibleText("1");
	Thread.sleep(1000);

	WebElement ele5=dr.findElement(By.id("fuel"));
	Select select1 = new Select(ele5);
	select1.selectByVisibleText("Petrol");
	Thread.sleep(1000);

	dr.findElement(By.id("listprice")).sendKeys("2000");
	Thread.sleep(1000);
	dr.findElement(By.id("licenseplatenumber")).sendKeys("MH20");
	Thread.sleep(1000);

	dr.findElement(By.id("annualmileage")).sendKeys("2000");
	Thread.sleep(2000);
	dr.findElement(By.id("nextenterinsurantdata")).click();
}

public void EnterInsurantData()
{
	dr.findElement(By.id("firstname")).sendKeys("Puja");
	dr.findElement(By.id("lastname")).sendKeys("Jadhav");
	
	dr.findElement(By.id("birthdate")).sendKeys("07/07/19995");
	
	dr.findElement(By.id("genderfemale")).click();
	
	dr.findElement(By.name("Street Address")).sendKeys("Kharadi");
	WebElement data2=dr.findElement(By.id("country"));
	
	Select select2=new Select(data2);
	select2.selectByVisibleText("India");
	
	dr.findElement(By.id("zipcode")).sendKeys("411014");
	
	dr.findElement(By.id("city")).sendKeys("Pune");
	
	WebElement data3=dr.findElement(By.id("occupation"));
	Select select3=new Select(data3);
	select3.selectByVisibleText("Employee");
	
	dr.findElement(By.id("bungeejumping")).click();
	
	dr.findElement(By.id("website")).sendKeys("www.google.com");
	
	}

}
