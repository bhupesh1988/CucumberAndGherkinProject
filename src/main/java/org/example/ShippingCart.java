package org.example;

import org.openqa.selenium.By;

public class ShippingCart extends BuildYourOwnComputerPage {
    By _topCartLink =By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
    By _termOfService = By.id("termsofservice");
    By _checkout = By.id("checkout");
    public void userClickOnTheShippingCart() {
        // user click on top cart link
        click(_topCartLink);
        // user accept term and service
        click(_termOfService);
        // user click on checkout
        click(_checkout);
    }
}