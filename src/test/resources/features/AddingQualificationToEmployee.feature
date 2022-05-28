Feature: As an admin I should be able to add employee's qualifications

  Background:
    Given user enters valid admin credentials
    And user clicks on login button
    When user navigates to PIM option and clicks on EmployeeList
    Then user selects the first employee
    And user navigates to Qualifications

  @test @workexperience
  Scenario: add employee's Work Experience (US-4)
    And clicks on add work experience button
    When user fills out all the required fields
    Then user clicks on work experience save button

  @test @skills
  Scenario: Add employee's skills (US-8)
    And clicks Add under Skills Box
    When user able to fill out skill field
    Then  saves the skill

  @test @addingLicense
  Scenario: Add employee's licenses (US-10)
    And clicks Add under License Box
    When user able to fill out all license fields
    Then  clicks on save button

  @test @addinglanguage
  Scenario:Adding any languages for any employees (US-12)
    And user clicks on Add button
    Then user fill out the language fields
    Then user clicks on language save button
