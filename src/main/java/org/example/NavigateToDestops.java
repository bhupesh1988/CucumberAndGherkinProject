package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NavigateToDestops extends ComputerPage{
    By _navigateToDestop = By.xpath("//div[@class=\"center-2\"]/div/div/h1");
    public void navigateToDestopSuccessFull(){
        // user verify that user successfully navigate to destop
        String actualResult=getTextFromElement(_navigateToDestop);
        String expectedResult="Desktops";
        Assert.assertTrue(actualResult.equals(expectedResult),"Desktops");
    }
}
