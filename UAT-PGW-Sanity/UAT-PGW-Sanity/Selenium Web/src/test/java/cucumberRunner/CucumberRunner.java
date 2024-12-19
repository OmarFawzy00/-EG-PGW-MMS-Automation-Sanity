package cucumberRunner;

import DriverManager.DriverCallbackURL;
import DriverManager.DriverMMS;
import DriverManager.DriverGSDK;
import DriverManager.DriverOutlook;
import io.cucumber.java.AfterStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;


@CucumberOptions(features = {"src/test/java/featureFiles/"}
        , glue = {"stepDefinition"}
        , tags = "@UAT-1486"
        , plugin = {"json:target/cucumber-reports/CucumberTestReport.json"
}
)

public class CucumberRunner extends AbstractTestNGCucumberTests
{

    @BeforeMethod
    public static void setupMMS() throws IOException {
        DriverMMS.startDriver();
    }
    public static void setupGSDK() throws MalformedURLException {
        DriverGSDK.startDriver();
    }
    public static void setupOutlook() throws IOException {
        DriverOutlook.startDriver();
    }
    public static void setupURL() throws IOException {
        DriverCallbackURL.startDriver();
    }

    @BeforeMethod
    public static void screenshotSetup() throws IOException, AWTException {
//        DriverMMS.screenshot("testRecording");
        DriverMMS.recording();
    }

    @AfterMethod
    public static void stopScreenshot() throws Exception {
        DriverMMS.stopRecording();
    }

    @AfterMethod
    public static void tearDown() throws MalformedURLException {
//        DriverManager.DriverMMS.tearDown();
    }
    public static void tearDownGSDK() throws MalformedURLException {
        DriverGSDK.tearDown();
    }

}
