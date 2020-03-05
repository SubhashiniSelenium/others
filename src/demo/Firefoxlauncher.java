package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefoxlauncher {
@Test
	public void LandFF()
	{
	System.setProperty("webdriver.gecko.driver","D:/SeleniumJars/Firfox Driver/geckodriver.exe");
	System.setProperty("webdriver.driver.bin","C:/Program Files/Mozilla Firefox/firefox.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");		
	System.out.println(driver.getTitle());
	

	}

}
