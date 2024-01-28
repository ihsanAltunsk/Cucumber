Feature: 1010 The user cannot log in with invalid information.

  Scenario Outline: TC16 Login should not be possible with inVALİD user information provided as a list.
    Given User goes to the "toUrl" homepage.
    Then  Clicks on the account button.
    When  Enters the email as "<givenEmail>"
    And   Enters the password as "<givenPassword>"
    Then  Clicks on the signIn button.
    And   Tests that the user cannot log into the system.
    And   Waits for 1 seconds.
    Then  Closes the page.

    Examples:
    | givenEmail     | givenPassword     |
    | toValidEmail   | toInvalidPassword |
    | toInvalidEmail | toValidPassword   |
    | toInvalidEmail | toInvalidPassword |

