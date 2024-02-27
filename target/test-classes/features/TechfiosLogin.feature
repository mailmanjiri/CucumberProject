@codeFiosLoginFeature
Feature: Techfios billing page login functionality validation

  @loginScenario1 @Smoke
  Scenario: User should be able to login with valid credential
    Given User is on the techfios login page
    When user enter the username as "demo1@codefios.com"
    When user enters the password as "abc123"
    And User clicks on sign in button
    Then User should be able to land on dashboard page

  @loginScenario2
  Scenario: other User should not be able to login with invalid credential
    Given User is on the techfios login page
    When user enter the username as "demo123@codefios.com"
    When user enters the password as "abc123"
    And User clicks on sign in button
    Then User should be able to land on dashboard page
