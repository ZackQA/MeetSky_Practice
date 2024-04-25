@tasks
Feature: Tasks Module Functionality


  Background: User logins and navigates to Tasks module
    Given the user is on the login page
    And the user logged in with username as "Employee1" and password as "Employee123"


  @wip
  Scenario: User can create a new task
    And the user navigates to "Tasks" module
