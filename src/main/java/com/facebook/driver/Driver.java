package com.facebook.driver;

import com.facebook.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public final class Driver {

    private Driver(){}

    public static void initDriver() throws MalformedURLException {
        String browser = ConfigFactory.getConfig().browser();
        String runmode = ConfigFactory.getConfig().runmode();
        if (DriverManager.getDriver() == null){
            WebDriver driver = DriverFactory.getDriver(runmode,browser);
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
