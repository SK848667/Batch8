Feature: Dashboard Tab Functionality

  @dashboardTabs
  Scenario: Dashboard Tab verification
    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
    Then verify the following tabs on dashboard
      |Admin|PIM|Leave|Time|Recruitment|Performance|Dashboard|Directory|
