package BestBuy_Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class SearchItems extends BaseClass {

	public WebDriver driver;

	public SearchItems(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='search-input']")
	private WebElement searchBox;

	@FindBy(xpath = "//div[@class='list-wrapper top-border']/ol/li//child::h4/a[@href]")
	private List<WebElement> listOfProducts;

	@FindBy(xpath = "(//button[@data-button-state='ADD_TO_CART'])[1]")
	private WebElement addToCart;

	@FindBy(xpath = "//a[text()='Go to Cart']")
	private WebElement goToCart;

	@FindBy(xpath = "//button[@class='c-close-icon c-modal-close-icon']//*[name()='svg']//*[name()='path' and contains(@d,'M19.25 20c')]")
	private WebElement plus;


	public WebElement getSearchBox() {
		return searchBox;
	}

	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}

	public void getListOfProducts(String productsName, String sysoMessage) throws InterruptedException {
		String productName = productsName;
		for (WebElement productList : listOfProducts) {
			String productText = productList.getText();
			if (productText.contains(productName)) {
				sleep(5000);
				clickOnElement(productList);
				System.out.println(sysoMessage + productText);
				break;
			}
		}
	}

	public void setListOfProducts(List<WebElement> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public WebElement getGoToCart() {
		return goToCart;
	}

	public void setGoToCart(WebElement goToCart) {
		this.goToCart = goToCart;
	}

	public WebElement getPlus() {
		return plus;
	}

	public void setPlus(WebElement plus) {
		this.plus = plus;
	}


}
