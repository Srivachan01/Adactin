Feature: Hotel Booking in Adactin Application

Scenario: user Login the user Application

Given user Launch the Adactin Application
When user Enters The Username In Username Field
And user Enters The User's Password In The Password Field
Then user Clicks The Submit Button  

Scenario: user Searches The Search Page

When user Selects The Hotel Location
And user Selects The Available Hotel In The Location
And user Selects The Room Type 
And user Selects The Number Of Rooms Required
And user Enters The Check-In Date
And user Enters The Check-Out Date
And user Selects The No of Adult Occupants
And user Selects The No of Child Occupants
Then user Clicks Search Button

Scenario: user Selects The Hotel

When user Selects The Available Hotels
Then user Clicks Continue button

Scenario: user Enters Billing Details
When user Enters The First Name 
And user Enters The Last Name
And user Enters The Billing Address
And user Enters The Credit Card Number
And user Enters The Credit Card Type
And user Selects The Credit Card Expiring Month
And user Selects The Credit Card Expiring Year
And user Enters The CVV Number
Then user Clicks The Book Now Button

Scenario: user Views The Booking Details
Then user Clicks The My Itinerary

Scenario: user Cancels The Booked Hotels

When user Selects The Unwanted Hotels
Then user Clicks The Cancel Button

Scenario: user Logout The Page

Then user Clicks Logout Button
 
