package org.example;

import org.openqa.selenium.By;

public class NewsCommentPage extends HomePage{
    By _newsCommentsTitle =By.id("AddNewComment_CommentTitle");
    By _newsCommentsText =By.id("AddNewComment_CommentText");
    By _newsCommentsButton =By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]");

    public void enterNewsCommentsDetails(){
        //type comment
        sendKeyText(_newsCommentsTitle,"Nice website");
        //Enter the Message on Comment Text
        sendKeyText(_newsCommentsText,"nopcommerce web Site is very User Friendly easy to assess");
        // click on the news Comment Button
        click(_newsCommentsButton);

    }
}
