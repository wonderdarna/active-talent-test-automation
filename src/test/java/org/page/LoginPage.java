package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends SauceDemoBasePage {

    private final By ERROR_MESSAGE = new By.ByCssSelector("[data-test='error']");
    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public void login (String username, String password) {
        enter(getFieldByPlaceholder("Username"), username);
        enter(getFieldByPlaceholder("Password"), password);
        click(getButtonByValue("Login"));
    }

    public String getErrorMessage () {
        return element(ERROR_MESSAGE).getText();
    }
}
