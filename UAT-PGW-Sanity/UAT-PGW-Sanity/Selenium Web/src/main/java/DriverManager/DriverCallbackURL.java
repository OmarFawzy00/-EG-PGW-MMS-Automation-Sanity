package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class DriverCallbackURL {

    public static WebDriver driverURL = new ChromeDriver();
    public static void startDriver() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        driverURL.get("https://pipedream.com");


        driverURL.manage().window().maximize();
    }

    public static void tearDown() throws MalformedURLException {
        driverURL.close();
    }
}
