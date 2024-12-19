package pageObjects.CallbackURLPages;

import MobileActions.GenericMethods.AssertionMethods;
import MobileActions.GenericMethods.GenericMethods;
import MobileActions.GenericMethods.jsonFileMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pageObjects.MMSPages.MMSElements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import static DriverManager.DriverMMS.driverMMS;

public class CallbackURLHelper extends CallbackURLElements {

    public static void clickOnHereButton() {
        GenericMethods.click(driverMMS, hereButton);
    }

    public static void clickOnLogoButtonCallback() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, logoButton);
    }

    public static void clickOnSigninButtonCallback() {
        GenericMethods.click(driverMMS, signinButton);
    }

    public static void fillEmailCallback() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.type(driverMMS, emailTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "customerEmailPBL"));
    }

    public static void fillPasswordCallback() {
        GenericMethods.type(driverMMS, passwordTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "pipedreamPassword"));
    }

    public static void clicksOnSigninButtonInLoginPageCallback() {
        GenericMethods.click(driverMMS, signinButton);
    }

    public static void clicksOnProjectButtonCallback() {
        GenericMethods.click(driverMMS, untitledProjectButton);
    }

    public static void clicksOnWorkflowButtonCallback() {
        GenericMethods.click(driverMMS, untitledWorkflowButton);
    }

    public static void clicksOnContinueButtonCallback() {
        GenericMethods.click(driverMMS, continueButton);
    }

    public static void clicksOnFirstRequestButtonCallback() throws InterruptedException {
        Thread.sleep(4000);
        GenericMethods.click(driverMMS, firstRequestButton);
    }

    public static void clicksOnMoreButtonCallback() {
        GenericMethods.click(driverMMS, moreButton);
    }

    public static void getTokenIDCallback() throws IOException, InterruptedException {
        Thread.sleep(2000);
        jsonFileMethods.modifyWritingStringToJsonFileGeneric(GenericMethods.getElementText(driverMMS, tokenIDText),MMSElements.data, "tokenID");
    }

    public static void userOpensCallbackURL() {
        Set<String> windowHandles = driverMMS.getWindowHandles();
        // Switch to the new window
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        driverMMS.switchTo().window(tabs.get(2));

        // Open a website in the new tab
        driverMMS.get("https://pipedream.com");
    }

    public static void validateThatAmountRight() throws InterruptedException, IOException {
        Thread.sleep(9000);
//        AssertionMethods.assertTwoStrings(jsonFileMethods.getValueFromJson(MMSElements.data, "valUAmount"), GenericMethods.getElementText(driverMMS,amountTextField));
//        GenericMethods.click(driverMMS,amountTextFieldCopyButton);
        jsonFileMethods.modifyWritingStringToJsonFileGeneric(GenericMethods.getElementText(driverMMS, amountTextField),MMSElements.data, "callbackAmount");

    }

    public static void validateThatMerchantPublicKeyRight() {
//        AssertionMethods.assertTwoStrings(jsonFileMethods.getValueFromJson(MMSElements.data, "merchantPublicKeyLive"), GenericMethods.getElementText(driverMMS,merchantPublicKeyTextField));

    }

    public static void validateThatOrderIdRight() {
        AssertionMethods.assertTwoStrings(jsonFileMethods.getValueFromJson(MMSElements.data, "orderID"), GenericMethods.getElementText(driverMMS,orderIDTextField));

    }

    public static void validateThatCardholderNameRight() {
        AssertionMethods.assertTwoStrings(jsonFileMethods.getValueFromJson(MMSElements.data, "cardName"), GenericMethods.getElementText(driverMMS,cardholderNameTextField));

    }
}
