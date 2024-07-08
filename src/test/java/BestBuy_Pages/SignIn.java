package BestBuy_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class SignIn extends BaseClass{
	
	public WebDriver driver;
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Account']")
	private WebElement accountButton;
	
	@FindBy (xpath = "//a[normalize-space()='Sign In']")
	private WebElement signInButton;
	
	@FindBy (xpath = "//input[@type='email']")
	private WebElement signInEmail;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement signInPassword;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement signInSubmit;
	
	@FindBy(xpath = "//a[normalize-space()='Return to previous page']")
	private WebElement signUpReturnPreviousPage;
	

	public WebElement getAccountButton() {
		return accountButton;
	}

	public void setAccountButton(WebElement accountButton) {
		this.accountButton = accountButton;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public void setSignInButton(WebElement signInButton) {
		this.signInButton = signInButton;
	}

	public WebElement getSignInEmail() {
		return signInEmail;
	}

	public void setSignInEmail(WebElement signInEmail) {
		this.signInEmail = signInEmail;
	}

	public WebElement getSignInPassword() {
		return signInPassword;
	}

	public void setSignInPassword(WebElement signInPassword) {
		this.signInPassword = signInPassword;
	}

	public WebElement getSignInSubmit() {
		return signInSubmit;
	}

	public void setSignInSubmit(WebElement signInSubmit) {
		this.signInSubmit = signInSubmit;
	}

	public WebElement getSignUpReturnPreviousPage() {
		return signUpReturnPreviousPage;
	}

	public void setSignUpReturnPreviousPage(WebElement signUpReturnPreviousPage) {
		this.signUpReturnPreviousPage = signUpReturnPreviousPage;
	}
	
}
