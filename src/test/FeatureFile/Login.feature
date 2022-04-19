Feature:Adactin

Scenario Outline:Login Functionality


Given user is launching the application
When user is entering the "<username>" in username field
And user enters password in "<password>" field
Then user click on login button


Examples:
|username|password|
|Nithiya90|6B980P|


Scenario:Hotel Selection

Given user is directed to search Hotel page
When user select the location from dropdown
And user select the hotel from dropdown
And user select the room type from dropdown
And user select the No of rooms from dropdown
And user select the Check-in-date from dropdown
And user select the check-out date from dropdown
And user select the Adult room from dropdown
And user select the Child room from dropdown
Then user click the search button

Scenario:Hotel Booking

Given user is redirected to confirm hotel page
When user click on radiobutton
Then user click on continue button

Scenario:Card Details

Given user id redirected to card details payment page
When user enters the First name in fisrtname field
And user enters the last name in lastname field
And user enter the billing address in billing address field
And user enters the credit card no in the credit card field
And user enter the credit card type in the credit card type field
And user enter the expiry month in expiry month field
And user enters the expiry year in expiry year field
And user enter the CVV number in CVV field
Then user click on book  now button

