Feature: NewsComment
  As a User, I want to Add News Comment Successfully in website DemoNopeCommerce
  So that, I can use all User features
  @test
  Scenario: User should be able to add News Comment Successfully
    Given user is on news Comment Page
    When User Enter All the Requiement Details In the News Comment Page
    And click on the "news Comment" submit button
    Then user add news comment successfully