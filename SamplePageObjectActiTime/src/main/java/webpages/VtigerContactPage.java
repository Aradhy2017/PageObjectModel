package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerContactPage extends SeleniumUtility{
	WebDriver driver;
	public VtigerContactPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id ='Contacts_listView_basicAction_LBL_ADD_RECORD']")
	 private WebElement addContact;
	
	@FindBy(xpath ="//span[text()='None']")
	private WebElement  salotaionForContact;
	
	@FindBy(xpath ="//div[@id='select2-drop']/ul/li[3]")
	private WebElement selectSalotationTypeForContact;
	
	@FindBy(id="Contacts_editView_fieldName_firstname")
	private WebElement firstNameInputFieldForContact;

	@FindBy(id="Contacts_editView_fieldName_lastname")
	private WebElement lastNameInputFieldForContact;
	
	@FindBy(id="Contacts_editView_fieldName_phone")
	private WebElement contactNumberOfContact;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButtonForContact;
	
	@FindBy(xpath="//h4[contains(text(),' Contacts ')]")
	private WebElement ContactHeaderLink;
	
	@FindBy(xpath="//a[contains(text(),'Aradhy')]")
	private WebElement newlyCreatedContactName;
	
	@FindBy(xpath ="//tr[td[span[span[a[text()='Aradhy']]]]]/td[1]/div/span/input")
	private WebElement selectcheckBox;
	
	@FindBy(xpath ="//button[@id ='Contacts_listView_massAction_LBL_DELETE']")
	private WebElement DeleteButtonForContact;
	
	
	@FindBy(xpath ="//button[@class='btn confirm-box-ok confirm-box-btn-pad btn-primary']")
	private WebElement ConfirmDeleteButtonForContact;
	
	public void createNewContact(String fname,String lname,String number)
	{
		clickOnElement(addContact);
		clickOnElement(salotaionForContact);
		clickOnElement(selectSalotationTypeForContact);
		typeInput(firstNameInputFieldForContact, fname);
		typeInput(lastNameInputFieldForContact, lname);
		typeInput(contactNumberOfContact, number);
		clickOnElement(saveButtonForContact);
		clickOnElement(ContactHeaderLink);
		
	}
	
	public boolean checkContactCreation()
	{
		return isElementExist(newlyCreatedContactName);
		
	}
	
	public void deleteContact()
	{
		clickOnElement(selectcheckBox);
		clickOnElement(DeleteButtonForContact);
		clickOnElement(ConfirmDeleteButtonForContact);
		
	}
	
	

}
