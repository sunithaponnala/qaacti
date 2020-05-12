package com.acti.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverScript {
	public static WebDriver driver;
	public static Properties prop;
	public DriverScript() {
		try
		{
			File src = new File("./acticonfiguration/config.properties");
			FileInputStream fis = new FileInputStream(src);
		 prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("unable to load properties file" +e.getMessage());
		}
		
	}
	
			public static void initApp()
		{
			String browser = prop.getProperty("Browser");
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./actiBrowsers/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
			System.setProperty("webdriver.geco.driver", "./actiBrowsers/geckodriver.exe");
			driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String url = prop.getProperty("qaurl");
			driver.get(url);
		}
		
		
			

		
	}
	


