package Com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.DemoWebShop_POM.AddNewAddress_Page;
import Com.DemoWebShop_POM.Address_Page;
import Com.DemoWebShop_Utilities.BaseTest;
import Com.DemoWebShop_Utilities.WebDriverUtility;

public class TC001_VerifyUserIsAbleToAddAddressOrNot_Test extends BaseTest {
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		webDriver.javascriptScrollTillElement(driver, homepage.getAddressOption());
		homepage.getAddressOption().click();
		
		Address_Page addresspage = new Address_Page(driver);
		webDriver.javascriptScrollTillElement(driver, addresspage.getAddnewButton());
		addresspage.getAddnewButton().click();
		
		AddNewAddress_Page newAddressPage = new AddNewAddress_Page(driver);
		newAddressPage.getFirstNameField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 0));
		newAddressPage.getLastNameField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 1));
		newAddressPage.getEmailField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 2));
		newAddressPage.getCompanyTextField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 3));


		webDriver.selectByVisibleText(newAddressPage.getCountryDropdown(),fileutility.readDataFromExcelFile("sheet1", 1, 4));
		newAddressPage.getCityTextField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 5));
		newAddressPage.getAddress1TextField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 6));
		newAddressPage.getAddress2TextField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 7));
		newAddressPage.getZipcodeTextField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 8));
		newAddressPage.getPhoneNumberTextField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 9));
		newAddressPage.getFaxNumberTextField().sendKeys(fileutility.readDataFromExcelFile("sheet1", 1, 10));
		System.out.println("Data Entered");
		
		newAddressPage.getSaveButton().click();
		
		Thread.sleep(2000);
		webDriver.webPageScreenShot(driver);







		


		
		
	}
	

}
