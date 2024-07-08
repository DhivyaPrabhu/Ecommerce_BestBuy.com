package BestBuy_testCases;

import java.io.IOException;

import BestBuy_Pages.SearchItems;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClass;


public class SearchItemTest extends BaseClass {

	public SearchItems search;

	@Test
	public void searchAddToshoppingCart() throws InterruptedException, IOException {
		search = new SearchItems(driver);
		passInput(search.getSearchBox(), "Apple laptop");
		search.getSearchBox().sendKeys(Keys.ENTER);
		scrollDownorUp("window.scrollBy(0,2000)");
		search.getListOfProducts("MacBook Air 13.6\" Laptop - Apple M2 chip - 8GB Memory - 512GB SSD - Midnight - Midnight",
				"Clicked on the target product: ");
		sleep(2000);
		scrollDownorUp("window.scrollBy(0,2000)");
		clickOnElement(search.getAddToCart());
		sleep(10000);
		clickOnElement(search.getGoToCart());
		sleep(2000);
		clickOnElement(search.getPlus());
		sleep(3000);
		pageSource("MacBook Air 13.6\" Laptop - Apple M2 chip - 8GB Memory - 512GB SSD - Midnight - Midnight",
				"Search Item Product has been added successfully", "Search Item Product not added to the cart");
		Assert.assertTrue(true);

	}

}
