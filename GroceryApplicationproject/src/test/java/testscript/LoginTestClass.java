package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;

public class LoginTestClass extends Base{
	@Test
	public void verifyUserLoginWithValidCredentials() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField();
		loginpage.enterPasswordOnPasswordField();
		loginpage.clickOnSignInButton();
 
		
	}
	

	@Test
	 public void verifyUserLoginWithValidUsernameAndInvalidPassword() 
	 { 
	   
	 WebElement username=driver.findElement(By.xpath("//input[@name='username']")); 
	 username.sendKeys("admin"); 
	 WebElement password= driver.findElement(By.xpath("//input[@name='password']")); 
	 password.sendKeys("password"); 
	 WebElement loginbutton= driver.findElement(By.xpath("//button[text()='Sign In']")); 
	 loginbutton.click(); 
	 } 
	    
	
	 @Test 
	 public void verifyUserLoginWithInvalidUsernameAndValidPassword() 
	 { 
	 WebElement username=driver.findElement(By.xpath("//input[@name='username']")); 
	 username.sendKeys("user"); 
	 WebElement password= driver.findElement(By.xpath("//input[@name='password']")); 
	 password.sendKeys("admin"); 
	 WebElement loginbutton= driver.findElement(By.xpath("//button[text()='Sign In']")); 
	 loginbutton.click(); 
	 } 

	  @Test 
	  public void verifyUserLoginWithInValidCredentials() 
	  { 
	  WebElement username=driver.findElement(By.xpath("//input[@name='username']")); 
	  username.sendKeys("user"); 
	  WebElement password= driver.findElement(By.xpath("//input[@name='password']")); 
	  password.sendKeys("password"); 
	  WebElement loginbutton= driver.findElement(By.xpath("//button[text()='Sign In']")); 
	  loginbutton.click(); 
	  } 
	  }
