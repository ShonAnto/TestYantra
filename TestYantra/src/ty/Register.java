package ty;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test(groups = "smoke")
	public void register() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shon");
		driver.findElement(By.id("LastName")).sendKeys("Antony");
		driver.findElement(By.id("Email")).sendKeys("shon.antony106@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("shonantony123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("shonantony123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//input[@type='button' and @value='Continue']")).click();
		String text = driver.findElement(By.xpath("(//a[@class='account' and @href='/customer/info'])[1]")).getText();
		System.out.println(text);
		driver.quit();
	}
	@Test
	public void demo() {
		System.out.println("hi");
	}
	}


