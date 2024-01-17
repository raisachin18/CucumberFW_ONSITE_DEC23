Feature; TalentTek Login Feature

  Scenario: Student logs in with valid credentials
    Given student at TalentTek Homepage
    And student enter there valid email address
    And student enter there valid password
    When student clicks on login button
    Then Student should be successfully login

  Scenario: Student logs in with invalid password
    Given student at TalentTek Homepage
    And student enter there valid email address
    And student enter there invalid password
    When student clicks on login button
    Then Student should get an error message for enetering invalid credentials

  Scenario: Student logs in with invalid email address
    Given student at TalentTek Homepage
    And student enter there invalid email address
    And student enter there valid password
    When student clicks on login button
    Then Student should get an error message for entering invalid credentials


  Scenario: Student logs in with invalid credentials
    Given student at TalentTek Homepage
    And student enter there invalid email address
    And student enter there invalid password
    When student clicks on login button
    Then Student should get an error message for entering invalid credentials