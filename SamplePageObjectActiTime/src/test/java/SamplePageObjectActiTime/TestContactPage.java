package SamplePageObjectActiTime;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.VtigerContactPage;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;

public class TestContactPage extends SeleniumUtility {
	
	VtigerLoginPage getVtigerLoginPage =null;
	VtigerHomePage getVtigerHomePage =null;
	VtigerContactPage getVtigerContactPage =null;
	
	
	@BeforeTest
	public void prerequisite()
	{
		WebDriver driver =setUp("chrome" ,"https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage = new VtigerLoginPage(driver);
		getVtigerHomePage = new VtigerHomePage(driver);
		getVtigerContactPage = new VtigerContactPage(driver);
		getVtigerLoginPage.loginInVtiger("admin", "Test@123");
		getVtigerHomePage.navigateToContactsPage();
	}
	
	
	@Test
	public void testContactCreation()
	{
		getVtigerContactPage.createNewContact("Aradhy", "Avhad", "7351457840");
		Assert.assertTrue(getVtigerContactPage.checkContactCreation(), "Contact not Created");
	}
	
	@Test
	public void testContactDelete()
	{
		getVtigerContactPage.deleteContact();
		Assert.assertTrue(getVtigerContactPage.checkContactCreation(), "Contact not deleteed");
		
	}

}
