Feature: Testing the Products and Minimum Stock Levels Given in Excel
  @wip
  Scenario Outline: TC18 The products in the list provided in Excel should have the minimum stock.
    Given User goes to the "toUrl" homepage.
    Then The test script finds the stock quantity of the product in the row "<desiredRow>" in the Excel sheet.
    And Tests that the stock quantity is greater than the stock quantity given in the row "<desiredRow>".
    And Closes the page.
    Examples:
      |desiredRow|
      |2         |
      |3         |
      |4         |
      |5         |
      |6         |
      |7         |
      |8         |
      |9         |