package BestBuy_Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class MenuValidation extends BaseClass {

	public WebDriver driver;

	public MenuValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='bottom-fluid-container ']//nav/div/ul/li/a")
	private List<WebElement> topLinksVerification;

	@FindBy(xpath = "//div[@class='flex justify-content-start']/a")
	private List<WebElement> bottomLinksVerification;

	public void getTopLinksVerification(String valueBefore) {
		for (int i = 0; i < topLinksVerification.size(); i++) {
			System.out.println(valueBefore + topLinksVerification.get(i).getText());
			if (driver == null) {
				break;
			}
		}
	}

	public void setTopLinksVerification(List<WebElement> topLinksVerification) {
		this.topLinksVerification = topLinksVerification;
	}

	public void getBottomLinksVerification(String valueBefore) {
		for (int i = 0; i < bottomLinksVerification.size(); i++) {
			System.out.println(valueBefore + bottomLinksVerification.get(i).getText());
			if (driver == null) {
				break;
			}
		}
	}

	public void setBottomLinksVerification(List<WebElement> bottomLinksVerification) {
		this.bottomLinksVerification = bottomLinksVerification;
	}
}
