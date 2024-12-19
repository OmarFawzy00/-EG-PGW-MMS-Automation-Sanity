package stepDefinition;

import cucumberRunner.CucumberRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import pageObjects.MMSPages.MMSHelper;
import pageObjects.ImpersonationPages.ImpersonationHelper;
import pageObjects.OutlookPages.OutlookHelper;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Set;

import static DriverManager.DriverMMS.driverMMS;

public class MMSStepdef {

    @Given("User opens Geidea MMS")
    public void user_opens_Geidea_MMS() {
    }

    @Then("User Login Geidea MMS")
    public void userLoginGeideaMMS() throws IOException, InterruptedException {
        MMSHelper.loginToMMS();
    }

    @Then("User clicks on merchant list")
    public void userClicksOnMerchantList() throws IOException {
        MMSHelper.clickOnMerchantList();
    }

    @And("User Enter MID in search")
    public void userEnterMIDInSearch() throws IOException {
        MMSHelper.enterMIDInSearch();
    }

    @Then("User clicks on search button")
    public void userClicksOnSearchButton() throws IOException, InterruptedException {
        MMSHelper.clickOnSearchButton();
    }

    @Then("User clicks on actions button")
    public void userClicksOnActionsButton() throws IOException, InterruptedException {
        MMSHelper.clickOnActionsButton();
    }

    @Then("User clicks on impersonate merchant button")
    public void userClicksOnImpersonateMerchantButton() {
        MMSHelper.clickOnImpersonateMerchantButton();
    }

    @Then("User clicks on payment gateway button")
    public void userClicksOnPaymentGatewayButton() {
        ImpersonationHelper.clickOnPaymentGatewayButton();
    }

    @Then("User clicks on configuration button")
    public void userClicksOnConfigurationButton() {
        ImpersonationHelper.clickOnConfigurationButton();
    }

    @Then("User clicks on instance button")
    public void userClicksOnInstanceButton() {
        ImpersonationHelper.clickOnInstanceButton();
    }

    @Then("User clicks on live instance button")
    public void userClicksOnLiveInstanceButton() {
        ImpersonationHelper.clickOnLiveInstanceButton();
    }

    @Then("User clicks on gateway settings button")
    public void userClicksOnGatewaySettingsButton() {
        ImpersonationHelper.clickOnGatewaySettingsButton();
    }

    @Then("User get the merchant public key")
    public void userGetTheMerchantPublicKey() throws IOException {
        ImpersonationHelper.getTheMerchantPublicKey();
    }

    @Then("User clicks on show password button")
    public void userClicksOnShowPasswordButton() {
        ImpersonationHelper.clickOnShowPasswordButton();
    }

    @Then("User get the gateway API password key")
    public void userGetTheGatewayAPIPasswordKey() throws IOException {
        ImpersonationHelper.getTheGatewayAPIPassword();
    }

    @Then("User clicks on test instance button")
    public void userClicksOnTestInstanceButton() {
        ImpersonationHelper.clickOnTestInstanceButton();
    }

    @Then("User clicks on Login")
    public void userClicksOnLogin() {
        MMSHelper.clickOnLoginButton();
    }

    @Given("User opens Geidea GSDK")
    public void userOpensGeideaGSDK() throws MalformedURLException {
        CucumberRunner.setupGSDK();
    }

    @Then("User Login Geidea GSDK")
    public void userLoginGeideaGSDK() {
        MMSHelper.loginToGSDK();
    }

    @Then("User clicks on Login Geidea GSDK")
    public void userClicksOnLoginGeideaGSDK() {
        MMSHelper.clickOnLoginButtonGSDK();
    }

    @Then("User converts to english language")
    public void userConvertsToEnglishLanguage() {
        MMSHelper.convertsToEnglishLanguage();
    }

    @Then("User clicks on test payments category button")
    public void userClicksOnTestPaymentsCategoryButton() {
        ImpersonationHelper.clickOnTestPaymentsCategoryButton();
    }

    @Then("User clicks on right arrow button to navigate test payments")
    public void userClicksOnRightArrowButtonToNavigateTestPayments() {
        ImpersonationHelper.clickOnRightArrowButton();
    }

    @Then("User clicks on test payments button")
    public void userClicksOnTestPaymentsButton() throws InterruptedException {
        ImpersonationHelper.clickOnTestPaymentsButton();
    }

    @Then("User clicks on toggle to switch versions of test payment button")
    public void userClicksOnToggleToSwitchVersionsOfTestPaymentButton() throws InterruptedException {
        ImpersonationHelper.clickOnToggleToSwitchVersionsOfTestPaymentButton();
    }

    @Then("User Enters Test merchant key on test payment page")
    public void userEntersTestMerchantKeyOnTestPaymentPage() {
        ImpersonationHelper.fillTestMerchantKeyOnTestPaymentPage();
    }

    @Then("User Enters amount on test payment page")
    public void userEntersAmountOnTestPaymentPage() {
        ImpersonationHelper.fillAmountOnTestPaymentPage();
    }

    @Then("User clicks on purchase button")
    public void userClicksOnPurchaseButton() {
        ImpersonationHelper.clickOnPurchaseButton();
    }

    @Then("User selects Meeza card button")
    public void userSelectsMeezaCardButton() {
        ImpersonationHelper.selectsMeezaCardButton();
    }

    @Then("User clicks on next button")
    public void userClicksOnNextButton() {
        ImpersonationHelper.clicksOnNextButton();
    }

    @Then("User Enters Meeza phone number")
    public void userEntersMeezaPhoneNumber() {
        ImpersonationHelper.fillMeezaPhoneNumber();
    }

    @Then("Validate that transaction success")
    public void validateThatTransactionSuccess() throws IOException, InterruptedException {
        ImpersonationHelper.validateThatTransactionSuccess();
    }

    @Then("User convert to the previous tab")
    public void userConvertToThePreviousTab() {
        ImpersonationHelper.convertToThePreviousTab();
    }

    @Then("User clicks on sales button")
    public void userClicksOnSalesButton() {
        ImpersonationHelper.clicksOnSalesButton();
    }

    @Then("User clicks on transactions button")
    public void userClicksOnTransactionsButton() {
        ImpersonationHelper.clicksOnTransactionsButton();
    }

    @Then("Get the order ID number")
    public void getTheOrderIDNumber() throws IOException {
        ImpersonationHelper.getOrderIDText();
    }

    @Then("User clicks on show receipt check box")
    public void userClicksOnShowReceiptCheckBox() {
        ImpersonationHelper.clicksOnShowReceiptCheckBox();
    }

    @Then("User clicks on view details button on GSDK")
    public void userClicksOnViewDetailsButtonOnGSDK() {
        ImpersonationHelper.clicksOnViewDetailsButtonOnGSDK();
    }

    @Then("User clicks on profile button")
    public void userClicksOnProfileButton() throws InterruptedException {
        ImpersonationHelper.clicksOnProfileButton();
    }

    @Then("User clicks on exit impersonation button")
    public void userClicksOnExitImpersonationButton() {
        ImpersonationHelper.clicksOnExitImpersonationButton();
    }

    @Then("Validate on order ID on transaction page")
    public void validateOnOrderIDOnTransactionPage() throws InterruptedException {
        ImpersonationHelper.validateOnOrderIDOnTransactionPage();
    }

    @Then("User clicks on test mode button")
    public void userClicksOnTestModeButton() {
        ImpersonationHelper.clicksOnTestModeButton();
    }

    @Then("User clicks on last transaction row button")
    public void userClicksOnLastTransactionRowButton() {
        ImpersonationHelper.clicksOnLastTransactionRowButton();
    }

    @Then("Validate on amount on transaction page")
    public void validateOnAmountOnTransactionPage() {
        ImpersonationHelper.validateOnAmountOnTransactionPage();
    }

    @Then("Validate on member ID on transaction page")
    public void validateOnMemberIDOnTransactionPage() {
        ImpersonationHelper.validateOnMemberIDOnTransactionPage();
    }

    @Then("Validate on original amount on transaction page")
    public void validateOnOriginalAmountOnTransactionPage() {
        ImpersonationHelper.validateOnOriginalAmountOnTransactionPage();
    }

    @Then("Validate on gross amount on transaction page")
    public void validateOnGrossAmountOnTransactionPage() {
        ImpersonationHelper.validateOnGrossAmountOnTransactionPage();
    }

    @Then("Validate on transaction type on transaction page")
    public void validateOnTransactionTypeOnTransactionPage() {
        ImpersonationHelper.validateOnTransactionTypeOnTransactionPage();
    }

    @Then("User Enters live merchant key on test payment page")
    public void userEntersLiveMerchantKeyOnTestPaymentPage() {
        ImpersonationHelper.fillLiveMerchantKeyOnTestPaymentPage();
    }

    @Then("User Enters API password on live payment page")
    public void userEntersAPIPasswordOnLivePaymentPage() {
        ImpersonationHelper.fillAPIPasswordOnLivePaymentPage();
    }

    @Then("User Enters valU amount on test payment page")
    public void userEntersValUAmountOnTestPaymentPage() {
        ImpersonationHelper.fillValUAmountOnTestPaymentPage();
    }

    @Then("User selects BNPL card button")
    public void userSelectsBNPLCardButton() throws InterruptedException {
        ImpersonationHelper.clicksBNPLCardButton();
    }

    @Then("User clicks VlaU card button")
    public void userClicksVlaUCardButton() {
        ImpersonationHelper.clicksVlaUCardButton();
    }

    @Then("User Enters valU phone number")
    public void userEntersValUPhoneNumber() throws InterruptedException {
        ImpersonationHelper.fillvalUPhoneNumber();
    }

    @Then("User Enters down payment amount")
    public void userEntersDownPaymentAmount() {
        ImpersonationHelper.fillDownPaymentAmount();
    }

    @Then("User clicks on Three months installment plan")
    public void userClicksOnThreeMonthsInstallmentPlan() throws InterruptedException {
        ImpersonationHelper.clicksOnThreeMonthsInstallmentPlan();
    }

    @Then("User clicks on pay cash at delivery")
    public void userClicksOnPayCashAtDelivery() throws InterruptedException {
        ImpersonationHelper.clicksOnOnPayCashAtDelivery();
    }

    @Then("User Enters an OTP")
    public void userEntersAnOTP() throws InterruptedException {
        ImpersonationHelper.fillAnOTP();
    }

    @Then("User clicks on Finalize purchase button")
    public void userClicksOnFinalizePurchaseButton() {
        ImpersonationHelper.clicksOnFinalizePurchaseButton();
    }

    @Then("User clicks on next button on valU")
    public void userClicksOnNextButtonOnValU() throws InterruptedException {
        ImpersonationHelper.clicksOnNextButtonOnValU();
    }

    @Then("User clicks on next button on down payment page")
    public void userClicksOnNextButtonOnDownPaymentPage() {
        ImpersonationHelper.clicksOnNextButtonOnDownPaymentPage();
    }

    @Then("Validate that transaction success for valu")
    public void validateThatTransactionSuccessForValu() throws InterruptedException {
        ImpersonationHelper.validateThatTransactionSuccessForValu();
    }

    @Then("Validate that receipt success for valu")
    public void validateThatReceiptSuccessForValu() {
        ImpersonationHelper.validateThatReceiptSuccessForValu();
    }

    @Then("Validate on valU amount on transaction page")
    public void validateOnValUAmountOnTransactionPage() {
        ImpersonationHelper.validateOnValUAmountOnTransactionPage();
    }

    @Then("Validate on valu logo on transaction page")
    public void validateOnValuLogoOnTransactionPage() {
        ImpersonationHelper.validateOnValuLogoOnTransactionPage();
    }

    @Then("Validate on BNPL order ID on transaction page")
    public void validateOnBNPLOrderIDOnTransactionPage() {
        ImpersonationHelper.validateOnBNPLOrderIDOnTransactionPage();
    }

    @Then("User clicks souhoola card button")
    public void userClicksSouhoolaCardButton() {
        ImpersonationHelper.clicksSouhoolaCardButton();
    }

    @Then("User Enters souhoola phone number")
    public void userEntersSouhoolaPhoneNumber() throws InterruptedException {
        ImpersonationHelper.fillSouhoolaPhoneNumber();
    }

    @Then("User Enters souhoola pin")
    public void userEntersSouhoolaPin() {
        ImpersonationHelper.fillSouhoolaPin();
    }

    @Then("User clicks on next button on souhoola")
    public void userClicksOnNextButtonOnSouhoola() {
        ImpersonationHelper.clicksOnNextButtonOnSouhoola();
    }

    @Then("User clicks on pay now, online")
    public void userClicksOnPayNowOnline() {
        ImpersonationHelper.clicksOnPayNowOnline();
    }

    @Then("User clicks on Debit or credit card")
    public void userClicksOnDebitCreditCard() {
        ImpersonationHelper.clicksOnDebitCreditCard();
    }

    @Then("User clicks on next button on select payment method page")
    public void userClicksOnNextButtonOnSelectPaymentMethodPage() {
        ImpersonationHelper.clicksOnNextButtonOnSelectPaymentMethodPage();
    }

    @Then("User Enters card number")
    public void userEntersCardNumber() {
        ImpersonationHelper.fillCardNumber();
    }

    @Then("User Enters Expiry date")
    public void userEntersExpiryDate() {
        ImpersonationHelper.fillExpiryDate();
    }

    @Then("User Enters CVV")
    public void userEntersCVV() {
        ImpersonationHelper.fillCVV();
    }

    @Then("User Enters Name on card")
    public void userEntersNameOnCard() {
        ImpersonationHelper.fillNameOnCard();
    }

    @Then("User clicks on pay souhoola")
    public void userClicksOnPaySouhoola() throws InterruptedException {
        ImpersonationHelper.clicksOnPaySouhoola();
    }

    @Then("User Enters submit on 3DS")
    public void userEntersSubmitOnDS() throws InterruptedException {
        ImpersonationHelper.clicksOnSubmitOnDS();
    }

    @Then("User clicks on pay by link button")
    public void userClicksOnPayByLinkButton() {
        ImpersonationHelper.clicksOnPayByLinkButton();
    }

    @Then("User clicks on quick paylink button")
    public void userClicksOnQuickPaylinkButton() {
        ImpersonationHelper.clicksOnQuickPaylinkButton();
    }


    @Then("User clicks on Add new customer button")
    public void userClicksOnAddNewCustomerButton() throws InterruptedException {
        ImpersonationHelper.clicksOnAddNewCustomerButton();
    }

    @Then("User clicks on Add customer button")
    public void userClicksOnAddCustomerButton() {
        ImpersonationHelper.clicksOnAddCustomerButton();
    }

    @Then("User Enters customer name in PBL")
    public void userEntersCustomerNameInPBL() {
        ImpersonationHelper.fillCustomerNameInPBL();
    }

    @Then("User Enters customer email in PBL")
    public void userEntersCustomerEmailInPBL() {
        ImpersonationHelper.fillCustomerEmailInPBL();
    }

    @Then("User Enters amount in PBL")
    public void userEntersAmountInPBL() {
        ImpersonationHelper.fillAmountInPBL();
    }

    @Then("User clicks on create and send button")
    public void userClicksOnCreateAndSendButton() {
        ImpersonationHelper.clicksOnCreateAndSendButton();
    }

    @Then("User clicks on expand button")
    public void userClicksOnExpandButton() throws InterruptedException {
        ImpersonationHelper.clicksOnExpandButton();
    }

    @Then("User search to Find a customer")
    public void userSearchToFindACustomer() throws InterruptedException {
        ImpersonationHelper.searchToFindACustomer();
    }

    @Then("User clicks on a selected customer button")
    public void userClicksOnASelectedCustomerButton() {
        ImpersonationHelper.clicksOnASelectedCustomerButton();
    }

    @Given("User opens outlook")
    public void userOpensOutlook() throws IOException {
        CucumberRunner.setupOutlook();
    }

    @Then("User clicks on sign in button in outlook home page")
    public void userClicksOnSignInButtonInOutlookHomePage() {
        OutlookHelper.clicksOnSignInButtonInOutlookHomePage();
    }

    @Then("User Enters email in outlook")
    public void userEntersEmailInOutlook() throws InterruptedException {
        OutlookHelper.fillEmailInOutlook();
    }

    @Then("User clicks on next button in oulook")
    public void userClicksOnNextButtonInOulook() {
        OutlookHelper.clicksOnNextButtonInOulook();
    }

    @Then("User Enters password in outlook")
    public void userEntersPasswordInOutlook() {
        OutlookHelper.fillPasswordInOutlook();
    }

    @Then("User clicks on sign in button in oulook")
    public void userClicksOnSignInButtonInOulook() {
        OutlookHelper.clicksOnSignInButtonInOulook();
    }

    @Then("User clicks on six months installment plan souhoola")
    public void userClicksOnSixMonthsInstallmentPlanSouhoola() throws InterruptedException {
        ImpersonationHelper.clicksOnSixMonthsInstallmentPlanSouhoola();
    }

    @Then("User clicks on next button on installment page souhoola")
    public void userClicksOnNextButtonOnInstallmentPageSouhoola() {
        ImpersonationHelper.clicksOnNextButtonOnInstallmentPageSouhoola();
    }

    @Then("User clicks on pay cash at delivery souhoola")
    public void userClicksOnPayCashAtDeliverySouhoola() {
        ImpersonationHelper.clicksOnPayCashAtDeliverySouhoola();
    }

    @Then("User clicks on proceed button souhoola")
    public void userClicksOnProceedButtonSouhoola() {
        ImpersonationHelper.clicksOnProceedButtonSouhoola();
    }

    @Then("User Enters an OTP for souhoola")
    public void userEntersAnOTPForSouhoola() {
        ImpersonationHelper.fillAnOTPForSouhoola();
    }

    @Then("User clicks on Finalize purchase button souhoola")
    public void userClicksOnFinalizePurchaseButtonSouhoola() {
        ImpersonationHelper.clicksOnFinalizePurchaseButtonSouhoola();
    }

    @Then("Validate on souhoola amount on transaction page")
    public void validateOnSouhoolaAmountOnTransactionPage() {
        ImpersonationHelper.validateOnSouhoolaAmountOnTransactionPage();
    }

    @Then("User clicks on pay now, online souhoola")
    public void userClicksOnPayNowOnlineSouhoola() {
        ImpersonationHelper.clicksOnPayNowOnlineSouhoola();
    }

    @Then("User clicks submit on 3DS souhoola")
    public void userclicksSubmitOnDSSouhoola() throws InterruptedException {
        ImpersonationHelper.clicksSubmitOnDSSouhoola();
    }

    @Then("User selects debit or credit card button")
    public void userSelectsDebitOrCreditCardButton() throws InterruptedException {
        ImpersonationHelper.clicksOnDebitOrCreditCardButton();
    }

    @Then("User Enters submit on 3DS v2 transaction")
    public void userEntersSubmitOnDSVTransaction() throws InterruptedException {
        ImpersonationHelper.clicksOnSubmitOnDSVTransaction();
    }


    @Then("Validate on order ID on credit or debit transaction page")
    public void validateOnOrderIDOnCreditOrDebitTransactionPage() {
        ImpersonationHelper.validateOnOrderIDOnCreditOrDebitTransactionPage();
    }

    @Then("User clicks on static paylink button")
    public void userClicksOnStaticPaylinkButton() throws InterruptedException {
        ImpersonationHelper.clicksOnStaticPaylinkButton();
    }

    @Then("User clicks on create static paylink")
    public void userClicksOnCreateStaticPaylink() {
        ImpersonationHelper.clicksOnCreateStaticPaylink();
    }

    @Then("User Enter static paylink title")
    public void userEnterStaticPaylinkTitle() {
        ImpersonationHelper.fillStaticPaylinkTitle();
    }

    @Then("User Enter item description for static paylink")
    public void userEnterItemDescriptionForStaticPaylink() {
        ImpersonationHelper.fillItemDescriptionForStaticPaylink();
    }

    @Then("User Enter unit price for static paylink")
    public void userEnterUnitPriceForStaticPaylink() {
        ImpersonationHelper.fillUnitPriceForStaticPaylink();
    }

    @Then("User clicks on create button for static paylink")
    public void userClicksOnCreateButtonForStaticPaylink() throws InterruptedException {
        ImpersonationHelper.clicksOnCreateButtonForStaticPaylink();
    }

    @Then("User clicks on actions button on static paylink page")
    public void userClicksOnActionsButtonOnStaticPaylinkPage() {
        ImpersonationHelper.clicksOnActionsButtonOnStaticPaylinkPage();
    }

    @Then("User clicks on view details button on static paylink page")
    public void userClicksOnViewDetailsButtonOnStaticPaylinkPage() throws InterruptedException {
        ImpersonationHelper.clicksOnViewDetailsButtonOnStaticPaylinkPage();
    }

    @Then("User clicks on paylink")
    public void userClicksOnPaylink() throws InterruptedException {
        ImpersonationHelper.clicksOnPaylink();
    }

    @Then("User Enter customer name on paylink page")
    public void userEnterCustomerNameOnPaylinkPage() {
        ImpersonationHelper.fillCustomerNameOnPaylinkPage();
    }

    @Then("User Enter customer Email on paylink page")
    public void userEnterCustomerEmailOnPaylinkPage() {
        ImpersonationHelper.fillCustomerEmailOnPaylinkPage();
    }

    @Then("User clicks on pay button on paylink page")
    public void userClicksOnPayButtonOnPaylinkPage() throws InterruptedException {
        ImpersonationHelper.clicksOnPayButtonOnPaylinkPage();
    }

    @Then("Validate that pay link page show correct Total Amount, Pay link number and Merchant Name")
    public void validateThatPayLinkPageShowCorrectTotalAmountPayLinkNumberAndMerchantName() {
        ImpersonationHelper.validateThatPayLinkPageShowCorrectTotalAmountPayLinkNumberAndMerchantName();
    }

    @Then("User clicks on convert language button on paylink page")
    public void userClicksOnConvertLanguageButtonOnPaylinkPage() throws InterruptedException {
        ImpersonationHelper.clicksOnConvertLanguageButtonOnPaylinkPage();
    }

    @Then("User selects debit or credit card button on paylink page")
    public void userSelectsDebitOrCreditCardButtonOnPaylinkPage() throws InterruptedException {
        ImpersonationHelper.clicksOnDebitOrCreditCardButtonOnPaylinkPage();
    }

    @Then("User clicks on pay on pay link page button")
    public void userClicksOnPayOnPayLinkPageButton() throws InterruptedException {
        ImpersonationHelper.clicksOnPayOnPayLinkPageButton();
    }

    @Then("Validate that transaction success for static paylink receipt")
    public void validateThatTransactionSuccessForStaticPaylinkReceipt() throws InterruptedException {
        ImpersonationHelper.validateThatTransactionSuccessForStaticPaylinkReceipt();
    }

    @Then("User Login Geidea MMS as complaints supervisor")
    public void userLoginGeideaMMSAsComplaintsSupervisor() {
        MMSHelper.loginGeideaMMSAsComplaintsSupervisor();
    }

    @Then("User clicks on system management")
    public void userClicksOnSystemManagement() {
        MMSHelper.clicksOnSystemManagementButton();

    }

    @Then("User clicks on merchant import")
    public void userClicksOnMerchantImport() {
        MMSHelper.clicksOnPayOnMerchantImportButton();
    }

    @Then("User Enters merchant in excel file for PGW")
    public void userEntersMerchantInExcelFileForPGW() throws IOException, InterruptedException {
        MMSHelper.entersMerchantInExcelFileForPGW();
    }

    @Then("User clicks on management")
    public void userClicksOnManagement() {
        ImpersonationHelper.clicksOnOnManagement();
    }

    @Then("User clicks on Businesses")
    public void userClicksOnBusinesses() {
        ImpersonationHelper.clicksOnOnBusinesses();
    }

    @Then("User clicks on Business Name")
    public void userClicksOnBusinessName() {
        ImpersonationHelper.clicksOnBusinessName();
    }

    @Then("User clicks on edit Business")
    public void userClicksOnEditBusiness() {
        ImpersonationHelper.clicksOnEditBusiness();
    }

    @Then("User clicks on attach a file NID")
    public void userClicksOnAttachAFileNID() throws AWTException {
        ImpersonationHelper.clicksOnAttachAFileNID();
    }

    @Then("User clicks on attach a file Commercial Registration")
    public void userClicksOnAttachAFileCommercialRegistration() throws AWTException, InterruptedException {
        ImpersonationHelper.clicksOnAttachAFileCommercialRegistration();
    }

    @Then("User clicks on save changes")
    public void userClicksOnSaveChanges() throws InterruptedException {
        ImpersonationHelper.clicksOnSaveChanges();
    }

    @Then("User clicks on view details")
    public void userClicksOnViewDetails() {
        MMSHelper.clicksOnViewDetails();
    }

    @Then("User clicks on MCC code")
    public void userClicksOnMCCCode() {
        MMSHelper.clicksOnMCCCode();
    }

    @Then("User clicks to select MCC code")
    public void userClicksToSelectMCCCode() throws InterruptedException {
        MMSHelper.clicksToSelectMCCCode();
    }

    @Then("User clicks on edit contract")
    public void userClicksOnEditContract() {
        MMSHelper.clicksOnEditContract();
    }

    @Then("User clicks on contract name")
    public void userClicksOnContractName() throws InterruptedException {
        MMSHelper.clicksOnContractName();
    }

    @Then("User clicks to select contract")
    public void userClicksToSelectContract() {
        MMSHelper.clicksToSelectContract();
    }

    @Then("User clicks on save details")
    public void userClicksOnSaveDetails() throws InterruptedException {
        MMSHelper.clicksOnSaveDetails();
    }

    @Then("User clicks on merchant status")
    public void userClicksOnMerchantStatus() {
        MMSHelper.clicksOnMerchantStatus();
    }

    @Then("User clicks on verified")
    public void userClicksOnVerified() {
        MMSHelper.clicksOnVerified();
    }

    @Then("User clicks on sign out")
    public void userClicksOnSignOut() {
        MMSHelper.clicksOnSignOut();
    }

    @Then("User clicks on orders")
    public void userClicksOnOrders() {
        MMSHelper.clicksOnOrders();
    }

    @Then("User clicks on order status")
    public void userClicksOnOrderStatus() {
        MMSHelper.clicksOnOrderStatus();
    }

    @Then("User clicks on products registered")
    public void userClicksOnProductsRegistered() {
        MMSHelper.clicksOnProductsRegistered();
    }

    @Then("User clicks on GSDK settings")
    public void userClicksOnGSDKSettings() throws InterruptedException {
        ImpersonationHelper.clicksOnGSDKSettings();
    }

    @Then("User Enters TID")
    public void userEntersTID() {
        ImpersonationHelper.fillTID();
    }

    @Then("User Enters MID")
    public void userEntersMID() throws InterruptedException {
        ImpersonationHelper.fillMID();
    }

    @Then("User clicks on save changes PGW configurations")
    public void userClicksOnSaveChangesPGWConfigurations() throws InterruptedException {
        ImpersonationHelper.clicksOnSaveChangesPGWConfigurations();
    }

    @Then("User clicks on actions button for onboarding merchant")
    public void userClicksOnActionsButtonForOnboardingMerchant() throws InterruptedException {
        MMSHelper.clicksOnActionsButtonForOnboardingMerchant();
    }

    @Then("User clicks on complaints profile button")
    public void userClicksOnComplaintsProfileButton() {
        MMSHelper.clicksOnComplaintsProfileButton();
    }

    @Then("User clicks on Business Name verified")
    public void userClicksOnBusinessNameVerified() {
        ImpersonationHelper.clicksOnBusinessNameVerified();
    }

    @Then("User Enters merchant website")
    public void userEntersMerchantWebsite() throws InterruptedException {
        ImpersonationHelper.fillMerchantWebsite();
    }

    @Then("User clicks on generate secret key")
    public void userClicksOnGenerateSecretKey() {
        ImpersonationHelper.clicksOnGenerateSecretKey();
    }

    @Then("User clicks on toggle to Federate Transactions to GSDK")
    public void userClicksOnToggleToFederateTransactionsToGSDK() {
        ImpersonationHelper.clicksOnToggleToFederateTransactionsToGSDK();
    }

    @Then("User clicks on edit contract for online payment")
    public void userClicksOnEditContractForOnlinePayment() {
        MMSHelper.clicksOnEditContractForOnlinePayment();
    }

    @Then("User clicks to select contract for online payment")
    public void userClicksToSelectContractForOnlinePayment() {
        MMSHelper.clicksToSelectContractForOnlinePayment();
    }

    @Then("Validate merchant status of onboarding")
    public void validateMerchantStatusOfOnboarding() throws InterruptedException {
        MMSHelper.validateMerchantStatusOfOnboarding();
    }

    @Then("User Enters merchant in excel file for BM")
    public void userEntersMerchantInExcelFileForBM() throws IOException, InterruptedException {
        MMSHelper.fillMerchantInExcelFileForBM();
    }

    @Then("User clicks to select contract for BM")
    public void userClicksToSelectContractForBM() {
        MMSHelper.clicksToSelectContractForBM();
    }

    @Then("User clicks on refund button")
    public void userClicksOnRefundButton() {
        ImpersonationHelper.clicksOnRefundButton();
    }

    @Then("User clicks on arrow to select partial refund button")
    public void userClicksOnArrowToSelectPartialRefundButton() {
        ImpersonationHelper.clicksOnArrowToSelectPartialRefundButton();
    }

    @Then("User clicks on partial refund button")
    public void userClicksOnPartialRefundButton() {
        ImpersonationHelper.clicksOnPartialRefundButton();
    }

    @Then("Validate that Full Refund Initiated")
    public void validateThatFullRefundInitiated() throws InterruptedException {
        ImpersonationHelper.validateThatFullRefundInitiated();
    }

    @Then("User Enters refund amount")
    public void userEntersRefundAmount() {
        ImpersonationHelper.fillRefundAmount();
    }

    @Then("User clicks on confirm to partial refund button")
    public void userClicksOnConfirmToPartialRefundButton() {
        ImpersonationHelper.clicksOnConfirmToPartialRefundButton();
    }

    @Then("Validate that Partial Refund Initiated")
    public void validateThatPartialRefundInitiated() throws InterruptedException {
        ImpersonationHelper.validateThatPartialRefundInitiated();
    }

    @Then("User clicks on payment gateway button for onboarding")
    public void userClicksOnPaymentGatewayButtonForOnboarding() {
        ImpersonationHelper.clicksOnPaymentGatewayButtonForOnboarding();
    }

    @Then("User Enters down payment amount for souhoola")
    public void userEntersDownPaymentAmountForSouhoola() {
        ImpersonationHelper.fillDownPaymentAmountForSouhoola();

    }

    @Then("Validate on souhoola pay now amount on transaction page")
    public void validateOnSouhoolaPayNowAmountOnTransactionPage() {
        ImpersonationHelper.validateOnSouhoolaPayNowAmountOnTransactionPage();
    }

    @Then("User Enters down payment amount for valu")
    public void userEntersDownPaymentAmountForValu() {
        ImpersonationHelper.fillDownPaymentAmountForValu();
    }

    @Then("User Enters callback URL on test payment page")
    public void userEntersCallbackURLOnTestPaymentPage() {
        ImpersonationHelper.fillCallbackURLOnTestPaymentPage();
    }

    @Then("User Enters payment Operation on test payment page")
    public void userEntersPaymentOperationOnTestPaymentPage() {
        ImpersonationHelper.fillPaymentOperationOnTestPaymentPage();
    }

    @Then("User clicks on void button")
    public void userClicksOnVoidButton() {
        ImpersonationHelper.clicksOnVoidButton();
    }

    @Then("Validate that transaction voided")
    public void validateThatTransactionVoided() {
        ImpersonationHelper.validateThatTransactionVoided();
    }

    @Then("User Enters verification code")
    public void userEntersVerificationCode() {
        MMSHelper.fillVerificationCode();
    }

    @Then("User clicks on verfiy to verification code")
    public void userClicksOnVerfiyToVerificationCode() {
        MMSHelper.clicksOnVerfiyToVerificationCode();
    }

    @Then("User search for order")
    public void userSearchForOrder() {
        MMSHelper.searchForOrder();
    }

    @Then("Validate that Order found successfully")
    public void validateThatOrderFoundSuccessfully() throws InterruptedException {
        MMSHelper.validateThatOrderFoundSuccessfully();
    }

    @Then("User clicks on search button on order page")
    public void userClicksOnSearchButtonOnOrderPage() throws InterruptedException {
        MMSHelper.clicksOnSearchButtonOnOrderPage();

    }

    @Then("User clicks on capture button")
    public void userClicksOnCaptureButton() {
        ImpersonationHelper.clicksOnCaptureButton();
    }

    @Then("Validate that transaction captured")
    public void validateThatTransactionCaptured() {
        ImpersonationHelper.validateThatTransactionCaptured();
    }

    @Then("User clicks token payment button on test payment page")
    public void userClicksTokenPaymentButtonOnTestPaymentPage() {
        ImpersonationHelper.clicksTokenPaymentButtonOnTestPaymentPage();
    }

    @Then("User Enters token ID on test payment page")
    public void userEntersTokenIDOnTestPaymentPage() {
        ImpersonationHelper.fillTokenIDOnTestPaymentPage();
    }

    @Then("Navigate to previous tab")
    public void navigateToPreviousTab() throws InterruptedException {
        ImpersonationHelper.navigateToPreviousTab();
    }

    @Then("User clicks on alert")
    public void userClicksOnAlert() throws InterruptedException {
        Thread.sleep(4000);
        Alert alert;
        alert = driverMMS.switchTo().alert();
        alert.accept();
    }

    @Then("User clicks on test payments button enhancement")
    public void userClicksOnTestPaymentsButtonEnhancement() throws InterruptedException {
        ImpersonationHelper.clicksOnTestPaymentsButtonEnhancement();
    }

    @Then("Navigate to next tab")
    public void navigateToNextTab() throws InterruptedException {
        Thread.sleep(2000);
        ImpersonationHelper.navigateToNextTab();
    }

    @Then("User opens a new blank window")
    public void userOpensANewBlankWindow() {
        ImpersonationHelper.opensANewBlankWindow();
    }

    @Then("User clicks on close button")
    public void userClicksOnCloseButton() {
        ImpersonationHelper.clicksOnCloseButton();
    }

    @Then("User Enters CVV of tokenized")
    public void userEntersCVVOfTokenized() throws InterruptedException {
        ImpersonationHelper.fillCVVOfTokenized();
    }

    @Then("User Enters submit on 3DS v2 transaction for tokenized")
    public void userEntersSubmitOnDSVTransactionForTokenized() throws InterruptedException {
        ImpersonationHelper.entersSubmitOnDSVTransactionForTokenized();
    }

    @Then("Navigate to third tab")
    public void navigateToThirdTab() {
        ImpersonationHelper.navigateToThirdTab();
    }


    @Then("Validate on amount on transaction page for tokenized")
    public void validateOnAmountOnTransactionPageForTokenized() {
        ImpersonationHelper.validateOnAmountOnTransactionPageForTokenized();
    }
}