package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    ResgisterResultPage resgisterResultPage = new ResgisterResultPage();
    NewsCommentPage newsCommentPage = new NewsCommentPage();
    NewsCommentAddSuccessFully newsCommentAddSuccessFully = new NewsCommentAddSuccessFully();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    ComputerPage computerPage = new ComputerPage();
    NavigateToDestops navigateToDestops = new NavigateToDestops();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
    CategoryPage categoryPage = new CategoryPage();
    NewStoreOpen newStoreOpen = new NewStoreOpen();
    ShippingCart shippingCart=new ShippingCart();
    BillingAddress billingAddress=new BillingAddress();
    ShippingMethod shippingMethod=new ShippingMethod();
    PaymentMethod paymentMethod = new PaymentMethod();
    PaymentInformation paymentInformation =new PaymentInformation();
    ConfirmOrder confirmOrder = new ConfirmOrder();


    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePage.clickOnRegisterButton();

    }

    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPage.eneterRegitrationDetails();

    }

    @When("click on {string} button")
    public void click_on_button(String string) {

    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        resgisterResultPage.registrationResult();

    }

    @Given("user is on news Comment Page")
    public void user_is_on_news_comment_page() {
        homePage.clickOnNewsComments();


    }

    @When("User Enter All the Requiement Details In the News Comment Page")
    public void user_enter_all_the_requiement_details_in_the_news_comment_page() {
        newsCommentPage.enterNewsCommentsDetails();

    }

    @When("click on the {string} submit button")
    public void click_on_the_submit_button(String string) {

    }

    @Then("user add news comment successfully")
    public void user_add_news_comment_successfully() {

        newsCommentAddSuccessFully.newsCommentsSuccessfullyAdded();

    }

    @Given("user is on Computer page")
    public void user_is_on_computer_page() {
        homePage.clickOnComputersButton();

    }

    @When("user click on the computer from main menu bar")
    public void user_click_on_the_computer_from_main_menu_bar() {
        computerPage.selectDesktops();

    }

    @When("User click on the Destop from computer menu bar")
    public void user_click_on_the_destop_from_computer_menu_bar() {

    }

    @Then("user should be able navigate to destop successfully")
    public void user_should_be_able_navigate_to_destop_successfully() {
        navigateToDestops.navigateToDestopSuccessFull();

    }

    @Given("user already on Register Successfully page")
    public void user_already_on_register_successfully_page() {
        homePage.clickOnRegisterButton();
        registrationPage.eneterRegitrationDetails();
        resgisterResultPage.registrationResult();


    }

    @When("user click on continue button on Register successfull page")
    public void user_click_on_continue_button_on_register_successfull_page() {
        resgisterResultPage.clcikonContinueInTheRegistrationPage();
        homePage.clickOnBuildOnOwnComputerPicture();

    }

    @When("User click on Email a friend Button")
    public void user_click_on_email_a_friend_button() {
        buildYourOwnComputerPage.clickOnTheEmailAFriendOnBuildYourOwnComputerPage();
    }

    @When("user filled Friend valid Email address and personal message")
    public void user_filled_friend_valid_email_address_and_personal_message() {
        emailAFriendPage.enterEmailAFriendDetails();
    }

    @When("user click on Send Email Button")
    public void user_click_on_send_email_button() {


    }

    @Then("user should be able to send email a friend Successfully")
    public void user_should_be_able_to_send_email_a_friend_successfully() {
        emailAFriendResultPage.resultEmailAFriend();

    }

    @Given("I am on homepage")
    public void i_am_on_homepage() {

    }

    @When("I click on {string} button")
    public void i_click_on_button(String category) {
        homePage.clickOnTheCategoryButton(category);


    }

    @Then("i should be able to verify the {string} accordingly")
    public void i_should_be_able_to_verify_the_accordingly(String pageUrl) {
        categoryPage.getMyUrl(pageUrl);


    }


    @Then("i should  able to verify from the get text {string} accordinggly")
    public void i_should_able_to_verify_from_the_get_text_accordinggly(String taxt) {
        categoryPage.verifyCategoryTitle(taxt);

    }

    @Given("user is already registered Successfully")
    public void user_is_already_registered_successfully() {
        homePage.clickOnRegisterButton();
        registrationPage.eneterRegitrationDetails();
        resgisterResultPage.registrationResult();

    }

    @When("user at homepage Now")
    public void user_at_homepage_now() {
        resgisterResultPage.clcikonContinueInTheRegistrationPage();


    }

    @When("user click on new online store is open from homepage")
    public void user_click_on_new_online_store_is_open_from_homepage() {
        homePage.userClickNewStoreOpen();

    }

    @When("User Verify That He Is successfully Open New Store Page")
    public void user_verify_that_he_is_successfully_open_new_store_page() {
        newStoreOpen.userVerifyThatUserAtOnlineStorePage();
        newStoreOpen.userVerifyLeaveYourCommentTittle();

    }

    @When("type title and comment")
    public void type_title_and_comment() {
        newStoreOpen.userEnterLeaveCommentDetails();

    }

    @When("click on new comment button")
    public void click_on_new_comment_button() {

    }

    @When("user should able to see news comment is successfully added")
    public void user_should_able_to_see_news_comment_is_successfully_added() {
        newStoreOpen.UserCommentSuccessfullyAdd();

    }

    @Then("also see his comments in the last of the comment page")
    public void also_see_his_comments_in_the_last_of_the_comment_page() {
        newStoreOpen.userSuccessfullyNavigateComment();
    }

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        homePage.facebookWindowHandling();
    }

    @When("user click on facebook icon")
    public void user_click_on_facebook_icon() {

    }

    @Then("user should able to see facebook page url with page of DemoNopeCommerce website")
    public void user_should_able_to_see_facebook_page_url_with_page_of_demo_nope_commerce_website() {

    }

    @When("user at homepage")
    public void user_at_homepage() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("click on Vote")
    public void click_on_vote() {


    }
    @Then("Handle the alert")
    public void handle_the_alert() {
        homePage.userVoteAndHAndleAlert();
    }
    @Given("User is already registered")
    public void user_is_already_registered() {
        homePage.clickOnRegisterButton();
        registrationPage.eneterRegitrationDetails();
        resgisterResultPage.registrationResult();

    }
    @When("user already on homepage")
    public void user_already_on_homepage() {
        resgisterResultPage.clcikonContinueInTheRegistrationPage();
        homePage.UserCanAbleToBuyBuildYourOwnComputerSuccessFully();

    }
    @When("User Select Right Configuration")
    public void user_select_right_configuration() {
      buildYourOwnComputerPage.userShouldBeAbleChooseRightConfiguration();
      shippingCart.userClickOnTheShippingCart();
      billingAddress.userfillUpBillingAddressDetails();
      shippingMethod.userSlectedShippingMethod();
      paymentMethod.userSelectedPaymentMethod();
      paymentInformation.userenterPaymentInformationDetails();
      confirmOrder.userConfirmOrder();



    }
    @When("click on Add to cart")
    public void click_on_add_to_cart() {

    }
    @When("I click on shopping cart from popup")
    public void i_click_on_shopping_cart_from_popup() {

    }
    @When("click on check box of terms and condition")
    public void click_on_check_box_of_terms_and_condition() {

    }
    @When("click on checkout button")
    public void click_on_checkout_button() {

    }
    @When("fill all require details in billing address page")
    public void fill_all_require_details_in_billing_address_page() {

    }
    @When("click on continue button")
    public void click_on_continue_button() {

    }
    @When("click in continue button on shipping method page")
    public void click_in_continue_button_on_shipping_method_page() {

    }
    @When("select any one method for payment and click on continue button")
    public void select_any_one_method_for_payment_and_click_on_continue_button() {

    }
    @When("fill all details of payment information and click on continue button")
    public void fill_all_details_of_payment_information_and_click_on_continue_button() {

    }
    @When("click on confirm button on confirm order page")
    public void click_on_confirm_button_on_confirm_order_page() {

    }
    @Then("User can Place Successfully Order")
    public void user_can_place_successfully_order() {

    }


    @And("I Click on {string}")
    public void iClickOn(String string) {
        homePage.beforeAndAfterMouseHover(string);

    }
}