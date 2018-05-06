package SeleniumSingleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		DriverInit instanceDriver =DriverInit.getInstance();
		driver= instanceDriver.openBrowser();
		
	}
	
	@Test
	public void testMethod()
	{
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
