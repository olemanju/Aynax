package com.wip.pages;

import org.apache.log4j.Logger;
import org.jfree.util.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wip.util.BasePageObject;

public class LoginPage extends BasePageObject
{

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public static Logger log= Logger.getLogger(LoginPage.class);
	
	boolean flag=false;
	/* Web elements */

	//By msgLoginPage = By.xpath("//span[contains(text(),' Login To Your Aynax Account')]");
	By msgLandingPage = By.xpath("//h1[contains(text(),'List of  Invoices')]");
	By TimeSheetTab = By.xpath("//a[contains(text(),'Timesheets')]");
	By loginTab = By.xpath("//a[@href='https://www.aynax.com/login.php']");
	By userEmailAddr = By.name("emailaddress");
	By userPwd = By.name("password");
	By titleText = By.className("loginLabel");
	By login = By.linkText("Login");
	By LoginBtn = By.name("submit");
	By homePageTitle = By.xpath("//h1[contains(text(),'List of  Invoices')]");

	public boolean isLoginPageDisplayed() throws Exception 
	{
		try 
		{
			flag = isElementPresent(login);
			if (flag) 
			{
				Log.info("LoginPage displayed");
				
			}
			else
			{
				log.info("Login Page is Missing");
			}
		}
		catch(Exception e)
		{
			throw new Exception("Login page is displayed::" + isLoginPageDisplayed() + e.getLocalizedMessage());
		}
		return flag;
	}
}
