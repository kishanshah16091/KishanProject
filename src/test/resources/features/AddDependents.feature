Feature: As admin I should be able to add employee's multiple dependents
  Background:
    #Given user is navigated to HRMS application
    * user enters valid admin credentials
    * user clicks on login button
    * admin user is successfully logged in
    * navigates to PIM option and click EmployeeList
    * selects first employee

  @adding
  Scenario: Adding employee dependents
    And select Dependends
    And clicks on add button
    When admin user able to add all dependent details
    Then click save button