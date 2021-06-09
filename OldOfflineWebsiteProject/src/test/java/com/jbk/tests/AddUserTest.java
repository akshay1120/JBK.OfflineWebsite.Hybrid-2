package com.jbk.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.pages.AddUserPage;
import com.jbk.pages.LoginPage;
import com.jbk.testBase.TestBase;

public class AddUserTest extends TestBase
{
	WebDriver driver ;
	AddUserPage ap = null;
	LoginPage lp = null;
	
	@BeforeClass
	public void openBrowser() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		ap = lp.navigateToDashboardPg().navigateToUsersPg().navigateToAddUserPage();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority=1)
	public void verifyPrintingDragDownOptions()
	{
		log.info("verify Printing Drag Down Options using Al");
		Assert.assertTrue(ap.printingDragDownOptions());
	}
	
	@Test (priority=2)
	public void verifyprintingDragDownOptExcel() throws Exception
	{
		log.info("verify Printing Drag Down Options using Excel");
		Assert.assertTrue(ap.printingDragDownOptExcel());
	}
	
	@Test (priority=3)
	public void verifyValidAddUser() throws Exception
	{
		log.info("verify Valid Add User");
		Assert.assertTrue(ap.validAddUser());
	}
}
