Feature: OrangeHRM login

  Scenario: Logo presence on OrangeHRM home page
    Given I launch Chrome Browser
    When I open OrangeHRM homepage
    Then I verify that the Logo presence on page
    And close Browser
