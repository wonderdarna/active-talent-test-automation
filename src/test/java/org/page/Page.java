package org.page;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.webdriver.WebDriverManager;

public class Page {

    private final WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private SauceDemoBasePage sauceDemoBasePage;

    public Page () {
        driver = WebDriverManager.getDriver();
    }

    public LoginPage loginPage () {
        loginPage = loginPage == null ?  new LoginPage(driver) : loginPage;
        return loginPage;
    }

    public SauceDemoBasePage sauceDemoBasePage () {
        sauceDemoBasePage = sauceDemoBasePage == null ?  new LoginPage(driver) : sauceDemoBasePage;
        return sauceDemoBasePage;
    }


    public DashboardPage dashboardPage () {
        dashboardPage = dashboardPage == null ?  new DashboardPage(driver) : dashboardPage;
        return dashboardPage;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        if (driver != null)
            driver.quit();
    }

    public byte[] takeScreenshot () {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
