Feature: As an admin I should be able to add employee's Work Experience in qualifications

  Background:
    Given user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user navigates to PIM option and clicks on EmployeeList
    Then user selects the first employee

    @test
  Scenario: add employee's Work Experience
    Given user navigates to Qualifications
    And clicks on add work experience button
    When user fills out all the required fields
   # Then user clicks on save button
