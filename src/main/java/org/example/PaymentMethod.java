package org.example;

import org.openqa.selenium.By;

public class PaymentMethod extends ShippingMethod {
    By _paymentMethod =By.id("paymentmethod_1");
    By _paymentMethodButton = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
    public void userSelectedPaymentMethod(){
        // user select payment method
        waitForVisible(_paymentMethod,4);
        click(_paymentMethod);
        // user click on the payment method button
        waitForVisible(_paymentMethodButton,4);
        click(_paymentMethodButton);
    }
}
