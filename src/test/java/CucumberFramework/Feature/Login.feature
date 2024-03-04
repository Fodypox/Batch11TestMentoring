Feature:

  Scenario Outline: Login
    Given Navigate to luma webpage
    When I click on login link
    And I enter "<username>" and "<password>"
    Examples:
      | username              | password   |
      | random@testRandom.com | Qwerty123* |
      | jhgsdjfhs             | kshjdkwjh  |
      | keijrlsjf             | khdrfkherf |