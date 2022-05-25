Feature:As an admin I should be able to add employee's Emergency Contacts
  Background:
    Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user navigated to employee list page
    When user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information
    And user click on searched employee


    @testRun2
    Scenario:
      Given user clicks on  Emergency contact details and click on add button
      And user send Emergency Details
      |Name     |RelationShip|Home Telephone  |Mobile      |Work Telephone|
      |Suny     |Mother      |888 999 1212    |520-481-0001|111 333 5556  |
     And user click on save button
