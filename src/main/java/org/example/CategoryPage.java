package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CategoryPage extends Utils {

By _verifyPageTitle = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1");



    public void  getMyUrl(String page_Url) {
        Assert.assertTrue(driver.getCurrentUrl().equals(page_Url));
    }
    public void  verifyCategoryTitle(String page_title){

        Assert.assertTrue(getTextFromElement(_verifyPageTitle).equals(page_title));
}

}