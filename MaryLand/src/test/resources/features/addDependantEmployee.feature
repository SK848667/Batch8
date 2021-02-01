Feature:

  Background:

  Scenario: Login with valid credentials
    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button

  Scenario: Add Dependant's Employee

    When click on PIM
    And enter Id of employee
    And click  on search
    Then click on employee on the table
    When click on Dependants
    And click on Add Dependants Button
    And enter name of dependant "Emme Anthony"
    And enter relationship dependant's employee
    And enter Date of Birth
    And click on save button
    Then verify if dependent "Emme Anthony" is added
    Then quit the browser


