@otherLoginFeature @Regression
Feature: other Techfios billing page login functionality validation

  Background: 
    Given User is on the techfios login page

  @otherScenario1 @Smoke @Sanity
  Scenario Outline: other User should not be able to login with invalid credential
    When user enter the username as "<username>"
    When user enters the password as "<password>"
    And User clicks on sign in button
    Then User should be able to land on dashboard page

    Examples: 
      | username             | password   |
      | demo1@codefios.com   | abc12323   |
      | demo156@techfios.com | abc1236356 |
      | demo12@codefios.com  | abc123     |
      |                      |            |

 