package com.google.tester;


import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    @Test
    public void testingmyGoogle()
    {
    	WebDriver d1 = new FirefoxDriver();
    	d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	d1.get("http://www.google.com");
    	d1.quit();
    }
}
