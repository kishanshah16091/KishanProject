Feature:As an admin I should be able to change employee's contact details
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
    @test
    Scenario:
      Given  user clicks on contact details and click on edit button
      And user add employees and verify they are added

      |Address Street 1|Address Street 2|City   |ZipCode |Country      |State   |Home Telephone|Mobile      |Work Telephone|Work Email      |Other Email      |
      |123 Main Street |456 Main Street |Phoenix|56789   |United States|Arizona|555 222 3344  |888 999 4566|666 555 2233  |tester@gmail.com|develop@gmail.com|

