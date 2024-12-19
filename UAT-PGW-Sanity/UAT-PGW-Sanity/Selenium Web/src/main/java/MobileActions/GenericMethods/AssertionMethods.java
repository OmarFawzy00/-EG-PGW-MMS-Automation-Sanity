package MobileActions.GenericMethods;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AssertionMethods {

    public static void assertTwoStrings(String ExpectedString,String  ActualString) {
        Assert.assertEquals(ExpectedString, ActualString);

    }

    public static void assertIsDisplayed(WebDriver webDriver, By by) {
        WebElement element = webDriver.findElement(by);
        Assert.assertTrue("The element should be displayed!", element.isDisplayed());
    }

    public static Boolean isAssertTrue(boolean condition, String message) {
        try {
            Assert.assertTrue(message, condition);
            return true;  // Assertion passed
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + message);
            return false;  // Assertion failed
        }
    }

    public static boolean checkElementDisplayed(WebDriver webDriver, By by) {
        try {
            WebElement element = webDriver.findElement(by);
            return isAssertTrue(element.isDisplayed(), "Element should be displayed.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            return false;
        }
    }

    public static boolean assertTrue(WebDriver webDriver, By by) {
        try {
            WebElement element = webDriver.findElement(by);
            return true;
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            return false;
        }
    }
}
