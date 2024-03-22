package com.facebook.utils;

import com.facebook.config.ConfigFactory;
import com.facebook.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

    public static void click(By by){
        WebElement element = waitUntilElementClickable(by);
        element.click();
    }

    public static void click(WebElement element){
        element.click();
    }

    public static void click(By by, String waitStrategy){
        WebElement element = null;
        if(waitStrategy.equalsIgnoreCase("present")){
            element = waitUntilElementPresent(by);
        } else if (waitStrategy.equalsIgnoreCase("clicable")) {
            element = waitUntilElementPresent(by);
        }
        element.click();
    }
    public static void sendKeys(By by, String value){
        WebElement element = waitUntilElementPresent(by);
        element.sendKeys(value);
    }

    private static WebElement waitUntilElementPresent(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(),ConfigFactory.getConfig().timeout());
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    private static WebElement waitUntilElementClickable(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverManager.getDriver(),ConfigFactory.getConfig().timeout());
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(by));

    }
}
