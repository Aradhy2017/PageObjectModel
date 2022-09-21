package SamplePageObjectActiTime;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;
import webpages.VtigerOrganisationPage;

public class TestOrgnisationPage extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage =null;
	VtigerHomePage getVtigerHomePage =null ;
	VtigerOrganisationPage getVtigerOrganisationPage = null;
	
	@BeforeTest
	public void prerequisite()
	{
		WebDriver driver =setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage =new VtigerLoginPage(driver);
		getVtigerHomePage = new VtigerHomePage(driver);
		getVtigerOrganisationPage = new VtigerOrganisationPage(driver);
		getVtigerLoginPage.loginInVtiger("admin", "Test@123");
		getVtigerHomePage.navigateToOrgnisationPage();
		
	}
	
	@Test
	public void testOrgnisationCreate()
	{
		getVtigerOrganisationPage.createNewOrgnisation("Aradhy", "www.google.com", "7845981245");
		Assert.assertTrue(getVtigerOrganisationPage.checkOrgnisationCreation(), "Name not Created");
	}
	
	@Test
	public void testOrgnisationDeletion()
	{
		getVtigerOrganisationPage.deleteOrgnisation();
		Assert.assertTrue(getVtigerOrganisationPage.checkOrgnisationCreation(), "Deleteed or not");
		
	}
	

}
