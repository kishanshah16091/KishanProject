Feature: Adding job Details and Terminating Existing Employee

  Background:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user navigates to PIM and Employee list
    Then user search for employee by employee id "7908464"
    And user click on search button
    Then user click on searched employee
    Then user clicks on Job button

 @JobDetails @dataTable @test
  Scenario: Admin login Job Title drop down field, user can select values from there
    And user click on  Edit button
    And user select Job Title, Employment status, Job Category form dropdowns
    And user select Joined Date from calender
      | Year | Month | Day |
      | 2012 | Jan   | 10  |
    And user select Sub Unit "developer", Location "HQ" from dropdowns
    And user select StartDate from Calendar
      | Year | Month | Day |
      | 2012 | Dec   | 18  |
    And user select EndDate from Calendar
      | Year | Month | Day |
      | 2022 | May   | 24  |
    And user uploads file to ContractDetails
    And user clicks on save button

  @TerminatingEmp @test
  Scenario: User should be able to Terminate employment
    And then clicks on Terminate Employment
    Then specified employee is terminated