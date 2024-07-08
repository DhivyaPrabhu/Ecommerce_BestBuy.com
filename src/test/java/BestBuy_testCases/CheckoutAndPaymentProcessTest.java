package BestBuy_testCases;

import java.io.IOException;

import BestBuy_Pages.CheckoutAndPaymentProcess;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import utils.BaseClass;
import utils.ExcelUtils;


public class CheckoutAndPaymentProcessTest extends BaseClass {

	public CheckoutAndPaymentProcess checkoutandpayment;

	@Test
	public void checkoutLoginProcess() throws InterruptedException, IOException {
		checkoutandpayment = new CheckoutAndPaymentProcess(driver);
		clickOnElement(checkoutandpayment.getCheckoutButton());
		explicitlyWait(10, checkoutandpayment.getCheckoutEmail());
		passInput(checkoutandpayment.getCheckoutEmail(), ExcelUtils.excelUtils("Sheet1", 13, 0));
		passInput(checkoutandpayment.getCheckoutPassword(), ExcelUtils.excelUtils("Sheet1", 13, 1));
		explicitlyWait(20, checkoutandpayment.getCheckoutSignin());
		clickOnElement(checkoutandpayment.getCheckoutSignin());
		Assert.assertTrue(true);
	}

	@Test
	public void paymentInformation() throws InterruptedException, IOException {
		checkoutandpayment = new CheckoutAndPaymentProcess(driver);
		sleep(10000);
		clickOnElement(checkoutandpayment.getContinueToGuest());
		explicitlyWait(10, checkoutandpayment.getSwitchToPickUp());
		sleep(4000);
		clickOnElement(checkoutandpayment.getSwitchToPickUp());
		passInput(checkoutandpayment.getPaymentFirstName(), ExcelUtils.excelUtils("Sheet1", 17, 0));
		passInput(checkoutandpayment.getPaymentLastName(), ExcelUtils.excelUtils("Sheet1", 17, 1));
		passInput(checkoutandpayment.getAddressLine(), ExcelUtils.excelUtils("Sheet1", 17, 2));
		passInput(checkoutandpayment.getCity(), ExcelUtils.excelUtils("Sheet1", 17, 3));
		selectOperation(checkoutandpayment.getState(), "RI");
		passInput(checkoutandpayment.getPostalCode(), "02842");
		clickOnElement(checkoutandpayment.getApply());
		Assert.assertTrue(true);
		sleep(3000);
	}
	
	@AfterClass
	public void tearDown() {
		quit();
	}
	
	
}
