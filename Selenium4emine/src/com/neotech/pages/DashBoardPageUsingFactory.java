package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPageUsingFactory {

	// public WebElement logo = driver.findElement(By.xpath("ohrm-samll-logo"));

	// public WebElement name = driver.findElement(By.id("account-name"));

	@FindBy(id = "ohrm-small-logo")
	public WebElement logo;

public DashboardPageUsingFactory () 
{
	}

}
