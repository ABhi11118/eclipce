package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenersImplementation.class)
@Test
public class CustomerModule extends BaseClass {
	public void CreateCustomer() {
		TaskListPage t = new TaskListPage(driver);
		t.getAddNewButton();
		t.getNewCustomer();
		t.getEnterCustomerTextFeild();
		t.getEnterCustomerDiscription();
		t.getSelectCustomerDropDown();
		t.getBigBangCompany();
		t.getCreateCustomerButton();
		
		
	}

}
