package com.ActitimeMvn.genericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	public void waitForPageLoad(){
		Browser.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	public void waitForElementToLoad(WebElement element){
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
