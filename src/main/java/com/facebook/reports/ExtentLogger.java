package com.facebook.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.facebook.utils.ScreenshotUtils;

public class ExtentLogger {

    private ExtentLogger()
    {}

    public static void pass(String message){
        // take screenshot for every action
        ExtentManager.getExtentTest().pass(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void fail(String message){
        ExtentManager.getExtentTest().pass(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }
    public static void info(String message){
        ExtentManager.getExtentTest().pass(message,
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }
}
