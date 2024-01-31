Feature:

  Scenario: TC04 User should not find any results when searching for java.
    Given User goes to the test automation homepage.
    Then  Types "java" in the search box and presses ENTER.
    And   Tests that no product is found in the search results.
    And   Waits for 2 seconds.
    Then  Closes the page.

  Scenario: TC05 User should not find any results when searching for cucumber.
    Given User goes to the "toUrl" homepage.
    Then  Types "cucumber" in the search box and presses ENTER.
    And   Tests that no product is found in the search results.
    And   Waits for 1 seconds.
    Then  Closes the page.