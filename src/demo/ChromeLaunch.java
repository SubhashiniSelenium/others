package demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeLaunch {
	
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/Chrome Driver/chromedriver.exe");
		System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.easemytrip.com/");	
	     System.out.println(driver.getTitle());
		 
		}
	}



