package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    By _clickOnRegistrationButton=By.xpath("//a[@class=\"ico-register\"]");
    By _clickonNewsCommentsButton=By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[2]/div[3]/a");
    By _clickOnComputersButton= By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]");
    By _clickOnThePictureBuildOwnComputer=By.xpath("//img[@alt=\"Picture of Build your own computer\"]");


    public void clickOnRegisterButton() {
        click(_clickOnRegistrationButton);

    }
    public void clickOnNewsComments(){
        click(_clickonNewsCommentsButton);
    }
    public void clickOnComputersButton()
    {
        //click on the computer
        click(_clickOnComputersButton);
    }
    public void clickOnBuildOnOwnComputerPicture(){
        // Click On Build Own Computer Picture
        click(_clickOnThePictureBuildOwnComputer);

    }
}
