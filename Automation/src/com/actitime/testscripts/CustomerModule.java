package com.actitime.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
@Listeners(com.actitime.generics.ListenersImplementation.class)
public class CustomerModule extends BaseClass  {
	@Test
	public void createCustomer() throws InterruptedException {
		Reporter.log("createCustomer",true);
		Thread.sleep(3000);
		Assert.fail();
	}
	
 
}
