Feature: Validation of login scenarios

  Background:
    #Given user is navigated to HRMS application


  @test
  Scenario: Admin login
    #Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on Admin option
    Then  user clicks on skills on Qulification dropdown
    And   user clicks on skills
    And user clicks on add employee option
