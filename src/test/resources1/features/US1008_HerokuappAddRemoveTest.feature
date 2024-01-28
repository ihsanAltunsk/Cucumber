Feature: US1008 User tests the buttons on the page

  Scenario: TC14 The user tests that the Add and Delete buttons are functional.
    Given User goes to the "heroUrl" homepage.
    When  Clicks on the Add Element button.
    And   Waits for 1 seconds.
    And   Tests the visibility of the Delete button.
    Then  Clicks on the Delete button.
    And   Tests the visibility of the Add Remove Elements text.
    And   Waits for 1 seconds.
    And   Closes the page.





