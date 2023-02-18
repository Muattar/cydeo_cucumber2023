Feature: Bing search functionality
  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant result


Scenario: Search Title Verification
Given user is on the Bing search page
When user enters orange in the Bing search box
Then user should see orange in the title


  Scenario: Search Title Verification
    Given user is on the Bing search page
    When user enters "orange" in the Bing search box
    Then user should see "orange - Search" in the title