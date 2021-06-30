package co.amazon.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_page3 extends Base_class{
	
	@Test
	public void selectToCart() 
	{
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
//		select size large
		
		Select sizeDrop=new Select(driver.findElement(By.id("native_dropdown_selected_size_name")));
		sizeDrop.selectByIndex(4);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//      print product title name and title length in the console
		
		String title=driver.findElement(By.id("productTitle")).getText();
		int titleLength=title.length();
		
		System.out.println("The product title is : "+title);
		System.out.println("Length of the product title is : "+titleLength);
		
//		click on add to cart button
		
		driver.findElement(By.xpath("//div[@id='exports_desktop_qualifiedBuybox_atc_feature_div']")).click();
		
		
		
		
	}
	

}
