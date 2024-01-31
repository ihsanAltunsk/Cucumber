Feature: 1011 Negative login test with incorrect information given in scenario.

  Scenario Outline: TC17 Login should not be possible with invalid user information provided as a list.
    Given User goes to the "toUrl" homepage.
    Then  Clicks on the account button.
    When  Enters "<givenEmail>" given in the list as the email
    And   Enters "<givenPassword>" given in the list as the password
    Then  Clicks on the signIn button.
    And   Tests that the user cannot log into the system.
    And   Waits for 1 seconds.
    Then  Closes the page.

    Examples:
      | givenEmail      | givenPassword |
      | asdf@gmail.com  | sdgfgdf       |
      | asdfh@gmail.com | sdfsdfsdf     |
      | asdfg@gmail.com | dsfsdfsdfs    |

