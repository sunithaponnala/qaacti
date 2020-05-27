package com.acti.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.DriverScript;
import com.acti.Pages.LoginPage;

public class LoginPageTest  extends BaseTest{
/*	LoginPage lp;
	
	public LoginPageTest()
	//super keyword is used to call the parent or base class constructor
	{
		super();
	}
	
	@BeforeMethod
	public void preTest()
	{
		initApp();
		  lp = new LoginPage();
		
	}
	
	@AfterMethod
	public void postTest()
	{
		driver.close();
	}*/
	@Test(priority=1)
	public void TestverifyactiLogo()
	{
   boolean flag = lp.verifyactilogo();
   Assert.assertTrue(flag);
  // System.out.println(flag);
	}
	@Test(priority=2)
	public void TestLoginPageTitle()
	{
		String Title = lp.verifyLoginPageTitle();
		Assert.assertEquals("actiTIME - Login", Title);
		//System.out.println(Title);
	}
	
	@Test(priority=3)
	public void TestvalidateLoginFunction()
	{
		lp.validateLogin("admin", "manager");
	}
	//to show if we don't want to hard code we can pass in parameters using config.properties
	@Test(priority=4)
	public void TestvalidateLoginFunction1()
	{
		lp.validateLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
}

