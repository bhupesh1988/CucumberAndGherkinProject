package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewsCommentAddSuccessFully extends NewsCommentPage{
    By _newsCommentResult = By.xpath("//div[@class=\"result\"]");

    public void newsCommentsSuccessfullyAdded(){
        // user verify that news comment successfully added
        String actualNewsComment=getTextFromElement(_newsCommentResult);
        String expectedNewsComment="News comment is successfully added.";
        Assert.assertTrue(actualNewsComment.equals(expectedNewsComment),"News comment is successfully added.");
    }
}
