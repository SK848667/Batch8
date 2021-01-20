Feature: Add Employee Functionality


  Background:
    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
    When click on PIM
    And click on add employee button


  @addEmployeeWithoutLogin
  Scenario: Add employee without login details
    Then enter first and last name
    And click on save button
    Then verify employee is added successfully


  @addEmployeeWithLogin
  Scenario: Add employee with login credentials and with middle name
      Then enter first and last name and middle name
      When click on login details checkbox
      Then enter login details
      And click on save button
      Then verify employee is added successfully

