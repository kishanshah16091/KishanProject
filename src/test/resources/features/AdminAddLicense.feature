Feature: As an admin I should be able to add employee's licenses in qualifications

  Background:
    * user enters valid admin credentials
    * user clicks on login button
    * navigates to PIM option and click EmployeeList
    * selects first employee


@test @admin
  Scenario: Add employee's licenses
    Given user navigates to Qualifications
    And clicks Add under License Box
    When user able to fill out all license fields
    Then  clicks on save button
