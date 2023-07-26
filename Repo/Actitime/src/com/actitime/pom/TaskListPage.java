package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewButton;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomer;
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement enterCustomerNameTextFeild;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement enterCustomerDiscription;
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[1]")
private WebElement selectCustomerDropDown;
@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow selected']")
private WebElement bigBangCompany;
@FindBy(xpath="(//div[text()='Create Customer'])[1]")
private WebElement createCustomerButton;

public TaskListPage( WebDriver driver) {
PageFactory.initElements(driver, this);	
}
public WebElement getAddNewButton() {
	return addNewButton;
}

public WebElement getNewCustomer() {
	return newCustomer;
}

public WebElement getEnterCustomerTextFeild() {
	return enterCustomerNameTextFeild;
}

public WebElement getEnterCustomerDiscription() {
	return enterCustomerDiscription;
}

public WebElement getSelectCustomerDropDown() {
	return selectCustomerDropDown;
}

public WebElement getBigBangCompany() {
	return bigBangCompany;
}
public WebElement getCreateCustomerButton() {
	return createCustomerButton;
}

}