package utils;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

    public static WebDriver driver;
    public static ExtentSparkReporter reporter;
    public static ExtentReports extent;

    public static WebDriver launchBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions chromeOp = new ChromeOptions();
            chromeOp.addArguments("--headless");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions edgeOp = new EdgeOptions();
            edgeOp.addArguments("--headless");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        /*else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions fireOp = new FirefoxOptions();
            fireOp.addArguments("--headless");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }*/
        return driver;
    }

    public static void launchUrl(String url) {
        driver.get(url);
    }

    public static void implicitlyWait(int value) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
    }

    public static void explicitlyWait(int value, WebElement visibilityOfElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(value));
        wait.until(ExpectedConditions.visibilityOf(visibilityOfElement));
    }

    public static void explicitlyWaitAll(int value, WebElement visibilityOfAllElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(value));
        wait.until(ExpectedConditions.elementToBeClickable(visibilityOfAllElement));
    }

    public static void scrollDownorUp(String script) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script);
    }

    public static void verifyUrlLink(String url, String value, String valueOneOfOne, String valueTwoOfTwo)
            throws IOException {
        try {
            URL Url = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) Url.openConnection();
            urlConnection.connect();
            if (urlConnection.getResponseCode() >= 400) {
                System.out.println(url + value + urlConnection.getResponseMessage() + valueOneOfOne);
            } else {
                System.out.println(url + value + urlConnection.getResponseMessage() + valueTwoOfTwo);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            js.executeScript("arguments[0].click();", element);
        }
    }

    public static void passInput(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void sendPhoneNumber(WebElement element, String phoneNumber) {
        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            element.clear();
            element.sendKeys(phoneNumber);
        } else {
            System.out.println("Phone number cannot be null or empty.");
        }
    }

    public static void pageSource(String containsValue, String sysoMessageOne, String sysoMessageTwo) {
        if (driver.getPageSource().contains(containsValue)) {
            System.out.println(sysoMessageOne);
        } else {
            System.out.println(sysoMessageTwo);
        }
    }

    public static void selectOperation(WebElement element, String value) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement opt : options) {
            if (opt.getText().contains(value)) {
                opt.click();
                break;
            }
        }
    }

    public static void timeOut(int value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String takeScreenShot(String testCaseName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File scrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destinationFile = new File("D:\\Intelli workspace\\BestBuy.com\\src\\test\\Screenshots-BestBuy\\" + testCaseName + ".png");
        try {
            FileUtils.copyFile(scrFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String path = "<img src= " + destinationFile.getAbsolutePath() + " width = 200px height=200px />";

        Reporter.log(path);
        return destinationFile.getAbsolutePath();
    }

    public static void sleep(int value) throws InterruptedException {
        Thread.sleep(value);
    }

    public static void quit() {
        driver.quit();
    }
}
