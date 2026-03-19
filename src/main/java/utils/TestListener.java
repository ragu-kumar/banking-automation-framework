package utils;

import base.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = ExtentManager.getInstance().createTest(result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, result.getThrowable());

        String path = ScreenshotUtil.capture(DriverFactory.getDriver(), result.getName());
        test.addScreenCaptureFromPath(path);
    }

    public void onFinish(org.testng.ITestContext context) {
        ExtentManager.getInstance().flush();
    }
}