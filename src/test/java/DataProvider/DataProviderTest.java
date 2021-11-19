package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DataProviderTest {

	public WebDriver driver = null;

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {

		System.out.println("Launching the browser");
		System.setProperty("webdriver.chrome.driver", "D://Documents//Automation//ChromeDriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/Coyote/staging/stores");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test
	public void Login() {
		WebElement Email = driver.findElement(By.xpath("//input[@formcontrolname='userEmail']"));
		WebElement Password = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		
//		driver.findElements(By.xpath("//input")).size();
		

		Assert.assertTrue(Email.isDisplayed());
		Email.sendKeys("superadmin@coyote.com");
		Assert.assertTrue(Password.isDisplayed());
		Password.sendKeys("cdn@12345");
		driver.findElement(By.xpath("//*[@class='btn btn-block thm-btn']")).click();

		String text = driver.findElement(By.xpath("//*[@id='dropdownMenuLink']")).getText();
		Assert.assertTrue(text.equalsIgnoreCase("superadmin"), "Login Unsuccesfull, Actual:  "+text);

	}
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}

}
