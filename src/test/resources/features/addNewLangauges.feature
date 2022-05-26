Feature: Adding any languages for any employees in Qualifications:

  Background:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
  @test
  Scenario:Adding any languages for any employees
    And user enters valid employee id
    And user clicks on search button
    When user choose the employee name and clicks on it
    And user clicks on Qualifications
    And user clicks on Add button
    And user can select values from Language dropdown when it displayed
    And user can select values from Fluency dropdown when it displayed
    And user can select values from Competency dropdown when it displayed
    And user can enters values in Comments textBox when it displayed
    Then user by clicking on save button is able to add new language for any any employee successfully









