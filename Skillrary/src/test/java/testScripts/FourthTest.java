package testScripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FourthTest extends BaseClass {
	@Test
	public void fourthtest() {
		SoftAssert soft = new SoftAssert();
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		web.childBrowser();
		soft.assertTrue(demoApp.getHeader().isDisplayed());
		demoApp.contact();
		soft.assertTrue(contact.getContactUsImg().isDisplayed());
		List<String> list = excel.fetchExcelData("TestData");
		contact.setContactDetails(list.get(0), list.get(1), list.get(2), list.get(3));
		contact.sendMail();
		soft.assertAll();
	}

}
