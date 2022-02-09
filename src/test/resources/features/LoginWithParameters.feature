Feature: Login as different users

  Scenario: login as a driver user
    Given the user on the login page
    When the user logs in using "User10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"


    Scenario: login as driver
      Given the user logged in as "sales manager"
      And the user should be able to login
      When the user should be able to login
      And the title contains "Dashboard"