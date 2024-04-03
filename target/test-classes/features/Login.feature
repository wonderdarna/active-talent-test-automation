@login
Feature: Login feature

  Scenario: I should be able to login successfully to SauceDemo using valid credentials
    Given I login to SauceDemo using valid credentials
    Then I should be navigated to dashboard page

  Scenario: User should be able to see an error message in SauceDemo login page when I used invalid credentials
    Given I login to SauceDemo using invalid credentials
    Then I should be able to see an error message

  Scenario: User should be able to see an error message in SauceDemo login page when username and password fields are empty
    Given I login to SauceDemo using empty credentials
    Then I should be able to see the error message : "Epic sadface: Username is required"

  Scenario: User should be able to see an error message in SauceDemo login page when password field is empty
    Given I login to SauceDemo using empty password field
    Then I should be able to see the error message : "Epic sadface: Password is required"