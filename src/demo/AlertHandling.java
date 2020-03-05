package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[]args)throws IOException
	{
	System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/Chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get("http://www.prtc.in/PRTCWeb/preUserAuthenticate.do;jsessionid=F57FC5F9F7F821F8EF1D57FDBD13ECDC");
	 driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[3]/input")).click();
	 Alert a=driver.switchTo().alert();
	 System.out.println(a.getText());
	 a.accept();//for enter button
	 a.dismiss();//for cancel button
	 a.sendKeys("Subhashini");//prompt button
	 a.accept();
	 
	 
	
}
}