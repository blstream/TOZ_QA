Feature: As a user i want to be able to log to my account.


  Scenario Outline: Login with the correct Data
    Given User is on main page
    When User write <email> and <password>
    When User press Ok button
    Then User is able to login

    Examples:
      | email           |password     |
      | marek@test      |haslo        |


    Given User is on main page
    When User write <email> and <password>
    When User press Ok button
    Then User see corresponding <error>

    Examples:
      | email           |password     |error|
      | marek@test      |haslo        |     |
