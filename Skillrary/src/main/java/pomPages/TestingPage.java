package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	// Declaration
	@FindBy(xpath = "//h1[text()='Testing']")
	private WebElement header;
	@FindBy(id = "java")
	private WebElement javaImg;
	@FindBy(id = "cartArea")
	private WebElement cartArea;
	@FindBy(className = "fa fa-facebook")
	private WebElement facebook;

	// Initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getHeader() {
		return header;
	}

	public WebElement getJavaImage() {
		return javaImg;
	}

	public WebElement getCartArea() {
		return cartArea;
	}

	public WebElement getFacebookIcon() {
		return facebook;
	}

	public void clickFacebookIcon() {
		facebook.click();
	}

}
