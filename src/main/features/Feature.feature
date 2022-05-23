Feature: Myntra feature

  Scenario: login to myntra feature

    Given user is on login page
    When login page title is Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra
    Then user mouse hover on profile button
    And clicks on login button
    Then user enters mobile number into the field
    And clicks on continue button
    And clicks on login with password
    And user enters password into the field
    Then user clicks on login button
