@codeFiosAddNewAccountFeature
Feature: codefios add new account functionality validation

  Background: 
    Given User is on the techfios login page
    When user enter the username as "demo1@codefios.com"
    When user enters the password as "abc123"
    And User clicks on sign in button
    Then User should be able to land on dashboard page

  @addAccount
  Scenario Outline: User should be able to add new account
    When user click on the List account tab
    When user click on the add account tab
    When User enters account accountName as "<accountName>"
    When User enters account description as "<description>"
    Then User enters account initialBalance as "<initialBalance>"
    When User enters account accountNumber as "<accountNumber>"
    When User enters account contactPerson as "<contactPerson>"
    And user click on save button
    Then new account should successfuly get created

    Examples: 
      | accountName | description    | initialBalance | accountNumber | contactPerson  |
      | Abc123      | Saving account |           2342 |      12343429 | contactPerson1 |
