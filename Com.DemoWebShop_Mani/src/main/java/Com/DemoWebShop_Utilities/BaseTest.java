package Com.DemoWebShop_Utilities;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.DemoWebShop_POM.Home_Page;
import Com.DemoWebShop_POM.Login_Page;
import Com.DemoWebShop_POM.Welcome_Page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest 
{
	public WebDriver driver;
	public static WebDriver sDriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public FileUtility fileutility = new FileUtility();
	public Welcome_Page welcomepage;
	public Login_Page loginpage;
	public Home_Page homepage;
	public WebDriverUtility webDriver = new WebDriverUtility();
	public WebDriverWait wait;
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  System.out.println("Before Method----Login");
	  welcomepage = new Welcome_Page(driver);
	  welcomepage.getLoginLink().click();;
	  
	  loginpage = new Login_Page(driver);
	  loginpage.getEmailTextField().sendKeys(fileutility.readDataFromPropertyFile("username"));
	  loginpage.getPasswordTextField().sendKeys(fileutility.readDataFromPropertyFile("password"));
	  loginpage.getLoginButton().click();
	  
	  homepage = new Home_Page(driver);
	  
}

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println("After Method----Logout");
	  Thread.sleep(2000);
	  homepage.getLogoutLink().click();
  }

  @BeforeClass
  public void beforeClass() throws IOException {
	  System.out.println("Before Class----BrowserSetup Open");
		//Launch Browser
	  String browser= fileutility.readDataFromPropertyFile("browsername");
  
	  String url=fileutility.readDataFromPropertyFile("url");
	  
//	  String browser=System.getProperty("browsername");
//	  String url=System.getProperty("baseurl");
	  
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.out.println("Launch Chrome browser");
		  driver=new ChromeDriver();
	  }
		  else if(browser.equalsIgnoreCase("edge")) {
			  System.out.println("Launch edge browser");
			  driver=new EdgeDriver();
		  }
		  else if(browser.equalsIgnoreCase("firefox")) {
			  System.out.println("Launch Firefox browser");
			  driver=new FirefoxDriver();
		  }
		  else {
			  System.out.println("Invalid Browser");
	  }
	  wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	  sDriver=driver;
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  System.out.println("After Class----BrowserSetup Close");
	  Thread.sleep(3000);
	  
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test----Report Generation");
	  spark=  new ExtentSparkReporter(FrameworkConstants.extentReportPath);
	  reports = new ExtentReports();
	  reports.attachReporter(spark);
	  test = reports.createTest("DemoWebShop Address Module");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test----Report Generation");
	  reports.flush();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suit----DB Connect");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suit----DB Disconnect");
  }

}


