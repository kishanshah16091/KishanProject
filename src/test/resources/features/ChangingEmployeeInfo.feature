Feature: Changing employee's contact details and emergency contacts

  Background:
    When user enters valid admin credentials
    And user clicks on login button
    When user navigates to PIM and Employee list
    Then user search for employee by employee id "7908464"
    And user clicks on search button
    Then user click on searched employee

  @test
  Scenario: User story 1, changing employee's contact details
    Given  user clicks on contact details and click on edit button
    And user add employees and verify they are added

      | Address Street 1 | Address Street 2 | City    | ZipCode | Country       | State   | Home Telephone | Mobile       | Work Telephone | Work Email       | Other Email       |
      | 123 Main Street  | 456 Main Street  | Phoenix | 56789   | United States | Arizona | 555 222 3344   | 888 999 4566 | 666 555 2233   | tester@gmail.com | develop@gmail.com |

  @test
  Scenario: User story 2, changing employee's emergency contacts
    Given user clicks on  Emergency contact details and click on add button
    And user send Emergency Details
      | Name | RelationShip | Home Telephone | Mobile       | Work Telephone |
      | Suny | Mother       | 888 999 1212   | 520-481-0001 | 111 333 5556   |
    And user click on save button
