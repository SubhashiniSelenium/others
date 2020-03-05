package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchIE {
	@Test
	public void LaunchInternetExplorar()
	{
	System.setProperty("webdriver.ie.driver","D:/SeleniumJars/Internet Explorar/IEDriverServer.exe");
	System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Internet Explorer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");		
	System.out.println(driver.getTitle());
	

	

}

}
