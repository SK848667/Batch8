#Author : Steven Klyman
@apiWorkFlow
Feature: Syntax HRMS API WorkFlow
  Description: This feature file tests Syntax HRMS API WorkFlow

  Background:
    Given  a JWT is generated

  Scenario: Create an Employee
    Given a request is prepared to create an employee
    When a POST call is made to create an Employee
    Then the status code for creating an employee is 201
    And the employee is created contains key "Message" and value "Entry Created"
    And the employeeID "Employee[0].employee_id" is stored in the global variable to be used for other calls


    Scenario: Retrieving the created employee
      Given a request is prepared to retrieve the created employee
      When a GET call is made to retrieve the created Employee
      Then the status code for retrieving the created employee is 200
      And the retrieved EmployeeID "employee[0].employee_id" matches the globally stored EmployeeID
      And the retrieved data matched the data used to create the employee


  Scenario: Update the created Employee
    Given a request is prepared to retrieve the updated employee
    When a GET call is made to retrieve the updated Employee
    Then the status code for retrieving the updated employee is 200
    And the updated employee contains key "Message" and value "Entry updated"

  Scenario: Retrieving the updated employee
    Given a request is prepared to retrieve the updated employee
    When  a GET call is made to retrieve the updated Employee
    Then the status code for retrieving the updated employee is 200
    And the retrieved Employee_Middle_Name "employee[0].emp_middle_name" matches the globally sotred employee middle name


  Scenario:Partially updating the employee
    Given a request is prepared to partially update the employee
    When a PATCH call is made to partially update the employee
    Then the status code is 201
    And the partailly updated employee contains key "Message" and value "Entry updated"
    And the partially update employee "employee[0].emp_firstname" matches the globally stored employee first name