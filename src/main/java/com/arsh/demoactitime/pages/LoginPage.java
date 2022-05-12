package com.arsh.demoactitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.arsh.demoactitime.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id="username")
	WebElement username;
	
	@FindBy(name = "pwd")
	WebElement password;
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	@FindBy(xpath = "//div[@class='atLogoImg']")
	WebElement logo;
	
	@FindBy(id = "headerContainer")
	WebElement displayText;
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public String validateLoginPageURL() {
		return driver.getCurrentUrl();
	}
	public boolean validateLoginPageLogo() {
		return logo.isDisplayed();
	}
	public HomePage login() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
		return new HomePage();
	}
}
