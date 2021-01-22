#Author: your.email@your.domain.com

#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

#author: asel@syntaxtechs.com
  @search @sprint5
  Feature: Search feature/functionality

    Background:
      When user enters any text
    @smoke
    Scenario: Search by typing and hit enter
     # Given user navigate to google application
      And hit enter
      Then result is displayed

      @regression
      Scenario: search by typing and using google search button
       # Given user navigate to google application
        And click on google search button
        Then result is displayed
