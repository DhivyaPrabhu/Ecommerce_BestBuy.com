package BestBuy_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class CreateAccount extends BaseClass {

	public WebDriver driver;

	public CreateAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='country-selection']//child::h4[text()='United States'])[1]")
	private WebElement countrySelectionUS;

	@FindBy(xpath = "//span[text()='Account']")
	private WebElement accountButton;

	@FindBy(xpath = "//a[normalize-space()='Create Account']")
	private WebElement createAccountButton;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement createAccountFirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement createAccountLastName;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement createAccountEmail;

	@FindBy(xpath = "//input[@id='fld-p1']")
	private WebElement createAccountPassword;

	@FindBy(xpath = "//input[@id='reenterPassword']")
	private WebElement createAccountConfirmPassword;

	@FindBy(xpath = "//input[@id='phone']")
	private WebElement createAccountPhoneNumber;

	@FindBy(xpath = "//button[text()='Create an Account']")
	private WebElement createAccountSubmit;
	
	@FindBy(xpath = "//a[normalize-space()='Return to previous page']")
	private WebElement createAccountReturnPreviousPage;

	public WebElement getCountrySelectionUS() {
		return countrySelectionUS;
	}

	public void setCountrySelectionUS(WebElement countrySelectionUS) {
		this.countrySelectionUS = countrySelectionUS;
	}

	public WebElement getAccountButton() {
		return accountButton;
	}

	public void setAccountButton(WebElement accountButton) {
		this.accountButton = accountButton;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public void setCreateAccountButton(WebElement createAccountButton) {
		this.createAccountButton = createAccountButton;
	}

	public WebElement getCreateAccountFirstName() {
		return createAccountFirstName;
	}

	public void setCreateAccountFirstName(WebElement createAccountFirstName) {
		this.createAccountFirstName = createAccountFirstName;
	}

	public WebElement getCreateAccountLastName() {
		return createAccountLastName;
	}

	public void setCreateAccountLastName(WebElement createAccountLastName) {
		this.createAccountLastName = createAccountLastName;
	}

	public WebElement getCreateAccountEmail() {
		return createAccountEmail;
	}

	public void setCreateAccountEmail(WebElement createAccountEmail) {
		this.createAccountEmail = createAccountEmail;
	}

	public WebElement getCreateAccountPassword() {
		return createAccountPassword;
	}

	public void setCreateAccountPassword(WebElement createAccountPassword) {
		this.createAccountPassword = createAccountPassword;
	}

	public WebElement getCreateAccountConfirmPassword() {
		return createAccountConfirmPassword;
	}

	public void setCreateAccountConfirmPassword(WebElement createAccountConfirmPassword) {
		this.createAccountConfirmPassword = createAccountConfirmPassword;
	}

	public WebElement getCreateAccountPhoneNumber() {
		return createAccountPhoneNumber;
	}

	public void setCreateAccountPhoneNumber(WebElement createAccountPhoneNumber) {
		this.createAccountPhoneNumber = createAccountPhoneNumber;
	}

	public WebElement getCreateAccountSubmit() {
		return createAccountSubmit;
	}

	public void setCreateAccountSubmit(WebElement createAccountSubmit) {
		this.createAccountSubmit = createAccountSubmit;
	}

	public WebElement getCreateAccountReturnPreviousPage() {
		return createAccountReturnPreviousPage;
	}

	public void setCreateAccountReturnPreviousPage(WebElement createAccountReturnPreviousPage) {
		this.createAccountReturnPreviousPage = createAccountReturnPreviousPage;
	}

}
