package co.amazon.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Base_class {
	
//  Launch chrome browser and setup browser activities
	
	public static WebDriver driver;
	public String baseURL="https://www.amazon.com/";
	public String currentURL;
	
	
	@BeforeSuite
	public void  browserSetup() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver=new ChromeDriver();

	}
	
//	close the browser
	
	@AfterSuite
	public void tearDown() {
    	
    	driver.quit();
    }
}