package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	 @FindBy(xpath = "//input[@name='username']")
	 private WebElement username;
	 @FindBy(xpath= "//input[@name='password']")
	private WebElement password;
	 @FindBy(xpath = "//button[text()='Sign In']")
	 private WebElement signInButton;
	
	
	public void enterUserNameOnUserNameField() {
		username.sendKeys("admin");

	}

	public void enterPasswordOnPasswordField() {
		password.sendKeys("admin");
	}

	public void clickOnSignInButton() {
		signInButton.click();
	}

}