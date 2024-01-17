Feature: TalentTek Student Signup

  Scenario: Student signs up with valid details
    Given the student is on the signup page
    When the student enters valid registration details
    And clicks the signup button
    Then the student should be successfully registered
    And redirected to the home page
