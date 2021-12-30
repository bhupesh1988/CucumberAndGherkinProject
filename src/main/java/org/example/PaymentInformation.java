package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PaymentInformation extends PaymentMethod{
    By _CardHolderName = By.id("CardholderName");
    By _cardNumber = By.id ("CardNumber");
    By _cardCode = By.id("CardCode");
    By _paymentButton = By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
    public void userenterPaymentInformationDetails(){
        // user enter cardholder name
        waitForVisible(_CardHolderName,5);
        sendKeyText(_CardHolderName,"s patel");
        // user enter card number
        sendKeyText(_cardNumber,"4929548462463207");
        // user select card expire month
        Select expirationMonth = new Select(driver.findElement(By.id("ExpireMonth")));
        expirationMonth.selectByValue("5");
        // user select card expire year
        Select expirationYear = new Select(driver.findElement(By.id("ExpireYear")));
        expirationYear.selectByValue("2024");
        // user enter cvc code number
        sendKeyText(_cardCode,"166");
        // user click on payment button
        click(_paymentButton);

    }
}
