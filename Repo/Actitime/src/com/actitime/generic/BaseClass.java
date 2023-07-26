package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;

public class BaseClass {
	public static WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		Reporter.log("Open the Browser", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void loginToActitime() throws IOException {
		Reporter.log("Login to the Appication", true);
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);

	}

	@AfterMethod
	public void logOut() {
		Reporter.log("Logging Out the Application", true);
		HomePage hp = new HomePage(driver);
		hp.setlogOut();
	}

	@AfterTest
	public void closeBrowser() {
		Reporter.log("Closing the Browser", true);
		driver.manage().window().minimize();
		driver.close();
	}

}
