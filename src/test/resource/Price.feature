@search
Feature: Price change
  As an end user
  I want to add a random product to trolley and increase that product quantity.
  So that i can see the price change accordingly.

  Scenario: double the quantity of a product
    Given I am on homepage
    And I search for product adidas
    And add random product to trolley
    When I double the product quantity
    Then I should be able to see the price of the product get double
