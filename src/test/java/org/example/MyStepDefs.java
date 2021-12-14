package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homePage= new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    ResgisterResultPage resgisterResultPage=new ResgisterResultPage();
    NewsCommentPage newsCommentPage= new NewsCommentPage();
    NewsCommentAddSuccessFully newsCommentAddSuccessFully=new NewsCommentAddSuccessFully();
    BuildYourOwnComputerPage buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    EmailAFriendPage emailAFriendPage =new EmailAFriendPage();
    ComputerPage computerPage =new ComputerPage();
    NavigateToDestops navigateToDestops = new NavigateToDestops();
    EmailAFriendResultPage emailAFriendResultPage=new EmailAFriendResultPage();
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

}
