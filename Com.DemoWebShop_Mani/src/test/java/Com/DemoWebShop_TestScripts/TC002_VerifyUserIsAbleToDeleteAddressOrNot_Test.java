package Com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Com.DemoWebShop_POM.Address_Page;
import Com.DemoWebShop_Utilities.BaseTest;

public class TC002_VerifyUserIsAbleToDeleteAddressOrNot_Test extends BaseTest{
	
	@Test
	
	public void deletAddress() throws IOException, InterruptedException {
	
		webDriver.javascriptScrollTillElement(driver, homepage.getAddressOption());
		homepage.getAddressOption().click();
		
		Address_Page addresspage = new Address_Page(driver);
        addresspage.getDeleteButton().click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		webDriver.switchToAlertAccept(driver);
		
		Thread.sleep(3000);
		webDriver.webPageScreenShot(driver);
		
				
	}

}

	