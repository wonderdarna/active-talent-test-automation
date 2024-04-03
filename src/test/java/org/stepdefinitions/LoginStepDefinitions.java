package org.stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.context.Context;
import org.junit.Assert;
import org.page.DashboardPage;
import org.page.LoginPage;
import org.page.Page;

import static org.helpers.StringUtils.EMPTY;


public class LoginStepDefinitions {
    private Page page;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private final Context context;
    private Scenario scenario;
    public LoginStepDefinitions (Context context) {
        this.context = context;
        this.scenario = context.scenario;
        this.page = context.page;
        loginPage = page.loginPage();
        dashboardPage = page.dashboardPage();
    }

    @Given("I login to SauceDemo using valid credentials")
    public void iLoginToSauceDemoUsingValidCredentials() {
        loginPage.login("standard_user", "secret_sauce");
        scenario.log(String.format("Login using the following credentials username : %s and password : %s  ", "standard_user", "secret_sauce"));
    }

    @Then("I should be navigated to dashboard page")
    public void iShouldBeNavigatedToDashboardPage() {
        Assert.assertTrue(dashboardPage.isAt());
        scenario.log("Successfully navigated to dashboard page");
    }

    @Given("I login to SauceDemo using invalid credentials")
    public void iLoginToSauceDemoUsingInvalidCredentials() {
        loginPage.login("invalid_username", "invalid_password");
        scenario.log(String.format("Login using the following credentials username : %s and password : %s  ", "invalid_username", "invalid_password"));

    }

    @Then("I should be able to see an error message")
    public void iShouldBeAbleToSeeAnErrorMessage() {
        iShouldBeAbleToSeeAnErrorMessage("Epic sadface: Username and password do not match any user in this service");
    }

    @Then("I should be able to see the error message : {string}")
    public void iShouldBeAbleToSeeAnErrorMessage(String expectedErrorMssg) {
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMssg);
        scenario.log(String.format("Error message '%s' is displaying  ", expectedErrorMssg));
    }


    @Given("I login to SauceDemo using empty credentials")
    public void iLoginToSauceDemoUsingEmptyCredentials() {
        loginPage.login(EMPTY, EMPTY);
        scenario.log(String.format("Login using the following credentials username : %s and password : %s  ", EMPTY, EMPTY));

    }

    @Given("I login to SauceDemo using empty password field")
    public void iLoginToSauceDemoUsingEmptyPasswordField() {
        loginPage.login("standard_user", EMPTY);
        scenario.log(String.format("Login using the following credentials username : %s and password : %s  ", "standard_user", EMPTY));

    }

}
