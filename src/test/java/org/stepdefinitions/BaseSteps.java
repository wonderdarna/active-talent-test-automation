package org.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.context.Context;
import org.page.Page;

import static org.enums.EnvironmentVariable.URL;
import static org.enums.EnvironmentVariable.getValue;

public class BaseSteps {

    private Page page;
    private Context context;

    public BaseSteps(Context context) {
        this.context = context;
    }
    @Before
    public void beforeHook (Scenario scenario) {
        page = new Page();
        context.page = page;
        context.scenario = scenario;
        page.navigateTo(getValue(URL));
    }

    @After
    public void afterHook (Scenario scenario) {
        scenario.attach(page.takeScreenshot(), "image/png", scenario.getName());
        page.closeBrowser();
    }
}
