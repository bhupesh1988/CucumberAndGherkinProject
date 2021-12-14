package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResultPage extends EmailAFriendPage{
    public void resultEmailAFriend(){
        String actualResult=getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        String expectedResult="Your message has been sent.";
        Assert.assertTrue(actualResult.equals(expectedResult),"Your message has been sent.");
    }

}
