Feature: Refer A Product to a Friend
  As a user, I want to registered on DemoNopeCommerce website then i can able to refer a
  product to friend.
  So that, I can use all user features
  @test
  Scenario:Registered user should be able to refer a product to friend successfully
    Given user already on Register Successfully page
    When user click on continue button on Register successfull page
    And User click on Email a friend Button
    And user filled Friend valid Email address and personal message
    And user click on Send Email Button
    Then user should be able to send email a friend Successfully

