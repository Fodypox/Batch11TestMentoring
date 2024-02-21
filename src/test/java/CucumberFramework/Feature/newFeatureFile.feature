Feature: our new cucumber test


  Scenario: test1
    Given I navigate to openMRS login page
    When I enter valid credentials
    And I select a location
    And I click on login button
    Then I should be logged in

