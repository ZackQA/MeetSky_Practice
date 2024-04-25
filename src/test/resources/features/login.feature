@login
Feature: Users should be able to login

  Scenario: Verify Login Page and Login button have the same background color
    Given the user is on the login page
    Then verify the user should see Login Page and Login button background color same

  Scenario: Verify MeetSky app logo is in expected dimensions
    Given the user is on the login page
    Then the user should see the app logo in expected dimensions

  @loginEnvVariable
  Scenario: Verify login with valid credentials
    Given the user is on the login page
    When the user logged in with valid credentials as environment variables
    Then the user should land on Dashboard page





