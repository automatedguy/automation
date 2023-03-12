package test.ui.page;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
