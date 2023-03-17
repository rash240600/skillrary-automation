package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	// Declaration
	@FindBy(xpath = "//img[contains(@src,'contactus')]")
	private WebElement contactImg;
	@FindBy(name = "name")
	private WebElement nameTF;
	@FindBy(name = "sender")
	private WebElement emailTF;
	@FindBy(name = "subject")
	private WebElement subjectTF;
	@FindBy(name = "message")
	private WebElement messageTF;
	@FindBy(className = "btn btn-sm btn-primary")
	private WebElement sendMailButton;

	// Initialization
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getContactUsImg() {
		return contactImg;
	}

	public void setContactDetails(String name, String email, String subject, String message) {
		nameTF.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTF.sendKeys(message);
	}

	public void sendMail() {
		sendMailButton.click();
	}

}
