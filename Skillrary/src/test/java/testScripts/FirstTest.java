package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass {
	@Test
	public void firstTest() {
		SoftAssert soft = new SoftAssert();
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		web.childBrowser();
		demoApp.getHeader();
		demoApp.mouseHoverToCourse(web);
		demoApp.selectSeleniumTraining();
		soft.assertTrue(selenium.getHeader().isDisplayed());
		selenium.add(web);
		selenium.addToCart();
		web.alertpopup();
		web.sceenshot();
		soft.assertAll();

	}

}
