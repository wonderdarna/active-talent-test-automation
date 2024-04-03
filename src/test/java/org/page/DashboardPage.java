package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends SauceDemoBasePage {
    private final By DASHBOARD_TITLE = By.xpath("//*[@class='title' and text()='Products']");
    public DashboardPage (WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return waitForElementToDisplay(DASHBOARD_TITLE, 10);
    }
}
