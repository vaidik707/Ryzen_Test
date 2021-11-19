package Uitls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public WebDriver driver = null;
	
	public Browser(WebDriver driver) {
		this.driver = driver;
		
	}

	public void setBrowser(String Browser) {
		
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", PropertyUtils.getInstance().Getproperty("CHROMEPATH"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(PropertyUtils.getInstance().Getproperty("URL"));
		}
		else {
			System.setProperty("webdriver.gecko.driver", PropertyUtils.getInstance().Getproperty("FIREFOXPATH"));
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(PropertyUtils.getInstance().Getproperty("URL"));
		}
		
	}

}
