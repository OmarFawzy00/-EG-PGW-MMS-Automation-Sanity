package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.http.Message;
import org.bouncycastle.util.Store;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;


public class DriverOutlook {

    static ChromeOptions options = new ChromeOptions();
    public static WebDriver driverOutlook;

    static Date currentdate = new Date();
    static String screenshotFileName = currentdate.toString().replace(" ","-").replace(":","-");

    public static void startDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        options.addArguments("--ignore-certificate-errors");
//        options.addArguments("--incognito");
        driverOutlook = new ChromeDriver(options);

        driverOutlook.get("https://www.microsoft.com/en-us/microsoft-365/outlook/log-in");

        driverOutlook.manage().window().maximize();

    }

    public static void screenshot() throws IOException {
        File screenshotFile = ((TakesScreenshot) driverOutlook).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("target/Screenshots/"+screenshotFileName+".png"));
    }

    public static void tearDown() throws MalformedURLException {
        driverOutlook.close();
    }
}
