package AutomationPackeg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyFirstTest extends AnnotationsExample {
	
	public WebDriver driver =  null;
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Launching the Browser");
		System.setProperty("webdriver.chrome.driver", "D://Documents//Automation//ChromeDriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://m2.cdnsolutionsgroup.com/CoyoteConsoleApp/Coyote/staging/stores");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void LoginIntoApplication() {
	
		driver.findElement(By.xpath("//input[@formcontrolname='userEmail']")).sendKeys("superadmin@coyote.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("cdn@12345");
		driver.findElement(By.xpath("//*[@class='btn btn-block thm-btn']")).click();
		String text = driver.findElement(By.xpath("//*[@id='dropdownMenuLink']")).getText();
		
		// With assert if any of the assert fail in between then next assert will not run.
//		Assert.assertTrue(text.equalsIgnoreCase("superadmin"), "Login Unsuccessfull. Actual: "+text+" Expected: superadmin");
//		Assert.assertTrue(text.equalsIgnoreCase("ssuperadmin"), "Login Unsuccessfull. Actual: "+text+" Expected: superadmin");
//		Assert.assertEquals(text, "superadmin");
		
		// We use soft assert to run all the assert conditions if one of the conditions fails in between.
		SoftAssert soft = new SoftAssert();
//		soft.assertTrue(text.equalsIgnoreCase("superadmin"), "Login Unsuccessfull. Actual: "+text+" Expected: superadmin");
//		soft.assertTrue(text.equalsIgnoreCase("superadmin"), "Login Unsuccessfull. Actual: "+text+" Expected: superadmin");
//		System.out.println("Next will run");
		soft.assertTrue(text.equalsIgnoreCase("superadmin"), "Login Unsuccessfull. Actual: "+text+" Expected: superadmin");
		soft.assertAll();
		
//		if(text.equalsIgnoreCase("superadmin")){
//			System.out.println("Login Succesfull");
//		}
//		else {
//			System.out.println("Login Fail");
//		}
		
//		driver.findElement(By.xpath("//*[@routerlinkactive='subModule.router_link_active']")).click();
//		driver.findElement(By.xpath("//*[@placeholder='Search Product']")).sendKeys("1012007");
//				
//		driver.findElement(By.xpath("(//button[@class=\"btn btn-blue mr-2\"])[2]")).click();
//		driver.close();
	}
	
//	@Test
//	public void Test2() {
//		System.out.println("I am in Test2");
//	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		driver.close();
	}
	
	
	
//	public static void main(String[] args) {
//		MyFirstTest obj = new MyFirstTest();
//		obj.LaunchDriver();
//	}

}
