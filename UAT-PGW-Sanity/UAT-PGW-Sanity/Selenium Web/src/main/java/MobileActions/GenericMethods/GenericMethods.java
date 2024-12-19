package MobileActions.GenericMethods;

import DriverManager.DriverMMS;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class GenericMethods extends DriverMMS {

    private static final Duration DEFAULT_WAIT_TIME = Duration.ofSeconds(35);

    public static WebElement waitForElementReadiness(WebDriver webDriver, By by) {
        WebDriverWait wait = new WebDriverWait(webDriver, DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void type(WebDriver webDriver, By by, String str) {
        waitForElementReadiness(webDriver,by);
        webDriver.findElement(by).sendKeys(str);
    }

    public static void click(WebDriver webDriver,By by) {
        waitForElementReadiness(webDriver,by);
        webDriver.findElement(by).click();
    }

    public static void holdClick(WebDriver webDriver,By by) {
        waitForElementReadiness(webDriver,by);
        Actions actions = new Actions(webDriver);
        actions.clickAndHold(webDriver.findElement(by)).perform();
    }

    public static void submit(WebDriver webDriver,By by) {
        webDriver.findElement(by).submit();
    }

    public static void scrollDown(WebDriver webDriver,By by) {

        while (!elementDisplayed(webDriver,by)) {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("window.scrollBy(0,360)");
        }
    }

    public static String getElementText(WebDriver webDriver,By by) {
        WebElement element = waitForElementReadiness(webDriver,by);
        return element.getText().replaceAll("[,\\.]", "");
    }

    public static String getElementTextWithRegex(WebDriver webDriver,By by) {
        WebElement element = waitForElementReadiness(webDriver,by);
        return element.getText();
    }

    public static boolean elementDisplayed(WebDriver webDriver,By by) {
        waitForElementReadiness(webDriver,by);
        return webDriver.findElement(by).isDisplayed();
    }

    public static void hoverThenClick(WebDriver webDriver,By by, By byClick) {
        WebElement buttonToHover = webDriver.findElement(by);

        // Create an Actions object
        Actions actions = new Actions(webDriver);

        // Perform the hover action
        actions.moveToElement(buttonToHover).perform();

        // Locate the element you want to click after hovering
        WebElement elementToClick = webDriver.findElement(byClick);

        // Click the element
        elementToClick.click();
    }

    public static void scrollToButtonOfThePage(WebDriver webDriver,By by) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollDown = arguments[0].scrollDown + 200;", by);
    }

    public static void clear(WebDriver webDriver,By by) {
        waitForElementReadiness(webDriver,by);
        webDriver.findElement(by).clear();
    }

    public static boolean isElementDisplayed(WebDriver webDriver,By by) {
        return webDriver.findElement(by).isDisplayed();
    }

    public static boolean elementEnabled(WebDriver webDriver,By by) {
        waitForElementReadiness(webDriver,by);
        return webDriver.findElement(by).isEnabled();
    }

    public static String splitText(String s,int indexMin, int indexMax) {
        String myStr = s;
        return myStr.replaceAll("[^0-9]", "").substring(indexMin, indexMax);
    }

    public static Boolean waitForElementInvisibility(WebDriver webDriver, By by) {
        WebDriverWait wait = new WebDriverWait(webDriver, DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static String Otp(String otp,int max) {
        // Assuming the OTP is a 6-digit number
        return otp.replaceAll("[^0-9]", "").substring(0, max); // Customize extraction logic based on the message format
    }

    public static void attachAFile(String filePath ) throws AWTException {
        Robot robot = new Robot();

        // Copy the file path to clipboard
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Simulate pressing CTRL+V to paste the file path
        robot.delay(2000);  // Delay to allow the dialog to appear
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate pressing ENTER to confirm the upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void scrollDown() {
        Actions actions = new Actions(driverMMS);

        // Perform a PAGE_DOWN action to scroll down the page
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

}
