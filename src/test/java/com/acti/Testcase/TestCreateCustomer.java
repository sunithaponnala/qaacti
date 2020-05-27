package com.acti.Testcase;

import org.testng.annotations.Test;

public class TestCreateCustomer extends BaseTest {
/*	LoginPage lp;
	EnterTimePage etp;
	TaskPage tp;OO
	
	public TestCreateCustomer()
	{
		super();
	}
	@BeforeMethod
	public void preTest()
	{
		initApp();
		 lp = new LoginPage();
		 etp = new EnterTimePage();
		 tp = new TaskPage();
	}*/
	@Test
	public void testCreateCustomer()
	{
		lp.validateLogin("admin", "manager");
		String userLogged = etp.getuserLoggedIntext();
		System.out.println(userLogged);
		etp.clicktaskmenu();
		tp.clickAddNewbtn();
		tp.clickNewCustomeroption();
		tp.entercustomername("TestCustomer12");
		tp.entercustomerDescription("created dummy customer for test");
		tp.clickCreateCustomer();
		etp.clicklogoutLink();
	}

}
