Feature: 1005 The user cannot log in with invalid information.

  Scenario: TC09 The user should not be able to log in with a valid email and an invalid password.
    Given User goes to the "toUrl" homepage.
    Then  Clicks on the account button.
    And   Enters the valid email as "toValidEmail"
    And   Enters the valid password as "toInvalidPassword"
    Then  Clicks on the signIn button.
    And   Tests that the user cannot log into the system.
    And   Waits for 1 seconds.
    And   Closes the page.

  Scenario: TC10 The user should not be able to log in with a invalid email and an valid password.
    Given User goes to the "toUrl" homepage.
    Then  Clicks on the account button.
    And   Enters the valid email as "toInvalidEmail"
    And   Enters the valid password as "toValidPassword"
    Then  Clicks on the signIn button.
    And   Tests that the user cannot log into the system.
    And   Waits for 1 seconds.
    And   Closes the page.

  Scenario: TC11 The user should not be able to log in with a invalid email and an invalid password.
    Given User goes to the "toUrl" homepage.
    Then  Clicks on the account button.
    And   Enters the valid email as "toInvalidEmail"
    And   Enters the valid password as "toInvalidPassword"
    Then  Clicks on the signIn button.
    And   Tests that the user cannot log into the system.
    And   Waits for 1 seconds.
    And   Closes the page.