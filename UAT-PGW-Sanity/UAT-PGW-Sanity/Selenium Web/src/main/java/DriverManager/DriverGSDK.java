package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class DriverGSDK {

    public static WebDriver driverGSDK = new ChromeDriver();
    public static void startDriver() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        driverGSDK.get("https://api.gd-pprod-infra.net/eg/portal/dashboard/transactions/list");

        driverGSDK.manage().window().maximize();
    }

    public static void tearDown() throws MalformedURLException {
        driverGSDK.close();
    }
}
