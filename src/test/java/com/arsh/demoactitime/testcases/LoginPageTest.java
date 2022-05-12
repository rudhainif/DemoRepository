package com.arsh.demoactitime.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.arsh.demoactitime.base.TestBase;
import com.arsh.demoactitime.pages.HomePage;
import com.arsh.demoactitime.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPage();
	}
	@Test
	public void validateLoginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "actiTIME - Login");
	}
	@Test
	public void validateLoginPageURLTest()
	{
		String url = loginpage.validateLoginPageURL();
		Assert.assertEquals(url, "https://demo.actitime.com/login.do");
	}
	@Test
	public void validateLoginPageLogoTest() {
		boolean logo = loginpage.validateLoginPageLogo();
		Assert.assertTrue(logo);
	}
	@Test
	public void loginTest() {
		loginpage.login();
		Assert.assertNull(homepage);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
