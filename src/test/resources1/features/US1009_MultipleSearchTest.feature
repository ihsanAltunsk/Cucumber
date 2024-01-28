Feature: US1009 User performs multiple searches
  Scenario Outline: TC15 The user should be able to search for elements in a list.
    Given User goes to the "toUrl" homepage.
    Then Enters "<searchKeywords>" into the search box and presses ENTER.
    And Tests that products can be found in the search results.
    Then Waits for 1 second.
    And Closes the page.

Examples:
  |searchKeywords   |
  |phone            |
  |java             |
  |samsung          |
  |apple            |
  |nutella          |

    #If we want to search for multiple elements instead of a single one,
    #we use Scenario Outline instead of Scenario.