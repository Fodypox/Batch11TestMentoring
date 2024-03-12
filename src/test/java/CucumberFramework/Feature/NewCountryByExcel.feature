Feature:

  Scenario: Create New Country using excel data
    Given I navigate to "https://test.mersys.io/"
    When I enter text as "turkeyts" into element with xpath "//input[@placeholder='Username']"
    And I enter text as "TechnoStudy123" into element with xpath "//input[@placeholder='Password']"
    And I click on element with xpath "//span[normalize-space()='LOGIN']"
    When I navigate to Country page
    And I create a new Country using excel data
    Then New Country should be created