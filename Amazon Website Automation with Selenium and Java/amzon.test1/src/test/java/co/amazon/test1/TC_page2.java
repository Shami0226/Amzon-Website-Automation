package co.amazon.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_page2 extends Base_class{
	
	
	@Test
	public void selectItem() 
	{
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

//      click on brand check box
		WebElement chechkBox=driver.findElement(By.xpath("//span[contains(text(),'Under Armour')]"));
		chechkBox.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		click on the first item
		
		driver.findElement(By.xpath("//span[contains(text(),\"Under Armour Men's Tech 2.0 Short Sleeve T-Shirt\")]")).click();
		
		
	}

	

}
