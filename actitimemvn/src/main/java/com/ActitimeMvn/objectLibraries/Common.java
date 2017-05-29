package com.ActitimeMvn.objectLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	@FindBy(id="logoutLink")
	private WebElement logout_link;
	
	public void logout(){
		logout_link.click();
}
}
