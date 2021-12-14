package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends BuildYourOwnComputerPage {
    By _enterFriendEmailId = By.xpath("//input[@class=\"friend-email\"]");
    By _enterPersonalMessage= By.xpath("//textarea[@placeholder=\"Enter personal message (optional).\"]");
    By _clickOnTheSendEmailButton=By.name("send-email");
    public void enterEmailAFriendDetails(){
        // Enter friend email id
        sendKeyText(_enterFriendEmailId,loadProp.getProperty("friendEmailId")+currentTime()+loadProp.getProperty("friendEmailId1"));
        // Enter the message
        sendKeyText(_enterPersonalMessage,"build you own computer configuration is very good might be you like it");
        // Click to send email
        click(_clickOnTheSendEmailButton);


    }}
