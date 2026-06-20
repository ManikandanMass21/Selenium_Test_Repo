package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress_Page { 
	public AddNewAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Address_FirstName")
	private WebElement FirstNameField;
	
	@FindBy(id = "Address_LastName")
	private WebElement LastNameField;
	
	@FindBy(id = "Address_Email")
	private WebElement EmailField;
	
	@FindBy(id = "Address_CountryId")
	private WebElement countryDropdown;
	
	@FindBy(id = "Address_Company")
	private WebElement CompanyTextField;
	
	@FindBy(id = "Address_City")
	private WebElement CityTextField;
	
	@FindBy(id = "Address_Address1")
	private WebElement Address1TextField;
	
	@FindBy(id = "Address_Address2")
	private WebElement Address2TextField;
	
	public WebElement getFirstNameField() {
		return FirstNameField;
	}

	public WebElement getLastNameField() {
		return LastNameField;
	}

	public WebElement getEmailField() {
		return EmailField;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getCompanyTextField() {
		return CompanyTextField;
	}

	public WebElement getCityTextField() {
		return CityTextField;
	}

	public WebElement getAddress1TextField() {
		return Address1TextField;
	}

	public WebElement getAddress2TextField() {
		return Address2TextField;
	}

	public WebElement getZipcodeTextField() {
		return ZipcodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public WebElement getFaxNumberTextField() {
		return FaxNumberTextField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	@FindBy(id = "Address_ZipPostalCode")
	private WebElement ZipcodeTextField;
	
	@FindBy(id = "Address_PhoneNumber")
	private WebElement PhoneNumberTextField;
	
	@FindBy(id = "Address_FaxNumber")
	private WebElement FaxNumberTextField;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement SaveButton;

	

}
