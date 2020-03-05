package demo;



	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Framehandling {
		public static void main(String[]args)throws IOException
		{
		System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/Chrome Driver/chromedriver.exe");
		System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.switchTo().frame((WebElement) driver.findElements(By.className("demo-frame")));
		System.out.println(driver.findElement(By.id("Draggable")).isDisplayed());
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Droppable")).click();

	}}



