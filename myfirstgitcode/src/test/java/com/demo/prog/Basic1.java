package com.demo.prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 
{
static
{
System.setProperty("webdriver.chrome.driver", "./src/test/java/driver/chromedriver.exe");	
}
	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();	
     driver.get("http://www.google.com");
	 String title=driver.getTitle();
	 System.out.println(title);
	}
}
