package pageObjects.MMSPages;

import MobileActions.GenericMethods.AssertionMethods;
import MobileActions.GenericMethods.CSVFileMethods;
import MobileActions.GenericMethods.GenericMethods;
import MobileActions.GenericMethods.jsonFileMethods;
import com.twocaptcha.captcha.ReCaptcha;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import static DriverManager.DriverMMS.driverMMS;
import static DriverManager.DriverGSDK.driverGSDK;

public class MMSHelper extends MMSElements {

    public static void loginToMMS() throws InterruptedException {
        GenericMethods.type(driverMMS, usernameField, jsonFileMethods.getValueFromJson(credentials, "usernameAdmin"));
        GenericMethods.type(driverMMS, passwordField, jsonFileMethods.getValueFromJson(credentials, "passwordAdmin"));

        Thread.sleep(2000);
        if (AssertionMethods.assertTrue(driverMMS, captcha)){
            GenericMethods.click(driverMMS, captcha);
        }
        Thread.sleep(60000);
//        driverMMS.switchTo().frame(driverMMS.findElement(reCaptchaFrame));
//        Thread.sleep(3000);

//        ReCaptcha captcha = new ReCaptcha();
//        captcha.setSiteKey("6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI");
//        captcha.setUrl("https://www.gd-pprod-infra.net/eg/");
//        captcha.setInvisible(true);
//        captcha.setAction("verify");
//        captcha.setProxy("HTTPS", "uat5@geidea.net:P@ssw0rd@93.189.100.206:443");
    }

    public static void clickOnLoginButton() {
        driverMMS.switchTo().parentFrame();
        GenericMethods.click(driverMMS, loginButton);
    }

    public static void fillVerificationCode() {
        GenericMethods.type(driverMMS, verificationCodeTextField, jsonFileMethods.getValueFromJson(data, "VerificationCode"));
    }

    public static void clicksOnVerfiyToVerificationCode() {
        GenericMethods.click(driverMMS, verifyButton);
    }

    public static void loginToGSDK() {
        GenericMethods.type(driverGSDK, usernameField, jsonFileMethods.getValueFromJson(credentials, "usernameAdmin"));
        GenericMethods.type(driverGSDK, passwordField, jsonFileMethods.getValueFromJson(credentials, "passwordAdmin"));
    }

    public static void clickOnLoginButtonGSDK() {
        GenericMethods.click(driverGSDK, loginButton);
    }


    public static void clickOnMerchantList() {
        GenericMethods.click(driverMMS, merchantListButton);
    }

    public static void enterMIDInSearch() {
        GenericMethods.type(driverMMS, searchField, jsonFileMethods.getValueFromJson(data, "MID"));
    }

    public static void clickOnSearchButton() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, searchButton);
    }

    public static void clickOnActionsButton() throws InterruptedException {
        GenericMethods.waitForElementInvisibility(driverMMS, loadingLogo);
        GenericMethods.waitForElementReadiness(driverMMS, actionsButton);
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, actionsButton);
    }

    public static void clickOnImpersonateMerchantButton() {
        GenericMethods.click(driverMMS, impersonateMerchantButton);
    }

    public static void convertsToEnglishLanguage() {
        GenericMethods.click(driverMMS, languageButton);
        GenericMethods.click(driverMMS, englishButton);
    }

    public static void loginGeideaMMSAsComplaintsSupervisor() {
        GenericMethods.type(driverMMS, usernameField, jsonFileMethods.getValueFromJson(credentials, "usernameComplaints"));
        GenericMethods.type(driverMMS, passwordField, jsonFileMethods.getValueFromJson(credentials, "passwordComplaints"));
    }

    public static void clicksOnSystemManagementButton() {
        GenericMethods.click(driverMMS, systemManagementButton);
    }

    public static void clicksOnPayOnMerchantImportButton() {
        GenericMethods.click(driverMMS, merchantImportButton);
    }

    public static void entersMerchantInExcelFileForPGW() throws IOException, InterruptedException {

        i = (int) (Math.random() * (max - min + 1)) + min;
        for(int x=1;x<=18;x++) {
            FirstName ="UAT"+i;
            LastName="Sanity";
            Email =FirstName+LastName+"@endava.com";
            Phonenumber="11111"+i;
            NationalId="294090921"+i;
            BusinessName =FirstName+LastName;
            Comreg=Phonenumber;
            AccountHolder= BusinessName;
            CSVFileMethods.readCSVFile(filePath);
            CSVFileMethods.editCSVCell(filePath, x, 0, FirstName);
            CSVFileMethods.editCSVCell(filePath, x, 1, LastName);
            CSVFileMethods.editCSVCell(filePath, x, 2, Email);
            CSVFileMethods.editCSVCell(filePath, x, 4, Phonenumber);
            CSVFileMethods.editCSVCell(filePath, x, 5, NationalId);
            CSVFileMethods.editCSVCell(filePath, x, 10, BusinessName);
            CSVFileMethods.editCSVCell(filePath, x, 12, Comreg);
            CSVFileMethods.editCSVCell(filePath, x, 13, AccountHolder);
            CSVFileMethods.editCSVCell(filePath, x, 17, Bundle);
            CSVFileMethods.editCSVCell(filePath, x, 24, AcquirerNBE);
        }
        driverMMS.findElement(uploadFileButton).sendKeys(filePath);
        GenericMethods.click(driverMMS, uploadMerchantsButton);
        driverMMS.switchTo().activeElement();
        GenericMethods.click(driverMMS, confirmUploadMerchantsButton);
    }

    public static void clicksOnViewDetails() {
        GenericMethods.click(driverMMS, viewDetailsButton);
    }

    public static void clicksOnMCCCode() {
        GenericMethods.click(driverMMS, MCCCodeArrowButton);
    }

    public static void clicksToSelectMCCCode() throws InterruptedException {
        driverMMS.switchTo().parentFrame();
        GenericMethods.click(driverMMS, ACMCCButton);
    }

    public static void clicksOnEditContract() {
        GenericMethods.click(driverMMS, editContractButton);
    }

    public static void clicksOnContractName() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, contractNameButton);
    }

    public static void clicksToSelectContract() {
        driverMMS.switchTo().parentFrame();
        GenericMethods.click(driverMMS, contractButton);
    }

    public static void clicksOnSaveDetails() throws InterruptedException {
        Thread.sleep(1000);
        GenericMethods.click(driverMMS, saveContractButton);
        Thread.sleep(1000);
    }

    public static void clicksOnMerchantStatus() {
        GenericMethods.click(driverMMS, merchantStatusArrowButton);
    }

    public static void clicksOnVerified() {
        driverMMS.switchTo().parentFrame();
        GenericMethods.click(driverMMS, verifiedButton);
    }

    public static void clicksOnSignOut() {
        GenericMethods.click(driverMMS, signOutButton);
    }

    public static void clicksOnOrders() {
        GenericMethods.click(driverMMS, ordersButton);
    }

    public static void clicksOnOrderStatus() {
        GenericMethods.click(driverMMS, orderStatusButton);
    }

    public static void clicksOnProductsRegistered() {
        GenericMethods.click(driverMMS, productRegisteredButton);
    }

    public static void clicksOnActionsButtonForOnboardingMerchant() throws InterruptedException {
        Thread.sleep(6000);
        JavascriptExecutor js = (JavascriptExecutor) driverMMS;

        js.executeScript("document.body.style.zoom='0.3'");
        GenericMethods.click(driverMMS, actionsForOnboardingMerchantButton);
        js.executeScript("document.body.style.zoom='1'");
    }

    public static void clicksOnComplaintsProfileButton() {
        GenericMethods.click(driverMMS, profileComplaintsButton);
    }

    public static void clicksOnEditContractForOnlinePayment() {
        GenericMethods.click(driverMMS, editContractOnlinePaymentButton);
    }

    public static void clicksToSelectContractForOnlinePayment() {
        GenericMethods.click(driverMMS, contractOnlinePaymentButton);
    }

    public static void validateMerchantStatusOfOnboarding() throws InterruptedException {
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driverMMS;
        js.executeScript("document.body.style.zoom='0.3'");
        GenericMethods.click(driverMMS, actionsInOrderListForOnboardingMerchantButton);
        js.executeScript("document.body.style.zoom='1'");
        GenericMethods.click(driverMMS, viewMerchantStatusButton);
        driverMMS.switchTo().parentFrame();
        AssertionMethods.assertTwoStrings("Products Registered",GenericMethods.getElementText(driverMMS, expectedOrderStatusButton));
        AssertionMethods.assertTwoStrings("Verified",GenericMethods.getElementText(driverMMS, expectedMerchantStatusButton));

    }

    public static void fillMerchantInExcelFileForBM() throws IOException, InterruptedException {

        i = (int) (Math.random() * (max - min + 1)) + min;
        for(int x=1;x<=18;x++) {
            FirstName ="UAT"+i;
            LastName="Sanity";
            Email =FirstName+LastName+"@endava.com";
            Phonenumber="11111"+i;
            NationalId="294090921"+i;
            BusinessName =FirstName+LastName;
            Comreg=Phonenumber;
            AccountHolder= BusinessName;
            CSVFileMethods.readCSVFile(filePath);
            CSVFileMethods.editCSVCell(filePath, x, 0, FirstName);
            CSVFileMethods.editCSVCell(filePath, x, 1, LastName);
            CSVFileMethods.editCSVCell(filePath, x, 2, Email);
            CSVFileMethods.editCSVCell(filePath, x, 4, Phonenumber);
            CSVFileMethods.editCSVCell(filePath, x, 5, NationalId);
            CSVFileMethods.editCSVCell(filePath, x, 10, BusinessName);
            CSVFileMethods.editCSVCell(filePath, x, 12, Comreg);
            CSVFileMethods.editCSVCell(filePath, x, 13, AccountHolder);
            CSVFileMethods.editCSVCell(filePath, x, 17, Bundle);
            CSVFileMethods.editCSVCell(filePath, x, 24, AcquirerBM);
        }
        driverMMS.findElement(uploadFileButton).sendKeys(filePath);
        GenericMethods.click(driverMMS, uploadMerchantsButton);
        driverMMS.switchTo().activeElement();
        GenericMethods.click(driverMMS, confirmUploadMerchantsButton);
        Thread.sleep(4000);
    }

    public static void clicksToSelectContractForBM() {
        GenericMethods.click(driverMMS, contractBMButton);
    }


    public static void searchForOrder() {
        GenericMethods.type(driverMMS, ordersSearchTextField, jsonFileMethods.getValueFromJson(data, "orderNumber"));
    }

    public static void validateThatOrderFoundSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        AssertionMethods.assertTwoStrings(jsonFileMethods.getValueFromJson(data, "orderNumber"),GenericMethods.getElementText(driverMMS, orderNumberText));
    }

    public static void clicksOnSearchButtonOnOrderPage() throws InterruptedException {
        Thread.sleep(3000);
        GenericMethods.click(driverMMS, orderSearchButton);
    }
}
