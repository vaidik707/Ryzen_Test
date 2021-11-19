package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Uitls.Browser;
import Uitls.PropertyUtils;

public class LoginPage extends Browser {
	
	public static WebDriver driver;
	By username = By.xpath("//input[@formcontrolname='userEmail']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginButton = By.xpath("//button[@type='submit']");
	

	public LoginPage() {
		super(driver);	
	}
	
	public void verifyUserName() {
		driver.findElement(username).sendKeys(PropertyUtils.getInstance().Getproperty("Username"));
	}
	
	public void verifyPassword() {
		driver.findElement(password).sendKeys(PropertyUtils.getInstance().Getproperty("Pass"));
	}
	
	public void clickSignInButton() {
		driver.findElement(loginButton).click();
	}
	

}