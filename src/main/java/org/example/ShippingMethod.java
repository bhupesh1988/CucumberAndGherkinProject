package org.example;

import org.openqa.selenium.By;

public class ShippingMethod extends BillingAddress{
    By _shippingMethod = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
    public void userSlectedShippingMethod(){
        // user select shipping method
        waitForVisible(_shippingMethod,5);
        click(_shippingMethod);


    }
}
