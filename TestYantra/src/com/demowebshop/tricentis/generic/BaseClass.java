package com.demowebshop.tricentis.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.demowebshop.tricentis.pom.HomePage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		CommonMethods c= new CommonMethods();
		String s = c.propertyData("URL");
		driver.get(s);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	
	@BeforeMethod
	public void login() throws IOException {
		CommonMethods c= new CommonMethods();
		String un = c.propertyData("UN");
		String pwd = c.propertyData("PWD");
		HomePage h= new HomePage(driver);
		h.loginLinkText().click();
		h.usernameTxtBx().clear();
		h.usernameTxtBx().sendKeys(un);
		h.passwordTxtBx().clear();
		h.passwordTxtBx().sendKeys(pwd);
		h.loginBtn().click();
		
		
	}
	
	
	
	@AfterMethod
	public void logout() {
		HomePage h= new HomePage(driver);
		h.logoutBtn().click();;
		
	}
	
	
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		
	}
	
	 
}
