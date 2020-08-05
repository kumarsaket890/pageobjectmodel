package com.abc.majentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home {
	
	WebDriver driver;
	 
	public home(WebDriver driver)
	{
		this.driver=driver;
	}
	By logout=By.xpath("//a[text()='Log Out']");
	public void clickonlogout()
	{
		driver.findElement(logout).click();
	}
	

}
