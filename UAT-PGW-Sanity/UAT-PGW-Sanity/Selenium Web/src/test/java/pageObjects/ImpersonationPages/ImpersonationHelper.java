package pageObjects.ImpersonationPages;

import MobileActions.GenericMethods.AssertionMethods;
import MobileActions.GenericMethods.GenericMethods;
import MobileActions.GenericMethods.jsonFileMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pageObjects.MMSPages.MMSElements;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import static DriverManager.DriverGSDK.driverGSDK;
import static DriverManager.DriverMMS.driverMMS;
import static pageObjects.MMSPages.MMSElements.credentials;

public class ImpersonationHelper extends ImpersonationElements {

    public static void clickOnPaymentGatewayButton() {
        GenericMethods.click(driverMMS, paymentGatewayButton);
    }

    public static void clickOnConfigurationButton() {
        GenericMethods.click(driverMMS, configurationButton);
    }

    public static void clickOnInstanceButton() {
        GenericMethods.click(driverMMS, instanceButton);
    }

    public static void clickOnLiveInstanceButton() {
        GenericMethods.click(driverMMS, liveInstanceButton);
    }

    public static void clickOnGatewaySettingsButton() {
        GenericMethods.click(driverMMS, gatewaySettingsButton);
    }

    public static void getTheMerchantPublicKey() throws IOException {
//        jsonFileMethods.modifyWritingStringToJsonFileGeneric(GenericMethods.getElementText(driverMMS,merchantPublicKeyText),data,"merchantPublicKeyTest");
    }

    public static void clickOnShowPasswordButton() {
        GenericMethods.click(driverMMS, showPasswordButton);
    }

    public static void getTheGatewayAPIPassword() throws IOException {
//        jsonFileMethods.modifyWritingStringToJsonFileGeneric(GenericMethods.getElementText(driverMMS,gatewayAPIPasswordText),data,"GatewayAPIPasswordTest");
    }

    public static void clickOnTestInstanceButton() {
        GenericMethods.click(driverMMS, testInstanceButton);
    }

    public static void clickOnTestPaymentsCategoryButton() {
        GenericMethods.click(driverMMS, testPaymentsCategoryButton);
    }

    public static void clickOnRightArrowButton() {
        GenericMethods.click(driverMMS, rightArrowButton);
    }

    public static void clickOnTestPaymentsButton() throws InterruptedException {
        GenericMethods.click(driverMMS, testPaymentsButton);

        Set<String> windowHandles = driverMMS.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        driverMMS.switchTo().window(tabs.get(1));

        Thread.sleep(15000);
        Alert alert;
        alert = driverMMS.switchTo().alert();
        alert.accept();

    }

    public static void clickOnToggleToSwitchVersionsOfTestPaymentButton() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, toggleButton);
    }

    public static void fillTestMerchantKeyOnTestPaymentPage() {
        GenericMethods.clear(driverMMS, merchantKeyTextField);
        GenericMethods.type(driverMMS, merchantKeyTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "merchantPublicKeyTest"));
    }

    public static void fillAmountOnTestPaymentPage() {
        GenericMethods.type(driverMMS, amountTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "amount"));
    }

    public static void clickOnPurchaseButton() {
        GenericMethods.click(driverMMS, purchaseButton);
    }

    public static void selectsMeezaCardButton() {
        GenericMethods.click(driverMMS, meezaCardButton);
    }

    public static void clicksOnNextButton() {
        GenericMethods.click(driverMMS, nextButton);
    }

    public static void fillMeezaPhoneNumber() {
        GenericMethods.type(driverMMS, meezaPhoneNumberTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "meezaPhoneNumber"));
    }

    public static void validateThatTransactionSuccess() throws InterruptedException {
        Thread.sleep(3000);
        GenericMethods.waitForElementReadiness(driverMMS, successMsg);
    }

    public static void convertToThePreviousTab() {
        Set<String> windowHandles = driverMMS.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        driverMMS.switchTo().window(tabs.get(1));
    }

    public static void clicksOnSalesButton() {
        GenericMethods.click(driverMMS, salesButton);
    }

    public static void clicksOnTransactionsButton() {
        GenericMethods.click(driverMMS, transactionsButton);
    }

    public static void getOrderIDText() throws IOException {
        jsonFileMethods.modifyWritingStringToJsonFileGeneric(GenericMethods.splitText(GenericMethods.getElementText(driverMMS, orderIDText), 0, 15), MMSElements.data, "orderID");
//        jsonFileMethods.modifyWritingStringToJsonFileGeneric(GenericMethods.splitText(GenericMethods.getElementText(driverMMS, orderIDText), 10, 46), MMSElements.data, "orderID");
    }

    public static void clicksOnShowReceiptCheckBox() {
        GenericMethods.click(driverMMS, showReceiptChckBox);
    }

    public static void clicksOnViewDetailsButtonOnGSDK() {
        GenericMethods.click(driverGSDK, viewDetailsButton);
    }

    public static void clicksOnProfileButton() throws InterruptedException {
        Thread.sleep(10000);
        GenericMethods.click(driverMMS, profileButton);
    }


    public static void clicksOnExitImpersonationButton() {
        GenericMethods.click(driverMMS, exitImpersonationButton);
    }

    public static void validateOnOrderIDOnTransactionPage() throws InterruptedException {
        Thread.sleep(3000);
        AssertionMethods.assertIsDisplayed(driverMMS, orderIDOnTransactionPageTxt);
    }

    public static void clicksOnTestModeButton() {
        GenericMethods.waitForElementInvisibility(driverMMS, MMSElements.loadingLogo);
        GenericMethods.click(driverMMS, testModeButton);
    }

    public static void clicksOnLastTransactionRowButton() {
        GenericMethods.click(driverMMS, lastTransactionRowButton);
    }

    public static void validateOnAmountOnTransactionPage() {
        AssertionMethods.assertTwoStrings(GenericMethods.splitText(GenericMethods.getElementText(driverMMS, amountOnTransactionText), 0, 3), jsonFileMethods.getValueFromJson(MMSElements.data, "amount"));
    }

    public static void validateOnMemberIDOnTransactionPage() {
        GenericMethods.waitForElementReadiness(driverMMS, transactionsDetailsText);
        AssertionMethods.assertIsDisplayed(driverMMS, MIDText);
    }

    public static void validateOnOriginalAmountOnTransactionPage() {
        AssertionMethods.assertIsDisplayed(driverMMS, originalAmountText);
    }

    public static void validateOnGrossAmountOnTransactionPage() {
        AssertionMethods.assertIsDisplayed(driverMMS, grossAmountText);
    }

    public static void validateOnTransactionTypeOnTransactionPage() {
        AssertionMethods.assertIsDisplayed(driverMMS, transactionTypeText);
    }

    public static void fillLiveMerchantKeyOnTestPaymentPage() {
        GenericMethods.clear(driverMMS, merchantKeyTextField);
        GenericMethods.type(driverMMS, merchantKeyTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "merchantPublicKeyLive"));
    }

    public static void fillAPIPasswordOnLivePaymentPage() {
        GenericMethods.type(driverMMS, APIPasswordTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "GatewayAPIPasswordLive"));
    }

    public static void fillValUAmountOnTestPaymentPage() {
        GenericMethods.type(driverMMS, amountTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "valUAmount"));
    }

    public static void clicksBNPLCardButton() throws InterruptedException {
        Thread.sleep(9000);
        driverMMS.switchTo().frame(driverMMS.findElement(paymentFrame));

        GenericMethods.click(driverMMS, BNPLButton);
    }

    public static void clicksVlaUCardButton() {
        GenericMethods.click(driverMMS, valUButton);
    }

    public static void fillvalUPhoneNumber() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.type(driverMMS, valUPhoneNumberTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "valUPhoneNumber"));
    }

    public static void fillDownPaymentAmount() {
        GenericMethods.type(driverMMS, downPaymentTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "valUDownPayment"));
    }

    public static void clicksOnThreeMonthsInstallmentPlan() throws InterruptedException {
        Thread.sleep(3000);
        GenericMethods.click(driverMMS, threeMonthsInstallmentButton);

    }

    public static void clicksOnOnPayCashAtDelivery() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, payCashAtDeliveryButton);
    }

    public static void fillAnOTP() {
        GenericMethods.type(driverMMS, otpTextField, GenericMethods.Otp(jsonFileMethods.getValueFromJson(MMSElements.data, "OTP"), 6));
    }

    public static void clicksOnFinalizePurchaseButton() {
        GenericMethods.click(driverMMS, finalizePurchaseButton);
    }

    public static void clicksOnNextButtonOnValU() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, nextOnValuPageButton);
    }

    public static void clicksOnNextButtonOnDownPaymentPage() {
        GenericMethods.click(driverMMS, nextOnDownPaymentPageButton);
    }

    public static void validateThatTransactionSuccessForValu() throws InterruptedException {
        Thread.sleep(25000);

//        driverMMS.switchTo().frame(driverMMS.findElement(successFrame));
        driverMMS.switchTo().activeElement();
        GenericMethods.waitForElementReadiness(driverMMS, successMsgForValu);
        AssertionMethods.assertTwoStrings("Success", GenericMethods.getElementText(driverMMS, successMsgForValu));
    }

    public static void validateThatReceiptSuccessForValu() {
        GenericMethods.waitForElementReadiness(driverMMS, thePurchaseSuccessfullMSG);
        AssertionMethods.assertTwoStrings("   Your purchase with Valu has been confirmed   ", GenericMethods.getElementText(driverMMS, successMsgForValu));
    }

    public static void validateOnValUAmountOnTransactionPage() {
        AssertionMethods.assertTwoStrings(jsonFileMethods.getValueFromJson(MMSElements.data, "valUAmount"), GenericMethods.splitText(GenericMethods.getElementText(driverMMS, amountOnTransactionText), 0, 4));
    }

    public static void validateOnValuLogoOnTransactionPage() {
        AssertionMethods.assertIsDisplayed(driverMMS, valuLogoOnTransactionPage);
    }

    public static void validateOnBNPLOrderIDOnTransactionPage() {
        AssertionMethods.assertIsDisplayed(driverMMS, BNPLOrderIDOnTransactionPageTxt);
    }

    public static void clicksSouhoolaCardButton() {
        GenericMethods.click(driverMMS, souhoolaButton);
    }

    public static void fillSouhoolaPhoneNumber() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.type(driverMMS, souhoolaPhoneNumberTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "souhoolaPhoneNumber"));
    }

    public static void fillSouhoolaPin() {
        GenericMethods.type(driverMMS, souhoolaPinTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "souhoolaPin"));
    }

    public static void clicksOnNextButtonOnSouhoola() {
        GenericMethods.click(driverMMS, nextOnSouhoolaPageButton);
    }

    public static void clicksOnPayNowOnline() {
        GenericMethods.click(driverMMS, payNowOnlineButton);
    }

    public static void clicksOnDebitCreditCard() {
        GenericMethods.click(driverMMS, debitOrCreditCardButton);
    }

    public static void clicksOnNextButtonOnSelectPaymentMethodPage() {
        GenericMethods.click(driverMMS, NextOnSelectPaymentMethodPageButton);
    }

    public static void fillCardNumber() {
        GenericMethods.type(driverMMS, cardNumberTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "cardNumber"));
    }

    public static void fillExpiryDate() {
        GenericMethods.type(driverMMS, expiryDateTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "expiryDate"));
    }

    public static void fillCVV() {
        GenericMethods.type(driverMMS, cvvTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "CVV"));
    }

    public static void fillNameOnCard() {
        GenericMethods.type(driverMMS, nameOnCardTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "cardName"));
    }

    public static void clicksOnPaySouhoola() throws InterruptedException {
        Thread.sleep(5000);
        GenericMethods.click(driverMMS, payOnSouhoolaPageButton);
    }

    public static void clicksOnSubmitOnDS() throws InterruptedException {
        Thread.sleep(6000);
        driverMMS.switchTo().frame(driverMMS.findElement(DSFrame));
        GenericMethods.click(driverMMS, submitOnDSButton);
        Thread.sleep(7000);
        driverMMS.switchTo().frame(1);
    }

    public static void clicksOnPayByLinkButton() {
//        WebElement scrollableDiv = driverMMS.findElement(sideBarFrame);
//        JavascriptExecutor js = (JavascriptExecutor) driverMMS;
//        js.executeScript("arguments[0].scrollDown = arguments[0].scrollHeight;", scrollableDiv);
        JavascriptExecutor js = (JavascriptExecutor) driverMMS;
        js.executeScript("document.body.style.zoom='0.5'");
        GenericMethods.click(driverMMS, PBLButton);
    }

    public static void clicksOnQuickPaylinkButton() {
        GenericMethods.click(driverMMS, quickPayLinkButton);
    }

    public static void clicksOnAddNewCustomerButton() throws InterruptedException {
        Thread.sleep(4000);
        driverMMS.switchTo().activeElement();
        GenericMethods.click(driverMMS, addNewCustomerButton);
    }

    public static void clicksOnAddCustomerButton() {
        GenericMethods.click(driverMMS, addCustomerButton);
    }

    public static void fillCustomerNameInPBL() {
        GenericMethods.type(driverMMS, customerNamePBLTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "customerNamePBL"));
    }

    public static void fillCustomerEmailInPBL() {
        GenericMethods.type(driverMMS, customerEmailPBLTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "customerEmailPBL"));
    }

    public static void fillAmountInPBL() {
        GenericMethods.type(driverMMS, PBLAmountTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "PBLAmount"));
    }

    public static void clicksOnCreateAndSendButton() {
        GenericMethods.click(driverMMS, createAndSendPBLButton);
    }

    public static void clicksOnExpandButton() throws InterruptedException {
        GenericMethods.click(driverMMS, expandButton);
    }

    public static void searchToFindACustomer() throws InterruptedException {
        Thread.sleep(2000);
//        driverMMS.switchTo().activeElement();
//        GenericMethods.type(driverMMS, searchFindCustomerQuickPBLTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "customerNamePBL"));
        driverMMS.findElement(searchFindCustomerQuickPBLTextField).sendKeys(jsonFileMethods.getValueFromJson(MMSElements.data, "customerNamePBL") + Keys.ENTER);
    }

    public static void clicksOnASelectedCustomerButton() {
        GenericMethods.click(driverMMS, selectedCustomerText);
    }


    public static void clicksOnSixMonthsInstallmentPlanSouhoola() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, sixMonthsInstallmentSouhoolaButton);
    }

    public static void clicksOnNextButtonOnInstallmentPageSouhoola() {
        GenericMethods.click(driverMMS, nextDownPaymentPageButton);
    }

    public static void clicksOnPayCashAtDeliverySouhoola() {
        GenericMethods.click(driverMMS, cashAtDeliverySouhoolaButton);
    }

    public static void clicksOnProceedButtonSouhoola() {
        GenericMethods.click(driverMMS, proceedSouhoolaButton);
    }

    public static void fillAnOTPForSouhoola() {
        GenericMethods.type(driverMMS, otpSouhoolaTextField, GenericMethods.Otp(jsonFileMethods.getValueFromJson(MMSElements.data, "souhoolaPin"), 5));

    }

    public static void clicksOnFinalizePurchaseButtonSouhoola() {
        GenericMethods.click(driverMMS, finalizePurchaseSouhoolaButton);
    }

    public static void validateOnSouhoolaAmountOnTransactionPage() {
        AssertionMethods.assertTwoStrings(jsonFileMethods.getValueFromJson(MMSElements.data, "souhoolaOriginalAmount"), GenericMethods.splitText(GenericMethods.getElementText(driverMMS, amountOnTransactionText), 0, 4));

    }

    public static void clicksOnPayNowOnlineSouhoola() {
        GenericMethods.click(driverMMS, payNowOnlineSouhoolaButton);
    }

    public static void clicksSubmitOnDSSouhoola() throws InterruptedException {
        Thread.sleep(5000);
        driverMMS.switchTo().frame(driverMMS.findElement(DSFrame));
        GenericMethods.click(driverMMS, submitOnDSSouhoolaButton);
        Thread.sleep(7000);
        driverMMS.switchTo().frame(1);
    }

    public static void clicksOnDebitOrCreditCardButton() throws InterruptedException {
        Thread.sleep(9000);
        driverMMS.switchTo().frame(driverMMS.findElement(paymentFrame));
        GenericMethods.click(driverMMS, creditOrDebitCardButton);
    }

    public static void clicksOnSubmitOnDSVTransaction() throws InterruptedException {
        Thread.sleep(6000);
        driverMMS.switchTo().frame(driverMMS.findElement(DSFrame));
        GenericMethods.click(driverMMS, submitOnDSButton);
    }


    public static void validateOnOrderIDOnCreditOrDebitTransactionPage() {
        AssertionMethods.assertIsDisplayed(driverMMS, orderIDDebitOrCreditOnTransactionPageTxt);
    }

    public static void clicksOnStaticPaylinkButton() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, staticPayLinkButton);
    }

    public static void clicksOnCreateStaticPaylink() {
        GenericMethods.click(driverMMS, createStaticPayLinkButton);
    }

    public static void fillStaticPaylinkTitle() {
        GenericMethods.type(driverMMS, staticPayLinkTitleTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "staticPaylinkTitle"));
    }

    public static void fillItemDescriptionForStaticPaylink() {
        GenericMethods.type(driverMMS, itemDescriptionStaticPayLinkTitleTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "itemDescriptionPaylink"));
    }

    public static void fillUnitPriceForStaticPaylink() {
        GenericMethods.type(driverMMS, unitPriceStaticPayLinkTitleTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "unitPicePaylink"));
    }

    public static void clicksOnCreateButtonForStaticPaylink() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driverMMS;
        js.executeScript("document.body.style.zoom='1.6'");
        Thread.sleep(3000);
        GenericMethods.click(driverMMS, createButtonForStaticPayLink);
        js.executeScript("document.body.style.zoom='0.75'");

    }

    public static void clicksOnActionsButtonOnStaticPaylinkPage() {
        GenericMethods.click(driverMMS, actionButtonForStaticPayLink);
    }

    public static void clicksOnViewDetailsButtonOnStaticPaylinkPage() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, viewDetailsButtonForStaticPayLink);
    }

    public static void clicksOnPaylink() throws InterruptedException {
        Thread.sleep(30000);
        GenericMethods.click(driverMMS, payLinkButton);

        Set<String> windowHandles = driverMMS.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        driverMMS.switchTo().window(tabs.get(1));
    }

    public static void fillCustomerNameOnPaylinkPage() {
        GenericMethods.type(driverMMS, customerNameOnPayLinkPageTitleTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "customerNamePBL"));

    }

    public static void fillCustomerEmailOnPaylinkPage() {
        GenericMethods.type(driverMMS, customerEmailOnPayLinkPageTitleTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "customerEmailPBL"));

    }

    public static void clicksOnPayButtonOnPaylinkPage() throws InterruptedException {
        Thread.sleep(5000);
        GenericMethods.click(driverMMS, payButtonOnPaylinkPage);
    }

    public static void validateThatPayLinkPageShowCorrectTotalAmountPayLinkNumberAndMerchantName() {
        AssertionMethods.assertIsDisplayed(driverMMS, paylinkNumberText);
        AssertionMethods.assertIsDisplayed(driverMMS, customerNameOnPayLinkPageText);
        AssertionMethods.assertTwoStrings(jsonFileMethods.getValueFromJson(MMSElements.data, "unitPicePaylink"), GenericMethods.splitText(GenericMethods.getElementText(driverMMS, totalAmountOnPayLinkPageText), 0, 4));
    }

    public static void clicksOnConvertLanguageButtonOnPaylinkPage() throws InterruptedException {
        Thread.sleep(12000);
        GenericMethods.click(driverMMS, convertLanguageButtonOnPayLinkPage);
        GenericMethods.click(driverMMS, englishLanguageButtonOnPayLinkPage);
    }

    public static void clicksOnDebitOrCreditCardButtonOnPaylinkPage() throws InterruptedException {
        Thread.sleep(3000);
        driverMMS.switchTo().frame(driverMMS.findElement(staticPaylinkPaymentFrame));
        GenericMethods.click(driverMMS, debitOrCreditOnPaylinkPageButton);
    }

    public static void clicksOnPayOnPayLinkPageButton() throws InterruptedException {
        Thread.sleep(10000);
        GenericMethods.click(driverMMS, payOnPaylinkPageButton);
    }

    public static void validateThatTransactionSuccessForStaticPaylinkReceipt() throws InterruptedException {
        Thread.sleep(25000);
        AssertionMethods.checkElementDisplayed(driverMMS, orderIDOnStaticPaylinkReceiptText);
        AssertionMethods.checkElementDisplayed(driverMMS, paymentLinkNumberOnStaticPaylinkReceiptText);
        AssertionMethods.checkElementDisplayed(driverMMS, paidByNameOnStaticPaylinkReceiptText);
        AssertionMethods.checkElementDisplayed(driverMMS, paidByEmailOnStaticPaylinkReceiptText);
        AssertionMethods.checkElementDisplayed(driverMMS, grandAmountOnStaticPaylinkReceiptText);
    }

    public static void clicksOnOnManagement() {
        GenericMethods.click(driverMMS, managementButton);
    }

    public static void clicksOnOnBusinesses() {
        GenericMethods.click(driverMMS, businessesButton);
    }

    public static void clicksOnBusinessName() {
        GenericMethods.click(driverMMS, businessNameButton);
    }

    public static void clicksOnEditBusiness() {
        GenericMethods.click(driverMMS, editBusinessButton);
    }

    public static void clicksOnAttachAFileNID() throws AWTException {
        GenericMethods.click(driverMMS, attachFileNIDButton);
        GenericMethods.attachAFile(photoPath);
    }

    public static void clicksOnAttachAFileCommercialRegistration() throws AWTException, InterruptedException {
        Thread.sleep(5000);
        GenericMethods.click(driverMMS, attachFileCommercialRegButton);
        GenericMethods.attachAFile(photoPath);
    }

    public static void clicksOnSaveChanges() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, saveChangesButton);
        Thread.sleep(8000);
    }

    public static void clicksOnGSDKSettings() throws InterruptedException {
        GenericMethods.click(driverMMS, GSDKSettingsButton);
        JavascriptExecutor js = (JavascriptExecutor) driverMMS;
        js.executeScript("document.body.style.zoom='0.75'");
        Thread.sleep(2000);
    }

    public static void fillTID() {
        GenericMethods.type(driverMMS, TIDTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "TIDGSDK"));
    }

    public static void fillMID() throws InterruptedException {
        GenericMethods.type(driverMMS, MIDTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "MIDGSDK"));
        Thread.sleep(2000);
    }

    public static void clicksOnSaveChangesPGWConfigurations() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.click(driverMMS, saveChangesPGWConfigurationsButton);
    }

    public static void clicksOnBusinessNameVerified() {
        GenericMethods.click(driverMMS, businessNameVerifiedButton);
    }

    public static void fillMerchantWebsite() throws InterruptedException {
        Thread.sleep(2000);
        GenericMethods.type(driverMMS, merchantWebsiteTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "merchantWebsite"));
        Thread.sleep(2000);
    }

    public static void clicksOnGenerateSecretKey() {
        GenericMethods.scrollDown();
//        GenericMethods.click(driverMMS, secretKeyButton);
        GenericMethods.type(driverMMS, secretKeyButton, jsonFileMethods.getValueFromJson(MMSElements.data, "MIDGSDK"));

    }

    public static void clicksOnToggleToFederateTransactionsToGSDK() {
//        GenericMethods.click(driverMMS, ToggleToFederateTransactionsToGSDKButton);
    }

    public static void clicksOnRefundButton() {
        GenericMethods.click(driverMMS, refundButton);
    }

    public static void clicksOnArrowToSelectPartialRefundButton() {
        GenericMethods.click(driverMMS, selectPartialRefundButton);
    }

    public static void clicksOnPartialRefundButton() {
        GenericMethods.click(driverMMS, partialRefundButton);
    }

    public static void validateThatFullRefundInitiated() throws InterruptedException {
        Thread.sleep(4000);
        AssertionMethods.assertTwoStrings("Paid - Full Refund Initiated - FULL Refund INITIATED",GenericMethods.getElementTextWithRegex(driverMMS,fullRefundInitiatedTxtMsg));
    }

    public static void fillRefundAmount() {
        driverMMS.switchTo().parentFrame();
        GenericMethods.type(driverMMS, refundAmountTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "valUDownPayment"));
    }

    public static void clicksOnConfirmToPartialRefundButton() {
        GenericMethods.click(driverMMS, confirmToPartialRefundButton);
    }

    public static void validateThatPartialRefundInitiated() throws InterruptedException {
        Thread.sleep(2000);
        AssertionMethods.assertTwoStrings("Paid - Partial Refund Initiated - PARTIAL Refund INITIATED",GenericMethods.getElementTextWithRegex(driverMMS,partialRefundInitiatedTxtMsg));
    }

    public static void clicksOnPaymentGatewayButtonForOnboarding() {
        GenericMethods.click(driverMMS, paymentGatewayButtonForOnboarding);
    }

    public static void fillDownPaymentAmountForSouhoola() {
        GenericMethods.type(driverMMS, downPaymentTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "valUDownPayment"));
    }

    public static void validateOnSouhoolaPayNowAmountOnTransactionPage() {
        AssertionMethods.assertTwoStrings(jsonFileMethods.getValueFromJson(MMSElements.data, "souhoolaOriginalAmount"), GenericMethods.splitText(GenericMethods.getElementText(driverMMS, amountOnTransactionText), 0, 4));
    }

    public static void fillDownPaymentAmountForValu() {
        GenericMethods.type(driverMMS, valuDownPaymentTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "valUDownPayment"));
    }

    public static void fillPaymentOperationOnTestPaymentPage() {
        GenericMethods.clear(driverMMS, paymentOperationTextField);
        GenericMethods.type(driverMMS, paymentOperationTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "paymentOperation"));
    }

    public static void fillCallbackURLOnTestPaymentPage() {
        GenericMethods.type(driverMMS, CallbackURLTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "CallbackURL"));
    }

    public static void clicksOnVoidButton() {
        GenericMethods.click(driverMMS, voidButton);
    }

    public static void validateThatTransactionVoided() {
        AssertionMethods.assertTwoStrings("Voided", GenericMethods.getElementText(driverMMS, voidedButton));

    }

    public static void clicksOnCaptureButton() {
        GenericMethods.click(driverMMS, captureButton);
    }

    public static void validateThatTransactionCaptured() {
        AssertionMethods.assertTwoStrings("Captured", GenericMethods.getElementText(driverMMS, capturedButton));
    }

    public static void clicksTokenPaymentButtonOnTestPaymentPage() {
        GenericMethods.click(driverMMS, tokenPaymentButton);
    }

    public static void fillTokenIDOnTestPaymentPage() {
        GenericMethods.type(driverMMS, tokenIDTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "tokenID"));
    }

    public static void navigateToPreviousTab() throws InterruptedException {
        Thread.sleep(2000);
        String currentTab = driverMMS.getWindowHandle();
        Set<String> allTabs = driverMMS.getWindowHandles();
        int currentIndex = new ArrayList<String>(allTabs).indexOf(currentTab);
        int previousIndex = currentIndex - 1;
        if (previousIndex < 0) {
            previousIndex = allTabs.size() - 1; // go back to the last tab
        }
        String previousTab = new ArrayList<String>(allTabs).get(previousIndex);
        driverMMS.switchTo().window(previousTab);
    }

    public static void clicksOnTestPaymentsButtonEnhancement() throws InterruptedException {
        Thread.sleep(4000);
        GenericMethods.click(driverMMS, testPaymentsButton);
    }

    public static void clicksOnAlert() throws InterruptedException {

        Set<String> windowHandles = driverMMS.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        driverMMS.switchTo().window(tabs.get(2));

        Thread.sleep(6000);

//        String currentTab = driverMMS.getWindowHandle();
//        Set<String> allTabs = driverMMS.getWindowHandles();
//        int currentIndex = new ArrayList<String>(allTabs).indexOf(currentTab);
//        int previousIndex = currentIndex + 1;
//        if (previousIndex > 0) {
//            previousIndex = allTabs.size() + 1; // go back to the last tab
//        }
//        String previousTab = new ArrayList<String>(allTabs).get(previousIndex);
//        driverMMS.switchTo().window(previousTab);

        Alert alert = driverMMS.switchTo().alert();
        alert.accept();
        alert.accept();
    }

    public static void navigateToNextTab() {
        Set<String> windowHandles = driverMMS.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        driverMMS.switchTo().window(tabs.get(1));
    }

    public static void opensANewBlankWindow() {
        JavascriptExecutor js = (JavascriptExecutor) driverMMS;
        js.executeScript("window.open();");
        // Get the window handles
        Set<String> windowHandles = driverMMS.getWindowHandles();
        // Convert windowHandles Set to an array to switch between windows
        String mainWindow = driverMMS.getWindowHandle(); // Main window handle
        String newWindow = null;
        // Find the new window handle
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindow)) {
                newWindow = handle;
                break;
            }
        }
    }

    public static void clicksOnCloseButton() {
        GenericMethods.click(driverMMS,closeButton);
    }

    public static void fillCVVOfTokenized() throws InterruptedException {
        Thread.sleep(6000);
        driverMMS.switchTo().frame(driverMMS.findElement(paymentFrame));
        GenericMethods.click(driverMMS,cvvOfTokenizedTextField);
        GenericMethods.type(driverMMS, cvvOfTokenizedTextField, jsonFileMethods.getValueFromJson(MMSElements.data, "CVV"));
    }

    public static void entersSubmitOnDSVTransactionForTokenized() throws InterruptedException {
        Thread.sleep(6000);
        driverMMS.switchTo().frame(driverMMS.findElement(DSFrameOfTokenized));
        GenericMethods.click(driverMMS, submitOnDSButton);
    }

    public static void navigateToThirdTab() {
        Set<String> windowHandles = driverMMS.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(windowHandles);
        driverMMS.switchTo().window(tabs.get(2));
    }


    public static void validateOnAmountOnTransactionPageForTokenized() {
        AssertionMethods.assertTwoStrings(GenericMethods.splitText(GenericMethods.getElementText(driverMMS, amountOnTransactionText), 0, 4), jsonFileMethods.getValueFromJson(MMSElements.data, "valUAmount"));

    }
}
