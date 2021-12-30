Feature: Navigate to Sub Category pages
  @homeWork
  Scenario Outline: As a user, i Should Able to navigate to subcategory pages

    Given I am on homepage
    When  I click on "<category>" button
    And  I Click on "<Subcategory>"
    Then i should be able to verify the "<page_Url>" accordingly
    And i should  able to verify from the get text "<page_title>" accordinggly
    Examples:
      | category    | Subcategory    | page_Url                                  | page_title     |
      | Computers   | Desktops       | https://demo.nopcommerce.com/desktops     | Desktops       |
      | Computers   | Notebooks      | https://demo.nopcommerce.com/notebooks    | Notebooks      |
      | Computers   | Software       | https://demo.nopcommerce.com/software     | Software       |
      | Electronics | Camera & photo | https://demo.nopcommerce.com/camera-photo | Camera & photo |
      | Electronics | Cell phones    | https://demo.nopcommerce.com/cell-phones  | Cell phones    |
      | Electronics | Others         | https://demo.nopcommerce.com/others       | Others         |
      | Apparel     | Shoes          | https://demo.nopcommerce.com/shoes        | Shoes          |
      | Apparel     | Clothing       | https://demo.nopcommerce.com/clothing     | Clothing       |
      | Apparel     | Accessories    | https://demo.nopcommerce.com/accessories  | Accessories    |


