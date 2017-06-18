Feature:
  As a user
  I want to have possibility to navigate to pets gallery
  So I can see results

  Scenario: User look on the pets gallery and their details
    Given User is on mainpage
    When User click on gallery tile
    And User click on chosen pet
    Then user should see pet details