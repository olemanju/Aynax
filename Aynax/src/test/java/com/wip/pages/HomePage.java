package com.wip.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.wip.util.BasePageObject;

public class HomePage extends BasePageObject
{
	
WebElement element;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
public static Logger log= Logger.getLogger(HomePage.class);

/*Variables*/

boolean flag = false;
List<WebElement> list=null;
/*Web elements*/

By imgSiteLogo = By.xpath("//img[@alt='Aynax.com Logo']");
By lnkLogin = By.linkText("Login");

public boolean isSiteLogoDisplayed() throws Exception
{
try 
{
	flag= isElementPresent(imgSiteLogo);
	if(flag)
	{
		System.out.println("Sitelogo Present on the Page");
	}
	else
	{
		System.out.println("Site logo is missing");
	}
	
}
catch (Exception e) 
{
	throw new Exception("Site logo is not present in Home page::"+isSiteLogoDisplayed()+e.getLocalizedMessage());
}	
return flag;
}

public LoginPage clickOnLogin() throws Exception
{
	try 
	{
		flag = isElementPresent(lnkLogin);
		
		Assert.assertTrue(flag, "Logn link is not displayed");
		String name=setElement(lnkLogin).getText();
		System.out.println(name);
		setElement(lnkLogin).click();
		explicitWait(3000);
		
	} 
	catch (Exception e) 
	{
		throw new Exception("Login link is not present in Home page::"+clickOnLogin()+e.getLocalizedMessage());
	}
	return new LoginPage(driver);
}


}
