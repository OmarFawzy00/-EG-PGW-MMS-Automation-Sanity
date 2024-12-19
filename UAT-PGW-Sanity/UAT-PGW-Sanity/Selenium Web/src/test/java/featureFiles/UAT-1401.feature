@Sanity @UAT-1401
Feature: [EG] Souhoola Transaction


  Scenario: User can make Souhoola transaction
    Given User opens Geidea MMS
    Then User Login Geidea MMS
    Then User clicks on Login
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
#    Then User clicks on show receipt check box
    Then User clicks on purchase button
    Then User selects BNPL card button
    Then User clicks souhoola card button
    Then User clicks on next button
    Then User Enters souhoola phone number
    Then User Enters souhoola pin
    Then User clicks on next button on souhoola
    Then User Enters down payment amount for souhoola
    Then User clicks on six months installment plan souhoola
    Then User clicks on next button on installment page souhoola
    Then User clicks on pay cash at delivery souhoola
    Then User clicks on proceed button souhoola
    Then User Enters an OTP for souhoola
    Then User clicks on Finalize purchase button souhoola
#    Then Validate that receipt success for valu
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
    Then Validate on souhoola amount on transaction page
    Then User clicks on last transaction row button
    Then Validate on member ID on transaction page
    Then Validate on original amount on transaction page
    Then Validate on gross amount on transaction page
    Then Validate on valu logo on transaction page
    Then Validate on BNPL order ID on transaction page
    Then User clicks on refund button


  @SouhoolaPayNow
  Scenario: User can make ValU transaction using pay now, online
    Given User opens Geidea MMS
    Then User Login Geidea MMS
    Then User clicks on Login
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
#    Then User clicks on show receipt check box
    Then User clicks on purchase button
    Then User selects BNPL card button
    Then User clicks souhoola card button
    Then User clicks on next button
    Then User Enters souhoola phone number
    Then User Enters souhoola pin
    Then User clicks on next button on souhoola
    Then User Enters down payment amount
    Then User clicks on six months installment plan souhoola
    Then User clicks on next button on installment page souhoola
    Then User clicks on pay now, online souhoola
    Then User clicks on proceed button souhoola
    Then User clicks on Debit or credit card
    Then User clicks on next button on select payment method page
    Then User Enters card number
    Then User Enters Expiry date
    Then User Enters CVV
    Then User Enters Name on card
    Then User clicks on pay souhoola
    Then User clicks submit on 3DS souhoola
    Then User Enters an OTP for souhoola
    Then User clicks on Finalize purchase button souhoola
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
    Then Validate on souhoola pay now amount on transaction page
    Then User clicks on last transaction row button
    Then Validate on member ID on transaction page
    Then Validate on original amount on transaction page
    Then Validate on gross amount on transaction page
    Then Validate on valu logo on transaction page
    Then Validate on BNPL order ID on transaction page
    Then User clicks on refund button
#    Given User opens Geidea GSDK
#    Then User Login Geidea GSDK
#    Then User clicks on Login Geidea GSDK
#    Then User clicks on view details button on GSDK



