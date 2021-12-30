package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BrowserManager {
    LoadProp loadProp=new LoadProp();
    public static String getMyUrl1() {
        return driver.getCurrentUrl();
    }

    public static void click(By by){
        driver.findElement(by).click();
    }
    public static void sendKeyText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    public static String currentTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddmmyymmss");
        return sdf.format(date);
    }
    public static void waitForClickable(By by,int timeInSeconds){
        WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitForVisible(By by, int timeInSeconds){
        WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void captureScreenshot(String fileName){
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File destFile=new File("src/test/Screenshot/"+fileName+""+currentTime()+".png");
        try{
            FileUtils.copyFile(SrcFile,destFile);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void captureScreenshot1(){
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File destFile=new File("src/test/Screenshot/"+currentTime()+".png");
        try{
            FileUtils.copyFile(SrcFile,destFile);
        }catch (IOException e) {
            e.printStackTrace();
        }}}


