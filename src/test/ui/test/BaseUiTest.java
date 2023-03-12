package test.ui.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

public abstract class BaseUiTest {

    private WebDriver webDriver;
    private final String BASE_URL = "http://www.google.com";
    private final Logger logger = Logger.getLogger("BaseUiTest");

    public void downloadWebDriver() {
        logger.info("Initializing webDriver");
        WebDriverManager.chromedriver().setup();
    }

    public void initializeWebDriver() {
        logger.info("Initializing webDriver");
        webDriver = new ChromeDriver();
    }

    public void navigateToBaseUrl() {
        logger.info("Navigating to BASE_URL");
        webDriver.navigate().to(BASE_URL);
    }

    public void quitWebDriver() {
        logger.info("Quitting webDriver");
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        logger.info("Getting webDriver");
        return webDriver;
    }

    // Add @BeforeClass
    @BeforeClass
    public void setUp() {
        downloadWebDriver();
        initializeWebDriver();
        navigateToBaseUrl();
    }

    @AfterClass
    public void tearDown() {
        quitWebDriver();
    }
}
