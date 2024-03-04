Feature: Luma TCs

  Scenario: Open new account
    Given Navigate to luma webpage
    When I click on Create an account link
    And I fill the registration form
      | First name       | Quality Assurance     | Developer         |
      | Last name        | Engineer              | Devops            |
      | Email            | random@testRandom.com | another@email.com |
      | Password         | Qwerty123*            | jhsdgf            |
      | Confirm Password | Qwerty123*            | jhsdgf            |
    Then New account should be created


  Scenario Outline: add new address
    Given Navigate to luma webpage
    When click on my account and click on add address button
    And fill address form of "<Street>" and "<City>" and "<state>" and "<zipcode>"
    Then new address should be added
    Examples:
      | Street       | City     | state | zipcode |
      | 123 main ave | New york | NY    | 98458   |
      | 465 djfhd    | kjhfj    | kjhfg | 63482   |
      | Street       | City     | state | zipcode |
      | Street       | City     | state | zipcode |

