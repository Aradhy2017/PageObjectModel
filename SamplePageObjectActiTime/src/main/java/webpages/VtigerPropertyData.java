package webpages;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class VtigerPropertyData extends SeleniumUtility {
	
	public void PropertyFileRead() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\SamplePageObjectActiTime\\src\\VtigerData.properties");
		Properties prop =new Properties();
		prop.load(fis);
		
		
		String appUrl = prop.getProperty("appUrl");
		String UserName = prop.getProperty("UserName");
		String Password =prop.getProperty("Password");
		WebDriver driver = setUp("chrome",appUrl);
		
		
		
	}

}
