Feature: As an admin I should be able to add employee's Skills in qualifications

  Background:
    * user enters valid admin credentials
    * user clicks on login button
    * navigates to PIM option and click EmployeeList
    * selects first employee


  @test
  Scenario: Add employee's skills
    Given user navigates to Qualifications
    And clicks Add under Skills Box
    When user able to fill out skill field
    Then  clicks on save button









