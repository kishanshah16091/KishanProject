Feature: US - Admin user adding different qualifications
# As an admin user should be able to add different memberships under qualifications


  Background:
    Given user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user navigates to Qualifications page



   # adding membership qualification by zulfiya
  @membership
  Scenario: Adding new Memberships
    And selects Memberships from the drop-down and clicks on it
    Then user can add and save new Membership





