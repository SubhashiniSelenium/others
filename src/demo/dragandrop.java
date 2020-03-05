package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandrop {
	public static void main(String[]args)throws IOException
	{
	System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/Chrome Driver/chromedriver.exe");
	System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	WebElement a = driver.findElement(By.id("draggable"));
	WebElement b = driver.findElement(By.id("droppable"));
	Actions action = new Actions (driver);
	action.dragAndDrop(a, b).build().perform();


}
}