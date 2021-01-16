Feature: Login Functionality

  Scenario: Login with valid credentials
    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
    And quit the browser

  Scenario: Login with invalid credentials
    Given navigate to HRMS login page
    When enter invalid credentials
    And click on login button
    Then verify error message
    And quit the browser

#HW----------------------------------------------
  Scenario: Login with empty userName
    Given navigate to HRMS login page
    When leave the username empty and enter password
    And  click on login button
    Then verify user cannot be empty message
    And quit the browser

  Scenario: Login with empty user Password
    Given navigate to HRMS login page
    When entering username and leaving password empty
    And  click on login button
    Then verify password cannot be empty message
    And quit the browser
#-------------------------------------------------
