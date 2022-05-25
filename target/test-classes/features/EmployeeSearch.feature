Feature: US-12345 - Search an employee in HRMS
  Background:
   // Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    And user navigated to employee list page

  @batch12 @smoke @regression @sprint12
  Scenario: Search an employee by id
    #Given user is navigated to HRMS application
    #When user enters valid admin credentials
    #And user clicks on login button
    #And user navigated to employee list page
    When user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information
  @smike
  Scenario: Search an employee by name
    #Given user is navigated to HRMS application
    #When user enters valid admin credentials
    #And user clicks on login button
    #And user navigated to employee list page
    When user enters valid employee name
    And user clicks on search button
    Then user is able to see employee information

    # We can replace the key words Given, when, And , Then with * key and it will work the same
    # similarly like the key words.