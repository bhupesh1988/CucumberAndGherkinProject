Feature: New Store Open


  @homeWork
  Scenario: User should able to see title,subtitle and comment successfully

    Given user is already registered Successfully
    When user at homepage Now
    And user click on new online store is open from homepage
    And User Verify That He Is successfully Open New Store Page
    And type title and comment
    And click on new comment button
    And user should able to see news comment is successfully added
    Then also see his comments in the last of the comment page
