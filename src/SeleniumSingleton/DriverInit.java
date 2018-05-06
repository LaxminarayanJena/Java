package SeleniumSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInit {
	
	private static DriverInit instanceDriver= null;	
	private WebDriver driver;
	
	private DriverInit()
	{
		
	}
	
	public WebDriver openBrowser()
	{
		
		  driver = new FirefoxDriver();
		  driver.get("http://www.google.com");
		 return driver;
	}
	
	public static DriverInit getInstance()
	{
		if(instanceDriver == null)
			instanceDriver= new DriverInit();
		return instanceDriver;
	}
	

}
