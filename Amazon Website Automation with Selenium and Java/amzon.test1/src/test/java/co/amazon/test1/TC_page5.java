package co.amazon.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_page5 extends Base_class{

    @BeforeMethod
	public void createAccount() 
	{
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
//      click on create account button
		
		driver.findElement(By.id("createAccountSubmit")).click();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	}
    
//     adding customer details
    @Test
    @Parameters({"customerName","email","password","rePassword"})
    public void setAccountData(String customerName,String email,String password,String rePassword) {
    	
    	WebElement name=driver.findElement(By.id("ap_customer_name"));
    	name.sendKeys(customerName);
    	
    	WebElement emailAddress=driver.findElement(By.id("ap_email"));
    	emailAddress.sendKeys(email);
    	
    	WebElement pass=driver.findElement(By.id("ap_password"));
    	pass.sendKeys(password);
    	
    	WebElement rePass=driver.findElement(By.id("ap_password_check"));
    	rePass.sendKeys(rePassword);
    	
    	
    }
    
    
    
	
	
}
