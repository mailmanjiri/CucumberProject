@DataFromMySqlFeature
Feature: Techfios billing page login functionality validation

Background:
 Given User is on the techfios login page

  @DbScenario1 
  Scenario: User should be able to login with valid credential
   
    When user enter the "username" from mysql database
    When user enter the "password" from mysql database
    And User clicks on sign in button
    Then User should be able to land on dashboard page

 