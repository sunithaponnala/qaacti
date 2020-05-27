package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Utils.Common;

public class TaskPage extends DriverScript {

	
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement btnAddNew;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement addNewcustomeroption;
	@FindBy(xpath="//div[@class='customerNameDiv'] //input[@placeholder='Enter Customer Name']") WebElement customerNametb; 
	 @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement customerdescriptonTextArea ;
	 @FindBy(xpath="//div[contains (text(),'Create Customer')]") WebElement createCustomerbtn;	 
	 
	 public TaskPage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public void clickAddNewbtn()
	 {
		 Common.highLightElement(btnAddNew);
		 btnAddNew.click();
	 }
	 public void clickNewCustomeroption()
	 {
		 Common.highLightElement(addNewcustomeroption);
		 addNewcustomeroption.click();
	
	 }
	 
	 public void entercustomername(String customerName)
	 {
		 Common.highLightElement(customerNametb);
		 customerNametb.sendKeys(customerName);
	 }
	 public void entercustomerDescription(String customerDescription)
	 {
		 Common.highLightElement(customerdescriptonTextArea);
		 customerdescriptonTextArea.sendKeys(customerDescription);
	 }
	 
	 public void clickCreateCustomer()
	 {
		 Common.highLightElement(createCustomerbtn);
		 createCustomerbtn.click(); 
	 }
}
