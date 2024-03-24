package com.facebook.driver;

import com.facebook.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getRemoteDriver(String browser) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        if(browser.equalsIgnoreCase("chrome")){
            desiredCapabilities.setBrowserName("chrome");
        } else if (browser.equalsIgnoreCase("edge")) {
            desiredCapabilities.setBrowserName("edge");
        }
        return new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteurl()), desiredCapabilities);
    }

}
