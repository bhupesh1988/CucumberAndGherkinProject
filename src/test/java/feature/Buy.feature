Feature: Checkout of Build your own computer

  As a user , I should able to checkout of Build your own computer

 @homeWork
  Scenario: User should able to successfully checkout of Build your own computer with specific requirements.

    Given User is already registered
    When user already on homepage
    And User Select Right Configuration
    And click on Add to cart
    And I click on shopping cart from popup
    And click on check box of terms and condition
    And click on checkout button
    And fill all require details in billing address page
    And click on continue button
    And click in continue button on shipping method page
    And select any one method for payment and click on continue button
    And fill all details of payment information and click on continue button
    And click on confirm button on confirm order page
    Then User can Place Successfully Order
