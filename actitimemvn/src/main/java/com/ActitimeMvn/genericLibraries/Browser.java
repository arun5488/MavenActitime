package com.ActitimeMvn.genericLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class Browser {
	
	static WebDriver driver;
	public  static WebDriver getBrowser(){
		
		if(Constants.browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else if (Constants.browser.equalsIgnoreCase("Chrome")){
			String chromeDriverPath = System.getProperty("user.dir")+"/src/main/resource/selenium-chrome-driver-2.53.0.jar";
			System.getProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		}
		
		return driver;
	}
}
