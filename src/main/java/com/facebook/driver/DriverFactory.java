package com.facebook.driver;

import com.facebook.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class DriverFactory {

    private DriverFactory(){

    }
    public static WebDriver getDriver(String runmode, String browserName) throws MalformedURLException {

        WebDriver driver = null;
        if(runmode.equalsIgnoreCase("local")){
          driver =  LocalDriverFactory.getLocalDriver(browserName);
        } else if (runmode.equalsIgnoreCase("remote")) {
          driver = RemoteDriverFactory.getRemoteDriver(browserName);
        }
        return driver;
    }
}
