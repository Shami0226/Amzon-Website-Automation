package co.amazon.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_page1 extends Base_class{

	
   @BeforeMethod
   public void getURL() {

//		setup url
	   
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//      verifying the url
		
		currentURL=driver.getCurrentUrl();
		
		if(baseURL.equals(currentURL)) 
		{
			System.out.println("You are in the correct URL");
		}else {
			System.out.println("URL is not matched");
			System.out.println("Your current URL is : "+currentURL);
			
		}
		
	}
	
	@Test
	@Parameters({"inputItem"})
	public void searchMethod(String inputItem) 
	{
//		click on main drop down and select "Men's Fashion" 
		driver.findElement(By.id("searchDropdownBox")).click();
		Select mainDrop=new Select(driver.findElement(By.id("searchDropdownBox")));
		mainDrop.selectByVisibleText("Men's Fashion");
		
//		search "Shirt" on the search bar
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(inputItem);

//		click on search button
		driver.findElement(By.cssSelector("#nav-search-submit-text > .nav-input")).click();
		
		
		
		
		
	}

}
