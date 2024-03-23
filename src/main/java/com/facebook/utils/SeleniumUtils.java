package com.facebook.utils;

import com.facebook.config.ConfigFactory;
import com.facebook.driver.DriverManager;
import com.facebook.enums.WaitType;
import com.facebook.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

    public static void click(By by, String elementName){
        WebElement element = waitUntilElementClickable(by);
        element.click();
        ExtentLogger.pass(elementName + "is clicked successfully");
    }

    public static void click(WebElement element){

        element.click();

    }

    public static void click(By by, WaitType waitType){
        WebElement element = null;
        if (waitType == WaitType.PRESENCE){
            element = waitUntilElementPresent(by);
        } else if (waitType == WaitType.CLICKABLE) {
            element = waitUntilElementClickable(by);
        } else if (waitType == WaitType.VISIBLE) {
            element = waitUntilElementVisible(by);
        }
        element.click();

    }
    public static void sendKeys(By by, String value, String elementName){
        WebElement element = waitUntilElementPresent(by);
        element.sendKeys(value);
       ExtentLogger.pass(value + "is entered" + "Successfully in " + elementName);
    }

    private static WebElement waitUntilElementPresent(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(),ConfigFactory.getConfig().timeout());
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    private static WebElement waitUntilElementClickable(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(),ConfigFactory.getConfig().timeout());
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(by));

    }

    private static WebElement waitUntilElementVisible(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(),ConfigFactory.getConfig().timeout());
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
}
