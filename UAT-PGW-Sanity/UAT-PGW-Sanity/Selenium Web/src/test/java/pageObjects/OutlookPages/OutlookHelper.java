package pageObjects.OutlookPages;

import MobileActions.GenericMethods.GenericMethods;
import MobileActions.GenericMethods.jsonFileMethods;
import org.openqa.selenium.Keys;
import pageObjects.MMSPages.MMSElements;

import java.util.ArrayList;
import java.util.Set;

import static DriverManager.DriverMMS.driverMMS;
import static DriverManager.DriverOutlook.driverOutlook;

public class OutlookHelper extends OutlookElements {

    public static void clicksOnSignInButtonInOutlookHomePage() {
        GenericMethods.click(driverOutlook,signInButtonInHomePage);
    }

    public static void fillEmailInOutlook() throws InterruptedException {
        Set<String> windowHandles = driverOutlook.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        Thread.sleep(7000);
        driverOutlook.switchTo().window(tabs.get(1));
//        driverOutlook.switchTo().defaultContent();
//        GenericMethods.type(driverMMS, emailTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "customerEmailPBL"));
        driverMMS.findElement(emailTextField).sendKeys(jsonFileMethods.getValueFromJson(MMSElements.data, "customerEmailPBL"));
    }

    public static void clicksOnNextButtonInOulook() {
        GenericMethods.click(driverOutlook,nextButton);
    }

    public static void fillPasswordInOutlook() {
        GenericMethods.type(driverMMS, passwordTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "passwordOutlook"));
    }

    public static void clicksOnSignInButtonInOulook() {
        GenericMethods.click(driverOutlook,signInButtonInSigninPage);
    }
}
