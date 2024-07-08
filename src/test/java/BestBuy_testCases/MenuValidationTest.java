package BestBuy_testCases;

import java.io.IOException;

import BestBuy_Pages.MenuValidation;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BaseClass;


public class MenuValidationTest extends BaseClass {

	public MenuValidation menu;

	@Test(priority = 0)
	public void topLinkVerification() throws IOException {
		menu = new MenuValidation(driver);
		menu.getTopLinksVerification("Top menu item title for: ");
		Assert.assertTrue(true);
	}

	@Test(priority = 1)
	public void bottomLinkVerification() throws IOException {
		menu = new MenuValidation(driver);
		menu.getBottomLinksVerification("Bottom menu items: ");
		Assert.assertTrue(true);
	}
}
