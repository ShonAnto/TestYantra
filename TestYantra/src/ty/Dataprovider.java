package ty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@DataProvider(name="testdata", parallel=true)
	public Object[][] data(){
		Object [][]arr=new Object[2][2];
		arr[0][0]="manager";
		arr[0][1]="admin";
		arr[1][0]="admin";
		arr[1][1]="manager";
		return arr;
	}
	@Test(dataProvider = "testdata")
	public void test(String a ,String b) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(a);
		driver.findElement(By.name("pwd")).sendKeys(b);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
	
}
