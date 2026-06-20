package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page { 
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Addresses")
	private WebElement AddressOption;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement LogoutLink;
	
	

	public WebElement getAddressOption() {
		return AddressOption;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}


}
