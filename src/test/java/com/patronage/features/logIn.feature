Feature: As a user i want to be able to log to my account.



  Scenario Outline: Login with the correct Data
    Given User is on main page
    When User go to login page
    And User write <email> and <password>
    When User press Ok button
    Then User is able to login

    Examples:
      | email                             |password         |
      | mtoz_user0.email@gmail.com        |TOZ_name_0       |


  Scenario Outline: Login with incorrect data
    Given User is on main page
    When User go to login page
    And User write wrong <email> and <password>
    When User press Ok button
    Then User see login <error>
    Examples:
      | email                     | password           |error                             |
      |wrong@email                | TOZ_name_0         |  Niepoprawny login i/lub hasło   |
      |mtoz_user0.email@gmail.com | wrongpassword      |  Niepoprawny login i/lub hasło   |



