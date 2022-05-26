Feature: Adding membership to the employee

  Background:
    #Given user is navigated to HRMS application
    * user enters valid admin credentials
    * user clicks on login button
    * admin user is successfully logged in
    * navigates to PIM option and click EmployeeList
    * selects first employee

  @Kishan
  Scenario Outline: Adding membership to the employee
    When click the membership option
    And click the add button
    Then user can select "<membershipOption>" from drop down list
    And click on the subscription paid by drop down and select "<subscriptionPaidBy>"
    And enters the subscription "<amount>" in the text box
    And click on the currency drop down and select "<currency>"
    And click the Subscription Start Date field and select "<subscriptionMonth>" "<subscriptionYear>"
    And click on the subscription renewal date calendar and select "<renewalMonth>" "<renewalYear>"
    Then click on save button

    Examples:
      | membershipOption | subscriptionPaidBy | amount | currency             | subscriptionMonth | subscriptionYear | renewalMonth | renewalYear
      | gold             | Company            | 200    | United States Dollar | Jun               | 2022             | Jul          | 2023
      | Gym              | Individual         | 300    | United States Dollar | Apr               | 2022             | Apr          | 2023


