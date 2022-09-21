package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerHomePage extends SeleniumUtility {
	WebDriver driver;
	public VtigerHomePage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id ="appnavigator")
	private WebElement flownavigator;
	
	@FindBy(xpath="//span[contains(text(),'MARKETING')]")
	private WebElement SelectMarketing;
	
	@FindBy(xpath="//a[@title='Leads']")
	private WebElement SelectLeadsOption;
	
	@FindBy(xpath="//a[@title='Contacts']")
	private WebElement selectContactsOption;
	
	@FindBy(xpath ="//span[text()=' Organizations']")
	private WebElement selectOrgnisationOption;
	
	
	public void navigateToLeadPage()
	{
		clickOnElement(flownavigator);
		clickOnElement(SelectMarketing);
		clickOnElement(SelectLeadsOption);
		
	}
	
	public void navigateToContactsPage()
	{
		clickOnElement(flownavigator);
		clickOnElement(SelectMarketing);
		clickOnElement(selectContactsOption);
	}
	
	public void navigateToOrgnisationPage()
	{
		clickOnElement(flownavigator);
		clickOnElement(SelectMarketing);
		clickOnElement(selectOrgnisationOption);
		
	}
}
