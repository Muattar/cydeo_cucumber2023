Feature: Some of the general functionality verifications

  @dropdown
  Scenario: Dropdown options verifications
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |


    @payment
  Scenario: Payment options verifications
  TC #: Order place scenario
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees Visa enabled payment option
    Then user sees MasterCard enabled payment option
    Then user sees American Express enabled payment option
