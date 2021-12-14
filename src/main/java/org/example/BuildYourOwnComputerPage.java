package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends HomePage{
    By _clickOnEmailAFriend=By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");


    public void clickOnTheEmailAFriendOnBuildYourOwnComputerPage(){
        //Click on Email A friend
        click(_clickOnEmailAFriend);

    }}
