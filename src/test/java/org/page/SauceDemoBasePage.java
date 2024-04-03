package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoBasePage extends BasePage{

    private final static String FIELD_WITH_PLACEHOLDER_LOCATOR = "input[placeholder='%s']";
    private final static String BUTTON_WITH_VALUE_LOCATOR = "input[value='%s']";

    public SauceDemoBasePage(WebDriver driver) {
        super(driver);
    }

    protected WebElement getFieldByPlaceholder (String placeholderName) {
        return element(new By.ByCssSelector(String.format(FIELD_WITH_PLACEHOLDER_LOCATOR, placeholderName)), 10);
    }

    protected WebElement getButtonByValue (String value) {
        return element(new By.ByCssSelector(String.format(BUTTON_WITH_VALUE_LOCATOR, value)), 10);
    }
}
