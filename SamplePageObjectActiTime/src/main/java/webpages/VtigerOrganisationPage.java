package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerOrganisationPage extends SeleniumUtility {
	WebDriver driver;
	public VtigerOrganisationPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id ="Accounts_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addOrgnisation;
	
	@FindBy(id ="Accounts_editView_fieldName_accountname")
	private WebElement NameInput;
	
	@FindBy(id = "Accounts_editView_fieldName_website")
	private WebElement WebsiteInput;
	
	@FindBy(id ="Accounts_editView_fieldName_phone")
	private WebElement PhoneInput;
	
	@FindBy(xpath ="//button[text()='Save']")
	private WebElement SaveButton;
	
	@FindBy(xpath ="//h4[text() =' Organizations ']")
	private WebElement OrgnisationHeaderLink;
	
    @FindBy(xpath="//a[contains(text(),'Aradhy')]")
	private WebElement newlyCreatedOrgnisationName;
	
	@FindBy(xpath ="//tr[td[span[span[a[text()='Aradhy']]]]]/td[1]/div/span/input")
    private WebElement selectCheckbox; 
	
	
	@FindBy(xpath ="//button[@id ='Accounts_listView_massAction_LBL_DELETE']")
	private WebElement deleteButton;
	
	 @FindBy(xpath = "//button[@class ='btn confirm-box-ok confirm-box-btn-pad btn-primary']")
	 private WebElement yesConfirmButton;
	 
	public void createNewOrgnisation(String fname,String website,String number)
	{
		clickOnElement(addOrgnisation);
		typeInput(NameInput ,fname);
		typeInput(WebsiteInput,website);
		typeInput(PhoneInput,number);
		clickOnElement(SaveButton);
		clickOnElement(OrgnisationHeaderLink);
		
		
	}
	
	public boolean checkOrgnisationCreation()
	{
		return isElementExist(newlyCreatedOrgnisationName);
	}
	
	public void deleteOrgnisation()
	{
		clickOnElement(selectCheckbox);
		clickOnElement(deleteButton);
		clickOnElement(yesConfirmButton);
		
	}
	

}
