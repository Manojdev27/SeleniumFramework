package com.facebook.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalDriverFactory {

    public static WebDriver getLocalDriver(String browser){
        WebDriver driver = null;

            if(browser.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup(); // setup chrome driver according to the browser version
                driver = new ChromeDriver();// Open chrome Driver
            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();// setup edge driver according to the browser version
                driver = new EdgeDriver();// Open edge Driver
            } else{
                WebDriverManager.firefoxdriver().setup(); // setup firefox driver according to the browser version
                driver = new FirefoxDriver();// Open firefox Driver
            }
            return driver;
    }

}
