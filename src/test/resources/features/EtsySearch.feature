
Feature: Etsy search functionality
  Agile Story: User should be able to type any keyword and see relevant information

  Scenario: Etsy Title Verification
    Given user is on the Etsy homepage
    Then user should se title is as expected
    #Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given user is on the Etsy homepage
    When User types Wooden Spoon in the search box
    And User clicks to Etsy search button
    Then User sees Wooden Spoon is in the title

  @etsy
  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given user is on the Etsy homepage
    When User types "Wooden spoon" in the search box
    And User clicks to Etsy search button
    Then User sees "Wooden spoon - Etsy" is in the title