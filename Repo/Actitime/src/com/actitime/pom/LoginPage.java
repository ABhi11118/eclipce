package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement usertxb;
	@FindBy(name = "pwd")
	private WebElement pswdtxb;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Login(String un, String pwd) {
		usertxb.sendKeys(un);
		pswdtxb.sendKeys(pwd);
		logoutBtn.click();
	}
}
