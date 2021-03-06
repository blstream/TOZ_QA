Feature:
  As a user
  I want to have access to news to which I have permission
  So I can see results

  Scenario Outline: User scrolling news
    Given User is on mainpage
    When User click on login tile
    And User login with <email> and <password>
    Then User should see news on the page

    Examples:
      | email                          | password         |
      | toz_user0.email@gmail.com      | TOZ_name_0       |
      #| volunteer_user1.email@gmail.com| VOLUNTEER_name_1 |

  Scenario Outline: User scrolling details of news
    Given User is on mainpage
    When User click on login tile
    And User login with <email> and <password>
    And User click on details button related to chosen news
    Then User should see details of news

    Examples:
      | email                          | password         |
      | toz_user0.email@gmail.com      | TOZ_name_0       |
      #| volunteer_user1.email@gmail.com| VOLUNTEER_name_1 |
