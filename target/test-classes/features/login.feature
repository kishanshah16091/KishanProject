Feature: Validation of login scenarios

  Background:

  @login
  Scenario: Admin login
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in

