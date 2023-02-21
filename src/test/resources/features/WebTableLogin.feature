Feature: Web table app log in functionality
  Agile story: User should be able to login with correct credentials


  Scenario: Positive log in scenario
    Given user is on the web table app login page
    When user enters correct user name
    And user enters correct password
    And user clicks login button
    Then user should see orders words in the URL



  Scenario: Positive log in scenario
    Given user is on the web table app login page
    When user enters "Test" username and "Tester" password
    And user clicks login button
    Then user should see orders words in the URL

  @web
  Scenario: Positive log in scenario
    Given user is on the web table app login page
    When user enters below correct credentials
      | username | Test   |
      | password | Tester |
    And user clicks login button
    Then user should see orders words in the URL



