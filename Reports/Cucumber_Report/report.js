$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/WELCOME/eclipse-workspace/Nithiya_Project/src/test/FeatureFile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin",
  "description": "",
  "id": "adactin",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is launching the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is entering the \"\u003cusername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters password in \"\u003cpassword\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "adactin;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "adactin;login-functionality;;1"
    },
    {
      "cells": [
        "Nithiya90",
        "6B980P"
      ],
      "line": 14,
      "id": "adactin;login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21940360,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is launching the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is entering the \"Nithiya90\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters password in \"6B980P\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_is_launching_the_application()"
});
formatter.result({
  "duration": 9652331420,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nithiya90",
      "offset": 22
    }
  ],
  "location": "Step_Definition.user_is_entering_the_in_username_field(String)"
});
formatter.result({
  "duration": 213923644,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6B980P",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_enters_password_in_field(String)"
});
formatter.result({
  "duration": 127227917,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_login_button()"
});
formatter.result({
  "duration": 2650028931,
  "status": "passed"
});
formatter.after({
  "duration": 172345,
  "status": "passed"
});
formatter.before({
  "duration": 137277,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Hotel Selection",
  "description": "",
  "id": "adactin;hotel-selection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user is directed to search Hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user select the location from dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user select the hotel from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user select the room type from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user select the No of rooms from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user select the Check-in-date from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user select the check-out date from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user select the Adult room from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user select the Child room from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_is_directed_to_search_Hotel_page()"
});
formatter.result({
  "duration": 31646,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_location_from_dropdown()"
});
formatter.result({
  "duration": 244339251,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_hotel_from_dropdown()"
});
formatter.result({
  "duration": 243461705,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_room_type_from_dropdown()"
});
formatter.result({
  "duration": 162832677,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_No_of_rooms_from_dropdown()"
});
formatter.result({
  "duration": 163353987,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Check_in_date_from_dropdown()"
});
formatter.result({
  "duration": 129201112,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_check_out_date_from_dropdown()"
});
formatter.result({
  "duration": 136593540,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Adult_room_from_dropdown()"
});
formatter.result({
  "duration": 194496606,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Child_room_from_dropdown()"
});
formatter.result({
  "duration": 231371499,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_the_search_button()"
});
formatter.result({
  "duration": 955775446,
  "status": "passed"
});
formatter.after({
  "duration": 104776,
  "status": "passed"
});
formatter.before({
  "duration": 89380,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Hotel Booking",
  "description": "",
  "id": "adactin;hotel-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "user is redirected to confirm hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user click on radiobutton",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user click on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_is_redirected_to_confirm_hotel_page()"
});
formatter.result({
  "duration": 165567525,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_radiobutton()"
});
formatter.result({
  "duration": 280541,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_continue_button()"
});
formatter.result({
  "duration": 1043991910,
  "status": "passed"
});
formatter.after({
  "duration": 84248,
  "status": "passed"
});
formatter.before({
  "duration": 110763,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Card Details",
  "description": "",
  "id": "adactin;card-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "user id redirected to card details payment page",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user enters the First name in fisrtname field",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user enters the last name in lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user enter the billing address in billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user enters the credit card no in the credit card field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user enter the credit card type in the credit card type field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user enter the expiry month in expiry month field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user enters the expiry year in expiry year field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user enter the CVV number in CVV field",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user click on book  now button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_id_redirected_to_card_details_payment_page()"
});
formatter.result({
  "duration": 42338,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enters_the_First_name_in_fisrtname_field()"
});
formatter.result({
  "duration": 400754553,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enters_the_last_name_in_lastname_field()"
});
formatter.result({
  "duration": 120439765,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_billing_address_in_billing_address_field()"
});
formatter.result({
  "duration": 251323696,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enters_the_credit_card_no_in_the_credit_card_field()"
});
formatter.result({
  "duration": 185447876,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_credit_card_type_in_the_credit_card_type_field()"
});
formatter.result({
  "duration": 149543758,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_expiry_month_in_expiry_month_field()"
});
formatter.result({
  "duration": 168124896,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enters_the_expiry_year_in_expiry_year_field()"
});
formatter.result({
  "duration": 153474752,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_CVV_number_in_CVV_field()"
});
formatter.result({
  "duration": 114799437,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_book_now_button()"
});
formatter.result({
  "duration": 866080154,
  "status": "passed"
});
formatter.after({
  "duration": 112901,
  "status": "passed"
});
});