package BestBuy_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class ShopByBrands extends BaseClass {

	public WebDriver driver;

	public ShopByBrands(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Menu']")
	private WebElement menuButtonBrands;

	@FindBy(xpath = "//div[@class='hamburger-menu-flyout']//ul//li")
	private List<WebElement> shopByBrands;

	@FindBy(xpath = "//div[@class='hamburger-menu-flyout']//ul[@class='hamburger-menu-flyout-list hamburger-menu-flyout-sidecar-list']//li")
	private List<WebElement> shopByBrandName;

	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement cameraButton;

	@FindBy(xpath = "//a[normalize-space()='Camera & Camcorder Accessories']")
	private WebElement cameraAccessories;

	@FindBy(xpath = "//div[@class='range-inputs']//child::input[@aria-label='Minimum Price']")
	private WebElement cameraMinimumRange;

	@FindBy(xpath = "//div[@class='range-inputs']//child::input[@aria-label='Maximum Price']")
	private WebElement cameramaximumRange;

	@FindBy(xpath = "//div[@class='range-inputs']//following-sibling::button[@aria-label='Apply Price Range']")
	private WebElement selectCameraRangeButton;

	@FindBy(xpath = "//a[text()='Black']")
	private WebElement selectCameraColor;

	@FindBy(xpath = "//a[text()='Autofocus']")
	private WebElement selectCameraFocus;

	@FindBy(xpath = "//a[text()='New']")
	private WebElement selectCameraCondition;

	@FindBy(xpath = "//a[text()='Sony a7 III']")
	private WebElement selectCameraModelFamily;

	@FindBy(xpath = "//a[text()='4 & Up']")
	private WebElement selectCustomerRatings;

	@FindBy(xpath = "//a[contains(text(),'Package - Sony - Alpha a7 III Mirrorless 4K Video Camera')]")
	private WebElement selectCamera;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Add to Cart']")
	private WebElement selectCameraAddToCart;

	@FindBy(xpath = "//a[text()='Go to Cart']")
	private WebElement cameraGoToCart;

	public WebElement getMenuButtonBrands() {
		return menuButtonBrands;
	}

	public void setMenuButtonBrands(WebElement menuButtonBrands) {
		this.menuButtonBrands = menuButtonBrands;
	}

	public void getShopByBrands(String brands) {
		String brandsTargetItems = brands;
		for (WebElement brandsListItems : shopByBrands) {
			String brandsItemsText = brandsListItems.getText();
			if (brandsItemsText.contains(brandsTargetItems)) {
				clickOnElement(brandsListItems);
				break;
			}
		}
	}

	public void setShopByBrands(List<WebElement> shopByBrands) {
		this.shopByBrands = shopByBrands;
	}

	public void getShopByBrandName(String brandName) {
		String brandsTargetItemName = brandName;
		for (WebElement brandsNameListItem : shopByBrandName) {
			String brandsItemNameText = brandsNameListItem.getText();
			if (brandsItemNameText.contains(brandsTargetItemName)) {
				 clickOnElement(brandsNameListItem);
				break;
			}
		}
	}

	public void setShopByBrandName(List<WebElement> shopByBrandName) {
		this.shopByBrandName = shopByBrandName;
	}

	public WebElement getCameraButton() {
		return cameraButton;
	}

	public void setCameraButton(WebElement cameraButton) {
		this.cameraButton = cameraButton;
	}

	public WebElement getCameraAccessories() {
		return cameraAccessories;
	}

	public void setCameraAccessories(WebElement cameraAccessories) {
		this.cameraAccessories = cameraAccessories;
	}

	public WebElement getCameraMinimumRange() {
		return cameraMinimumRange;
	}

	public void setCameraMinimumRange(WebElement cameraMinimumRange) {
		this.cameraMinimumRange = cameraMinimumRange;
	}

	public WebElement getCameramaximumRange() {
		return cameramaximumRange;
	}

	public void setCameramaximumRange(WebElement cameramaximumRange) {
		this.cameramaximumRange = cameramaximumRange;
	}

	public WebElement getSelectCameraRangeButton() {
		return selectCameraRangeButton;
	}

	public void setSelectCameraRangeButton(WebElement selectCameraRangeButton) {
		this.selectCameraRangeButton = selectCameraRangeButton;
	}

	public WebElement getSelectCameraColor() {
		return selectCameraColor;
	}

	public void setSelectCameraColor(WebElement selectCameraColor) {
		this.selectCameraColor = selectCameraColor;
	}

	public WebElement getSelectCameraFocus() {
		return selectCameraFocus;
	}

	public void setSelectCameraFocus(WebElement selectCameraFocus) {
		this.selectCameraFocus = selectCameraFocus;
	}

	public WebElement getSelectCameraCondition() {
		return selectCameraCondition;
	}

	public void setSelectCameraCondition(WebElement selectCameraCondition) {
		this.selectCameraCondition = selectCameraCondition;
	}

	public WebElement getSelectCameraModelFamily() {
		return selectCameraModelFamily;
	}

	public void setSelectCameraModelFamily(WebElement selectCameraModelFamily) {
		this.selectCameraModelFamily = selectCameraModelFamily;
	}

	public WebElement getSelectCustomerRatings() {
		return selectCustomerRatings;
	}

	public void setSelectCustomerRatings(WebElement selectCustomerRatings) {
		this.selectCustomerRatings = selectCustomerRatings;
	}

	public WebElement getSelectCamera() {
		return selectCamera;
	}

	public void setSelectCamera(WebElement selectCamera) {
		this.selectCamera = selectCamera;
	}

	public WebElement getSelectCameraAddToCart() {
		return selectCameraAddToCart;
	}

	public void setSelectCameraAddToCart(WebElement selectCameraAddToCart) {
		this.selectCameraAddToCart = selectCameraAddToCart;
	}

	public WebElement getCameraGoToCart() {
		return cameraGoToCart;
	}

	public void setCameraGoToCart(WebElement cameraGoToCart) {
		this.cameraGoToCart = cameraGoToCart;
	}

}
