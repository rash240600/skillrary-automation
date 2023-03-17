package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoApp {
// Declaration
	@FindBy(xpath = "//div[@class='navbar-header']")
	private WebElement pageHeader;
	@FindBy(id = "course")
	private WebElement course;
	@FindBy(xpath = "//span//a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	@FindBy(name = "addresstype")
	private WebElement category;
	@FindBy(xpath = "/descendant::a[text()='Contact Us']")
	private WebElement contactUs;

	// Initialization
	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Utilization
	public WebElement getHeader() {
		return pageHeader;
	}

	public void mouseHoverToCourse(WebDriverUtility web) {
		web.mouseHover(course);
	}

	public void selectSeleniumTraining() {
		seleniumTrainingLink.click();
	}

	public void categoryDropdown(WebDriverUtility web, int index) {
		web.dropDown(category, index);
	}

	public void contact() {
		contactUs.click();
	}
}
