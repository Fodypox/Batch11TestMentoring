Feature:

  Scenario:
    Given I navigate to "https://demo.openmrs.org/openmrs/login.htm"
    When I enter text as "admin" into element with xpath "//input[@id='username']"
    And I enter text as "Admin123" into element with xpath "//input[@id='password']"
    And I click on element with xpath "//li[@id='Isolation Ward']"
    And I wait for 3 seconds
    And I click on element with xpath "//input[@id='loginButton']"
    And I wait for 2 seconds
    And I assert that title is "Home"
    And I assert that element with xpath "xpath" is present
    And I wait for 3 seconds
    And I quit the driver
    
    
#    Scenario:
#      Given I navigate to "https://demo.openmrs.org/openmrs/login.htm"