Feature: Employees Emergency Contacts

  Background:

  Scenario: Login with valid credentials
    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button

  Scenario: Adding Emergency Contacts
    When  click on PIM
    And select a employee
    Then click on emergency contact details
    When click add
    Then write all emergency contact info
    And save
    Then verify that have been added
    Then quit the browser
