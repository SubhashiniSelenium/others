package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {
	public static void main(String[]args)throws IOException
	{
	System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/Chrome Driver/chromedriver.exe");
	System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	WebElement a = driver.findElement(By.xpath("//*[@id=\"selectable\"]/1i[1]"));
	WebElement b = driver.findElement(By.xpath("//*[@id=\"selectable\"]/1i[2]"));
	WebElement c = driver.findElement(By.xpath("//*[@id=\"selectable\"]/1i[3]"));
	WebElement d = driver.findElement(By.xpath("//*[@id=\"selectable\"]/1i[4]"));
	WebElement e = driver.findElement(By.xpath("//*[@id=\"selectable\"]/1i[5]"));
	WebElement f = driver.findElement(By.xpath("//*[@id=\"selectable\"]/1i[6]"));
	WebElement g = driver.findElement(By.xpath("//*[@id=\"selectable\"]/1i[7]"));
	Actions action = new Actions(driver);
	action.clickAndHold(a).clickAndHold(d).release().perform();
}
}