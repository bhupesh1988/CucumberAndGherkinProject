package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ResgisterResultPage extends RegistrationPage {
    By _ContinueButtonOnRegistertionPage=By.xpath("//a[@class=\"button-1 register-continue-button\"]");

    public void registrationResult() {
        String actualRegisterSuccessMessage = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        String expectedRegisterSuccessMessage = "Your registration completed";
        Assert.assertTrue(actualRegisterSuccessMessage.equals(expectedRegisterSuccessMessage), "Your registration completed");
    }
    public void clcikonContinueInTheRegistrationPage(){
        click(_ContinueButtonOnRegistertionPage);

    }
}