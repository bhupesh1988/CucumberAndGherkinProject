package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends HomePage {
    By _clickOnDestopPicture = By.xpath("//img[@alt=\"Picture for category Desktops\"]");

    public void selectDesktops() {
        // Click on The Destop Picture
        click(_clickOnDestopPicture);
    }
}