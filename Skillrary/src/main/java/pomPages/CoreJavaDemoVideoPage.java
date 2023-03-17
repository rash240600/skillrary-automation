package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaDemoVideoPage {
	// Declaration
	@FindBy(xpath = "//h1[text()='Core Java For Selenium Training']")
	private WebElement header;
	@FindBy(xpath = "//button[@aria-label='Play']")
	private WebElement play;
	@FindBy(xpath = "//button[@aria-label='Pause']")
	private WebElement pause;
	@FindBy(xpath = "//span[text()='Add To Wishlist']")
	private WebElement addToWishlist;

	// Initialization
	public CoreJavaDemoVideoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getHeader() {
		return header;
	}

	public void playVideo() {
		play.click();
	}

	public void pauseVideo() {
		pause.click();
	}

	public void wishlist() {
		addToWishlist.click();
	}

}
