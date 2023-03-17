package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdTest extends BaseClass {
	@Test
	public void thirdtest() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		home.searchCourse("Core java for Selenium");
		soft.assertTrue(coreJava.getHeader().isDisplayed());
		coreJava.clickOnCourse();
		soft.assertTrue(javaDemo.getHeader().isDisplayed());
		javaDemo.playVideo();
		Thread.sleep(3000);
		javaDemo.pauseVideo();
		javaDemo.wishlist();
		soft.assertAll();

	}

}
