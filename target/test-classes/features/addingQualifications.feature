Feature: Admin user adding different qualifications

  Background:
    Given user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user navigates to Qualifications page

  @test
  Scenario: Adding new Skills
    And   selects skills from dropdown and clicks on it
    Then  user can add and save any skills

