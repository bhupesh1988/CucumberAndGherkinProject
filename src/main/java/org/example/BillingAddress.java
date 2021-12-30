package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BillingAddress extends ShippingCart{
    LoadProp loadProp = new LoadProp();
    By _cityName= By.id("BillingNewAddress_City");
    By _address = By.id("BillingNewAddress_Address1");
    By _zipCode = By.id("BillingNewAddress_ZipPostalCode");
    By _phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By _billingButton = By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");
    public void userfillUpBillingAddressDetails(){
        // user enter country name
        Select country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        country.selectByValue("133");
        // user enter city name
        sendKeyText(_cityName,loadProp.getProperty("city"));
        // user enter address
        sendKeyText(_address,loadProp.getProperty("address"));
        // user enter zip code
        sendKeyText(_zipCode,loadProp.getProperty("zipPostalCode"));
        // user enter phone number
        sendKeyText(_phoneNumber,loadProp.getProperty("phoneNumber"));
        // user click on the billing button
        click(_billingButton);
//        sendKeyText(By.id("BillingNewAddress_City"),"Navsari");
//        sendKeyText(By.id("BillingNewAddress_Address1"),"AAT Paras Faliya");
//        sendKeyText(By.id("BillingNewAddress_ZipPostalCode"),"396403");
//        sendKeyText(By.id("BillingNewAddress_PhoneNumber"), "1234567891");
//        click(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]"));
    }
}
