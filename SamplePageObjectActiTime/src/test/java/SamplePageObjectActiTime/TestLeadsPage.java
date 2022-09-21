package SamplePageObjectActiTime;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utilities.SeleniumUtility;
import webpages.VtigerHomePage;
import webpages.VtigerLeadsPage;
import webpages.VtigerLoginPage;

public class TestLeadsPage extends SeleniumUtility{
	VtigerLoginPage getVtigerLoginPage =null;
	VtigerHomePage getVtigerHomePage =null;
	VtigerLeadsPage getVtigerLeadsPage =null;
	
	@BeforeTest
	public void prerequisite()
	{
		WebDriver driver =setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage = new VtigerLoginPage(driver);
		getVtigerHomePage = new VtigerHomePage(driver);
		getVtigerLeadsPage = new VtigerLeadsPage(driver);
		getVtigerLoginPage.loginInVtiger("admin", "Test@123");
		getVtigerHomePage.navigateToLeadPage();
		
	}
	
	@Test(enabled=true)
	public void testLeadCreation() {
		
		getVtigerLeadsPage.createNewLead("Aradhy", "Sangale", "9876542536");
		Assert.assertTrue(getVtigerLeadsPage.checkLeadCreation());
	}
	
	@Test
	public void testLeadDeletion() {
		//TODO:
		getVtigerLeadsPage.deleteLead();
		
	}
//	@AfterTest
//	
//	public void tearDown() {
//		cleanUp();
//	}

}
