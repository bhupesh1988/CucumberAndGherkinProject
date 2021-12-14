package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager extends BaseTest{
    LoadProp loadProp=new LoadProp();
    // Select The Browser
    String browserName = "firefox";
    //String browserName= System.getProperty("browser");

    public void openBrowser() {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
            driver=new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","src/test/java/driver/msedgedriver.exe");
            driver=new EdgeDriver();
        }else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/test/java/driver/geckodriver.exe");
            driver=new FirefoxDriver();
        }else {
            System.out.println("your Browser is Wrong");
        }
        driver.manage().window().maximize();
        //type url link
        driver.get(loadProp.getProperty("url"));
    }
    public void closeBrowser()
    {
        // Close The Browser
        //driver.close();
    }
}

