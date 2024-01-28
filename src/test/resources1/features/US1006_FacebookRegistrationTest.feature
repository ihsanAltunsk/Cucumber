Feature: US1006 Facebook Registration Test with Faker Class

  Scenario: TC12 Facebook registration should be possible with fake information.
    Given User goes to the "facebookUrl" homepage.
    And   Clicks on the Create New Account button on Facebook.
    And   Waits for 1 seconds.
    When  Fills out the Facebook registration form with information from the Faker class.
    Then  Waits for 2 seconds.
    And   Clicks on the Sign Up button on Facebook.
    Then  Waits for 2 seconds.
    And   Closes the page.