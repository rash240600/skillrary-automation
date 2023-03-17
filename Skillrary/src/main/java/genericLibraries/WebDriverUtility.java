package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

// This class contains reusable methods to perform all web driver actions
public class WebDriverUtility {
	WebDriver driver;

	// This method is used to launch browser and navigate to application
	public WebDriver launchBrowser(String browser,String url, long time)
	{
		switch(browser)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default : System.out.println("Invalid Browser");break;
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return driver;
	//This method is used to mouse hover on certain element	
	}

	public void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	// This method is used to double click on particular element
	public void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	// This method is used to drag and drop an element to required location
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	// This method is used to select an element from drop down using index
	public void dropDown(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	// This method is used to select an element from drop down using value
	public void dropDown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	// This method handles child browser pop up
	public void childBrowser() {
		Set<String> windowIDs = driver.getWindowHandles();
		for (String id : windowIDs) {
			driver.switchTo().window(id);
		}
	}

	// This method is used to switch to a frame based on frame index
	public void frames() {
		driver.switchTo().frame(0);

	}

	// This method is used to switch back from frames
	public void switchbackframes() {
		driver.switchTo().defaultContent();
	}

	// This method handles alert pop up
	public void alertpopup() {
		driver.switchTo().alert().accept();
	}

	// This method is used to scroll till particular element on web page
	public void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollintoView(true)", element);
	}

	// This method is used to fetch the screenshot of particular web page
	public void sceenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/" + driver.getTitle() + ".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// This method is used to close current window
	public void closeCurrentWindow() {
		driver.close();
	}

	// This method is used to close all the windows and exit the browser
	public void quitbrowser() {
		driver.quit();
	}

}
