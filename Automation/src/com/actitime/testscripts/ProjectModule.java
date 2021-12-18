package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority=0,invocationCount = 3)
	public void createProject() {
		
		Reporter.log("Project created",true);
	}
	@Test(priority=1)
	public void modifyProject() {
		
		Reporter.log("Project modified",true);
	}
	@Test(priority=2)
	public void deleteProject() {
		
		Reporter.log("Project deleted",true);
	}

}


