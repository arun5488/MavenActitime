package com.ActitimeMvn.projectAndCustomerTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.ActitimeMvn.genericLibraries.ScreenShotListener.class)
public class ProjectAndCustomerTest {
  @Test
  public void createCustomerTest() {
	  System.out.println("Project with maven");
  }
}
