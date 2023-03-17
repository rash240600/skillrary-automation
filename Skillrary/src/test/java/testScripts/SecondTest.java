package testScripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SecondTest extends BaseClass {
	@Test
	public void secondtest() {
		SoftAssert soft = new SoftAssert();
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		web.childBrowser();
		soft.assertTrue(demoApp.getHeader().isDisplayed());
		demoApp.categoryDropdown(web, 1);
		soft.assertTrue(testing.getHeader().isDisplayed());
		WebElement javaImg = testing.getJavaImage();
		WebElement cartArea = testing.getCartArea();
		web.dragAndDrop(javaImg, cartArea);
		web.scroll(testing.getFacebookIcon());
		testing.getFacebookIcon();
		soft.assertAll();

	}

}
