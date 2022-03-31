Feature: Contacts page

  Scenario: Default page number
    Given the user on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1


  Scenario: Verify Create Calendar Events
    Given the user on the login page
    And the user enters the sales manager information
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar"


  Scenario: Menu Options
    Given the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: Menu Options
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Scenario: login as a given user
      Given the user on the login page
      When the user logs in using following credentials
      |username| user10 |
      |password|UserUser123|
      |firstname|John   |
      |lastname | Doe|
      Then the user should be able to login


      Scenario Outline: login as a given user <user>
    Given the user on the login page
    When the user logs in using following credentials
      |username| <user> |
      |password|UserUser123|
      |firstname|<firstname>   |
      |lastname | <lastname>|
    Then the user should be able to login

        Examples:
          |user           |firstname  |lastname|
          |user10         |John       |Doe     |
          |storemanager85 |John       |Doe     |
@wip
Scenario: Contacts test with email
  Given the user logged in as "salesmanager"
  And the user navigates to "Customers" "Contacts"
  When the user clicks the "smyvbsjn@gmail.com " from contacts
  Then the information should be same with database