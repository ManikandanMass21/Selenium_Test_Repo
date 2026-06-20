package Com.DemoWebShop_Utilities;
	import java.io.File;
	import java.io.IOException;
	import java.time.LocalDateTime;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
	import org.testng.ITestListener;
	import org.testng.ITestNGListener;
	import org.testng.ITestResult;
	import org.testng.annotations.Test;
	import org.testng.internal.annotations.IListeners;

	public class ListenerUtitlity implements ITestListener {
		
		@Override
		public void onTestFailure(ITestResult result) {
			TakesScreenshot ts= (TakesScreenshot) BaseTest.sDriver;
			File temp= ts.getScreenshotAs(OutputType.FILE);
			File dest= new File(FrameworkConstants.ScreenshotsPath);
			try
			{
				FileHandler.copy(temp, dest);
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}





}
