package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewStoreOpen extends HomePage{
    LoadProp loadProp = new LoadProp();
    By commentList=By.xpath("//div[@class='comment-list']");
    By _verifyNewStoreOpen = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1");
    By _verifyLeaveYourCommentTittle = By.xpath("//*[@id=\"comments\"]/div[1]/strong");
    By _commentTitle = By.id("AddNewComment_CommentTitle");
    By _commentText = By.id("AddNewComment_CommentText");
    By _commentButton = By.xpath("//*[@id=\"comments\"]/form/div[2]/button");
    By _commentSuccessAdd = By.xpath("//*[@id=\"comments\"]/div[2]/div");
    By _comment =By.xpath("//div[@class=\"comment news-comment\"]");

    public void userVerifyThatUserAtOnlineStorePage(){
        // user verify that user at new store online page
        Assert.assertTrue(driver.findElement(_verifyNewStoreOpen).getText().equals("New online store is open!"));
    }
    public void userVerifyLeaveYourCommentTittle(){
        // user verify that user at leave your comment tittle
        Assert.assertTrue(driver.findElement(_verifyLeaveYourCommentTittle).getText().equals("Leave your comment"));
    }
    public void userEnterLeaveCommentDetails(){
        // user enter message on comment title box
        sendKeyText(_commentTitle,loadProp.getProperty("newStoreTitle"));
        // user enter message on comment text box
        sendKeyText(_commentText,loadProp.getProperty("newStoreText"));
        // user click on the comment button
        click(_commentButton);
    }
        public void UserCommentSuccessfullyAdd(){
        // user verify that news comment successfully add
        Assert.assertTrue(driver.findElement(_commentSuccessAdd).getText().equals("News comment is successfully added."));
    }
    public void userSuccessfullyNavigateComment(){
        // user verify that his comment last in the comment list
        List<String> currentOptions = new ArrayList<>();
        WebElement select = driver.findElement(commentList);
        List<WebElement> matches = select.findElements(_comment);
        WebElement lastComment =matches.get(matches.size()-1);
        Assert.assertTrue(lastComment.getText().contains("Very Nice And User friendly"));
        System.out.println(lastComment.getText());

    }}

