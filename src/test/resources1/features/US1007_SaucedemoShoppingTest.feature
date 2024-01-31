Feature: US1007 Test for Products Added to the Shopping Cart by the User

  Scenario: TC13 A product should be successfully added to the shopping cart.
    Given User goes to the "sauceUrl" homepage.
    And   Waits for 1 seconds.
    Then  Enters "standard_user" into the saucedemo username box.
    And   Enters "secret_sauce" into the saucedemo password box.
    And   Waits for 1 seconds.
    Then  Clicks on the login button on saucedemo.
    And   Saves the name of the first product and goes to its page.
    When  Clicks on the Add to Cart button on saucedemo.
    Then  Clicks on the shopping cart icon on saucedemo.
    And   Waits for 1 seconds.
    And   Tests that the selected product is successfully added to the cart.
    And   Waits for 1 seconds.
    And   Closes the page.