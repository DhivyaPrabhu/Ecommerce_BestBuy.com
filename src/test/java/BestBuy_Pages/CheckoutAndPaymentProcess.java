package BestBuy_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class CheckoutAndPaymentProcess extends BaseClass {

	public WebDriver driver;

	public CheckoutAndPaymentProcess(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-track='Checkout - Top']")
	private WebElement checkoutButton;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement checkoutEmail;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement checkoutPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement checkoutSignin;

	@FindBy(xpath = "//button[@type='button' and normalize-space()='Continue as Guest']")
	private WebElement continueToGuest;

	@FindBy(xpath = "//button[@type='button' and normalize-space()='Switch all to shipping']")
	private WebElement switchToPickUp;

	@FindBy(xpath = "//input[@id='number']")
	private WebElement creditCardNumber;

	@FindBy(xpath = "//select[@name='expMonth']")
	private WebElement expireMonth;

	@FindBy(xpath = "//select[@name='expYear']")
	private List<WebElement> expireYear;

	@FindBy(xpath = "//input[@name='cvv']")
	private WebElement cvvNumber;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement paymentFirstName;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement paymentLastName;

	@FindBy(xpath = "//input[@name='street']")
	private WebElement addressLine;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;

	@FindBy(xpath = "//select[@name='state']")
	private WebElement state;

	@FindBy(xpath = "//input[@name='zipcode']")
	private WebElement postalCode;

	@FindBy(xpath = "//span[text()='Place Your Order']")
	private WebElement placeYourOrder;

	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement Apply;

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public void setCheckoutButton(WebElement checkoutButton) {
		this.checkoutButton = checkoutButton;
	}

	public WebElement getCheckoutEmail() {
		return checkoutEmail;
	}

	public void setCheckoutEmail(WebElement checkoutEmail) {
		this.checkoutEmail = checkoutEmail;
	}

	public WebElement getCheckoutPassword() {
		return checkoutPassword;
	}

	public void setCheckoutPassword(WebElement checkoutPassword) {
		this.checkoutPassword = checkoutPassword;
	}

	public WebElement getCheckoutSignin() {
		return checkoutSignin;
	}

	public void setCheckoutSignin(WebElement checkoutSignin) {
		this.checkoutSignin = checkoutSignin;
	}

	public WebElement getContinueToGuest() {
		return continueToGuest;
	}

	public void setContinueToGuest(WebElement continueToGuest) {
		this.continueToGuest = continueToGuest;
	}

	public WebElement getSwitchToPickUp() {
		return switchToPickUp;
	}

	public void setSwitchToPickUp(WebElement switchToPickUp) {
		this.switchToPickUp = switchToPickUp;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(WebElement creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public WebElement getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(WebElement expireMonth) {
		this.expireMonth = expireMonth;
	}

	public List<WebElement> getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(List<WebElement> expireYear) {
		this.expireYear = expireYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(WebElement cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public WebElement getPaymentFirstName() {
		return paymentFirstName;
	}

	public void setPaymentFirstName(WebElement paymentFirstName) {
		this.paymentFirstName = paymentFirstName;
	}

	public WebElement getPaymentLastName() {
		return paymentLastName;
	}

	public void setPaymentLastName(WebElement paymentLastName) {
		this.paymentLastName = paymentLastName;
	}

	public WebElement getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(WebElement addressLine) {
		this.addressLine = addressLine;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(WebElement postalCode) {
		this.postalCode = postalCode;
	}

	public WebElement getPlaceYourOrder() {
		return placeYourOrder;
	}

	public void setPlaceYourOrder(WebElement placeYourOrder) {
		this.placeYourOrder = placeYourOrder;
	}

	public WebElement getApply() {
		return Apply;
	}

	public void setApply(WebElement apply) {
		Apply = apply;
	}

}
