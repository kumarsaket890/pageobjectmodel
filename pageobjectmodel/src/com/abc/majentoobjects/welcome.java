package com.abc.majentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcome {
	WebDriver driver;
	
	public welcome(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By myactt= By.xpath("//a[text()='My Account']");
	
	public void clickonmyaccount()
	{
		driver.findElement(myactt).click();
	}
	

}
