Feature:

  Background:
  Scenario: Login with valid credentials
    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button

  Scenario: As an admin I should be able to change employee's contact details.
    When click on PIM
    And click on Employee List

    And click on contact details button
    Then click on Edit and change information
    And add "syntaxe55rror@google.com" email
    And save it
   Then verify that "syntaxe55rror@google.com" saved correctly
    Then quit the browser
    #
