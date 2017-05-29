package com.ActitimeMvn.objectLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement task_link;
	
	@FindBy(linkText="Projects & Customers")
	private WebElement project_and_customerlink;
	
	public WebElement getTask_link() {
		return task_link;
	}

	public void setTask_link(WebElement task_link) {
		this.task_link = task_link;
	}

	public WebElement getProject_and_customerlink() {
		return project_and_customerlink;
	}

	public void setProject_and_customerlink(WebElement project_and_customerlink) {
		this.project_and_customerlink = project_and_customerlink;
	}


	
}
