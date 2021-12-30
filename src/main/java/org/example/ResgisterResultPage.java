package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ResgisterResultPage extends RegistrationPage {
    By _ContinueButtonOnRegistertionPage=By.xpath("//a[@class=\"button-1 register-continue-button\"]");
    By _registertionResult = By.xpath("//div[@class=\"result\"]");

    public void registrationResult() {
        // user verify through assert that registration completed successfully
        String actualRegisterSuccessMessage = getTextFromElement(_registertionResult);
        String expectedRegisterSuccessMessage = "Your registration completed";
        Assert.assertTrue(actualRegisterSuccessMessage.equals(expectedRegisterSuccessMessage), "Your registration completed");
    }
    public void clcikonContinueInTheRegistrationPage(){
        // user click on continue registertion result page
        click(_ContinueButtonOnRegistertionPage);

    }
}