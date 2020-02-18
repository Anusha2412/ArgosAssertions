
@search
Feature: Search
  As an end user
  I want to search for product
  So that i can vies product i wish

  @smoke
  Scenario: Search for single product
    Given I am on homepage
    When I search for a product "nike"
    Then I should be able to see all nike products


    @regression
    Scenario Outline: Search multi products
      Given I am on homepage
      When I search for a product "<searchItem>"
      Then I should be able to see all <searchIteams>

      Examples:
      |  searchItem  |
      |   puma       |
      |   nike       |
      |   adidas     |

