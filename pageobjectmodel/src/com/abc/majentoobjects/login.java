package com.abc.majentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver;
	
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
		
	
		By email=By.id("email");
		By pwd= By.id("pass");
		By login=By.xpath("//button[@id='send2']");
		
	public void typemail()
	{
		driver.findElement(email).sendKeys("kundansinghmahisour@gmail.com");
		
	}
	public void typepassword()
	{
		driver.findElement(pwd).sendKeys("Welcome@123");
	}
	public void clickonlogin()
	{
		driver.findElement(login).click();
	}
	
	
}
