@search
Feature: Search
  As an end user
  I want to search for product
  So that i can vies product i wish

  Scenario: Search for single product
    Given I am on homepage
    When I search for product nike
    Then I should be able to see all nike products

  Scenario Outline: Search multi products
    Given I am on homepage
    When I search for product "<searchItem>"
    Then I should be able to see all "<searchItem>"

    Examples:
      |  searchItem  |
      |   puma       |
      |   adidas     |

