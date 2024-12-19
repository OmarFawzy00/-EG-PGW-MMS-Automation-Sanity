@Sanity @UAT-1432
Feature: [EG] Preauthorize and Void



  Scenario: As a user, i want to be able to void Full amount Transaction
    Given User opens Geidea MMS
    Then User Login Geidea MMS
    Then User clicks on Login
    Then User Enters verification code
    Then User clicks on verfiy to verification code
    Then User converts to english language
    Then User clicks on merchant list
    Then User Enter MID in search
    Then User clicks on search button
    Then User clicks on actions button
    Then User clicks on impersonate merchant button
    Then User clicks on payment gateway button
    Then User clicks on configuration button
    Then User clicks on instance button
    Then User clicks on live instance button
    Then User clicks on gateway settings button
    Then User get the merchant public key
    Then User clicks on show password button
    Then User get the gateway API password key
    Then User clicks on instance button
    Then User clicks on test instance button
    Then User clicks on right arrow button to navigate test payments
    Then User clicks on test payments category button
    Then User clicks on test payments button
    Then User clicks on toggle to switch versions of test payment button
    Then User Enters live merchant key on test payment page
    Then User Enters API password on live payment page
    Then User Enters valU amount on test payment page
    Then User Enters callback URL on test payment page
    Then User Enters payment Operation on test payment page
#    Then User clicks on show receipt check box
    Then User clicks on purchase button
    Then User selects debit or credit card button
    Then User clicks on next button
    Then User Enters card number
    Then User Enters Expiry date
    Then User Enters CVV
    Then User Enters Name on card
    Then User clicks on pay souhoola
    Then User Enters submit on 3DS v2 transaction
#    Then User Enters an OTP
#    Then User clicks on Finalize purchase button
    Then Validate that transaction success for valu
    Then Get the order ID number
    Then User convert to the previous tab
    Then User clicks on sales button
    Then User clicks on transactions button
    Then User clicks on profile button
    Then User clicks on exit impersonation button
    Then User clicks on actions button
    Then User clicks on impersonate merchant button
    Then User clicks on sales button
    Then User clicks on transactions button
    Then Validate on order ID on transaction page
    Then Validate on valU amount on transaction page
    Then User clicks on last transaction row button
    Then Validate on member ID on transaction page
    Then Validate on original amount on transaction page
    Then Validate on gross amount on transaction page
    Then Validate on valu logo on transaction page
    Then Validate on order ID on credit or debit transaction page
    Then User clicks on void button
    Then Validate that transaction voided
