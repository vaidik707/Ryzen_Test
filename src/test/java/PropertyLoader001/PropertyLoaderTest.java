package PropertyLoader001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Uitls.Browser;
import Uitls.PropertyUtils;

public class PropertyLoaderTest extends Browser {

	
public PropertyLoaderTest(WebDriver driver) {
		super(driver);
	}

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("Launching the browser");
		setBrowser(PropertyUtils.getInstance().Getproperty("BROWSER"));

	}
	@Test
	public void Login() {
		WebElement Email = driver.findElement(By.xpath("//input[@formcontrolname='userEmail']"));
		WebElement Password = driver.findElement(By.xpath("//input[@formcontrolname='password']"));

		//		driver.findElements(By.xpath("//input")).size();

		//Get username and pass from property file.
		Assert.assertTrue(Email.isDisplayed());
		Email.sendKeys(PropertyUtils.getInstance().Getproperty("Username"));
		Assert.assertTrue(Password.isDisplayed());
		Password.sendKeys(PropertyUtils.getInstance().Getproperty("Pass"));
		driver.findElement(By.xpath("//*[@class='btn btn-block thm-btn']")).click();

		//		String text = driver.findElement(By.xpath("//*[@id='dropdownMenuLink']")).getText();
		//		Assert.assertTrue(text.equalsIgnoreCase("superadmin"), "Login Unsuccesfull, Actual:  "+text);

	}
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}

}
