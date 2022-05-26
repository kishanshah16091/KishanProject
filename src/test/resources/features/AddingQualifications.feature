Feature: Admin user adding different qualifications

  Background:
    Given user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user navigates to Qualifications page from admin tab

  @skill @test
  Scenario: Adding new Skills (US-7)
    And   selects skills from dropdown and clicks on it
    Then  user can add and save any skills

  @license @test
  Scenario: Adding new licenses (US-9)
    And selects licenses
    And clicks on add button and fill the name box
    Then Admin can add licence and confirm message is displayed

  @language @test
  Scenario:Adding Any Language (US-11)
    And user clicks on Languages
    And user is able to clicks on Add button
    And user can add any Languages
    Then user click on save button & done successfully

  @membership @test
  Scenario: Adding new Memberships (US-13)
    And selects Memberships from the drop-down and clicks on it
    Then user can add and save new Membership







