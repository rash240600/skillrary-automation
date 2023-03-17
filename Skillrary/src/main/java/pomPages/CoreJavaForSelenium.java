package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSelenium {
	// Declaration
	@FindBy(className = "newest_coursing clearfix")
	private WebElement header;
	@FindBy(xpath = "//a[text()=' Core Java For Selenium Trainin']")
	private WebElement course;

	// Initialization
	public CoreJavaForSelenium(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getHeader() {
		return header;
	}

	public void clickOnCourse() {
		course.click();
	}

}
