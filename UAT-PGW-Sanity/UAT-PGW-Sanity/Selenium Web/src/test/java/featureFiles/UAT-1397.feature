@Sanity @UAT-1397
Feature: [EG] Order List Search


  Scenario: As a user, i want to be able to search on order list
    Given User opens Geidea MMS
    Then User Login Geidea MMS
    Then User clicks on Login
    Then User Enters verification code
    Then User clicks on verfiy to verification code
    Then User converts to english language
    Then User clicks on orders
    Then User search for order
    Then User clicks on search button on order page
    Then Validate that Order found successfully
