Feature: US1003 The common steps at the beginning should be typed by the user only once.

  Background: Common initial steps can be written here.
    Given User goes to the "toUrl" homepage.
  @smoke
  Scenario: TC06 User should not find any results when searching for java.

    Then Types "java" in the search box and presses ENTER.
    And Tests that no product is found in the search results.
    And Waits for 2 seconds.
    Then Closes the page.

  Scenario: TC07 User should not find any results when searching for cucumber.

    Then Types "cucumber" in the search box and presses ENTER.
    And Tests that no product is found in the search results.
    And Waits for 1 seconds.
    Then Closes the page.