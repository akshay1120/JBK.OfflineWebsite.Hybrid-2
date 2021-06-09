package com.jbk.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;
import com.jbk.pages.UsersPage;
import com.jbk.testBase.TestBase;

public class UsersTest extends TestBase
{
	WebDriver driver ;
	UsersPage up = null ;
	LoginPage lp = null ;
	
	@BeforeClass
	public void openBrowser() throws Exception 
	{
		driver = initialization() ;
		lp = new LoginPage(driver) ;
		up = lp.navigateToDashboardPg().navigateToUsersPg() ;
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyHeadingsAl()
	{
		log.info("verify Headings using Al");
		Assert.assertTrue(up.alTableHeadings());
	}
	
	@Test (priority=2) 
	public void verifyMobNoLength() 
	{
		log.info("verify Mob No Length");
		Assert.assertTrue(up.mobNoLength());
	}
	
	@Test (priority=3) 
	public void verifyMaleGender() 
	{
		log.info("verify for Male Gender");
		Assert.assertTrue(up.maleGender());
	}
	
	@Test (priority=4) 
	public void verifyUnameInOrder() 
	{
		log.info("verify Uname In Order");
		Assert.assertTrue(up.unameInOrder());
	}
	
	@Test (priority=5) 
	public void verifyStateMaharashtra() 
	{
		log.info("*********************************************************");
		log.info("verify Uname In Order");
		Assert.assertTrue(up.unameInOrder());
	}
	
	@Test (priority=6) 
	public void verifyGmail_com() 
	{
		log.info("*********************************************************");
		log.info("verify Gmail.com");
		Assert.assertTrue(up.gmail_com());
	}
	
	@Test (priority=7) 
	public void verifyClickDeleteAlertMsg() 
	{
		log.info("*********************************************************");
		log.info("verify Click Delete Alert Msg");
		Assert.assertTrue(up.clickDeleteAlertMsg());
	}
	
	@Test (priority=8) 
	public void verifySeleniumFaculty() 
	{
		log.info("*********************************************************");
		log.info("verify Selenium Faculty");
		Assert.assertTrue(up.seleniumFaculty());
	}
	
	@Test (priority=9) 
	public void verifyToolTip() 
	{
		log.info("*********************************************************");
		log.info("verify Tool Tip");
		Assert.assertTrue(up.toolTip());
	}
	
	@Test (priority=10) 
	public void verifyComplete_UsersTable() throws Exception 
	{
		log.info("*********************************************************");
		log.info("verify Complete Users Table");
		Assert.assertTrue(up.CompleteUsersTable());
	}
}
