Feature:  Adding information under qualifications : user story 11

  Background:
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user navigate to Admin tab

  @test
  Scenario:Adding Any Language
    Given user moves to Qualifications tab
    And user clicks on Languages
    And user is able to clicks on Add button
    And user can add any Languages
    Then user click on save button & done successfully
