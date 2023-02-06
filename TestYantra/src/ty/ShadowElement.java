package ty;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
    static WebDriver driver;
	public static void main(String[] args) {
         driver= new ChromeDriver();
         driver.get("http://watir.com/examples/shadow_dom.html");
        WebElement shadowHost = driver.findElement(By.xpath("//div[@id='shadow_host']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //typecast shadowRoot to SearchContext
         SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot",shadowHost);
        System.out.println( shadowRoot.findElement(By.cssSelector("span[id='shadow_content'] > span")).getText());
	}

}
