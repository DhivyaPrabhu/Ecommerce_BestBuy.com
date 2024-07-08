package BestBuy_Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class ShopByDepartment extends BaseClass {

	public WebDriver driver;

	public ShopByDepartment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Menu']")
	private WebElement menuButton;

	@FindBy(xpath = "//div[@class='hamburger-menu-flyout']//ul//li")
	private List<WebElement> shopByDepartment;

	@FindBy(xpath = "//div[@class='hamburger-menu-flyout']//ul//li")
	private List<WebElement> appliancesItem;

	@FindBy(xpath = "//input[@id='brand_facet-Epson-1']")
	private WebElement selectProductBrand;

	@FindBy(xpath = "//a[text()='Full HD (1080p)']")
	private WebElement selectProductResolution;

	@FindBy(xpath = "//a[text()='3000 Lumens & Above']")
	private WebElement selectProductLumens;

	@FindBy(xpath = "//div[@class='range-inputs']//child::input[@aria-label='Minimum Price']")
	private WebElement productMinimumRange;

	@FindBy(xpath = "//div[@class='range-inputs']//child::input[@aria-label='Maximum Price']")
	private WebElement productMaximumRange;

	@FindBy(xpath = "//div[@class='range-inputs']//following-sibling::button[@aria-label='Apply Price Range']")
	private WebElement selectProductRangeButton;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add to Cart'])[1]")
	private WebElement selectProductAddToCart;

	@FindBy(xpath = "(//a[normalize-space()='Go to Cart'])[1]")
	private WebElement productGoToCart;

	public WebElement getMenuButton() {
		return menuButton;
	}

	public void setMenuButton(WebElement menuButton) {
		this.menuButton = menuButton;
	}

	public void getShopByDepartment(String departmentTargetItem) {
		String departmentTargetItems = departmentTargetItem;
		for (WebElement dprtListItems : shopByDepartment) {
			String dprtItemsText = dprtListItems.getText();
			if (dprtItemsText.contains(departmentTargetItems)) {
				clickOnElement(dprtListItems);
				break;
			}
		}
	}

	public void setShopByDepartment(List<WebElement> shopByDepartment) {
		this.shopByDepartment = shopByDepartment;
	}

	public void getAppliancesItem(String appliancesItems) {
		String appliancesTargetItems = appliancesItems;
		for (WebElement appListItems : appliancesItem) {
			String appItemsText = appListItems.getText();
			if (appItemsText.contains(appliancesTargetItems)) {
				clickOnElement(appListItems);
				break;
			}
		}
	}

	public void setAppliancesItem(List<WebElement> appliancesItem) {
		this.appliancesItem = appliancesItem;
	}

	public WebElement getSelectProductBrand() {
		return selectProductBrand;
	}

	public void setSelectProductBrand(WebElement selectProductBrand) {
		this.selectProductBrand = selectProductBrand;
	}

	public WebElement getSelectProductResolution() {
		return selectProductResolution;
	}

	public void setSelectProductResolution(WebElement selectProductResolution) {
		this.selectProductResolution = selectProductResolution;
	}

	public WebElement getSelectProductLumens() {
		return selectProductLumens;
	}

	public void setSelectProductLumens(WebElement selectProductLumens) {
		this.selectProductLumens = selectProductLumens;
	}

	public WebElement getProductMinimumRange() {
		return productMinimumRange;
	}

	public void setProductMinimumRange(WebElement productMinimumRange) {
		this.productMinimumRange = productMinimumRange;
	}

	public WebElement getProductMaximumRange() {
		return productMaximumRange;
	}

	public void setProductMaximumRange(WebElement productMaximumRange) {
		this.productMaximumRange = productMaximumRange;
	}

	public WebElement getSelectProductRangeButton() {
		return selectProductRangeButton;
	}

	public void setSelectProductRangeButton(WebElement selectProductRangeButton) {
		this.selectProductRangeButton = selectProductRangeButton;
	}

	public WebElement getSelectProductAddToCart() {
		return selectProductAddToCart;
	}

	public void setSelectProductAddToCart(WebElement selectProductAddToCart) {
		this.selectProductAddToCart = selectProductAddToCart;
	}

	public WebElement getProductGoToCart() {
		return productGoToCart;
	}

	public void setProductGoToCart(WebElement productGoToCart) {
		this.productGoToCart = productGoToCart;
	}
}
