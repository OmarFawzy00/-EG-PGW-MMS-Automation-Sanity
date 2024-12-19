package stepDefinition;

import cucumberRunner.CucumberRunner;
import io.cucumber.java.en.Then;
import pageObjects.CallbackURLPages.CallbackURLHelper;

import java.io.IOException;

public class URLStepdef {

    @Then("User opens callback URL")
    public void user_opens_callback_url() throws IOException {
//        CucumberRunner.setupURL();
        CallbackURLHelper.userOpensCallbackURL();
    }

    @Then("User clicks on here button Callback")
    public void userClicksOnHereButton() {
        CallbackURLHelper.clickOnHereButton();
    }

    @Then("User clicks on logo button Callback")
    public void userClicksOnLogoButtonCallback() throws InterruptedException {
        CallbackURLHelper.clickOnLogoButtonCallback();
    }

    @Then("User clicks on signin button Callback")
    public void userClicksOnSigninButtonCallback() {
        CallbackURLHelper.clickOnSigninButtonCallback();
    }

    @Then("User Enters Email Callback")
    public void userEntersEmailCallback() throws InterruptedException {
        CallbackURLHelper.fillEmailCallback();
    }

    @Then("User Enters password Callback")
    public void userEntersPasswordCallback() {
        CallbackURLHelper.fillPasswordCallback();
    }

    @Then("User clicks on signin button in login page Callback")
    public void userClicksOnSigninButtonInLoginPageCallback() {
        CallbackURLHelper.clicksOnSigninButtonInLoginPageCallback();
    }

    @Then("User clicks on project button Callback")
    public void userClicksOnProjectButtonCallback() {
        CallbackURLHelper.clicksOnProjectButtonCallback();
    }

    @Then("User clicks on workflow button Callback")
    public void userClicksOnWorkflowButtonCallback() {
        CallbackURLHelper.clicksOnWorkflowButtonCallback();
    }

    @Then("User clicks on continue button Callback")
    public void userClicksOnContinueButtonCallback() {
        CallbackURLHelper.clicksOnContinueButtonCallback();
    }

    @Then("User clicks on first request button Callback")
    public void userClicksOnFirstRequestButtonCallback() throws InterruptedException {
        CallbackURLHelper.clicksOnFirstRequestButtonCallback();
    }

    @Then("User clicks on more button Callback")
    public void userClicksOnMoreButtonCallback() {
        CallbackURLHelper.clicksOnMoreButtonCallback();
    }

    @Then("User retrieves tokenID Callback")
    public void userRetrievesTokenIDCallback() throws IOException, InterruptedException {
        CallbackURLHelper.getTokenIDCallback();
    }

    @Then("Validate that amount right")
    public void validateThatAmountRight() throws InterruptedException, IOException {
        CallbackURLHelper.validateThatAmountRight();
    }

    @Then("Validate that merchant Public Key right")
    public void validateThatMerchantPublicKeyRight() {
        CallbackURLHelper.validateThatMerchantPublicKeyRight();
    }

    @Then("Validate that orderId right")
    public void validateThatOrderIdRight() {
        CallbackURLHelper.validateThatOrderIdRight();
    }

    @Then("Validate that cardholder Name right")
    public void validateThatCardholderNameRight() {
        CallbackURLHelper.validateThatCardholderNameRight();
    }
}
