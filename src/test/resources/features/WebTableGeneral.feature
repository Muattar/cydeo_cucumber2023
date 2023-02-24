Feature: Some of the general functionality verifications

  @dropdown
  Scenario: Dropdown options verifications
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |


  Scenario: Payment options verifications
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees Visa enabled payment option
    Then user sees MasterCard enabled payment option
    Then user sees American Express enabled payment option


  Scenario: Order place scenario
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    And user enters quantity "2"
    Then user clicks to the calculate button
    And user enters customer name "Jane Doe"
    And user enters street "Cloverdale Ln"
    And user enters city "Pittsburgh"
    And user enters state "PA"
    And user enters zip "15046"
    And user enters payment option "American Express"
    And user enters card number "234567894567"
    And user enters card expiration date "12/25"
    And user clicks to process order button
    Then user should see "Jane Doe" in the first row of the web table

  @payment
  Scenario Outline: Order place scenario
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    And user enters quantity "<quantity>"
    Then user clicks to the calculate button
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zip "<zip>"
    And user enters payment option "<paymentType>"
    And user enters card number "<cardNumber>"
    And user enters card expiration date "<expDate>"
    And user clicks to process order button
    Then user should see "<expectedName>" in the first row of the web table

    Examples:
      | quantity | customerName | street     | city | state | zip  | paymentType | cardNumber       | expDate | expectedName |
      | 3        | John Doe     | 7th street | NY   | NY    | 9999 | Visa        | 2345098745674567 | 12/25   | John Doe     |
      | 3        | Jane Doe     | 7th street | NY   | NY    | 9999 | Visa        | 2345098745674567 | 12/25   | Jane Doe     |
     # | 3        | Jack Doe     | 7th street | NY   | NY    | 9999 | Visa        | 2345098745674567 | 12/25   | Jack Doe     |
     # | 3        | Jen Doe      | 7th street | NY   | NY    | 9999 | Visa        | 2345098745674567 | 12/25   | Jen Doe      |
     # | 3        | Mike Doe     | 7th street | NY   | NY    | 9999 | Visa        | 2345098745674567 | 12/25   | Mike Doe     |
     # | 3        | Mary Doe     | 7th street | NY   | NY    | 9999 | Visa        | 2345098745674567 | 12/25   | Mary Doe     |


