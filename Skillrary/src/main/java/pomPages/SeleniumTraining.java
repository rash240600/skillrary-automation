package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SeleniumTraining {
	// Declaration
	@FindBy(xpath = "//h1[text()='Selenium Training']")
	private WebElement header;
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement plusButton;
	@FindBy(xpath = "//button[@ondblclick='addtocart()']")
	private WebElement addToCartButton;

//Initialization
	public SeleniumTraining(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Utilization
	public WebElement getHeader() {
		return header;
	}

	public void add(WebDriverUtility web) {
		web.doubleClick(plusButton);
	}

	public void addToCart() {
		addToCartButton.click();
	}

}
