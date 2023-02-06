package com.demowebshop.tricentis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "Log in")
	private WebElement loginlinktxt;
	
	@FindBy(id = "Email")
	private WebElement usernametxtbx;
	
	@FindBy(id = "Password")
	private WebElement passwordtxtbx;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbtn;
	
	@FindBy(linkText = "Log out")
	private WebElement logotbtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement loginLinkText() {
		return loginlinktxt;
	}
	public WebElement loginBtn() {
		return loginbtn;
	}
	public WebElement usernameTxtBx() {
		return usernametxtbx;
	}
	public WebElement passwordTxtBx() {
		return passwordtxtbx;
	}
	public WebElement logoutBtn() {
		return logotbtn;
	}
}
