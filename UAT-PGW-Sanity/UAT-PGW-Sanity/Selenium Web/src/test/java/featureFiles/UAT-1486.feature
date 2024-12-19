@Sanity @UAT-1486
Feature: [EG] Tokenized payment (test page)


  Scenario: As a user, i want to be able to Tokenized payment
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
#    Then User Enters payment Operation on test payment page
    Then User clicks on purchase button
    Then User selects debit or credit card button
    Then User clicks on next button
    Then User Enters card number
    Then User Enters Expiry date
    Then User Enters CVV
    Then User Enters Name on card
    Then User clicks on pay souhoola
    Then User Enters submit on 3DS v2 transaction
    Then Validate that transaction success for valu
    Then Get the order ID number

    Then User opens a new blank window
    Then User opens callback URL
    Then User clicks on signin button Callback
    Then User Enters Email Callback
    Then User Enters password Callback
    Then User clicks on signin button in login page Callback
    Then User clicks on project button Callback
    Then User clicks on workflow button Callback
    Then User clicks on first request button Callback
    Then User clicks on more button Callback
    Then User retrieves tokenID Callback

    Then User convert to the previous tab
    Then User clicks on close button
    Then User clicks token payment button on test payment page
    Then User Enters token ID on test payment page
    Then User Enters payment Operation on test payment page
    Then User clicks on purchase button
    Then User Enters CVV of tokenized
    Then User clicks on next button
    Then User Enters submit on 3DS v2 transaction for tokenized
    Then Validate that transaction success for valu
    Then Get the order ID number
    Then Navigate to previous tab
    Then User clicks on sales button
    Then User clicks on transactions button
    Then User clicks on profile button
    Then User clicks on exit impersonation button
    Then User clicks on actions button
    Then User clicks on impersonate merchant button
    Then User clicks on sales button
    Then User clicks on transactions button
    Then Validate on order ID on transaction page
    Then Validate on amount on transaction page for tokenized
    Then User clicks on last transaction row button
    Then Validate on member ID on transaction page
    Then Validate on original amount on transaction page
    Then Validate on gross amount on transaction page

    Then Navigate to third tab
    Then User clicks on first request button Callback
    Then Validate that amount right
    Then Validate that orderId right
    Then User clicks on more button Callback
    Then Validate that merchant Public Key right
    Then Validate that cardholder Name right
