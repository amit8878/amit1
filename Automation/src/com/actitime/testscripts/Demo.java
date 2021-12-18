package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test(priority=0,invocationCount = 3)
	public void createCustomer() {
		
		Reporter.log("hi",true);
	}
	@Test(priority=1)
	public void modifyCustomer() {
		
		Reporter.log("hello",true);
	}
	@Test(priority=2)
	public void deleteCustomer() {
		
		Reporter.log("bye",true);
	}

}
