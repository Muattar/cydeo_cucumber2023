Feature: Cucumber Data Table implementation practices


  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | grape      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |


  Scenario: List the type of pets
    Then user should see below list of pets
      | fish  |
      | cat   |
      | sheep |
      | cow   |
      | tiger |
      | lion  |


  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane          |
      | surname | Doe           |
      | age     | 29            |
      | sate    | PA            |
      | zipcode | 8888          |
      | phone   | 111-1111-1111 |
  @dataTable
  Scenario: User should be able to see all 12 month in month dropdown
    Given user is on the dropdowns page of practice tool
    Then user should see below info in month dropdown

      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |