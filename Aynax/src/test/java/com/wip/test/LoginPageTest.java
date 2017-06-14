package com.wip.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wip.pages.HomePage;
import com.wip.pages.LoginPage;
import com.wip.util.BaseTestObject;

public class LoginPageTest extends BaseTestObject
{

	HomePage objhomepage=null;
	LoginPage objloginpage=null;
	boolean flag=false;
	
	
	@Parameters({"browserType"})
	@Test(priority=0, enabled=true,groups="regression")
	public void verifyLoginPage() throws Exception
	{
		try 
		{
			objloginpage = new LoginPage(driver);
			flag = objloginpage.isLoginPageDisplayed();
		    Assert.assertTrue(flag, "login page is not is not displayed");
		   
		    
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED CLICK ON SITELOGO AND VERFIY PAGETITLE TESTCASE" + "\n clickOnSiteLogoAndCheckThePageTitle" +e.getLocalizedMessage());
		}

		}
	
		
	}
	

