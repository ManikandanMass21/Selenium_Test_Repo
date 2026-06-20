package Com.DemoWebShop_Utilities;

public interface FrameworkConstants {
	
		javaUtility jUtil=new javaUtility();
		
		String PropertyFilePath= "./src/test/resources/testData/commonData.Properties";
		
		String ExcelFilePath= "./src/test/resources/testData/AddressData.xlsx";
		
		String ScreenshotsPath = "./screenshots/" + jUtil.DateTime() + ".png";
		
		String extentReportPath = "./reports/" + jUtil.DateTime() + ".html";
		
		


	}
