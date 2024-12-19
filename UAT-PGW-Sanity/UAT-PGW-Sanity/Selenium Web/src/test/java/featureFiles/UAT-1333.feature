@Sanity @UAT-1333
Feature: [EG] Create Paylink [Static Link]


  Scenario: As a user i want to be able to create Paylink [Static Link]
    Given User opens Geidea MMS
    Then User Login Geidea MMS
    Then User clicks on Login
    Then User converts to english language
    Then User clicks on merchant list
    Then User Enter MID in search
    Then User clicks on search button
    Then User clicks on actions button
    Then User clicks on impersonate merchant button
    Then User clicks on expand button
    Then User clicks on pay by link button
    Then User clicks on static paylink button
    Then User clicks on create static paylink
    Then User Enter static paylink title
    Then User Enter item description for static paylink
    Then User Enter unit price for static paylink
    Then User clicks on create button for static paylink
    Then User clicks on actions button on static paylink page
    Then User clicks on view details button on static paylink page
    Then User clicks on paylink
    Then User clicks on convert language button on paylink page
    Then Validate that pay link page show correct Total Amount, Pay link number and Merchant Name
    Then User Enter customer name on paylink page
    Then User Enter customer Email on paylink page
    Then User clicks on pay button on paylink page
    Then User selects debit or credit card button on paylink page
    Then User clicks on next button
    Then User Enters card number
    Then User Enters Expiry date
    Then User Enters CVV
    Then User Enters Name on card
    Then User clicks on pay souhoola
    Then User Enters submit on 3DS v2 transaction
    Then Validate that transaction success for static paylink receipt

#    Then User search to Find a customer
#    Then User clicks on a selected customer button
#    Then User clicks on Add customer button
#    Then User Enters customer name in PBL
#    Then User Enters customer email in PBL
#    Then User Enters amount in PBL
#    Then User clicks on create and send button
#    Given User opens outlook
#    Then User clicks on sign in button in outlook home page
#    Then User Enters email in outlook
#    Then User clicks on next button in oulook
#    Then User Enters password in outlook
#    Then User clicks on sign in button in oulook


