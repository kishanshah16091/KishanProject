Feature: As an admin user should be able to add different
  licenses in qualifications

  Background:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When Admin navigates to Qualifications

  @add
  Scenario: Adding new licenses
    And selects licenses
    And clicks on add button and fill the name box
    Then Admin can add licence and confirm message is displayed


