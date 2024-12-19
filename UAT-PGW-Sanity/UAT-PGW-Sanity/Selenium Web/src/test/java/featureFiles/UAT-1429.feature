@Sanity @UAT-1429
Feature: [EG] Meeza Transaction


  Scenario: User can make Meeza transaction
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
#    Then User clicks on toggle to switch versions of test payment button
    Then User Enters Test merchant key on test payment page
#    Then User Enters API password on test payment page
    Then User Enters amount on test payment page
#    Then User clicks on show receipt check box
    Then User clicks on purchase button
    Then User selects Meeza card button
    Then User Enters Meeza phone number
    Then User clicks on next button
    Then Validate that transaction success
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
    Then User clicks on test mode button
    Then Validate on order ID on transaction page
    Then Validate on amount on transaction page
    Then User clicks on last transaction row button
    Then Validate on member ID on transaction page
    Then Validate on original amount on transaction page
    Then Validate on gross amount on transaction page
    Then Validate on transaction type on transaction page
    Then User clicks on refund button


#    Given User opens Geidea GSDK
#    Then User Login Geidea GSDK
#    Then User clicks on Login Geidea GSDK
#    Then User clicks on view details button on GSDK