Feature: Country
  Background:
    Given I navigate to "https://test.mersys.io/"
    When I enter text as "turkeyts" into element with xpath "//input[@placeholder='Username']"
    And I enter text as "TechnoStudy123" into element with xpath "//input[@placeholder='Password']"
    And I click on element with xpath "//span[normalize-space()='LOGIN']"

  Scenario: Create new country
    Given I navigate to Country page
    When I create new Country
    Then Error message with "Country with Name \"Neverlands\"" already exists should appear
    
    Scenario: Create new state
      Given I navigate to State page
      When I create new State
      Then Error message with "State with Name \"New Jersey\"" already exists should appear