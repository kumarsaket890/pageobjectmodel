package com.abc.magentomain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.majentoobjects.home;
import com.abc.majentoobjects.login;
import com.abc.majentoobjects.welcome;

public class magentotest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/saketkumar/Downloads/selenium/chromedriver");
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		c.get("https://www.magento.com");
		welcome w=new welcome(c);
		w.clickonmyaccount();
		login l=new login(c);
		l.typemail();
		l.typepassword();
		l.clickonlogin();
		home h=new home(c);
		h.clickonlogout();
		System.out.println("my send conmmit");
		
		c.quit();

	}

}
