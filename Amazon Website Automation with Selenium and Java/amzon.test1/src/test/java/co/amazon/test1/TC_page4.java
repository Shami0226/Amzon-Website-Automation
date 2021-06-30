package co.amazon.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_page4 extends Base_class{
	
	@Test
	public void shoppingCartValidation() 
	{
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

//		print price in console		
	    String price=driver.findElement(By.xpath("//*[@id='hlb-subcart']/div[1]/span/span[2]")).getText();
	    System.out.println("Item price is : "+price);
	    
//		click on cart button
	    driver.findElement(By.xpath("//*[@id='hlb-view-cart']")).click();
	    
//		verifying details of product
	    
	    String cartPrice=driver.findElement(By.id("sc-subtotal-amount-activecart")).getText();
	    
	    if(price.equalsIgnoreCase(cartPrice)) 
	    {
	    	System.out.println("Price is verified!");
	    }else {
	    	System.out.println("Price is not verified!");
	    	
	    }
	    
//      verification of price
	    
	    String proceedCartPrice=driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']")).getText();
        Assert.assertTrue((cartPrice).equalsIgnoreCase(proceedCartPrice));
	    System.out.println("Validation of price is passed");
	    
//		verifying item quantity
	    
	    WebElement qty=driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
	    Assert.assertNotNull(qty);
	    System.out.println("Item Quantity is : "+qty.getText());
	    
//	    Click on button proceed to checkout button
	    
	    driver.findElement(By.id("sc-buy-box-ptc-button")).click();
	    
	   
	    
	    
	    
	}

	

}
