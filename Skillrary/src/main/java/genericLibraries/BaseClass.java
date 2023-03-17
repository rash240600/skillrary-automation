package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPages.ContactUsPage;
import pomPages.CoreJavaDemoVideoPage;
import pomPages.CoreJavaForSelenium;
import pomPages.HomePage;
import pomPages.SeleniumTraining;
import pomPages.SkillraryDemoApp;
import pomPages.TestingPage;

public class BaseClass {
	protected PropertiesFileUtility property;
	protected ExcelFileUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoApp demoApp;
	protected ContactUsPage contact;
	protected SeleniumTraining selenium;
	protected TestingPage testing;
	protected CoreJavaForSelenium coreJava;
	protected CoreJavaDemoVideoPage javaDemo;

//@BeforeSuite
//@BeforeTest
	@BeforeClass
	public void classSetup() {
		property = new PropertiesFileUtility();
		excel = new ExcelFileUtility();
		web = new WebDriverUtility();
		property.propertiesInitialization(IConstantPath.PROPERTY_FILE_PATH);
		String browser = property.fetchData("browser");
		String url = property.fetchData("url");
		long time = Long.parseLong(property.fetchData("timeouts"));
		web.launchBrowser(null, null, 0);
		home = new HomePage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
	}

	@BeforeMethod
	public void methodSetup() {
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		demoApp = new SkillraryDemoApp(driver);
		contact = new ContactUsPage(driver);
		selenium = new SeleniumTraining(driver);
		testing = new TestingPage(driver);
		coreJava = new CoreJavaForSelenium(driver);
		javaDemo = new CoreJavaDemoVideoPage(driver);
	}

	@AfterMethod
	public void methodTearDown() {
		excel.closeWorkbook();
	}

@AfterClass
public void classTearDown() {
	web.quitbrowser();
}
//@AfterTest
//@AfterSuite


}
