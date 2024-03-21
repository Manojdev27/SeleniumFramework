package com.facebook.driver;

import com.facebook.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public final class Driver {

    private Driver(){}

    public static void initDriver(){
        String browser = ConfigFactory.getConfig().browser();
        if (DriverManager.getDriver() == null){
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();//maximize the browser
            DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);//presence of element in DOM
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        }

    }

    public static void quitDriver(){
if(DriverManager.getDriver() != null){
    DriverManager.getDriver().quit();
    DriverManager.setDriver(null);
}

    }
}
