
Feature: Automation Practice

Scenario : Sign In Functionality

Given user is launching the application
Then user click on Sign in button

Scenario: Sign In page

When user is redirected to authentication page
And user is entering the email in email address field
And user enters password in password field
Then user click on signin  button
     
Scenario: Search Page

When user is directed to search  page
And user clicks on  the women icon
And user clicks on the tops 
And user selects the t-shirts from dropdown
And user select the quantity, size and colour from dropdown
Then click on the add to cart button

Scenario: Checkout Page

When user is redirected to checkout page
And user clicks on proceed to checkout button
Then user is redirected to Shopping cart summary page

Scenario: Shopping Cart Summary

When user checks all the product details
Then clicks on the proceed to checkout button

Scenario: Address Page
When user writes any comment in comment box
Then click on the proceed to checkout button

Scenario:Shipping Page
When user is redirected to Shipping page
And user clicks on the checkbox 
Then user clicks on the proceed to checkout button

Scenario:Payment Page
When user is redirected to payment page
And user clicks on the pay by bank wire 
Then user is redirected to confirm page








