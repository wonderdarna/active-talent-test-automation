package org.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BasePage {
    private final WebDriver driver;
    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement element (By by, int waitTime) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(waitTime))
                .pollingEvery(Duration.ofSeconds(1));
        return wait.until(x -> x.findElement(by));
    }

    protected WebElement element (By by) {
        return element(by, 5);
    }

    protected void enter (WebElement element, CharSequence... charSequences) {
       element.sendKeys(charSequences);
    }

    protected void click (WebElement element) {
        element.click();
    }

    protected boolean waitForElementToDisplay (By by, int waitTime) {
       try {
           return element(by, waitTime).isDisplayed();
       } catch (Exception e) {
           return false;
       }
    }

}
