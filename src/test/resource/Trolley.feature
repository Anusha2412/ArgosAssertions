@search
Feature: To check number of items in trolley is updating correctly
  As an end user
  I want to add a random product to trolley and add another random product.
  So that i can see the number of products in the trolley get updated accordingly.

  Scenario: Add two random products to the trolley
    Given I am on homepage
    And I search for a product adidas
    And add a random product to trolley
    When I add another random product of adidas to trolley
    Then I should be able to see the trolley get updated with the number of products added


