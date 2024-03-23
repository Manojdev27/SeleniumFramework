package com.facebook.listeners;

import com.facebook.annotations.FrameworkAnnotation;
import com.facebook.reports.ExtentLogger;
import com.facebook.reports.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class TestListeners implements  ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

        ExtentReport.createTest(result.getMethod().getDescription());
        ExtentReport.assignAuthor(result.getMethod().getConstructorOrMethod()
                .getMethod().getAnnotation(FrameworkAnnotation.class).author());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentLogger.pass(result.getName()+ " is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        ExtentLogger.fail(result.getName()+ " is failed");
        ExtentLogger.fail(result.getThrowable().getMessage());
        ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.flushReports();
    }
}

