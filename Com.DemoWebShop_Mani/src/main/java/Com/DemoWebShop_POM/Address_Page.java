package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page { 
	public Address_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement AddnewButton;
	
	@FindBy(xpath = "(//input[@value='Delete'][1])")
			private WebElement DeleteButton;
	

	public WebElement getAddnewButton() {
		return AddnewButton;
	}


	public WebElement getDeleteButton() {
		return DeleteButton;
	}


	public WebElement getLogoutLink() {
		return AddnewButton;
	}


}
