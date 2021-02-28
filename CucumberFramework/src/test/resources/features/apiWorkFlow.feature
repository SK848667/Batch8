#Author : Steven Klyman
  @apiWorkFlow
  Feature: Syntax HRMS API WorkFlow
    Description: This feature file tests Syntax HRMS API WorkFlow

  Background:
    Given  a JWT is generated

    Scenario: Create an Employee
      Given a request is prepared to create an employee
      When a POST call is made to create an Employee
