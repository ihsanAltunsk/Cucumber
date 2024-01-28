Feature: 1004 The user logs into the system with valid information.

  Scenario: TC08 Successful login should be possible with valid information.
    Given User goes to the "toUrl" homepage.
    Then  Clicks on the account button.
    And   Enters the valid email as "toValidEmail"
    And   Enters the valid password as "toValidPassword"
    Then  Clicks on the signIn button.
    And   Tests that successful login is possible.
    And   Waits for 1 seconds.
    And   Closes the page.