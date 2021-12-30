package org.example;

import org.openqa.selenium.By;

public class ConfirmOrder extends PaymentInformation {
    By _confirmButton = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
    public void userConfirmOrder(){
        // user wait for click on confirm the order
        waitForVisible(_confirmButton,4);
        // user click on confirm the order
        click(_confirmButton);

    }
}
