package BestBuy_testCases;

import java.io.IOException;
import BestBuy_Pages.ShopByDepartment;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClass;


public class ShopByDepartmentTest extends BaseClass {

	public ShopByDepartment shopdept;

	@Test
	public void shopByDepartment() throws InterruptedException, IOException {
		shopdept = new ShopByDepartment(driver);
		shopdept.getMenuButton();
		clickOnElement(shopdept.getMenuButton());
		shopdept.getShopByDepartment("TV & Home Theater");
		shopdept.getAppliancesItem("Projectors & Screens");
		shopdept.getSelectProductBrand();
		sleep(2000);
		clickOnElement(shopdept.getSelectProductBrand());
		shopdept.getSelectProductResolution();
		clickOnElement(shopdept.getSelectProductResolution());
		shopdept.getSelectProductLumens();
		clickOnElement(shopdept.getSelectProductLumens());
		shopdept.getProductMinimumRange();
		passInput(shopdept.getProductMinimumRange(), "1000");
		shopdept.getProductMaximumRange();
		passInput(shopdept.getProductMaximumRange(), "1500");
		shopdept.getSelectProductRangeButton();
		clickOnElement(shopdept.getSelectProductRangeButton());
		sleep(3000);
		clickOnElement(shopdept.getSelectProductAddToCart());
		explicitlyWait(20, shopdept.getProductGoToCart());
		clickOnElement(shopdept.getProductGoToCart());
		sleep(3000);
		pageSource("Epson - Pro EX11000 3LCD Full HD 1080p Wireless Laser Projector - Black",
				"Shop by department Product has been added successfully",
				"Shop by department Product not added to the cart");
		Assert.assertTrue(true);
	}
}
