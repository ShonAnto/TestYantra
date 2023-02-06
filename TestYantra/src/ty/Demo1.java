package ty;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test(invocationCount = 0)
	public void demo() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement b = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a= new Actions(driver);
		a.contextClick(b).perform();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.switchTo().alert().accept();
				
	}
	
	@Test(invocationCount = 0)
	public void demo1() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		
	}
	
	@Test(invocationCount = 0)
	public void demo2() {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/shon%20antony/Downloads/iframe.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("(//img[@alt='Autocar India Facebook Page'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		Set<String> a = driver.getWindowHandles();
		for(String b:a)
		{
			String s = driver.getTitle();
			if(s.equals("Google"))
			{
				driver.switchTo().window(b);
			}
		}
		
	}
	
	@Test(invocationCount = 0)
	public void demo3() {
		WebDriver driver= new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    JavascriptExecutor j= (JavascriptExecutor) driver;
	    j.executeScript("window.scrollTo(x,y)");
		
	}
	
	@Test(invocationCount = 1)
	public void demo4() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");	
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");
		
		
		
	}
	
	

}
