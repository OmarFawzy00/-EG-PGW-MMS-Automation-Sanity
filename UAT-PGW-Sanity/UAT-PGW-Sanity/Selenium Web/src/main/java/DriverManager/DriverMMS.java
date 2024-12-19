package DriverManager;


import io.cucumber.java.AfterStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.Screen;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DriverMMS {

    static ChromeOptions options = new ChromeOptions();
    public static WebDriver driverMMS;

    static Date currentdate = new Date();
    static String screenshotFileName = currentdate.toString().replace(" ","-").replace(":","-");

    private static ScreenRecorder screenRecorder;
    static Screen screen = new Screen();

    public static void startDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--incognito");
//        options.addArguments("--headless");
        driverMMS = new ChromeDriver(options);

        driverMMS.get("https://www.gd-pprod-infra.net/eg/merchant-portal/subscription/add?isTest=false");

        driverMMS.manage().window().maximize();

    }

    public static void screenshot(String methodName) throws IOException, AWTException {
//        File screenshotFile = ((TakesScreenshot) driverMMS).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshotFile, new File("target/Screenshots/"+screenshotFileName+".png"));
//        System.out.println("Takes Screenshot Successfully !!!");

//        File file = new File("C:\\Users\\omar.fawzy\\Documents\\Screen Recording");
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        Rectangle captureSize = new Rectangle(0, 0, screenSize.width, screenSize.height);
//
//        screenRecorder = new ScreenRecorder(new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI), captureSize, file, methodName);
//        screenRecorder.start();


    }

    public static void recording() {

//        screen.startRecording();

    }

    public static void stopRecording() {
//        screen.stopRecording();
//
//        // Save the recording to a file
//        screen.saveCapture("test_video.mp4");

    }

    public static void tearDown() throws MalformedURLException {
        driverMMS.close();
    }
}
