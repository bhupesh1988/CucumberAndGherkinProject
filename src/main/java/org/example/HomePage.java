package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class HomePage extends Utils{
    By _clickOnRegistrationButton=By.xpath("//a[@class=\"ico-register\"]");
    By _clickonNewsCommentsButton=By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[2]/div[3]/a");
    By _clickOnComputersButton= By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]");
    By _clickOnThePictureBuildOwnComputer=By.xpath("//img[@alt=\"Picture of Build your own computer\"]");
    By _clickOnTheNewStore =By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[1]/div[1]/a");
    By _userClickOnFaceBookIcon = By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a");
    By _useracceptCookies = By.xpath("//button[@data-cookiebanner=\"accept_button\"]");
    By _faceBookIcon = By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/a/i");
    By _buildYourOwnComputer = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/h2/a");


    public void clickOnRegisterButton() {
        click(_clickOnRegistrationButton);

    }
    public void clickOnNewsComments(){
        click(_clickonNewsCommentsButton);
    }
    public void clickOnComputersButton()
    {
        //click on the computer
        click(_clickOnComputersButton);
    }
    public void clickOnBuildOnOwnComputerPicture(){
        // Click On Build Own Computer Picture
        click(_clickOnThePictureBuildOwnComputer);

    }
    public void clickOnTheCategoryButton(String name) {
        click(By.linkText(name));


    }
    public void userClickNewStoreOpen(){
        // user click on the New store Open
        click(_clickOnTheNewStore);

    }
    public void facebookWindowHandling(){
       // user click on the FaceBook icon
        click(_userClickOnFaceBookIcon);
       // window handling
        Set<String> Handles=driver.getWindowHandles();
        Iterator<String>iterator=Handles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
        // Accept cookies
        click(_useracceptCookies);
        // user verify that he is in Facebook Page
        Assert.assertTrue(driver.findElement(_faceBookIcon).getText().equals("Facebook"));
        // close New Tab or child Page or facebook page
        driver.close();
        // now user at nopcommerce website ( Parent page)
        driver.switchTo().window(parentWindow);
    }
    public void userVoteAndHAndleAlert(){
        // user click on the vote
        click(By.id("vote-poll-1"));
        // user accept alert
        driver.switchTo().alert().accept();
    }
    public void UserCanAbleToBuyBuildYourOwnComputerSuccessFully(){
        click(_buildYourOwnComputer);
    }
    public void beforeAndAfterMouseHover(String subcategory){
        // before mouseHover color
        WebElement element =driver.findElement((By.linkText(subcategory)));
        String e= element.getCssValue("color");
        System.out.println("beforHover" +e);

             //Initiate mouse action using Actions class
        Actions actions = new Actions(driver);
        // move the mouse to the earlier identified menu option
        WebElement element1= driver.findElement(By.linkText(subcategory));
        actions.moveToElement(element1).build().perform();
        element1.click();
        // After mouse hover color
        WebElement element2= driver.findElement(By.linkText(subcategory));
        String b= element2.getCssValue("color");
        System.out.println("afterHover" +b);
        System.out.println(loadProp.getProperty("blue"));
        // user verify after hover colour
        Assert.assertTrue(b.equals(loadProp.getProperty("blue")));
    }
}
