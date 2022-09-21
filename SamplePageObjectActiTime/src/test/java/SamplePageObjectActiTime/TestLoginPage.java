package SamplePageObjectActiTime;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;
import webpages.VtigerLoginPage;
import webpages.VtigerPropertyData;

public class TestLoginPage extends SeleniumUtility{

	@Test
	public void testVtigerLogin()
	{
		

		VtigerPropertyData getVtigerPropertyData =new VtigerPropertyData();
		VtigerLoginPage getVtigerLoginPage=new VtigerLoginPage(driver);
		
		getVtigerLoginPage.loginInVtiger("UserName", "Password");
		
		
		Assert.assertEquals(getCurrentTitleOfApplication(), "Dashboard","Login was not successfull or title got changed");
		
		cleanUp();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//step1: Open chrome browser and enter app url
//				WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
//				VtigerLoginPage getVtigerLoginPage=new VtigerLoginPage(driver);		
//				//step2: login with valid cred in vtiger
//				getVtigerLoginPage.loginInVtiger("admin", "Test@123");
//				//Step3: validate Vtiger home page opened or not
//				Assert.assertEquals(getCurrentTitleOfApplication(), "Dashboard","Login was not successfull or title got changed");
//				//step4: close the browser
//				cleanUp();
	
