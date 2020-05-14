package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;


//script:LoginPage
//Tester:Sunitha
//date created:05/14/20
public class LoginPage extends DriverScript {
	//identifying page elements using @findby elements by testng

@FindBy(id="logocontainer") WebElement actiLogo;
@FindBy(id="username") WebElement usernametb;
@FindBy(name="pwd") WebElement passwordtb;  
@FindBy(id="loginButton") WebElement logginbtn;
//***************page initialization**************

public  LoginPage()
{
	PageFactory.initElements(driver, this); 
	//pageFactory.initElements(driver,LoginPage.class);
	//pagefactory is a class in pom to intialize the pageelements of the class
}

//*******************page actions/methods*****************
public boolean verifyactilogo()
{
	return actiLogo.isDisplayed();
}
	
	public void validateLogin(String username,String password)
	{
		usernametb.sendKeys(username);
		passwordtb.sendKeys(password);
		logginbtn.click();
		
	}
	
	public String  verifyLoginPageTitle()
	{
		return driver.getTitle();
		
	}
	
	
}
