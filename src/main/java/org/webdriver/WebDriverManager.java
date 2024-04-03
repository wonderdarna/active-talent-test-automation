package org.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.enums.EnvironmentVariable.BROWSER;
import static org.enums.EnvironmentVariable.getValue;

public class WebDriverManager {

    public static WebDriver getDriver () {
        String browser = getValue(BROWSER);
        switch (browser) {
            case "firefox" : return new FirefoxDriver();
            case "edge" : return new EdgeDriver();
            default : return new ChromeDriver();
        }
    }
}
