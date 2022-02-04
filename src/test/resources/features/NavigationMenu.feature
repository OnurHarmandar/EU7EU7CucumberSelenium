@navigate
Feature: User should be able to navigate Menu

  Scenario: Navigating Fleet --> Vehicles
    Given the user on the login page
    And the user enters the sales manager information
    When the user Navigete to Fleet, Vehicles
    Then the title should be Vehicles


  Scenario: Navigating Marketing --> Campaigns
    Given the user on the login page
    And the user enters the sales manager information
    When the user Navigates to marketing, campaigns
    Then the title should be Campaigns


  Scenario: Navigating Marketing --> Campaigns
    Given the user on the login page
    And the user enters the sales manager information
    When the user Navigates to Activities, Calendar Events
    Then the title should be Calendar