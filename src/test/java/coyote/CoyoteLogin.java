package coyote;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Uitls.Browser;
import Uitls.PropertyUtils;

public class CoyoteLogin extends Browser {
	
	LoginPage loginpage = null;
	
	public CoyoteLogin(WebDriver driver) {
		super(driver);
	}

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("Launching the browser");
		setBrowser(PropertyUtils.getInstance().Getproperty("BROWSER"));
		loginpage = new LoginPage();
	}
	
	@Test
	public void verifyLogin() {
		loginpage.verifyUserName();
		loginpage.verifyPassword();
		loginpage.clickSignInButton();
	}
}