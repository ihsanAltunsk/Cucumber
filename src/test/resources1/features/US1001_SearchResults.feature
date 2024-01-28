Feature: US1001 User performs a search on the testotomasyonu page.

  Scenario: TC01_User should find results for the 'phone' search.

    Given User goes to the test automation homepage.
    Then Types phone in the search box and presses ENTER.
    And Tests that a product can be found in the search results.
    And Waits for a moment.
    Then Closes the page.

  Scenario: TC02 User should find results for shoes.
    Given User goes to the test automation homepage.
    Then Types shoes in the search box and presses ENTER.
    And Tests that a product can be found in the search results.
    And Waits for a moment.
    Then Closes the page.

  Scenario: TC03 User should not find any results when searching for nutella.
    Given User goes to the test automation homepage.
    Then Types nutella in the search box and presses ENTER.
    And Tests that no product is found in the search results.
    And Waits for a moment.
    Then Closes the page.