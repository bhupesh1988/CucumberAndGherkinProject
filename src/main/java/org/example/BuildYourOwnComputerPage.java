package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BuildYourOwnComputerPage extends HomePage{
    By _clickOnEmailAFriend=By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");
    By _hardDisk = By.id("product_attribute_3_6");
    By _vistaPremium = By.xpath("//*[@id=\"product_attribute_4_9\"]");
    By _acrobatReader = By.id("product_attribute_5_11");
    By _totalCommander = By.id("product_attribute_5_12");
    By _addToCart =By.id("add-to-cart-button-1");



    public void clickOnTheEmailAFriendOnBuildYourOwnComputerPage(){
        //Click on Email A friend
        click(_clickOnEmailAFriend);

    }
    public void userShouldBeAbleChooseRightConfiguration(){
        // user select the processor
        Select processor = new Select(driver.findElement(By.id("product_attribute_1")));
        processor.selectByValue("1");
        // user select ram
        Select ram = new Select(driver.findElement(By.id("product_attribute_2")));
        ram.selectByValue("5");
        // user select HardDisk
        click(_hardDisk);
        // user select operating System
        click(_vistaPremium);
        // User select Acrobat Reader Software
        click(_acrobatReader);
        // user select Total Commander Software
        click(_totalCommander);
        // user click add to card button
        click(_addToCart);
    }
}
