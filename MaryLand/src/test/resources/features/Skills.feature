Feature: Admin can successfully add skill

  Background:

  Scenario: Login with valid credentials
    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button


  Scenario: As an admin user should be able to add different skills in qualifications    When log in to hrms

    When click on Admin Button
    Then select Skills
    And click on Add Button
    Then Enter skills "god"
    And Click on Save Button
    Then verify that skills "god" have been added
    Then quit the browser


