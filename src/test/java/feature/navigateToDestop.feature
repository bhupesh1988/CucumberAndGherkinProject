Feature: NavigateToDestop
  As a User, I want to Navigate To Destop from ComputerPage in website DemoNopeCommerce
  So that, I can use all User features
  @test
  Scenario: User should be able navigate to destop successfully
    Given user is on Computer page
    When user click on the computer from main menu bar
    And User click on the Destop from computer menu bar
    Then user should be able navigate to destop successfully

