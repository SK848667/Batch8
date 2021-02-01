Feature: Admin can successfully add license

  Background:
  Scenario: Login with valid credentials
    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button

  Scenario: Admin can add any licenses
   # When log in to hrms
    When click on Admin Button
    Then select license under
    And click on Add Button
    Then Enter license "christinalicense"
    And Click on Save Button
    Then verify that  license "christinalicense" have been added
    Then quit the browser

