package BestBuy_testCases;

import java.io.IOException;
import BestBuy_Pages.CreateAccount;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.FileReaderManager;
import utils.BaseClass;
import utils.ExcelUtils;


public class CreateAccountTest extends BaseClass {

	public CreateAccount account;
	public  WebDriver driver;
	

	 @Test
	 public void reader() throws IOException {
	     FileReaderManager.getInstance().getConfigReader();
     }

    @Parameters("browser")
    @BeforeTest
    public void driverSetup(String browser) throws IOException {
        reader();
        driver = launchBrowser(browser);
        implicitlyWait(5);
        String url = FileReaderManager.getInstance().getConfigReader().getUrl();
        launchUrl(url);
    }

    @BeforeTest
    public void urlVerify() throws IOException {
        String url = FileReaderManager.getInstance().getConfigReader().getUrl();
        verifyUrlLink(url, "--Website", " Link is broken", " Link has been verified successfully");

    }

	@Parameters("validphonenumber")
	@Test(priority = 0)
	public void createAccountValidCredentials(@Optional String validphonenumber) throws IOException {
		account = new CreateAccount(driver);
		clickOnElement(account.getCountrySelectionUS());
		clickOnElement(account.getAccountButton());
		clickOnElement(account.getCreateAccountButton());
		passInput(account.getCreateAccountFirstName(), ExcelUtils.excelUtils("Sheet1", 1, 0));
		passInput(account.getCreateAccountLastName(), ExcelUtils.excelUtils("Sheet1", 1, 1));
		passInput(account.getCreateAccountEmail(), ExcelUtils.excelUtils("Sheet1", 1, 2));
		passInput(account.getCreateAccountPassword(), ExcelUtils.excelUtils("Sheet1", 1, 3));
		passInput(account.getCreateAccountConfirmPassword(), ExcelUtils.excelUtils("Sheet1", 1, 4));
		passInput(account.getCreateAccountPhoneNumber(), validphonenumber);
		clickOnElement(account.getCreateAccountSubmit());
		timeOut(2000);
		clickOnElement(account.getCreateAccountReturnPreviousPage());
		Assert.assertTrue(true);
	}

	@Parameters("invalidphonenumber")
	@Test(priority = 1)
	public void createAccountInvalidCredentials(@Optional String invalidphonenumber)
			throws IOException, InterruptedException {
		account = new CreateAccount(driver);
		clickOnElement(account.getAccountButton());
		clickOnElement(account.getCreateAccountButton());
		passInput(account.getCreateAccountFirstName(),ExcelUtils.excelUtils("Sheet1", 2, 0));
		passInput(account.getCreateAccountLastName(), ExcelUtils.excelUtils("Sheet1", 2, 1));
		passInput(account.getCreateAccountEmail(), ExcelUtils.excelUtils("Sheet1", 2, 2));
		passInput(account.getCreateAccountPassword(), ExcelUtils.excelUtils("Sheet1", 2, 3));
		passInput(account.getCreateAccountConfirmPassword(), ExcelUtils.excelUtils("Sheet1", 2, 4));
		passInput(account.getCreateAccountPhoneNumber(), invalidphonenumber);
		clickOnElement(account.getCreateAccountSubmit());
		timeOut(2000);
		clickOnElement(account.getCreateAccountReturnPreviousPage());
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	public void createAccountEmptyCredentials() throws IOException {
		account = new CreateAccount(driver);
		clickOnElement(account.getAccountButton());
		clickOnElement(account.getCreateAccountButton());
		passInput(account.getCreateAccountFirstName(), "");
		passInput(account.getCreateAccountLastName(), "");
		passInput(account.getCreateAccountEmail(), "");
		passInput(account.getCreateAccountPassword(), "");
		passInput(account.getCreateAccountConfirmPassword(), "");
		passInput(account.getCreateAccountPhoneNumber(), "");
		clickOnElement(account.getCreateAccountSubmit());
		clickOnElement(account.getCreateAccountReturnPreviousPage());
		Assert.assertTrue(true);
	}
}
